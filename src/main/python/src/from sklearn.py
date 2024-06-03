from sklearn.linear_model import LinearRegression
import numpy as np

# Sample data for training the model
X = np.array(df.index.map(pd.to_datetime).astype(int).values).reshape(-1, 1)
y = df['close'].values

# Train the model
model = LinearRegression()
model.fit(X, y)

# Predict future prices
future_dates = pd.date_range(start=df.index[-1], periods=30)
future_X = np.array(future_dates.map(pd.to_datetime).astype(int).values).reshape(-1, 1)
predictions = model.predict(future_X)
