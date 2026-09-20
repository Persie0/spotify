package p204p;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ec21 extends yno {

    /* JADX INFO: renamed from: c */
    public static final fd11 f58217c = new fd11(2);

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f58218b = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: c */
    public static dc21 m38468c(HashMap map) {
        map.put(hf71.f90618b, map.get(hf71.f90617a));
        map.put(hf71.f90620d, map.get(hf71.f90619c));
        hf71 hf71Var = hf71.f90621e;
        if (map.containsKey(hf71Var)) {
            hf71 hf71Var2 = hf71.f90622f;
            if (!map.containsKey(hf71Var2)) {
                map.put(hf71Var2, map.get(hf71Var));
            }
        }
        return new dc21(map);
    }

    /* JADX INFO: renamed from: e */
    public static String m38469e(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    /* JADX INFO: renamed from: f */
    public static String m38470f(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i) : str.substring(0, 1);
    }

    @Override // p204p.yno
    /* JADX INFO: renamed from: a */
    public final String mo33464a(dz61 dz61Var, long j, hf71 hf71Var, Locale locale) {
        Map map;
        Object objM38471d = m38471d(dz61Var, locale);
        if (!(objM38471d instanceof dc21) || (map = (Map) ((dc21) objM38471d).f47408a.get(hf71Var)) == null) {
            return null;
        }
        return (String) map.get(Long.valueOf(j));
    }

    @Override // p204p.yno
    /* JADX INFO: renamed from: b */
    public final Iterator mo33465b(dz61 dz61Var, hf71 hf71Var, Locale locale) {
        List list;
        Object objM38471d = m38471d(dz61Var, locale);
        if (!(objM38471d instanceof dc21) || (list = (List) ((dc21) objM38471d).f47409b.get(hf71Var)) == null) {
            return null;
        }
        return list.iterator();
    }

    /* JADX INFO: renamed from: d */
    public final Object m38471d(dz61 dz61Var, Locale locale) {
        ConcurrentHashMap concurrentHashMap;
        Object objM38468c;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(dz61Var, locale);
        ConcurrentHashMap concurrentHashMap2 = this.f58218b;
        Object obj = concurrentHashMap2.get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        dce dceVar = dce.MONTH_OF_YEAR;
        hf71 hf71Var = hf71.f90621e;
        hf71 hf71Var2 = hf71.f90619c;
        hf71 hf71Var3 = hf71.f90617a;
        if (dz61Var == dceVar) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map = new HashMap();
            concurrentHashMap = concurrentHashMap2;
            String[] months = dateFormatSymbols.getMonths();
            HashMap map2 = new HashMap();
            map2.put(1L, months[0]);
            map2.put(2L, months[1]);
            map2.put(3L, months[2]);
            map2.put(4L, months[3]);
            map2.put(5L, months[4]);
            map2.put(6L, months[5]);
            map2.put(7L, months[6]);
            map2.put(8L, months[7]);
            map2.put(9L, months[8]);
            map2.put(10L, months[9]);
            map2.put(11L, months[10]);
            map2.put(12L, months[11]);
            map.put(hf71Var3, map2);
            HashMap map3 = new HashMap();
            map3.put(1L, m38470f(1, months[0], locale));
            map3.put(2L, m38470f(2, months[1], locale));
            map3.put(3L, m38470f(3, months[2], locale));
            map3.put(4L, m38470f(4, months[3], locale));
            map3.put(5L, m38470f(5, months[4], locale));
            map3.put(6L, m38470f(6, months[5], locale));
            map3.put(7L, m38470f(7, months[6], locale));
            map3.put(8L, m38470f(8, months[7], locale));
            map3.put(9L, m38470f(9, months[8], locale));
            map3.put(10L, m38470f(10, months[9], locale));
            map3.put(11L, m38470f(11, months[10], locale));
            map3.put(12L, m38470f(12, months[11], locale));
            map.put(hf71Var, map3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap map4 = new HashMap();
            map4.put(1L, shortMonths[0]);
            map4.put(2L, shortMonths[1]);
            map4.put(3L, shortMonths[2]);
            map4.put(4L, shortMonths[3]);
            map4.put(5L, shortMonths[4]);
            map4.put(6L, shortMonths[5]);
            map4.put(7L, shortMonths[6]);
            map4.put(8L, shortMonths[7]);
            map4.put(9L, shortMonths[8]);
            map4.put(10L, shortMonths[9]);
            map4.put(11L, shortMonths[10]);
            map4.put(12L, shortMonths[11]);
            map.put(hf71Var2, map4);
            objM38468c = m38468c(map);
        } else {
            concurrentHashMap = concurrentHashMap2;
            if (dz61Var == dce.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map5 = new HashMap();
                String[] weekdays = dateFormatSymbols2.getWeekdays();
                HashMap map6 = new HashMap();
                map6.put(1L, weekdays[2]);
                map6.put(2L, weekdays[3]);
                map6.put(3L, weekdays[4]);
                map6.put(4L, weekdays[5]);
                map6.put(5L, weekdays[6]);
                map6.put(6L, weekdays[7]);
                map6.put(7L, weekdays[1]);
                map5.put(hf71Var3, map6);
                HashMap map7 = new HashMap();
                map7.put(1L, m38469e(1, weekdays[2], locale));
                map7.put(2L, m38469e(2, weekdays[3], locale));
                map7.put(3L, m38469e(3, weekdays[4], locale));
                map7.put(4L, m38469e(4, weekdays[5], locale));
                map7.put(5L, m38469e(5, weekdays[6], locale));
                map7.put(6L, m38469e(6, weekdays[7], locale));
                map7.put(7L, m38469e(7, weekdays[1], locale));
                map5.put(hf71Var, map7);
                String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                HashMap map8 = new HashMap();
                map8.put(1L, shortWeekdays[2]);
                map8.put(2L, shortWeekdays[3]);
                map8.put(3L, shortWeekdays[4]);
                map8.put(4L, shortWeekdays[5]);
                map8.put(5L, shortWeekdays[6]);
                map8.put(6L, shortWeekdays[7]);
                map8.put(7L, shortWeekdays[1]);
                map5.put(hf71Var2, map8);
                objM38468c = m38468c(map5);
            } else if (dz61Var == dce.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap map9 = new HashMap();
                String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                HashMap map10 = new HashMap();
                map10.put(0L, amPmStrings[0]);
                map10.put(1L, amPmStrings[1]);
                map9.put(hf71Var3, map10);
                map9.put(hf71Var2, map10);
                objM38468c = m38468c(map9);
            } else if (dz61Var == dce.ERA) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap map11 = new HashMap();
                String[] eras = dateFormatSymbols4.getEras();
                HashMap map12 = new HashMap();
                map12.put(0L, eras[0]);
                map12.put(1L, eras[1]);
                map11.put(hf71Var2, map12);
                if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                    HashMap map13 = new HashMap();
                    map13.put(0L, "Before Christ");
                    map13.put(1L, "Anno Domini");
                    map11.put(hf71Var3, map13);
                } else {
                    map11.put(hf71Var3, map12);
                }
                HashMap map14 = new HashMap();
                map14.put(0L, eras[0].substring(0, 1));
                map14.put(1L, eras[1].substring(0, 1));
                map11.put(hf71Var, map14);
                objM38468c = m38468c(map11);
            } else {
                tp50 tp50Var = up50.f232582a;
                if (dz61Var == sp50.f212735b) {
                    HashMap map15 = new HashMap();
                    HashMap map16 = new HashMap();
                    map16.put(1L, "Q1");
                    map16.put(2L, "Q2");
                    map16.put(3L, "Q3");
                    map16.put(4L, "Q4");
                    map15.put(hf71Var2, map16);
                    HashMap map17 = new HashMap();
                    map17.put(1L, "1st quarter");
                    map17.put(2L, "2nd quarter");
                    map17.put(3L, "3rd quarter");
                    map17.put(4L, "4th quarter");
                    map15.put(hf71Var3, map17);
                    objM38468c = m38468c(map15);
                } else {
                    objM38468c = "";
                }
            }
        }
        ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
        concurrentHashMap3.putIfAbsent(simpleImmutableEntry, objM38468c);
        return concurrentHashMap3.get(simpleImmutableEntry);
    }
}
