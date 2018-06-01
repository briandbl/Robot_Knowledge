import tushare as ts 
import matplotlib.pyplot as plt
import numpy as np
import talib
df=ts.get_k_data('000002')
close = [float(x) for x in df['close']]
df['EMA12'] = talib.EMA(np.array(close), timeperiod=6)  
df['EMA26'] = talib.EMA(np.array(close), timeperiod=12)   
df['MACD'],df['MACDsignal'],df['MACDhist'] = talib.MACD(np.array(close),
                            fastperiod=6, slowperiod=12, signalperiod=9)   
df.tail(12)
df.to_excel("c:/000002_macd.xlsx")