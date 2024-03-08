package com.example.mybatisdemo202402;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NameService {

    private final NameMapper nameMapper;

    public NameService(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }

    public List<Name> findNames(String prefix, String suffix, String keyword) {
        List<Name> names = nameMapper.findNames(prefix,suffix,keyword);
        return names;
    }

    public Name findNames(int id){
        Optional<Name> name = this.nameMapper.findById(id);
        if (name.isPresent()) {
            return name.get();  // Optional.get()は値が存在しない場合例外を発生させる
        } else {
            throw new UserNotFoundException("user not found");
        }
    }
}
