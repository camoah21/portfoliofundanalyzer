import axios from 'axios';
import React, { useEffect, useState } from 'react';

function AssetComponent() {
    const [assets, setAssets] = useState([]);
    const [symbol, setSymbol] = useState('');
    const [quantity, setQuantity] = useState(0);
    const [purchasePrice, setPurchasePrice] = useState(0.0);
    const [message, setMessage] = useState('');

    useEffect(() => {
        fetchAssets();
    }, []);

    const fetchAssets = async () => {
        try {
            const response = await axios.get('/api/assets');
            setAssets(response.data);
        } catch (error) {
            console.error('Error fetching assets:', error);
        }
    };

    const handleAddAsset = async (event) => {
        event.preventDefault();
        try {
            const newAsset = { symbol, quantity, purchasePrice };
            const response = await axios.post('/api/assets', newAsset);
            setAssets([...assets, response.data]);
            setMessage('Asset added successfully');
        } catch (error) {
            setMessage('Error adding asset: ' + (error.response ? error.response.data : 'Unknown error'));
        }
    };

    const handleUpdateAsset = async (id) => {
        try {
            const updatedAsset = { symbol, quantity, purchasePrice };
            await axios.put(`/api/assets/${id}`, updatedAsset);
            fetchAssets();
            setMessage('Asset updated successfully');
        } catch (error) {
            setMessage('Error updating asset: ' + (error.response ? error.response.data : 'Unknown error'));
        }
    };

    const handleDeleteAsset = async (id) => {
        try {
            await axios.delete(`/api/assets/${id}`);
            setAssets(assets.filter(asset => asset.id !== id));
            setMessage('Asset deleted successfully');
        } catch (error) {
            setMessage('Error deleting asset: ' + (error.response ? error.response.data : 'Unknown error'));
        }
    };

    return (
        <div>
            <h2>Assets</h2>
            <form onSubmit={handleAddAsset}>
                <div>
                    <label>Symbol:</label>
                    <input type="text" value={symbol} onChange={(e) => setSymbol(e.target.value)} />
                </div>
                <div>
                    <label>Quantity:</label>
                    <input type="number" value={quantity} onChange={(e) => setQuantity(e.target.value)} />
                </div>
                <div>
                    <label>Purchase Price:</label>
                    <input type="number" value={purchasePrice} onChange={(e) => setPurchasePrice(e.target.value)} />
                </div>
                <button type="submit">Add Asset</button>
            </form>
            {message && <p>{message}</p>}
            <h3>Asset List</h3>
            <ul>
                {assets.map(asset => (
                    <li key={asset.id}>
                        {asset.symbol} - {asset.quantity} shares @ ${asset.purchasePrice}
                        <button onClick={() => handleUpdateAsset(asset.id)}>Update</button>
                        <button onClick={() => handleDeleteAsset(asset.id)}>Delete</button>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default AssetComponent;
