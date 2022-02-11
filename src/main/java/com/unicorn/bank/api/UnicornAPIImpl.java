package com.unicorn.bank.api;

import java.util.Arrays;
import java.util.List;

import com.unicorn.bank.model.Unicorn;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UnicornAPIImpl implements UnicornsApiDelegate {

    @Override
    public ResponseEntity<List<Unicorn>> listUnicorns() {
        Unicorn alan = new Unicorn();
        alan.setId(1l);
        alan.setName("Space Unicorn Alan");
        List<Unicorn> unicorns = Arrays.asList(alan);
        return ResponseEntity.ok(unicorns);
    }
    
}
