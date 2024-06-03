package com.realestatefundanalyzer.realestatefundanalyzer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    List<User> findByUsername(String username);
}
