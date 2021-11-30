package com.javastart.account.dto;

import com.javastart.account.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class AccountResponseDTO {
    private Long accountId;

    private String name;

    private String email;

    private String phone;

    private OffsetDateTime creationDate;

    private List<Long> bills;

    public AccountResponseDTO(Account account) {
        this(account.getAccountId(), account.getName(),
                account.getEmail(), account.getPhone(), account.getCreationDate(),
                account.getBills());
    }
}
