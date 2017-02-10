function showCalendarBox(e) {
    var t = $("#" + e).val();
    $("#ndp-target-id").html(e);
    var n = $("#" + e).position();
    var n = $("#" + e).position();
    $("#ndp-nepali-box").css("top", n.top + $("#" + e).outerHeight()), $("#ndp-nepali-box").css("left", n.left), showCalendar(t)
}

function setSelectedDay(e) {
    var t = $("#ndp-target-id").html();
    $("#" + t).val(e), hideCalendarBox()
}

function showCalendar(e) {
    $("#ndp-nepali-box table").find("tr:gt(0)").remove(), "" == e ? $("#ndp-nepali-box table").append(getDateTable("")) : $("#ndp-nepali-box table").append(getDateTable(e)), "block" == $("#ndp-nepali-box").css("display") && $("#ndp-nepali-box").hide(), $("#ndp-nepali-box").fadeIn(100)
}

function getDateTable(e) {
    if ("" == e) {
        var t = getNepaliDate(),
            n = getMonthParameters(t),
            r = getDateRows(n[0], n[1], n[2], n[3], n[4]);
        return r
    }
    var n = getMonthParameters(e),
        r = getDateRows(n[0], n[1], n[2], n[3], n[4]);
    return r
}

function getMonthParameters(e) {
    var t = e.split("-"),
        n = t[0],
        r = t[1];
    $("#currentMonth").html(getNepaliMonth(r - 1) + "  " + englishNo2Nep(n)), nYear = pYear = n, nMonth = parseInt(r, 10) + 1, nMonth > 12 && (nYear++, nMonth = "01"), pMonth = parseInt(r, 10) - 1, 1 > pMonth && (pYear--, pMonth = "12"), $("#prev").attr("onclick", "showCalendar('" + pYear + "-" + pMonth + "-" + "01')"), $("#next").attr("onclick", "showCalendar('" + nYear + "-" + nMonth + "-" + "01')");
    var i = t[2],
        s = numberOfBsDays(n, r - 1),
        o = new NepaliDateConverter,
        u = r + "/" + "1" + "/" + n,
        a = o.bs2ad(u),
        f = a.split("-"),
        l = f[0],
        c = f[1],
        h = f[2],
        p = new Date(l, c - 1, h),
        d = p.getDay();
    return [d, s, n, r, i]
}

function getDateRows(e, t, n, r, i) {
    var s = getNepaliDate(),
        o = s.split("-");
    o[0];
    for (var u = get2DigitNo(o[1]), a = get2DigitNo(o[2]), f = "", l = 0; e + t > l; l++) {
        0 == l % 7 && (f += "<tr>");
        var c = l - e + 1,
            h = "" + n + "-" + get2DigitNo(r) + "-" + get2DigitNo(c),
            p = "";
        p = get2DigitNo(r) == u && a == get2DigitNo(c) ? "ndp-selected" : c == i ? "ndp-current" : "ndp-date", e > l ? f += "<td></td>\n" : (f += "<td class='" + p + "'>", f += "<a href='javascript:void(0);' onclick=\"setSelectedDay('" + h + "')\">" + englishNo2Nep(c) + "</a>", f += "</td>\n"), 6 == l % 7 && (f += "</tr>\n")
    }
    return f
}

function hideCalendarBox() {
    $("#ndp-nepali-box").fadeOut(100);
	
        if (!(typeof(nepaliDateSelect)=='undefined')) {nepaliDateSelect();}
}

function get2DigitNo(e) {
    return e = parseInt(e, 10), 10 > e ? "0" + ("" + e) : "" + e
}

function getMonths() {
    var e = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    return e
}

function getNepaliMonths() {
    var e = ["Baisakh", "Jestha", "Ashar", "Shrawan", "Bhadra", "Ashoj", "Kartik", "Mangsir", "Poush", "Magh", "Falgun", "Chaitra"];
    return e
}

function getNepaliDaysShort() {
    var e = ["आ", "सो", "मं", "बु", "बि", "शु,", "श"];
    return e
}

function getNepaliMonth(e) {
    e = parseInt(e, 10);
    var t = ["बैशाख", "जेठ", "अषाढ", "श्रावण", "भाद्र", "आश्विन", "कार्तिक", "मङ्सिर", "पौष", "माघ", "फाल्गुन", "चैत्र"];
    return t[e]
}

function getCurrentDayName() {
    var e = new Date,
        t = e.getDay(),
        n = Array(7);
    return n[0] = "Sunday", n[1] = "Monday", n[2] = "Tuesday", n[3] = "Wednesday", n[4] = "Thursday", n[5] = "Friday", n[6] = "Saturday", n[t]
}

function getDayFromDate(e) {
    var t = e.split("-"),
        n = t[2],
        r = t[1],
        i = t[0],
        s = new Date(i, r - 1, n),
        o = s.getDay(),
        u = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
    return u[o]
}

function numberOfBsDays(e, t) {
    var n = new NepaliDateConverter;
    return n.bs[e][t]
}

function numberOfDays(e, t) {
    var n = new Date(e, t, 0);
    return n.getDate()
}

function getNepaliDate() {
    var e = new NepaliDateConverter;
    return e.ad2bs(getDateInNo("/"))
}

function getDateInWords() {
    var e = getMonths(),
        t = new Date,
        n = t.getDate(),
        r = t.getMonth() + 1,
        i = t.getYear(),
        s = 1e3 > i ? i + 1900 : i;
    return n + " " + e[r] + ", " + s
}

function getDateInNo(e) {
    var t = new Date,
        n = t.getDate(),
        r = t.getMonth() + 1,
        i = t.getFullYear();
    return r + e + n + e + i
}

function getAdDateInWords(e) {
    var t = getMonths(),
        n = e.split("-"),
        r = n[2],
        i = n[1],
        s = n[0];
    return r + " " + t[i] + ", " + s
}

function getNepaliDateInWords(e) {
    var t = getNepaliMonths(),
        n = e.split("-"),
        r = n[2],
        i = n[1],
        s = n[0];
    return r + " " + t[i] + ", " + s
}

function getCurrentYear() {
    var e = new Date,
        t = e.getFullYear();
    return t
}

function getCurrentMonth() {
    var e = new Date,
        t = e.getMonth() + 1;
    return t
}

function getCurrentDay() {
    var e = new Date,
        t = e.getDate();
    return t
}

function makeArray() {
    for (i = 0; makeArray.arguments.length > i; i++) this[i + 1] = makeArray.arguments[i]
}

function englishNo2Nep(e) {
    e = "" + e;
    for (var t = "", n = 0; e.length > n; n++) t += convertNos(e[n]);
    return t
}

function convertNos(e) {
    switch (e) {
        case "०":
            return 0;
        case "१":
            return 1;
        case "२":
            return 2;
        case "३":
            return 3;
        case "४":
            return 4;
        case "५":
            return 5;
        case "६":
            return 6;
        case "७":
            return 7;
        case "८":
            return 8;
        case "९":
            return 9;
        case "0":
            return "०";
        case "1":
            return "१";
        case "2":
            return "२";
        case "3":
            return "३";
        case "4":
            return "४";
        case "5":
            return "५";
        case "6":
            return "६";
        case "7":
            return "७";
        case "8":
            return "८";
        case "9":
            return "९"
    }
}

function NepaliDateConverter() {
    this.bs_date_eq = "09/17/2000", this.ad_date_eq = "01/01/1944", this.bs = [], this.bs[2e3] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2001] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2002] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2003] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2004] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2005] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2006] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2007] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2008] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31], this.bs[2009] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2010] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2011] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2012] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30], this.bs[2013] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2014] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2015] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2016] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30], this.bs[2017] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2018] = [31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2019] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2020] = [31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2021] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2022] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30], this.bs[2023] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2024] = [31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2025] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2026] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2027] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2028] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2029] = [31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30], this.bs[2030] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2031] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2032] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2033] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2034] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2035] = [30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31], this.bs[2036] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2037] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2038] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2039] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30], this.bs[2040] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2041] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2042] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2043] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30], this.bs[2044] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2045] = [31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2046] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2047] = [31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2048] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2049] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30], this.bs[2050] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2051] = [31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2052] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2053] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30], this.bs[2054] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2055] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2056] = [31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30], this.bs[2057] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2058] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2059] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2060] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2061] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2062] = [30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31], this.bs[2063] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2064] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2065] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2066] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31], this.bs[2067] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2068] = [31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2069] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2070] = [31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30], this.bs[2071] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2072] = [31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30], this.bs[2073] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31], this.bs[2074] = [31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2075] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2076] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30], this.bs[2077] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31], this.bs[2078] = [31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2079] = [31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30], this.bs[2080] = [31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30], this.bs[2081] = [31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30], this.bs[2082] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30], this.bs[2083] = [31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30], this.bs[2084] = [31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30], this.bs[2085] = [31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30], this.bs[2086] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30], this.bs[2087] = [31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30], this.bs[2088] = [30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30], this.bs[2089] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30], this.bs[2090] = [30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30], this.count_ad_days = count_ad_days, this.count_bs_days = count_bs_days, this.add_bs_days = add_bs_days, this.add_ad_days = add_ad_days, this.bs2ad = bs2ad, this.ad2bs = ad2bs
}

function count_ad_days(e, t) {
    var n = 864e5,
        r = e.split("/"),
        i = t.split("/");
    r[2] = Number(r[2]), r[1] = Number(r[1]), r[0] = Number(r[0]), i[2] = Number(i[2]), i[1] = Number(i[1]), i[0] = Number(i[0]);
    var s = new Date(r[2], r[0] - 1, r[1]),
        o = new Date(i[2], i[0] - 1, i[1]),
        u = Math.ceil((o.getTime() - s.getTime()) / n);
    return u
}

function count_bs_days(e, t) {
    var n = e.split("/"),
        r = t.split("/"),
        i = Number(n[2]),
        s = Number(n[0]),
        o = Number(n[1]),
        u = Number(r[2]),
        a = Number(r[0]),
        f = Number(r[1]),
        l = 0,
        c = 0;
    for (c = i; u >= c; c++) l += arraySum(this.bs[c]);
    for (c = 0; s > c; c++) l -= this.bs[i][c];
    for (l += this.bs[i][11], c = a - 1; 12 > c; c++) l -= this.bs[u][c];
    return l -= o + 1, l += f - 1
}

function add_ad_days(e, t) {
    var n = new Date(e);
    return n.setDate(n.getDate() + t), n.getFullYear() + "-" + (n.getMonth() + 1) + "-" + n.getDate()
}

function add_bs_days(e, t) {
    var n = e.split("/"),
        r = Number(n[2]),
        i = Number(n[0]),
        s = Number(n[1]);
    for (s += t; s > this.bs[r][i - 1];) s -= this.bs[r][i - 1], i++, i > 12 && (i = 1, r++);
    return r + "-" + i + "-" + s
}

function bs2ad(e) {
    return days_count = this.count_bs_days(this.bs_date_eq, e), this.add_ad_days(this.ad_date_eq, days_count)
}

function ad2bs(e) {
    return days_count = this.count_ad_days(this.ad_date_eq, e), this.add_bs_days(this.bs_date_eq, days_count)
}(function(e) {
    e.fn.nepaliDatePicker = function() {
        this.each(function() {
            var n = e(this).attr("id");
            e(this).addClass("ndp-nepali-calendar"), e(this).attr("onfocus", "showCalendarBox('" + n + "')"), e("body").append(calendarDivString)
        }), e(".ndp-nepali-calendar, #ndp-nepali-box").hover(function() {
            mouse_is_inside = !0
        }, function() {
            mouse_is_inside = !1
        }), e("html").mouseup(function() {
            mouse_is_inside || hideCalendarBox()
        })
    }
})(jQuery);
var mouse_is_inside = !1,
    calendarDivString = '<div id="ndp-nepali-box" class="ndp-corner-all" style="display:none">';
calendarDivString += '<span id="ndp-target-id" style="display:none"></span>', calendarDivString += '<div class="ndp-corner-all ndp-header">', calendarDivString += '<a href="javascript:void(0)" id="prev" title="Previous Month" class="ndp-prev"></a>', calendarDivString += '<a href="javascript:void(0)" id="next" title="Next Month" class="ndp-next"></a>', calendarDivString += '<span id="currentMonth"></span>', calendarDivString += "</div>", calendarDivString += "<table>", calendarDivString += '<tr class="ndp-days">', calendarDivString += "<th>आ</th>", calendarDivString += "<th>सो</th>", calendarDivString += "<th>मं</th>", calendarDivString += "<th>बु</th>", calendarDivString += "<th>बि</th>", calendarDivString += "<th>शु</th>", calendarDivString += "<th>श</th>", calendarDivString += "</tr>", calendarDivString += "</table>", calendarDivString += "</div>", arraySum = function(e) {
    for (var t = 0, n = e.length; n; t += e[--n]);
    return t
}