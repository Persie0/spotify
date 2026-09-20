package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class gyi0 {

    /* JADX INFO: renamed from: q */
    public static final Pattern f85636q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: r */
    public static final Pattern f85637r = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a */
    public final String f85638a;

    /* JADX INFO: renamed from: b */
    public final String f85639b;

    /* JADX INFO: renamed from: c */
    public final String f85640c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f85641d;

    /* JADX INFO: renamed from: e */
    public final String f85642e;

    /* JADX INFO: renamed from: f */
    public final wg61 f85643f;

    /* JADX INFO: renamed from: g */
    public final wg61 f85644g;

    /* JADX INFO: renamed from: h */
    public final Object f85645h;

    /* JADX INFO: renamed from: i */
    public boolean f85646i;

    /* JADX INFO: renamed from: j */
    public final Object f85647j;

    /* JADX INFO: renamed from: k */
    public final Object f85648k;

    /* JADX INFO: renamed from: l */
    public final Object f85649l;

    /* JADX INFO: renamed from: m */
    public final wg61 f85650m;

    /* JADX INFO: renamed from: n */
    public final String f85651n;

    /* JADX INFO: renamed from: o */
    public final wg61 f85652o;

    /* JADX INFO: renamed from: p */
    public final boolean f85653p;

    public gyi0(String str, String str2, String str3) {
        List listM44518y;
        List listM43714b1;
        this.f85638a = str;
        this.f85639b = str2;
        this.f85640c = str3;
        ArrayList arrayList = new ArrayList();
        this.f85641d = arrayList;
        this.f85643f = new wg61(new fyi0(this, 6));
        this.f85644g = new wg61(new fyi0(this, 4));
        this.f85645h = q3d0.m72078I(3, new fyi0(this, 7));
        this.f85647j = q3d0.m72078I(3, new fyi0(this, 1));
        this.f85648k = q3d0.m72078I(3, new fyi0(this, 0));
        this.f85649l = q3d0.m72078I(3, new fyi0(this, 3));
        this.f85650m = new wg61(new fyi0(this, 2));
        this.f85652o = new wg61(new fyi0(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f85636q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            m46164a(str.substring(0, matcher.start()), arrayList, sb);
            this.f85653p = (wl51.m88496t0(sb, ".*", false) || wl51.m88496t0(sb, "([^/]+?)", false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            this.f85642e = bm51.m29801l0(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(s571.m77251j("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern patternCompile = Pattern.compile("/");
        wl51.m88474X0(0);
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listM44518y = arrayList2;
        } else {
            listM44518y = geg1.m44518y(str3.toString());
        }
        if (listM44518y.isEmpty()) {
            listM43714b1 = lau.f131415a;
        } else {
            ListIterator listIterator = listM44518y.listIterator(listM44518y.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM43714b1 = g6f.m43714b1(listM44518y, listIterator.nextIndex() + 1);
                }
            }
            listM43714b1 = lau.f131415a;
        }
        this.f85651n = bm51.m29801l0(dq60.m36615o("^(", (String) listM43714b1.get(0), "|[*]+)/(", (String) listM43714b1.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    /* JADX INFO: renamed from: a */
    public static void m46164a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f85637r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
            if (matcher.start() > iEnd) {
                sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            }
            sb.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: b */
    public final ArrayList m46165b() {
        Collection collectionValues = ((Map) this.f85645h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((eyi0) it.next()).f64106b, arrayList);
        }
        return g6f.m43700N0((List) this.f85648k.getValue(), g6f.m43700N0(arrayList, this.f85641d));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: c */
    public final Bundle m46166c(Uri uri, LinkedHashMap linkedHashMap) {
        Pattern pattern = (Pattern) this.f85643f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (m46167d(matcher, bundle, linkedHashMap) && (!((Boolean) this.f85644g.getValue()).booleanValue() || m46168e(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.f85650m.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.f85648k.getValue();
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        String str = (String) obj;
                        String strDecode = Uri.decode(matcher2.group(i2));
                        qxi0 qxi0Var = (qxi0) linkedHashMap.get(str);
                        if (qxi0Var != null) {
                            try {
                                ozi0 ozi0Var = qxi0Var.f193681a;
                                ozi0Var.mo38911e(bundle, str, ozi0Var.mo38910d(strDecode));
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            bundle.putString(str, strDecode);
                        }
                        arrayList.add(w2a1.f247311a);
                        i = i2;
                    }
                }
                if (mif1.m61850C(linkedHashMap, new duo(1, bundle)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m46167d(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f85641d;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i2));
            qxi0 qxi0Var = (qxi0) map.get(str);
            if (qxi0Var != null) {
                try {
                    ozi0 ozi0Var = qxi0Var.f193681a;
                    ozi0Var.mo38911e(bundle, str, ozi0Var.mo38910d(strDecode));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                bundle.putString(str, strDecode);
            }
            arrayList2.add(w2a1.f247311a);
            i = i2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: e */
    public final boolean m46168e(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.f85645h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            eyi0 eyi0Var = (eyi0) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f85646i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = Collections.singletonList(query);
            }
            Object obj = w2a1.f247311a;
            int i = 0;
            Bundle bundleM70529j = pp91.m70529j(new pqm0[0]);
            for (String str2 : eyi0Var.f64106b) {
                qxi0 qxi0Var = (qxi0) map.get(str2);
                ozi0 ozi0Var = qxi0Var != null ? qxi0Var.f193681a : null;
                if ((ozi0Var instanceof k4f) && !qxi0Var.f193683c) {
                    ozi0Var.mo38911e(bundleM70529j, str2, ((k4f) ozi0Var).mo38912g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = eyi0Var.f64105a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList = eyi0Var.f64106b;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                int i2 = i;
                for (Object obj2 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    String strGroup = matcher.group(i3);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    int i4 = i;
                    qxi0 qxi0Var2 = (qxi0) map.get(str5);
                    try {
                        if (bundleM70529j.containsKey(str5)) {
                            if (bundleM70529j.containsKey(str5)) {
                                if (qxi0Var2 != null) {
                                    ozi0 ozi0Var2 = qxi0Var2.f193681a;
                                    Object objMo38907a = ozi0Var2.mo38907a(str5, bundleM70529j);
                                    if (!bundleM70529j.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    ozi0Var2.mo38911e(bundleM70529j, str5, ozi0Var2.mo38909c(objMo38907a, strGroup));
                                    objValueOf = obj;
                                }
                                z = i4;
                            } else {
                                z = 1;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj;
                            }
                        } else {
                            if (qxi0Var2 != null) {
                                ozi0 ozi0Var3 = qxi0Var2.f193681a;
                                ozi0Var3.mo38911e(bundleM70529j, str5, ozi0Var3.mo38910d(strGroup));
                            } else {
                                bundleM70529j.putString(str5, strGroup);
                            }
                            objValueOf = obj;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(objValueOf);
                    i2 = i3;
                    i = i4;
                }
            }
            bundle.putAll(bundleM70529j);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof gyi0)) {
            gyi0 gyi0Var = (gyi0) obj;
            if (wj50.m88271j(this.f85638a, gyi0Var.f85638a) && wj50.m88271j(this.f85639b, gyi0Var.f85639b) && wj50.m88271j(this.f85640c, gyi0Var.f85640c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f85638a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85639b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85640c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
