package com.realestatefundanalyzer.realestatefundanalyzer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    List<Portfolio> findByName(String name);
}
