package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyi0 {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ int f117413X = 0;

    /* JADX INFO: renamed from: a */
    public final String f117414a;

    /* JADX INFO: renamed from: b */
    public ryi0 f117415b;

    /* JADX INFO: renamed from: c */
    public String f117416c;

    /* JADX INFO: renamed from: d */
    public CharSequence f117417d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f117418e;

    /* JADX INFO: renamed from: f */
    public final mw31 f117419f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f117420g;

    /* JADX INFO: renamed from: h */
    public int f117421h;

    /* JADX INFO: renamed from: i */
    public String f117422i;

    /* JADX INFO: renamed from: t */
    public wg61 f117423t;

    static {
        new LinkedHashMap();
    }

    public jyi0(aaj0 aaj0Var) {
        LinkedHashMap linkedHashMap = eaj0.f57688b;
        this.f117414a = oig1.m67026n(aaj0Var.getClass());
        this.f117418e = new ArrayList();
        this.f117419f = new mw31(0);
        this.f117420g = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m54790a(gyi0 gyi0Var) {
        ArrayList arrayListM61850C = mif1.m61850C(this.f117420g, new iyi0(gyi0Var, 0));
        if (arrayListM61850C.isEmpty()) {
            this.f117418e.add(gyi0Var);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + gyi0Var.f85638a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListM61850C).toString());
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m54791b(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f117420g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            qxi0 qxi0Var = (qxi0) entry.getValue();
            if (qxi0Var.f193683c && (obj = qxi0Var.f193685e) != null) {
                qxi0Var.f193681a.mo38911e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                qxi0 qxi0Var2 = (qxi0) entry2.getValue();
                boolean z = qxi0Var2.f193684d;
                ozi0 ozi0Var = qxi0Var2.f193681a;
                if (!z) {
                    if (qxi0Var2.f193682b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            ozi0Var.mo38907a(str2, bundle2);
                        } catch (ClassCastException unused) {
                        }
                    }
                    StringBuilder sbM38572u = edb.m38572u("Wrong argument type for '", str2, "' in argument bundle. ");
                    sbM38572u.append(ozi0Var.mo38908b());
                    sbM38572u.append(" expected.");
                    throw new IllegalArgumentException(sbM38572u.toString().toString());
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public final oxi0 m54792d(int i) {
        oxi0 oxi0Var;
        mw31 mw31Var = this.f117419f;
        if (mw31Var.m62986h() == 0) {
            oxi0Var = null;
        } else {
            mw31Var.getClass();
            oxi0Var = (oxi0) fag1.m41164m(mw31Var, i);
        }
        if (oxi0Var != null) {
            return oxi0Var;
        }
        ryi0 ryi0Var = this.f117415b;
        if (ryi0Var != null) {
            return ryi0Var.m54792d(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m54793e() {
        return this.f117414a;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof jyi0)) {
                jyi0 jyi0Var = (jyi0) obj;
                mw31 mw31Var = jyi0Var.f117419f;
                LinkedHashMap linkedHashMap = jyi0Var.f117420g;
                boolean zM88271j = wj50.m88271j(this.f117418e, jyi0Var.f117418e);
                mw31 mw31Var2 = this.f117419f;
                if (mw31Var2.m62986h() != mw31Var.m62986h()) {
                    z = false;
                    break;
                }
                Iterator it = ((b6j) btz0.m30477A(new nw31(mw31Var2, 1))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!wj50.m88271j(fag1.m41164m(mw31Var2, iIntValue), fag1.m41164m(mw31Var, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap2 = this.f117420g;
                if (linkedHashMap2.size() != linkedHashMap.size()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap.containsKey(entry.getKey()) || !wj50.m88271j(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (this.f117421h != jyi0Var.f117421h || !wj50.m88271j(this.f117422i, jyi0Var.f117422i) || !zM88271j || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:98:0x0201  */
    /* JADX INFO: renamed from: f */
    public hyi0 mo54794f(oge0 oge0Var) {
        int i;
        hyi0 hyi0Var;
        int i2;
        List listM44518y;
        List listM43714b1;
        List listM44518y2;
        int i3;
        this = this;
        ArrayList<gyi0> arrayList = this.f117418e;
        Bundle bundle = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        hyi0 hyi0Var2 = null;
        for (gyi0 gyi0Var : arrayList) {
            Uri uri = (Uri) oge0Var.f165107b;
            LinkedHashMap linkedHashMap = this.f117420g;
            Bundle bundleM46166c = uri != null ? gyi0Var.m46166c(uri, linkedHashMap) : bundle;
            String str = gyi0Var.f85638a;
            int size = (uri == null || str == null) ? 0 : g6f.m43750v0(uri.getPathSegments(), Uri.parse(str).getPathSegments()).size();
            String str2 = (String) oge0Var.f165108c;
            boolean z = str2 != null && str2.equals(gyi0Var.f85639b);
            String str3 = (String) oge0Var.f165109d;
            if (str3 != null) {
                String str4 = gyi0Var.f85640c;
                if (str4 != null) {
                    Pattern pattern = (Pattern) gyi0Var.f85652o.getValue();
                    wj50.m88279p(pattern);
                    if (pattern.matcher(str3).matches()) {
                        Pattern patternCompile = Pattern.compile("/");
                        wl51.m88474X0(0);
                        Matcher matcher = patternCompile.matcher(str4);
                        if (matcher.find()) {
                            ArrayList arrayList2 = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList2.add(str4.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList2.add(str4.subSequence(iEnd, str4.length()).toString());
                            listM44518y = arrayList2;
                        } else {
                            listM44518y = geg1.m44518y(str4.toString());
                        }
                        boolean zIsEmpty = listM44518y.isEmpty();
                        List listM43714b2 = lau.f131415a;
                        if (zIsEmpty) {
                            listM43714b1 = listM43714b2;
                            break;
                        }
                        ListIterator listIterator = listM44518y.listIterator(listM44518y.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listM43714b1 = listM43714b2;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                listM43714b1 = g6f.m43714b1(listM44518y, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String str5 = (String) listM43714b1.get(0);
                        String str6 = (String) listM43714b1.get(1);
                        Pattern patternCompile2 = Pattern.compile("/");
                        wl51.m88474X0(0);
                        Matcher matcher2 = patternCompile2.matcher(str3);
                        if (matcher2.find()) {
                            ArrayList arrayList3 = new ArrayList(10);
                            int iEnd2 = 0;
                            do {
                                arrayList3.add(str3.subSequence(iEnd2, matcher2.start()).toString());
                                iEnd2 = matcher2.end();
                            } while (matcher2.find());
                            arrayList3.add(str3.subSequence(iEnd2, str3.length()).toString());
                            listM44518y2 = arrayList3;
                        } else {
                            listM44518y2 = geg1.m44518y(str3.toString());
                        }
                        if (listM44518y2.isEmpty()) {
                            i3 = 1;
                            break;
                        }
                        ListIterator listIterator2 = listM44518y2.listIterator(listM44518y2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                i3 = 1;
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                i3 = 1;
                                listM43714b2 = g6f.m43714b1(listM44518y2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        List list = listM43714b2;
                        String str7 = (String) list.get(0);
                        String str8 = (String) list.get(i3);
                        i2 = wj50.m88271j(str5, str7) ? 2 : 0;
                        if (wj50.m88271j(str6, str8)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                i = i2;
            } else {
                i = -1;
            }
            if (bundleM46166c != 0) {
                hyi0Var = new hyi0(this, bundleM46166c, gyi0Var.f85653p, size, z, i);
                if (hyi0Var2 != null || hyi0Var.compareTo(hyi0Var2) > 0) {
                    bundle = null;
                    hyi0Var2 = hyi0Var;
                } else {
                    bundle = null;
                }
            } else {
                if (z || i > -1) {
                    Bundle bundle2 = new Bundle();
                    if (uri != null) {
                        Pattern pattern2 = (Pattern) gyi0Var.f85643f.getValue();
                        Matcher matcher3 = pattern2 != null ? pattern2.matcher(uri.toString()) : null;
                        if (matcher3 != null && matcher3.matches()) {
                            gyi0Var.m46167d(matcher3, bundle2, linkedHashMap);
                            if (((Boolean) gyi0Var.f85644g.getValue()).booleanValue()) {
                                gyi0Var.m46168e(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                    if (mif1.m61850C(linkedHashMap, new duo(2, bundle2)).isEmpty()) {
                        hyi0Var = new hyi0(this, bundleM46166c, gyi0Var.f85653p, size, z, i);
                        if (hyi0Var2 != null) {
                        }
                        bundle = null;
                        hyi0Var2 = hyi0Var;
                    }
                }
                bundle = null;
            }
        }
        return hyi0Var2;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.f117421h * 31;
        String str = this.f117422i;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (gyi0 gyi0Var : this.f117418e) {
            int i2 = iHashCode * 31;
            String str2 = gyi0Var.f85638a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = gyi0Var.f85639b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = gyi0Var.f85640c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        int i3 = 0;
        while (true) {
            mw31 mw31Var = this.f117419f;
            if (i3 >= mw31Var.m62986h()) {
                break;
            }
            int i4 = i3 + 1;
            oxi0 oxi0Var = (oxi0) mw31Var.m62987i(i3);
            int i5 = ((iHashCode * 31) + oxi0Var.f170991a) * 31;
            ezi0 ezi0Var = oxi0Var.f170992b;
            iHashCode = i5 + (ezi0Var != null ? ezi0Var.hashCode() : 0);
            Bundle bundle = oxi0Var.f170993c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i6 = iHashCode * 31;
                    Bundle bundle2 = oxi0Var.f170993c;
                    wj50.m88279p(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i3 = i4;
        }
        LinkedHashMap linkedHashMap = this.f117420g;
        for (String str6 : linkedHashMap.keySet()) {
            int iM77243b = s571.m77243b(iHashCode * 31, 31, str6);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iM77243b + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final hyi0 m54795i(String str) {
        gyi0 gyi0Var;
        Uri uri;
        Bundle bundleM46166c;
        wg61 wg61Var = this.f117423t;
        if (wg61Var == null || (gyi0Var = (gyi0) wg61Var.getValue()) == null || (bundleM46166c = gyi0Var.m46166c((uri = Uri.parse("android-app://androidx.navigation/".concat(str))), this.f117420g)) == null) {
            return null;
        }
        String str2 = gyi0Var.f85638a;
        return new hyi0(this, bundleM46166c, gyi0Var.f85653p, str2 == null ? 0 : g6f.m43750v0(uri.getPathSegments(), Uri.parse(str2).getPathSegments()).size(), false, -1);
    }

    /* JADX INFO: renamed from: j */
    public void mo54796j(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w0u0.f246832e);
        m54798n(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f117421h = resourceId;
            this.f117416c = null;
            this.f117416c = wdg1.m87841o(context, resourceId);
        }
        this.f117417d = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public final void m54797l(int i, oxi0 oxi0Var) {
        if (!(this instanceof of0)) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f117419f.m62985g(i, oxi0Var);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m54798n(String str) {
        if (str == null) {
            this.f117421h = 0;
            this.f117416c = null;
        } else {
            if (wl51.m88460J0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            ArrayList arrayListM61850C = mif1.m61850C(this.f117420g, new iyi0(new gyi0(strConcat, null, null), 1));
            if (!arrayListM61850C.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + arrayListM61850C).toString());
            }
            this.f117423t = new wg61(new dl3(strConcat, 3));
            this.f117421h = strConcat.hashCode();
            this.f117416c = null;
        }
        this.f117422i = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f117416c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f117421h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f117422i;
        if (str2 != null && !wl51.m88460J0(str2)) {
            sb.append(" route=");
            sb.append(this.f117422i);
        }
        if (this.f117417d != null) {
            sb.append(" label=");
            sb.append(this.f117417d);
        }
        return sb.toString();
    }
}
