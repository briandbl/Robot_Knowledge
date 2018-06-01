# ����futuquant api
import futuquant as ft

# ʵ�������������Ķ���
quote_ctx = ft.OpenQuoteContext(host="127.0.0.1", port=11111)

# �����Ŀ���
quote_ctx.start()              # �����첽���ݽ���
quote_ctx.stop()               # ֹͣ�첽���ݽ���
quote_ctx.set_handler(handler) # ���������첽�������ݵĻص�����

# ��Ƶ���ݽӿ�
quote_ctx.get_trading_days(market, start_date=None, end_date=None)    # ��ȡ������
quote_ctx.get_stock_basicinfo(market, stock_type='STOCK')             # ��ȡ��Ʊ��Ϣ
quote_ctx.get_history_kline(code, start=None, end=None, ktype='K_DAY', autype='qfq')  # ��ȡ��ʷK��
quote_ctx.get_autype_list(code_list)                                  # ��ȡ��Ȩ����
quote_ctx.get_market_snapshot(code_list)                              # ��ȡ�г�����
quote_ctx.get_plate_list(market, plate_class)                         # ��ȡ��鼯���µ��Ӱ���б�
quote_ctx.get_plate_stock(market, stock_code)                         # ��ȡ����µĹ�Ʊ�б�

# ��Ƶ���ݽӿ�
quote_ctx.get_stock_quote(code_list) # ��ȡ����
quote_ctx.get_rt_ticker(code, num)   # ��ȡ���
quote_ctx.get_cur_kline(code, num, ktype=' K_DAY', autype='qfq') # ��ȡ��ǰK��
quote_ctx.get_order_book(code)       # ��ȡ����
quote_ctx.get_rt_data(code)          # ��ȡ��ʱ����
quote_ctx.get_broker_queue(code)     # ��ȡ���Ͷ���
printf (quoto_ctx)

# ʵ�����۹ɽ��������Ķ���
trade_hk_ctx = ft.OpenHKTradeContext(host="127.0.0.1", port=11111)

# ʵ�������ɽ��������Ķ���
trade_us_ctx = ft.OpenUSTradeContext(host="127.0.0.1", port=11111)

# ���׽ӿ��б�
ret_code, ret_data = trade_hk_ctx.unlock_trade(password='123456')                # �����ӿ�
ret_code, ret_data = trade_hk_ctx.place_order(price, qty, strcode, orderside, ordertype=0, envtype=0) # �µ��ӿ�
ret_code, ret_data = trade_hk_ctx.set_order_status(status, orderid=0, envtype=0) # ���ö���״̬
ret_code, ret_data = trade_hk_ctx.change_order(price, qty, orderid=0, envtype=0) # �޸Ķ���
ret_code, ret_data = trade_hk_ctx.accinfo_query(envtype=0)                       # ��ѯ�˻���Ϣ
ret_code, ret_data = trade_hk_ctx.order_list_query(statusfilter="", envtype=0)   # ��ѯ�����б�
ret_code, ret_data = trade_hk_ctx.position_list_query(envtype=0)                 # ��ѯ�ֲ��б�
ret_code, ret_data = trade_hk_ctx.deal_list_query(envtype=0)                     # ��ѯ�ɽ��б�