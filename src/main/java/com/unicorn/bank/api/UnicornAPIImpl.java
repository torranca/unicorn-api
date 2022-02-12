package com.unicorn.bank.api;

import java.util.UUID;

import com.unicorn.bank.model.Ping;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UnicornAPIImpl implements PingApiDelegate {

    @Override
    public ResponseEntity<Ping> ping() {
        Ping ping = new Ping();
        ping.setId(UUID.randomUUID());
        ping.setMessage("Go Unicorn Bank!");
        return ResponseEntity.ok(ping);
    }

    
}
