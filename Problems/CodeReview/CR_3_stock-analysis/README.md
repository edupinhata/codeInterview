## Make a code review: Stocks analysis

### Problem

The [polygon.io](https://polygon.io/) provides an [API](https://polygon.io/docs/stocks/getting-started) to get information about stocks.

We are implementing a program that will use this API to collect information about stocks and make some analysis of it.

Until now we had a code that would get information about opening and closing values of the Tickers (stocks) and sort them by the variation.

The last assignment given to someone from your team was to add support to make an API call to [Aggregates (Bar)](https://polygon.io/docs/stocks/get_v2_aggs_ticker__stocksticker__range__multiplier___timespan___from___to ) so we could see the history of the last top 3 variation Tickers.

They opened this [Pull Request](https://github.com/edupinhata/codeInterview/pull/2/files) and you need to review it.

Following your knowledge about performance, code good practices, find any possible errors and/or suggest improvements in the code. You can comment in the own Pull Request.

**Output before Pull Request:**

```vim
BRK.A [2022-11-28]: o: 474511.01 | c: 472712.01 | h:478838.77 | l: 471000.00 | var:   7838.77
  TPL [2022-11-28]: o:   2559.34 | c:   2504.22 | h:  2580.91 | l:   2492.06 | var:     88.85
  SEB [2022-11-28]: o:   3993.13 | c:   3989.98 | h:  4000.00 | l:   3929.87 | var:     70.13
  NVR [2022-11-28]: o:   4458.44 | c:   4444.95 | h:  4462.62 | l:   4412.79 | var:     49.83
 MELI [2022-11-28]: o:    941.10 | c:    921.34 | h:   956.69 | l:    920.85 | var:     35.84
  WTM [2022-11-28]: o:   1412.24 | c:   1422.81 | h:  1430.00 | l:   1394.50 | var:     35.50
 NRGU [2022-11-28]: o:    574.15 | c:    569.85 | h:   600.52 | l:    565.90 | var:     34.62
```

**Output after Pull Request:**
```vim
BRK.A: 
[2022-11-28]: o: 474511.01 | c: 472712.01 | h:478838.77 | l: 471000.00 | var:   7838.77 
  TPL: 
[2022-11-28]: o:   2559.34 | c:   2504.22 | h:  2580.91 | l:   2492.06 | var:     88.85 
  SEB: 
[2022-11-28]: o:   3993.13 | c:   3989.98 | h:  4000.00 | l:   3929.87 | var:     70.13 
  NVR: 
[2022-11-28]: o:   4458.44 | c:   4444.95 | h:  4462.62 | l:   4412.79 | var:     49.83 
 MELI: 
[2022-11-28]: o:    941.10 | c:    921.34 | h:   956.69 | l:    920.85 | var:     35.84 
  WTM: 
[2022-11-28]: o:   1412.24 | c:   1422.81 | h:  1430.00 | l:   1394.50 | var:     35.50 
 NRGU: 
[2022-11-28]: o:    574.15 | c:    569.85 | h:   600.52 | l:    565.90 | var:     34.62 

TOP 3 past variation
==============================
BRK.A: 
[2022-11-22]: o: 470608.50 | c: 476980.00 | h:477410.00 | l: 469217.00 | var:   8193.00 
[2022-11-28]: o: 476823.00 | c: 477019.99 | h:477530.00 | l: 473716.01 | var:   3813.99 
[2022-11-28]: o: 480349.63 | c: 478675.55 | h:481580.44 | l: 476281.01 | var:   5299.43 
[2022-11-28]: o: 474511.01 | c: 472712.01 | h:478838.77 | l: 471000.00 | var:   7838.77 
  TPL: 
[2022-11-22]: o:   2550.00 | c:   2636.81 | h:  2654.29 | l:   2550.00 | var:    104.29 
[2022-11-28]: o:   2630.00 | c:   2576.79 | h:  2663.40 | l:   2557.00 | var:    106.40 
[2022-11-28]: o:   2553.24 | c:   2603.23 | h:  2668.98 | l:   2553.24 | var:    115.74 
[2022-11-28]: o:   2559.34 | c:   2504.22 | h:  2580.91 | l:   2492.06 | var:     88.85 
  SEB: 
[2022-11-22]: o:   3974.74 | c:   3948.50 | h:  4000.00 | l:   3928.80 | var:     71.20 
[2022-11-28]: o:   3920.00 | c:   3923.46 | h:  3980.00 | l:   3900.00 | var:     80.00 
[2022-11-28]: o:   3936.74 | c:   3999.99 | h:  4000.00 | l:   3875.00 | var:    125.00 
[2022-11-28]: o:   3993.13 | c:   3989.98 | h:  4000.00 | l:   3929.87 | var:     70.13 

Process finished with exit code 0

```