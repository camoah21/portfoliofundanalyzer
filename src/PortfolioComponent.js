import axios from 'axios';
import React, { useEffect, useState } from 'react';

function PortfolioComponent() {
    const [portfolio, setPortfolio] = useState([]);

    useEffect(() => {
        axios.get('/api/portfolio')
            .then(response => setPortfolio(response.data))
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            <h1>Your Portfolio</h1>
            <ul>
                {portfolio.map(asset => (
                    <li key={asset.id}>{asset.symbol} - {asset.quantity} shares</li>
                ))}
            </ul>
        </div>
    );
}

export default PortfolioComponent;
