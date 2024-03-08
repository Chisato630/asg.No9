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
        Optional<Name> name = this.nameMapper.findById(id); //名前の取得
        return this.nameMapper.findById(id).orElseThrow(() -> new UserNotFoundException("user not found"));
        // メソッド内での名前の存在チェックと例外のスローを行う
        // `name` 変数の宣言を省略し、`orElseThrow` メソッドの中で直接 `return` 文を使用
    }
}