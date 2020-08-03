(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["chunk-2987ec0a"], {
    1148: function (t, e, a) {
        "use strict";
        var r = a("a691"), n = a("1d80");
        t.exports = "".repeat || function (t) {
            var e = String(n(this)), a = "", i = r(t);
            if (i < 0 || i == 1 / 0) throw RangeError("Wrong number of repetitions");
            for (; i > 0; (i >>>= 1) && (e += e)) 1 & i && (a += e);
            return a
        }
    }, "2d76": function (t, e, a) {
        "use strict";
        a.r(e);
        var r = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", [a("map-tool")], 1)
            }, n = [], i = (a("b680"), function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {style: t.getStyle, attrs: {id: t.getId}})
            }), o = [], s = (a("a9e3"), {
                props: {
                    size: {type: Object},
                    option: {type: Object},
                    index: {type: Number, default: (new Date).getTime()}
                }, data: function () {
                    return {}
                }, computed: {
                    getIndex: function () {
                        return this.index
                    }, getId: function () {
                        return "chart" + this.getIndex
                    }, getStyle: function () {
                        return this.size.width || (this.size.width = "100%"), this.size.height || (this.size.height = "300px"), this.size
                    }, getOptions: function () {
                        return this.option
                    }
                }, watch: {
                    getOptions: function (t, e) {
                    }
                }, mounted: function () {
                    console.log(this.getOptions), this.setOptions(this.getOptions)
                }, methods: {
                    setOptions: function (t) {
                        var e = this, a = e.$echarts.init(document.getElementById(this.getId));
                        a.setOption(t, !0)
                    }
                }
            }), c = s, u = a("2877"), l = Object(u["a"])(c, i, o, !1, null, "54c62e29", null), f = l.exports, p = a("d182"),
            d = {
                components: {"chart-set": f, "map-tool": p["default"]}, data: function () {
                    return {}
                }, computed: {
                    getLineSize: function () {
                        return {width: "100%", height: "200px"}
                    }, getLeftSize: function () {
                        return {width: "50%", height: "500px"}
                    }, getLineOption: function () {
                        var t = {
                            title: {top: 20, text: "Death & Recover Cases"},
                            tooltip: {trigger: "axis"},
                            legend: {top: 15, right: 10, orient: "vertical", data: ["Death", "Recover"]},
                            xAxis: {
                                type: "category",
                                boundaryGap: !1,
                                data: ["01-Feb", "10-Feb", "20-Feb", "01-Mar", "10-Mar", "20-Mar", "01-Apr", "10-Apr", "20-Apr", "01-May", "10-May", "20-May", "01-Jun", "10-Jun", "20-Jun"],
                                axisLabel: {interval: 2}
                            },
                            yAxis: {type: "value", minInterval: 1, boundaryGap: [0, "30%"]},
                            series: [{
                                name: "Death",
                                data: [156, 183, 196, 219, 281, 305, 460, 605, 842, 942, 1058, 1249, 1358, 1432, 1543],
                                type: "line",
                                symbolSize: 6,
                                itemStyle: {normal: {color: "#000000", lineStyle: {color: "#000000"}}}
                            }, {
                                name: "Recover",
                                data: [130, 146, 186, 204, 268, 395, 580, 694, 705, 716, 860, 946, 1125, 1259, 1485],
                                type: "line",
                                symbolSize: 6,
                                itemStyle: {normal: {color: "#8cd5c2", lineStyle: {color: "#8cd5c2"}}}
                            }]
                        };
                        return t
                    }, getLineAreaOption: function () {
                        var t = {
                            title: {top: 20, text: "Confirmed Cases & Active Case"},
                            tooltip: {trigger: "axis"},
                            legend: {top: 15, right: 10, orient: "vertical", data: ["Confirmed Case", "Active Case"]},
                            xAxis: {
                                type: "category",
                                boundaryGap: !1,
                                data: ["01-Feb", "10-Feb", "20-Feb", "01-Mar", "10-Mar", "20-Mar", "01-Apr", "10-Apr", "20-Apr", "01-May", "10-May", "20-May", "01-Jun", "10-Jun", "20-Jun"],
                                axisLabel: {interval: 2}
                            },
                            yAxis: {type: "value", minInterval: 1, boundaryGap: [0, "10%"]},
                            series: [{
                                name: "Confirmed Case",
                                data: [41, 165, 435, 659, 1048, 1645, 2020, 2832, 5584, 8584, 20452, 30524, 55485, 65856, 95124],
                                type: "line",
                                color: "#fff1e1",
                                areaStyle: {color: "#fff1e1"}
                            }, {
                                name: "Active Case",
                                data: [21, 85, 235, 359, 548, 845, 1020, 1832, 3584, 6584, 8452, 12524, 35485, 45856, 65124],
                                type: "line",
                                color: "#ffdadb",
                                areaStyle: {color: "#ffdadb"}
                            }]
                        };
                        return t
                    }, getBarOption: function () {
                        var t = this.generateData(30), e = {
                            tooltip: {trigger: "axis", axisPointer: {type: "shadow"}},
                            grid: {bottom: 90},
                            xAxis: {data: t.categoryData, silent: !1, splitLine: {show: !1}, splitArea: {show: !1}},
                            yAxis: {splitArea: {show: !1}},
                            series: [{type: "bar", data: t.valueData, large: !0}]
                        };
                        return e
                    }, getBarLeftOptions: function () {
                        var t = {
                            title: {text: ""},
                            tooltip: {},
                            legend: {},
                            grid: {left: "3%", right: "4%", bottom: "50%", containLabel: !0},
                            xAxis: {type: "value", show: !1, boundaryGap: [0, .01]},
                            yAxis: {
                                type: "category",
                                axisTick: {show: !1},
                                axisLine: {show: !1},
                                data: ["80+", "70-79", "60-69", "40-59", "30-39", "20-29", "0-19"],
                                axisLabel: {show: !0, textStyle: {color: "black", fontSize: 16}}
                            },
                            series: [{
                                type: "bar",
                                barCategoryGap: "30%",
                                data: [18203, 2348, 2903, 10497, 13174, 63023, 10254],
                                itemStyle: {
                                    normal: {
                                        label: {
                                            show: !0,
                                            position: "right",
                                            textStyle: {color: "black", fontSize: 16}
                                        }
                                    }
                                }
                            }]
                        };
                        return t
                    }, CaseComparison: function () {
                        var t = {
                            tooltip: {trigger: "axis", axisPointer: {type: "shadow"}},
                            legend: {data: ["Americas", , "Europe", "Eastern Mediterranean", "South-East Asia", "Western Pacific", "Aferica"]},
                            grid: {left: "3%", right: "4%", bottom: "3%", containLabel: !0},
                            xAxis: [{
                                type: "category",
                                data: ["01-Feb", "10-Feb", "20-Feb", "01-Mar", "10-Mar", "20-Mar", "01-Apr", "10-Apr", "20-Apr", "01-May", "10-May", "20-May", "01-Jun", "10-Jun", "20-Jun", "01-July", "10-July", "20-July"],
                                axisLabel: {interval: 2}
                            }],
                            yAxis: [{type: "value"}],
                            color: ["#0a71d5", "#c12592", "#5200ae", "#00ae8f", "#c8d65b", "#ffbb30"],
                            series: [{
                                name: "Americas",
                                type: "bar",
                                barWidth: "30",
                                stack: "case",
                                data: [21, 85, 235, 359, 448, 525, 620, 832, 1584, 2584, 5452, 8524, 15485, 25856, 35485, 42651, 48652, 55124]
                            }, {
                                name: "Europe",
                                type: "bar",
                                stack: "case",
                                data: [21, 85, 235, 359, 548, 845, 1020, 1832, 3584, 6584, 8452, 12524, 35485, 45856, 51548, 65124, 75424, 78452]
                            }, {
                                name: "Eastern Mediterranean",
                                type: "bar",
                                stack: "case",
                                data: [21, 85, 235, 359, 548, 845, 1020, 1832, 3584, 6584, 8452, 12524, 19548, 25485, 35485, 45856, 51548, 65124]
                            }, {
                                name: "South-East Asia",
                                type: "bar",
                                stack: "case",
                                data: [21, 85, 235, 359, 548, 845, 1020, 1832, 3584, 6584, 8452, 12524, 35485, 45856, 50125, 51548, 54856, 65124]
                            }, {
                                name: "Western Pacific",
                                type: "bar",
                                stack: "case",
                                data: [21, 85, 235, 359, 548, 845, 1020, 1254, 1548, 1832, 3584, 6584, 8452, 12524, 35485, 45856, 51548, 65124]
                            }, {
                                name: "Aferica",
                                type: "bar",
                                stack: "case",
                                data: [41, 165, 435, 659, 1048, 1645, 2020, 2832, 5584, 8584, 12548, 18645, 20452, 30524, 55485, 65856, 84524, 95124]
                            }]
                        };
                        return t
                    }
                }, mounted: function () {
                }, methods: {
                    buildCharts: function (t) {
                        var e = this.$echarts.init(document.getElementById("alarm"));
                        e.setOption(t, !0)
                    }, generateData: function (t) {
                        var e, a = 1e3 * Math.random(), r = +new Date(2011, 0, 1);

                        function n(t) {
                            return e = t % 3 === 0 ? 700 * Math.random() : e + 500 * Math.random() - 250, a += 20 * Math.random() - 10, Math.max(0, Math.round(a + e) + 3e3)
                        }

                        for (var i = [], o = [], s = 0; s < t; s++) i.push(this.$echarts.format.formatTime("yyyy-MM-dd\nhh:mm:ss", r)), o.push(n(s).toFixed(2)), r += 1e3;
                        return {categoryData: i, valueData: o}
                    }
                }
            }, h = d, y = Object(u["a"])(h, r, n, !1, null, null, null);
        e["default"] = y.exports
    }, "408a": function (t, e, a) {
        var r = a("c6b6");
        t.exports = function (t) {
            if ("number" != typeof t && "Number" != r(t)) throw TypeError("Incorrect invocation");
            return +t
        }
    }, 5899: function (t, e) {
        t.exports = "\t\n\v\f\r                　\u2028\u2029\ufeff"
    }, "58a8": function (t, e, a) {
        var r = a("1d80"), n = a("5899"), i = "[" + n + "]", o = RegExp("^" + i + i + "*"), s = RegExp(i + i + "*$"),
            c = function (t) {
                return function (e) {
                    var a = String(r(e));
                    return 1 & t && (a = a.replace(o, "")), 2 & t && (a = a.replace(s, "")), a
                }
            };
        t.exports = {start: c(1), end: c(2), trim: c(3)}
    }, 7156: function (t, e, a) {
        var r = a("861d"), n = a("d2bb");
        t.exports = function (t, e, a) {
            var i, o;
            return n && "function" == typeof (i = e.constructor) && i !== a && r(o = i.prototype) && o !== a.prototype && n(t, o), t
        }
    }, a9e3: function (t, e, a) {
        "use strict";
        var r = a("83ab"), n = a("da84"), i = a("94ca"), o = a("6eeb"), s = a("5135"), c = a("c6b6"), u = a("7156"),
            l = a("c04e"), f = a("d039"), p = a("7c73"), d = a("241c").f, h = a("06cf").f, y = a("9bf2").f,
            g = a("58a8").trim, b = "Number", m = n[b], x = m.prototype, v = c(p(x)) == b, A = function (t) {
                var e, a, r, n, i, o, s, c, u = l(t, !1);
                if ("string" == typeof u && u.length > 2) if (u = g(u), e = u.charCodeAt(0), 43 === e || 45 === e) {
                    if (a = u.charCodeAt(2), 88 === a || 120 === a) return NaN
                } else if (48 === e) {
                    switch (u.charCodeAt(1)) {
                        case 66:
                        case 98:
                            r = 2, n = 49;
                            break;
                        case 79:
                        case 111:
                            r = 8, n = 55;
                            break;
                        default:
                            return +u
                    }
                    for (i = u.slice(2), o = i.length, s = 0; s < o; s++) if (c = i.charCodeAt(s), c < 48 || c > n) return NaN;
                    return parseInt(i, r)
                }
                return +u
            };
        if (i(b, !m(" 0o1") || !m("0b1") || m("+0x1"))) {
            for (var w, M = function (t) {
                var e = arguments.length < 1 ? 0 : t, a = this;
                return a instanceof M && (v ? f((function () {
                    x.valueOf.call(a)
                })) : c(a) != b) ? u(new m(A(e)), a, M) : A(e)
            }, I = r ? d(m) : "MAX_VALUE,MIN_VALUE,NaN,NEGATIVE_INFINITY,POSITIVE_INFINITY,EPSILON,isFinite,isInteger,isNaN,isSafeInteger,MAX_SAFE_INTEGER,MIN_SAFE_INTEGER,parseFloat,parseInt,isInteger".split(","), S = 0; I.length > S; S++) s(m, w = I[S]) && !s(M, w) && y(M, w, h(m, w));
            M.prototype = x, x.constructor = M, o(n, b, M)
        }
    }, b680: function (t, e, a) {
        "use strict";
        var r = a("23e7"), n = a("a691"), i = a("408a"), o = a("1148"), s = a("d039"), c = 1..toFixed, u = Math.floor,
            l = function (t, e, a) {
                return 0 === e ? a : e % 2 === 1 ? l(t, e - 1, a * t) : l(t * t, e / 2, a)
            }, f = function (t) {
                var e = 0, a = t;
                while (a >= 4096) e += 12, a /= 4096;
                while (a >= 2) e += 1, a /= 2;
                return e
            },
            p = c && ("0.000" !== 8e-5.toFixed(3) || "1" !== .9.toFixed(0) || "1.25" !== 1.255.toFixed(2) || "1000000000000000128" !== (0xde0b6b3a7640080).toFixed(0)) || !s((function () {
                c.call({})
            }));
        r({target: "Number", proto: !0, forced: p}, {
            toFixed: function (t) {
                var e, a, r, s, c = i(this), p = n(t), d = [0, 0, 0, 0, 0, 0], h = "", y = "0", g = function (t, e) {
                    var a = -1, r = e;
                    while (++a < 6) r += t * d[a], d[a] = r % 1e7, r = u(r / 1e7)
                }, b = function (t) {
                    var e = 6, a = 0;
                    while (--e >= 0) a += d[e], d[e] = u(a / t), a = a % t * 1e7
                }, m = function () {
                    var t = 6, e = "";
                    while (--t >= 0) if ("" !== e || 0 === t || 0 !== d[t]) {
                        var a = String(d[t]);
                        e = "" === e ? a : e + o.call("0", 7 - a.length) + a
                    }
                    return e
                };
                if (p < 0 || p > 20) throw RangeError("Incorrect fraction digits");
                if (c != c) return "NaN";
                if (c <= -1e21 || c >= 1e21) return String(c);
                if (c < 0 && (h = "-", c = -c), c > 1e-21) if (e = f(c * l(2, 69, 1)) - 69, a = e < 0 ? c * l(2, -e, 1) : c / l(2, e, 1), a *= 4503599627370496, e = 52 - e, e > 0) {
                    g(0, a), r = p;
                    while (r >= 7) g(1e7, 0), r -= 7;
                    g(l(10, r, 1), 0), r = e - 1;
                    while (r >= 23) b(1 << 23), r -= 23;
                    b(1 << r), g(1, 1), b(2), y = m()
                } else g(0, a), g(1 << -e, 0), y = m() + o.call("0", p);
                return p > 0 ? (s = y.length, y = h + (s <= p ? "0." + o.call("0", p - s) + y : y.slice(0, s - p) + "." + y.slice(s - p))) : y = h + y, y
            }
        })
    }
}]);