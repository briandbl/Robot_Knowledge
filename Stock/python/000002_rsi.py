import tushare as ts
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import talib
df=ts.get_k_data('000002')
close = [float(x) for x in df['close']]
df['RSI']=talib.RSI(np.array(close), timeperiod=12)
df['MOM']=talib.MOM(np.array(close), timeperiod=5)
df.tail(12)
df.to_excel("c:/000002.xlsx")