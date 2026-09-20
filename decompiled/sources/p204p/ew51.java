package p204p;

import android.util.LruCache;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class ew51 {

    /* JADX INFO: renamed from: a */
    public final phj0 f63433a;

    /* JADX INFO: renamed from: b */
    public final qbc0 f63434b;

    /* JADX INFO: renamed from: c */
    public final t46 f63435c;

    /* JADX INFO: renamed from: d */
    public final LruCache f63436d = new LruCache(20);

    public ew51(phj0 phj0Var, qbc0 qbc0Var, t46 t46Var) {
        this.f63433a = phj0Var;
        this.f63434b = qbc0Var;
        this.f63435c = t46Var;
    }

    /* JADX INFO: renamed from: e */
    public static String m40132e(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (wl51.m88496t0(lowerCase, ".vtt", false) || wl51.m88496t0(lowerCase, "webvtt", false)) {
            return "text/vtt";
        }
        if (wl51.m88496t0(lowerCase, ".mp4vtt", false) || wl51.m88496t0(lowerCase, "mp4webvtt", false)) {
            return "application/x-mp4-vtt";
        }
        if (wl51.m88496t0(lowerCase, ".srt", false) || wl51.m88496t0(lowerCase, "subrip", false)) {
            return "application/x-subrip";
        }
        if (wl51.m88496t0(lowerCase, ".sub", false) || wl51.m88496t0(lowerCase, "vobsub", false)) {
            return "application/vobsub";
        }
        if (wl51.m88496t0(lowerCase, ".ass", false) || wl51.m88496t0(lowerCase, ".ssa", false)) {
            return "text/x-ssa";
        }
        if (wl51.m88496t0(lowerCase, ".ttml", false) || wl51.m88496t0(lowerCase, ".xml", false)) {
            return "application/ttml+xml";
        }
        if (wl51.m88496t0(lowerCase, ".tx3g", false)) {
            return "application/x-quicktime-tx3g";
        }
        if (wl51.m88496t0(lowerCase, ".pgs", false)) {
            return "application/pgs";
        }
        if (wl51.m88496t0(lowerCase, ".dvb", false)) {
            return "application/dvbsubs";
        }
        Logger.m3973i(s571.m77251j("Could not determine subtitle format from URL: ", s571.m77251j("SubtitleUrl(value=", str, ")"), ", defaulting to WebVTT"), new Object[0]);
        return "text/vtt";
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40133a(String str, Locale locale, ibk ibkVar) throws Throwable {
        zv51 zv51Var;
        pqm0 pqm0Var;
        String str2;
        Locale locale2;
        List list;
        LruCache lruCache;
        w9c1 w9c1Var;
        if (ibkVar instanceof zv51) {
            zv51Var = (zv51) ibkVar;
            int i = zv51Var.f286625f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv51Var.f286625f = i - Integer.MIN_VALUE;
            } else {
                zv51Var = new zv51(this, ibkVar);
            }
        } else {
            zv51Var = new zv51(this, ibkVar);
        }
        Object objM40136d = zv51Var.f286623d;
        int i2 = zv51Var.f286625f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM40136d);
            zv51Var.f286620a = str;
            zv51Var.f286621b = locale;
            zv51Var.f286625f = 1;
            objM40136d = m40136d(str, locale, zv51Var);
            if (objM40136d != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            locale = zv51Var.f286621b;
            str = zv51Var.f286620a;
            bga.m29073P(objM40136d);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale2 = zv51Var.f286622c;
            str2 = zv51Var.f286620a;
            bga.m29073P(objM40136d);
        }
        list = (List) objM40136d;
        if (!list.isEmpty()) {
            rbc0 rbc0Var = new rbc0(str2);
            lruCache = this.f63436d;
            w9c1Var = (w9c1) lruCache.get(rbc0Var);
            if (w9c1Var == null) {
                w9c1Var = new w9c1();
                lruCache.put(new rbc0(str2), w9c1Var);
            }
            w9c1Var.f249156a.put(locale2, list);
        }
        return list;
        Map map = (Map) objM40136d;
        if (!map.isEmpty()) {
            fx51 fx51Var = (fx51) map.get(locale);
            String str3 = fx51Var != null ? fx51Var.f74247a : null;
            if (str3 != null) {
                pqm0Var = new pqm0(locale, new fx51(str3));
            } else {
                Set setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setEntrySet) {
                    if (wj50.m88271j(locale.getLanguage(), ((Locale) ((Map.Entry) obj2).getKey()).getLanguage())) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    pqm0Var = null;
                } else {
                    Map.Entry entry = (Map.Entry) g6f.m43741q0(arrayList);
                    pqm0Var = new pqm0(entry.getKey(), entry.getValue());
                }
            }
            if (pqm0Var != null) {
                Locale locale3 = (Locale) pqm0Var.f180350a;
                String str4 = ((fx51) pqm0Var.f180351b).f74247a;
                zv51Var.f286620a = str;
                zv51Var.f286621b = null;
                zv51Var.f286622c = locale3;
                zv51Var.f286625f = 2;
                objM40136d = m40137f(str4, zv51Var);
                if (objM40136d != obj) {
                    str2 = str;
                    locale2 = locale3;
                    list = (List) objM40136d;
                    if (!list.isEmpty()) {
                        rbc0 rbc0Var2 = new rbc0(str2);
                        lruCache = this.f63436d;
                        w9c1Var = (w9c1) lruCache.get(rbc0Var2);
                        if (w9c1Var == null) {
                            w9c1Var = new w9c1();
                            lruCache.put(new rbc0(str2), w9c1Var);
                        }
                        w9c1Var.f249156a.put(locale2, list);
                    }
                    return list;
                }
                return obj;
            }
        }
        return lau.f131415a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, p.lau] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX INFO: renamed from: b */
    public final Object m40134b(String str, ibk ibkVar) {
        aw51 aw51Var;
        Object next;
        List list;
        if (ibkVar instanceof aw51) {
            aw51Var = (aw51) ibkVar;
            int i = aw51Var.f20405d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw51Var.f20405d = i - Integer.MIN_VALUE;
            } else {
                aw51Var = new aw51(this, ibkVar);
            }
        } else {
            aw51Var = new aw51(this, ibkVar);
        }
        Object objM72491a = aw51Var.f20403b;
        int i2 = aw51Var.f20405d;
        LruCache lruCache = this.f63436d;
        if (i2 == 0) {
            bga.m29073P(objM72491a);
            w9c1 w9c1Var = (w9c1) lruCache.get(new rbc0(str));
            if (w9c1Var != null) {
                ConcurrentHashMap concurrentHashMap = w9c1Var.f249156a;
                ArrayList arrayList = w9c1Var.f249157b;
                if (arrayList != null) {
                    return arrayList;
                }
                if (!concurrentHashMap.isEmpty()) {
                    Set setKeySet = concurrentHashMap.keySet();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(setKeySet, 10));
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new fv51(((Locale) it.next()).toLanguageTag()));
                    }
                    w9c1Var.f249157b = arrayList2;
                    return arrayList2;
                }
            }
            aw51Var.f20402a = str;
            aw51Var.f20405d = 1;
            objM72491a = this.f63434b.m72491a(str, aw51Var);
            yuk yukVar = yuk.f276404a;
            if (objM72491a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = aw51Var.f20402a;
            bga.m29073P(objM72491a);
        }
        nd41 nd41Var = (nd41) objM72491a;
        ?? arrayList3 = lau.f131415a;
        if (nd41Var == null) {
            return arrayList3;
        }
        nx51 nx51Var = nd41Var.f152654c;
        ?? r1 = nx51Var != null ? nx51Var.f159374a : arrayList3;
        cej cejVar = (cej) g6f.m43745s0(nd41Var.f152652a);
        if (cejVar != null && (list = cejVar.f37138d) != null) {
            arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((r2s0) obj).f195221a == 3) {
                    arrayList3.add(obj);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            r2s0 r2s0Var = (r2s0) next2;
            if (r2s0Var.f195223c != null) {
                bmr0 bmr0Var = (bmr0) g6f.m43745s0(r2s0Var.f195222b);
                if ((bmr0Var != null ? (String) g6f.m43745s0(bmr0Var.f28603c) : null) != null) {
                    arrayList4.add(next2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<r2s0> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (hashSet.add(((r2s0) obj2).f195223c)) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(i6f.m49804T(arrayList5, 10));
        for (r2s0 r2s0Var2 : arrayList5) {
            String str2 = r2s0Var2.f195223c;
            wj50.m88279p(str2);
            Iterator it3 = r1.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!wj50.m88271j(((fv51) next).f73685f, str2));
            fv51 fv51VarM32722t = (fv51) next;
            if (fv51VarM32722t == null) {
                bmr0 bmr0Var2 = (bmr0) g6f.m43745s0(r2s0Var2.f195222b);
                fv51VarM32722t = bmr0Var2 != null ? cgg1.m32722t(bmr0Var2.f28602b) : null;
                if (fv51VarM32722t == null) {
                    fv51VarM32722t = new fv51(str2);
                }
            }
            arrayList6.add(fv51VarM32722t);
        }
        if (!arrayList6.isEmpty()) {
            w9c1 w9c1Var2 = (w9c1) lruCache.get(new rbc0(str));
            if (w9c1Var2 == null) {
                w9c1Var2 = new w9c1();
                lruCache.put(new rbc0(str), w9c1Var2);
            }
            w9c1Var2.f249157b = arrayList6;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m40135c(String str, Locale locale, ibk ibkVar) {
        bw51 bw51Var;
        if (ibkVar instanceof bw51) {
            bw51Var = (bw51) ibkVar;
            int i = bw51Var.f31564e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bw51Var.f31564e = i - Integer.MIN_VALUE;
            } else {
                bw51Var = new bw51(this, ibkVar);
            }
        } else {
            bw51Var = new bw51(this, ibkVar);
        }
        Object objM40133a = bw51Var.f31562c;
        int i2 = bw51Var.f31564e;
        if (i2 == 0) {
            bga.m29073P(objM40133a);
            w9c1 w9c1Var = (w9c1) this.f63436d.get(new rbc0(str));
            List list = null;
            if (w9c1Var != null) {
                ConcurrentHashMap concurrentHashMap = w9c1Var.f249156a;
                List list2 = (List) concurrentHashMap.get(locale);
                if (list2 != null) {
                    list = list2;
                } else {
                    Set setEntrySet = concurrentHashMap.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setEntrySet) {
                        if (wj50.m88271j(locale.getLanguage(), ((Locale) ((Map.Entry) obj).getKey()).getLanguage())) {
                            arrayList.add(obj);
                        }
                    }
                    Map.Entry entry = (Map.Entry) g6f.m43745s0(arrayList);
                    if (entry != null) {
                        list = (List) entry.getValue();
                    }
                }
            }
            if (list != null) {
                return list;
            }
            bw51Var.f31560a = str;
            bw51Var.f31561b = locale;
            bw51Var.f31564e = 1;
            objM40133a = m40133a(str, locale, bw51Var);
            Object obj2 = yuk.f276404a;
            if (objM40133a == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale = bw51Var.f31561b;
            str = bw51Var.f31560a;
            bga.m29073P(objM40133a);
        }
        List list3 = (List) objM40133a;
        if (!list3.isEmpty()) {
            return list3;
        }
        Logger.m3973i(dq60.m36615o("No subtitles found for manifestId: ", str, " [", locale.toLanguageTag(), "]"), new Object[0]);
        return lau.f131415a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Serializable m40136d(String str, Locale locale, ibk ibkVar) throws Throwable {
        cw51 cw51Var;
        ArrayList<r2s0> arrayList;
        List list;
        if (ibkVar instanceof cw51) {
            cw51Var = (cw51) ibkVar;
            int i = cw51Var.f42652d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cw51Var.f42652d = i - Integer.MIN_VALUE;
            } else {
                cw51Var = new cw51(this, ibkVar);
            }
        } else {
            cw51Var = new cw51(this, ibkVar);
        }
        Object objM72491a = cw51Var.f42650b;
        int i2 = cw51Var.f42652d;
        if (i2 == 0) {
            bga.m29073P(objM72491a);
            cw51Var.f42649a = locale;
            cw51Var.f42652d = 1;
            objM72491a = this.f63434b.m72491a(str, cw51Var);
            yuk yukVar = yuk.f276404a;
            if (objM72491a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale = cw51Var.f42649a;
            bga.m29073P(objM72491a);
        }
        nd41 nd41Var = (nd41) objM72491a;
        if (nd41Var == null) {
            return nau.f152117a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cej cejVar = (cej) g6f.m43745s0(nd41Var.f152652a);
        if (cejVar == null || (list = cejVar.f37138d) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((r2s0) obj).f195221a == 3) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            for (r2s0 r2s0Var : arrayList) {
                String str2 = r2s0Var.f195223c;
                if (str2 != null) {
                    Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                    if (locale != null) {
                        wj50.m88279p(localeForLanguageTag);
                        if (wj50.m88271j(localeForLanguageTag.getLanguage(), locale.getLanguage())) {
                        }
                    }
                    bmr0 bmr0Var = (bmr0) g6f.m43745s0(r2s0Var.f195222b);
                    if (bmr0Var != null) {
                        String str3 = (String) g6f.m43745s0(bmr0Var.f28603c);
                        String str4 = bmr0Var.f28605e;
                        if (str3 != null) {
                            linkedHashMap.put(localeForLanguageTag, new fx51(s571.m77250i(str3, str4)));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: f */
    public final Serializable m40137f(String str, ibk ibkVar) throws Throwable {
        dw51 dw51Var;
        String str2 = str;
        t46 t46Var = this.f63435c;
        if (ibkVar instanceof dw51) {
            dw51Var = (dw51) ibkVar;
            int i = dw51Var.f53611d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw51Var.f53611d = i - Integer.MIN_VALUE;
            } else {
                dw51Var = new dw51(this, ibkVar);
            }
        } else {
            dw51Var = new dw51(this, ibkVar);
        }
        Object objM89557A = dw51Var.f53609b;
        int i2 = dw51Var.f53611d;
        lau lauVar = lau.f131415a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                phj0 phj0Var = this.f63433a;
                dw51Var.f53608a = str2;
                dw51Var.f53611d = 1;
                objM89557A = x0h1.m89557A(phj0Var.f177672a, new rzb0(str2, phj0Var, (fbk) null, 14), dw51Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = dw51Var.f53608a;
                bga.m29073P(objM89557A);
            }
            byte[] bArr = (byte[]) objM89557A;
            if (bArr == null) {
                Logger.m3973i("Failed to download subtitle from: " + str2, new Object[0]);
                return lauVar;
            }
            if (bArr.length == 0) {
                Logger.m3973i("Empty subtitle content from: " + str2, new Object[0]);
                return lauVar;
            }
            String strM40132e = m40132e(str2);
            p300 p300Var = new p300();
            p300Var.f173527o = def0.m35799p(strM40132e);
            r300 r300Var = new r300(p300Var);
            if (!t46Var.mo45920g(r300Var)) {
                Logger.m3973i("Unsupported subtitle format: " + strM40132e + " for URL: " + str2, new Object[0]);
                return lauVar;
            }
            iw51 iw51VarMo45921i = t46Var.mo45921i(r300Var);
            ArrayList arrayList = new ArrayList();
            int length = bArr.length;
            hw51 hw51Var = hw51.f95862c;
            sep sepVar = new sep();
            sepVar.f208338a = arrayList;
            iw51VarMo45921i.mo27086g(bArr, 0, length, hw51Var, sepVar);
            return arrayList;
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38564m("Failed to parse subtitle from: ", str2), new Object[0]);
            return lauVar;
        }
    }
}
