import tushare as ts
import time
while(True):
    print(ts.get_k_data('000002',ktype='30'))
    time.sleep(20)

