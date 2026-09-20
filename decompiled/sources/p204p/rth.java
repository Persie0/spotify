package p204p;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rth {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202586a;

    /* JADX INFO: renamed from: b */
    public int f202587b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f202588c;

    /* JADX INFO: renamed from: d */
    public ArrayList f202589d;

    /* JADX INFO: renamed from: e */
    public Object f202590e;

    /* JADX INFO: renamed from: f */
    public Object f202591f;

    /* JADX INFO: renamed from: g */
    public Serializable f202592g;

    /* JADX INFO: renamed from: h */
    public Object f202593h;

    /* JADX INFO: renamed from: i */
    public Object f202594i;

    public rth(qth qthVar, xzk xzkVar) {
        this.f202586a = 0;
        this.f202588c = new ArrayList();
        this.f202592g = new IdentityHashMap();
        this.f202589d = new ArrayList();
        this.f202593h = new ojp(false);
        this.f202590e = qthVar;
        xzkVar.getClass();
        this.f202591f = new t9w0(9);
        this.f202587b = 1;
        this.f202594i = new onz0(17);
    }

    /* JADX INFO: renamed from: p */
    public static ArrayList m76379p(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM88457G0 = wl51.m88457G0(str, '&', i, 4);
            if (iM88457G0 == -1) {
                iM88457G0 = str.length();
            }
            int iM88457G1 = wl51.m88457G0(str, '=', i, 4);
            if (iM88457G1 == -1 || iM88457G1 > iM88457G0) {
                arrayList.add(str.substring(i, iM88457G0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM88457G1));
                arrayList.add(str.substring(iM88457G1 + 1, iM88457G0));
            }
            i = iM88457G0 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76380a(int i, hjv0 hjv0Var) {
        ArrayList arrayList = this.f202589d;
        if (i < 0 || i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i);
        }
        if (this.f202587b != 1) {
            wj50.m88275l("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", hjv0Var.f92279b);
        } else {
            boolean z = hjv0Var.f92279b;
        }
        int iM76390k = m76390k(hjv0Var);
        if ((iM76390k == -1 ? null : (lfj0) arrayList.get(iM76390k)) != null) {
            return false;
        }
        lfj0 lfj0Var = new lfj0(hjv0Var, this, (t9w0) this.f202591f, ((onz0) this.f202594i).m67444n());
        arrayList.add(i, lfj0Var);
        Iterator it = this.f202588c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                hjv0Var.mo28858m(recyclerView);
            }
        }
        if (lfj0Var.f132962e > 0) {
            ((qth) this.f202590e).m47715k(m76384e(lfj0Var), lfj0Var.f132962e);
        }
        m76383d();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m76381b(String str, String str2) {
        if (this.f202589d == null) {
            this.f202589d = new ArrayList();
        }
        ArrayList arrayList = this.f202589d;
        wj50.m88279p(arrayList);
        arrayList.add(g0b1.m43267i(str, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList2 = this.f202589d;
        wj50.m88279p(arrayList2);
        arrayList2.add(str2 != null ? g0b1.m43267i(str2, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }

    /* JADX INFO: renamed from: c */
    public ph30 m76382c() {
        ArrayList arrayList;
        String str = (String) this.f202590e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM43279u = g0b1.m43279u(0, 0, 7, (String) this.f202591f);
        String strM43279u2 = g0b1.m43279u(0, 0, 7, (String) this.f202592g);
        String str2 = (String) this.f202593h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM76385f = m76385f();
        ArrayList arrayList2 = this.f202588c;
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(g0b1.m43279u(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.f202589d;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? g0b1.m43279u(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f202594i;
        return new ph30(str, strM43279u, strM43279u2, str2, iM76385f, arrayList3, arrayList, str4 != null ? g0b1.m43279u(0, 0, 7, str4) : null, toString());
    }

    /* JADX INFO: renamed from: d */
    public void m76383d() {
        int i;
        Iterator it = this.f202589d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            lfj0 lfj0Var = (lfj0) it.next();
            int i2 = lfj0Var.f132960c.f92280c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && lfj0Var.f132962e == 0)) {
                break;
            }
        }
        qth qthVar = (qth) this.f202590e;
        if (i != qthVar.f92280c) {
            qthVar.m47721x(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m76384e(lfj0 lfj0Var) {
        lfj0 lfj0Var2;
        Iterator it = this.f202589d.iterator();
        int i = 0;
        while (it.hasNext() && (lfj0Var2 = (lfj0) it.next()) != lfj0Var) {
            i += lfj0Var2.f132962e;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public int m76385f() {
        int i = this.f202587b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f202590e;
        wj50.m88279p(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(pka1.f178421b) ? 443 : -1;
    }

    /* JADX INFO: renamed from: g */
    public void m76386g(String str) {
        this.f202589d = str != null ? m76379p(g0b1.m43267i(str, 0, 0, 83, " \"'<>#")) : null;
    }

    /* JADX INFO: renamed from: h */
    public ojp m76387h(int i) {
        ojp ojpVar = (ojp) this.f202593h;
        if (ojpVar.f166107a) {
            ojpVar = new ojp(false);
        } else {
            ojpVar.f166107a = true;
        }
        int i2 = i;
        for (lfj0 lfj0Var : this.f202589d) {
            int i3 = lfj0Var.f132962e;
            if (i3 > i2) {
                ojpVar.f166109c = lfj0Var;
                ojpVar.f166108b = i2;
                break;
            }
            i2 -= i3;
        }
        if (((lfj0) ojpVar.f166109c) != null) {
            return ojpVar;
        }
        throw new IllegalArgumentException(s571.m77246e(i, "Cannot find wrapper for "));
    }

    /* JADX INFO: renamed from: i */
    public lfj0 m76388i(dkv0 dkv0Var) {
        lfj0 lfj0Var = (lfj0) ((IdentityHashMap) this.f202592g).get(dkv0Var);
        if (lfj0Var != null) {
            return lfj0Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + dkv0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* JADX INFO: renamed from: j */
    public void m76389j(String str) {
        String strM92455b = xze1.m92455b(g0b1.m43279u(0, 0, 7, str));
        if (strM92455b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.f202593h = strM92455b;
    }

    /* JADX INFO: renamed from: k */
    public int m76390k(hjv0 hjv0Var) {
        ArrayList arrayList = this.f202589d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lfj0) arrayList.get(i)).f132960c == hjv0Var) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0025  */
    /* JADX INFO: renamed from: l */
    public void m76391l(ph30 ph30Var, String str) {
        int i;
        Object obj;
        Object obj2;
        byte b;
        byte b2;
        int iM24344e;
        int i2;
        char cCharAt;
        String str2 = str;
        byte[] bArr = a0f1.f11072a;
        int iM24348i = a0f1.m24348i(0, str2.length(), str2);
        int iM24349j = a0f1.m24349j(iM24348i, str2.length(), str2);
        byte b3 = -1;
        if (iM24349j - iM24348i >= 2) {
            char cCharAt2 = str2.charAt(iM24348i);
            if ((wj50.m88282u(cCharAt2, 97) >= 0 && wj50.m88282u(cCharAt2, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND) <= 0) || (wj50.m88282u(cCharAt2, 65) >= 0 && wj50.m88282u(cCharAt2, 90) <= 0)) {
                int i3 = iM24348i + 1;
                while (true) {
                    if (i3 < iM24349j) {
                        char cCharAt3 = str2.charAt(i3);
                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i3++;
                        } else if (cCharAt3 == ':') {
                            i = i3;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        if (i != -1) {
            obj2 = "http";
            obj = pka1.f178421b;
            if (str2.regionMatches(true, iM24348i, "https:", 0, 6)) {
                this.f202590e = obj;
                iM24348i += 6;
                str2 = str;
            } else {
                str2 = str;
                if (!str2.regionMatches(true, iM24348i, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, i) + '\'');
                }
                this.f202590e = obj2;
                iM24348i += 5;
            }
        } else {
            obj = pka1.f178421b;
            obj2 = "http";
            if (ph30Var == null) {
                throw new IllegalArgumentException(edb.m38564m("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2.length() > 6 ? wl51.m88489m1(6, str2).concat("...") : str2));
            }
            this.f202590e = ph30Var.f177456a;
        }
        int i4 = iM24348i;
        int i5 = 0;
        while (true) {
            b = 92;
            b2 = 47;
            if (i4 >= iM24349j || !((cCharAt = str2.charAt(i4)) == '/' || cCharAt == '\\')) {
                break;
            }
            i5++;
            i4++;
        }
        ArrayList arrayList = this.f202588c;
        byte b4 = 35;
        if (i5 >= 2 || ph30Var == null || !wj50.m88271j(ph30Var.f177456a, (String) this.f202590e)) {
            int i6 = iM24348i + i5;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iM24344e = a0f1.m24344e(i6, str2, iM24349j, "@/\\?#");
                byte bCharAt = iM24344e != iM24349j ? str2.charAt(iM24344e) : b3;
                if (bCharAt == b3 || bCharAt == b4 || bCharAt == b2 || bCharAt == b || bCharAt == 63) {
                    break;
                }
                if (bCharAt != 64) {
                    b4 = 35;
                } else {
                    if (z2) {
                        this.f202592g = ((String) this.f202592g) + "%40" + g0b1.m43267i(str2, i6, iM24344e, ContentType.LONG_FORM_ON_DEMAND, " \"':;<=>@[]^`{}|/\\?#");
                    } else {
                        int iM24343d = a0f1.m24343d(':', i6, iM24344e, str2);
                        String strM43267i = g0b1.m43267i(str2, i6, iM24343d, ContentType.LONG_FORM_ON_DEMAND, " \"':;<=>@[]^`{}|/\\?#");
                        if (z) {
                            strM43267i = dq60.m36618r(new StringBuilder(), (String) this.f202591f, "%40", strM43267i);
                        }
                        this.f202591f = strM43267i;
                        if (iM24343d != iM24344e) {
                            this.f202592g = g0b1.m43267i(str2, iM24343d + 1, iM24344e, ContentType.LONG_FORM_ON_DEMAND, " \"':;<=>@[]^`{}|/\\?#");
                            z2 = true;
                        }
                        z = true;
                    }
                    i6 = iM24344e + 1;
                    b = 92;
                    b4 = 35;
                    b3 = -1;
                    b2 = 47;
                }
            }
            int i7 = i6;
            while (true) {
                if (i7 < iM24344e) {
                    char cCharAt4 = str2.charAt(i7);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i7++;
                            if (i7 >= iM24344e) {
                                break;
                            }
                        } while (str2.charAt(i7) != ']');
                    }
                    i7++;
                } else {
                    i7 = iM24344e;
                    break;
                }
            }
            int i8 = i7 + 1;
            if (i8 < iM24344e) {
                this.f202593h = xze1.m92455b(g0b1.m43279u(i6, i7, 4, str2));
                try {
                    i2 = Integer.parseInt(g0b1.m43267i(str2, i8, iM24344e, 120, ""));
                    if (1 > i2 || i2 >= 65536) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f202587b = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str2.substring(i8, iM24344e) + '\"').toString());
                }
            } else {
                int i9 = -1;
                this.f202593h = xze1.m92455b(g0b1.m43279u(i6, i7, 4, str2));
                String str3 = (String) this.f202590e;
                wj50.m88279p(str3);
                if (str3.equals(obj2)) {
                    i9 = 80;
                } else if (str3.equals(obj)) {
                    i9 = 443;
                }
                this.f202587b = i9;
            }
            if (((String) this.f202593h) == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str2.substring(i6, i7) + '\"').toString());
            }
            iM24348i = iM24344e;
        } else {
            this.f202591f = ph30Var.m69941e();
            this.f202592g = ph30Var.m69937a();
            this.f202593h = ph30Var.f177459d;
            this.f202587b = ph30Var.f177460e;
            arrayList.clear();
            arrayList.addAll(ph30Var.m69939c());
            if (iM24348i == iM24349j || str2.charAt(iM24348i) == '#') {
                m76386g(ph30Var.m69940d());
            }
        }
        int iM24344e2 = a0f1.m24344e(iM24348i, str2, iM24349j, "?#");
        if (iM24348i != iM24344e2) {
            char cCharAt5 = str2.charAt(iM24348i);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM24348i++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM24348i < iM24344e2) {
                int iM24344e3 = a0f1.m24344e(iM24348i, str2, iM24344e2, "/\\");
                boolean z3 = iM24344e3 < iM24344e2;
                String strM43267i2 = g0b1.m43267i(str2, iM24348i, iM24344e3, ContentType.LONG_FORM_ON_DEMAND, " \"<>^`{}|/\\?#");
                if (!strM43267i2.equals(".") && !strM43267i2.equalsIgnoreCase("%2e")) {
                    if (!strM43267i2.equals("..") && !strM43267i2.equalsIgnoreCase("%2e.") && !strM43267i2.equalsIgnoreCase(".%2e") && !strM43267i2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) edb.m38559h(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM43267i2);
                        } else {
                            arrayList.add(strM43267i2);
                        }
                        if (z3) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM24348i = z3 ? iM24344e3 + 1 : iM24344e3;
            }
        }
        if (iM24344e2 < iM24349j && str2.charAt(iM24344e2) == '?') {
            int iM24343d2 = a0f1.m24343d('#', iM24344e2, iM24349j, str2);
            this.f202589d = m76379p(g0b1.m43267i(str2, iM24344e2 + 1, iM24343d2, 80, " \"'<>#"));
            iM24344e2 = iM24343d2;
        }
        if (iM24344e2 >= iM24349j || str2.charAt(iM24344e2) != '#') {
            return;
        }
        this.f202594i = g0b1.m43267i(str2, iM24344e2 + 1, iM24349j, 48, "");
    }

    /* JADX INFO: renamed from: m */
    public void m76392m(int i) {
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(s571.m77246e(i, "unexpected port: ").toString());
        }
        this.f202587b = i;
    }

    /* JADX INFO: renamed from: n */
    public void m76393n(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.f202590e = "http";
        } else {
            if (!str.equalsIgnoreCase(pka1.f178421b)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f202590e = pka1.f178421b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0052 A[LOOP:0: B:7:0x0020->B:13:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[EDGE_INSN: B:17:0x0055->B:14:0x0055 BREAK  A[LOOP:0: B:7:0x0020->B:13:0x0052], SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public void m76394o(String str, String str2) {
        if (this.f202589d != null) {
            String strM43267i = g0b1.m43267i(str, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~");
            ArrayList arrayList = this.f202589d;
            wj50.m88279p(arrayList);
            int size = arrayList.size() - 2;
            int iM92097r = xtm0.m92097r(size, 0, -2);
            if (iM92097r <= size) {
                while (true) {
                    ArrayList arrayList2 = this.f202589d;
                    wj50.m88279p(arrayList2);
                    if (!strM43267i.equals(arrayList2.get(size))) {
                        if (size != iM92097r) {
                            break;
                            break;
                        }
                        size -= 2;
                    } else {
                        ArrayList arrayList3 = this.f202589d;
                        wj50.m88279p(arrayList3);
                        arrayList3.remove(size + 1);
                        ArrayList arrayList4 = this.f202589d;
                        wj50.m88279p(arrayList4);
                        arrayList4.remove(size);
                        ArrayList arrayList5 = this.f202589d;
                        wj50.m88279p(arrayList5);
                        if (!arrayList5.isEmpty()) {
                            if (size != iM92097r) {
                                break;
                            } else {
                                size -= 2;
                            }
                        } else {
                            this.f202589d = null;
                            break;
                        }
                    }
                }
            }
        }
        m76381b(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.f202586a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f202590e;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f202591f).length() > 0 || ((String) this.f202592g).length() > 0) {
                    sb.append((String) this.f202591f);
                    if (((String) this.f202592g).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f202592g);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f202593h;
                if (str2 != null) {
                    if (wl51.m88497u0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f202593h);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f202593h);
                    }
                }
                int i = -1;
                if (this.f202587b != -1 || ((String) this.f202590e) != null) {
                    int iM76385f = m76385f();
                    String str3 = (String) this.f202590e;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iM76385f);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals(pka1.f178421b)) {
                            i = 443;
                        }
                        if (iM76385f != i) {
                            sb.append(':');
                            sb.append(iM76385f);
                        }
                    }
                }
                ArrayList arrayList = this.f202588c;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (this.f202589d != null) {
                    sb.append('?');
                    ArrayList arrayList2 = this.f202589d;
                    wj50.m88279p(arrayList2);
                    u6j0.m82447l(sb, arrayList2);
                }
                if (((String) this.f202594i) != null) {
                    sb.append('#');
                    sb.append((String) this.f202594i);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public rth() {
        this.f202586a = 1;
        this.f202591f = "";
        this.f202592g = "";
        this.f202587b = -1;
        this.f202588c = h6f.m46717N("");
    }
}
