package com.realestatefundanalyzer.realestatefundanalyzer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    // Business logic for managing portfolios
    public Portfolio createPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public Optional<Portfolio> getPortfolioById(Long id) {
        return portfolioRepository.findById(id);
    }

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    public Portfolio updatePortfolio(Long id, Portfolio portfolioDetails) {
        Optional<Portfolio> optionalPortfolio = portfolioRepository.findById(id);
        if (optionalPortfolio.isPresent()) {
            Portfolio portfolio = optionalPortfolio.get();
            portfolio.setName(portfolioDetails.getName());
            portfolio.setTotalValue(portfolioDetails.getTotalValue());
            portfolio.setAssets(portfolioDetails.getAssets());
            return portfolioRepository.save(portfolio);
        }
        return null;
    }

    public void deletePortfolio(Long id) {
        portfolioRepository.deleteById(id);
    }
}
