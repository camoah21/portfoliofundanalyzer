import requests
import pandas as pd

API_KEY = 'your_api_key'
symbol = 'AAPL'

url = f'https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol={symbol}&apikey={API_KEY}'
response = requests.get(url)
data = response.json()

# Parse the JSON data and convert to DataFrame
time_series = data['Time Series (Daily)']
df = pd.DataFrame(time_series).transpose()
df.columns = ['open', 'high', 'low', 'close', 'volume']
df = df.astype(float)
