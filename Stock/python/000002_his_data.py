import tushare as ts
df=ts.get_hist_data('000002')
df.to_excel('c:/000002.xlsx')