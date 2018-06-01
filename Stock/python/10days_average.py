import tushare as ts
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import talib

df=ts.get_k_data('000002')
df['MA10_rolling'] = pd.rolling_mean(df['close'],10)
close = [float(x) for x in df['close']]
df['MA10_talib'] = talib.MA(np.array(close), timeperiod=10) 
df.tail(12)
df.to_excel('c:/000002_10days.xlsx')