package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class m1s {

    /* JADX INFO: renamed from: v */
    public static final LinkedHashSet f139061v;

    /* JADX INFO: renamed from: w */
    public static final Map f139062w;

    /* JADX INFO: renamed from: a */
    public ku31 f139063a;

    /* JADX INFO: renamed from: e */
    public boolean f139067e;

    /* JADX INFO: renamed from: i */
    public boolean f139071i;

    /* JADX INFO: renamed from: j */
    public final List f139072j;

    /* JADX INFO: renamed from: k */
    public final wuk0 f139073k;

    /* JADX INFO: renamed from: l */
    public final List f139074l;

    /* JADX INFO: renamed from: m */
    public final List f139075m;

    /* JADX INFO: renamed from: n */
    public final List f139076n;

    /* JADX INFO: renamed from: o */
    public final Set f139077o;

    /* JADX INFO: renamed from: p */
    public final int f139078p;

    /* JADX INFO: renamed from: q */
    public final int f139079q;

    /* JADX INFO: renamed from: r */
    public final i1s f139080r;

    /* JADX INFO: renamed from: t */
    public final ArrayList f139082t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f139083u;

    /* JADX INFO: renamed from: b */
    public int f139064b = -1;

    /* JADX INFO: renamed from: c */
    public int f139065c = 0;

    /* JADX INFO: renamed from: d */
    public int f139066d = 0;

    /* JADX INFO: renamed from: f */
    public int f139068f = 0;

    /* JADX INFO: renamed from: g */
    public int f139069g = 0;

    /* JADX INFO: renamed from: h */
    public int f139070h = 0;

    /* JADX INFO: renamed from: s */
    public final t5p f139081s = new t5p(14, (byte) 0);

    static {
        Object[] objArr = {vq9.class, vn20.class, ary.class, df30.class, cg71.class, ko80.class, sn40.class};
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        f139061v = new LinkedHashSet(Collections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(vq9.class, new wq9(0));
        map.put(vn20.class, new wq9(2));
        map.put(ary.class, new wq9(1));
        map.put(df30.class, new wq9(3));
        map.put(cg71.class, new wq9(7));
        map.put(ko80.class, new wq9(5));
        map.put(sn40.class, new wq9(4));
        f139062w = Collections.unmodifiableMap(map);
    }

    public m1s(ArrayList arrayList, wuk0 wuk0Var, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, int i, int i2) {
        ArrayList arrayList5 = new ArrayList();
        this.f139082t = arrayList5;
        this.f139083u = new ArrayList();
        this.f139072j = arrayList;
        this.f139073k = wuk0Var;
        this.f139074l = arrayList2;
        this.f139075m = arrayList3;
        this.f139076n = arrayList4;
        this.f139077o = hashSet;
        this.f139078p = i;
        this.f139079q = i2;
        i1s i1sVar = new i1s(0);
        this.f139080r = i1sVar;
        arrayList5.add(new l1s(i1sVar, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m60538a(l1s l1sVar) {
        AbstractC2601y5 abstractC2601y5 = l1sVar.f128778a;
        while (!m60544g().mo49421c(abstractC2601y5.mo30336f())) {
            m60542e(1);
        }
        m60544g().mo30336f().m73295b(abstractC2601y5.mo30336f());
        this.f139082t.add(l1sVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m60539b() {
        CharSequence charSequenceSubSequence;
        int i;
        bv31 bv31Var;
        int i2;
        if (this.f139067e) {
            int i3 = this.f139065c + 1;
            CharSequence charSequence = this.f139063a.f126444a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i3, charSequence.length());
            int i4 = 4 - (this.f139066d % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            int i6 = this.f139065c;
            if (i6 == 0) {
                charSequenceSubSequence = this.f139063a.f126444a;
            } else {
                CharSequence charSequence2 = this.f139063a.f126444a;
                charSequenceSubSequence = charSequence2.subSequence(i6, charSequence2.length());
            }
        }
        m60544g().mo30334a(new ku31(charSequenceSubSequence, (this.f139078p != 3 || (i = this.f139065c) >= (i2 = (bv31Var = this.f139063a.f126445b).f31269d)) ? null : bv31Var.m30583a(i, i2)));
        m60540c();
    }

    /* JADX INFO: renamed from: c */
    public final void m60540c() {
        int i = 1;
        if (this.f139078p == 1) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f139082t;
            if (i >= arrayList.size()) {
                return;
            }
            l1s l1sVar = (l1s) arrayList.get(i);
            int iMin = Math.min(l1sVar.f128779b, this.f139065c);
            if (this.f139063a.f126444a.length() - iMin != 0) {
                AbstractC2601y5 abstractC2601y5 = l1sVar.f128778a;
                bv31 bv31Var = this.f139063a.f126445b;
                abstractC2601y5.mo79219b(bv31Var.m30583a(iMin, bv31Var.f31269d));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m60541d() {
        char cCharAt = this.f139063a.f126444a.charAt(this.f139065c);
        this.f139065c++;
        if (cCharAt != '\t') {
            this.f139066d++;
        } else {
            int i = this.f139066d;
            this.f139066d = (4 - (i % 4)) + i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m60542e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.f139082t;
            AbstractC2601y5 abstractC2601y5 = ((l1s) arrayList.remove(arrayList.size() - 1)).f128778a;
            for (rkq rkqVar : abstractC2601y5.mo79220g()) {
                t5p t5pVar = this.f139081s;
                t5pVar.getClass();
                HashMap map = (HashMap) t5pVar.f217328b;
                rkq rkqVar2 = (rkq) map.get(rkqVar.f200141a);
                if (rkqVar2 == null) {
                    map.put(rkqVar.f200141a, rkqVar);
                } else {
                    for (Map.Entry entry : rkqVar.f200142b.entrySet()) {
                        rkqVar2.f200142b.putIfAbsent((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            abstractC2601y5.mo30335e();
            this.f139083u.add(abstractC2601y5);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m60543f() {
        int i = this.f139065c;
        int i2 = this.f139066d;
        this.f139071i = true;
        int length = this.f139063a.f126444a.length();
        while (i < length) {
            char cCharAt = this.f139063a.f126444a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f139071i = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f139068f = i;
        this.f139069g = i2;
        this.f139070h = i2 - this.f139066d;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC2601y5 m60544g() {
        return ((l1s) edb.m38559h(1, this.f139082t)).f128778a;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02a0 A[PHI: r23
      0x02a0: PHI (r23v10 p.y5) = 
      (r23v3 p.y5)
      (r23v4 p.y5)
      (r23v4 p.y5)
      (r23v5 p.y5)
      (r23v5 p.y5)
      (r23v5 p.y5)
      (r23v6 p.y5)
      (r23v6 p.y5)
      (r23v6 p.y5)
      (r23v7 p.y5)
      (r23v7 p.y5)
      (r23v7 p.y5)
      (r23v9 p.y5)
      (r23v9 p.y5)
      (r23v12 p.y5)
      (r23v14 p.y5)
      (r23v14 p.y5)
      (r23v14 p.y5)
     binds: [B:368:0x06af, B:342:0x063b, B:365:0x068b, B:263:0x04c8, B:333:0x05ff, B:335:0x060b, B:246:0x0468, B:248:0x0470, B:483:0x02a0, B:239:0x0430, B:241:0x0434, B:243:0x0440, B:151:0x02aa, B:218:0x03ba, B:148:0x029e, B:141:0x0268, B:143:0x026e, B:145:0x0283] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:234:0x0402  */
    /* JADX WARN: Code duplicated, block: B:306:0x0592  */
    /* JADX WARN: Code duplicated, block: B:322:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:331:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:332:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:364:0x068a  */
    /* JADX WARN: Code duplicated, block: B:380:0x06e9 A[LOOP:5: B:46:0x00de->B:380:0x06e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:394:0x0717  */
    /* JADX WARN: Code duplicated, block: B:457:0x06f1 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:166:0x02e9. Please report as an issue. */
    /* JADX INFO: renamed from: h */
    public final void m60545h(int i, String str) {
        ArrayList arrayList;
        AbstractC2601y5 abstractC2601y5;
        ar9 ar9Var;
        char cCharAt;
        int i2;
        bry bryVar;
        ar9 ar9Var2;
        int i3;
        ar9 ar9Var3;
        do20 do20Var;
        char c;
        char c2;
        boolean z;
        int i4;
        lo80 lo80Var;
        char cCharAt2;
        lo80 lo80Var2;
        boolean z2;
        int i5;
        char cCharAt3;
        int i6;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        List listUnmodifiableList;
        String strReplace = str;
        this.f139064b++;
        int i10 = 0;
        this.f139065c = 0;
        this.f139066d = 0;
        this.f139067e = false;
        if (strReplace.indexOf(0) != -1) {
            strReplace = strReplace.replace((char) 0, (char) 65533);
        }
        this.f139063a = new ku31(strReplace, this.f139078p != 1 ? new bv31(this.f139064b, 0, i, strReplace.length()) : null);
        int i11 = 1;
        int i12 = 1;
        while (true) {
            arrayList = this.f139082t;
            if (i11 >= arrayList.size()) {
                break;
            }
            l1s l1sVar = (l1s) arrayList.get(i11);
            AbstractC2601y5 abstractC2601y6 = l1sVar.f128778a;
            m60543f();
            lwe lweVarMo30337j = abstractC2601y6.mo30337j(this);
            if (lweVarMo30337j == null) {
                break;
            }
            l1sVar.f128779b = this.f139065c;
            if (lweVarMo30337j.f137550c) {
                m60540c();
                m60542e(arrayList.size() - i11);
                return;
            }
            int i13 = lweVarMo30337j.f137548a;
            if (i13 != -1) {
                m60547j(i13);
            } else {
                int i14 = lweVarMo30337j.f137549b;
                if (i14 != -1) {
                    m60546i(i14);
                }
            }
            i12++;
            i11++;
        }
        int size = arrayList.size() - i12;
        AbstractC2601y5 abstractC2601y7 = ((l1s) arrayList.get(i12 - 1)).f128778a;
        int i15 = this.f139065c;
        boolean zMo49422h = (abstractC2601y7.mo30336f() instanceof lsm0) || abstractC2601y7.mo49422h();
        boolean z5 = false;
        while (true) {
            if (zMo49422h) {
                i15 = this.f139065c;
                m60543f();
                if (!this.f139071i) {
                    int i16 = 4;
                    if (this.f139070h >= 4 || !Character.isLetter(Character.codePointAt(this.f139063a.f126444a, this.f139068f))) {
                        if (arrayList.size() > this.f139079q) {
                            abstractC2601y5 = abstractC2601y7;
                            ar9Var = null;
                        } else {
                            f0m f0mVar = new f0m(abstractC2601y7, 27);
                            Iterator it = this.f139072j.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    int i17 = ((wq9) it.next()).f253950a;
                                    char c3 = '*';
                                    int i18 = i10;
                                    char c4 = ' ';
                                    char c5 = '\t';
                                    Object obj = f0mVar.f64684b;
                                    switch (i17) {
                                        case 0:
                                            abstractC2601y5 = abstractC2601y7;
                                            int i19 = this.f139068f;
                                            if (xq9.m91821k(this, i19)) {
                                                int i20 = this.f139066d + this.f139070h;
                                                int i21 = i20 + 1;
                                                CharSequence charSequence = this.f139063a.f126444a;
                                                int i22 = i19 + 1;
                                                if (i22 < charSequence.length() && ((cCharAt = charSequence.charAt(i22)) == '\t' || cCharAt == ' ')) {
                                                    i21 = i20 + 2;
                                                }
                                                ar9Var = new ar9(new xq9());
                                                ar9Var.f18980b = i21;
                                            } else {
                                                ar9Var = null;
                                            }
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        case 1:
                                            abstractC2601y5 = abstractC2601y7;
                                            int i23 = this.f139070h;
                                            if (i23 < 4) {
                                                int i24 = this.f139068f;
                                                CharSequence charSequence2 = this.f139063a.f126444a;
                                                int length = charSequence2.length();
                                                int i25 = i24;
                                                int i26 = 0;
                                                int i27 = 0;
                                                while (true) {
                                                    i2 = i24;
                                                    if (i25 < length) {
                                                        char cCharAt4 = charSequence2.charAt(i25);
                                                        if (cCharAt4 == '`') {
                                                            i26++;
                                                        } else if (cCharAt4 == '~') {
                                                            i27++;
                                                        }
                                                        i25++;
                                                        i24 = i2;
                                                    }
                                                }
                                                if (i26 < 3 || i27 != 0) {
                                                    if (i27 < 3 || i26 != 0) {
                                                        bryVar = null;
                                                    } else {
                                                        bryVar = new bry(i27, i23, '~');
                                                    }
                                                } else if (epv0.m39694n('`', charSequence2, i2 + i26) != -1) {
                                                    bryVar = null;
                                                } else {
                                                    bryVar = new bry(i26, i23, '`');
                                                }
                                                if (bryVar != null) {
                                                    ar9Var2 = new ar9(bryVar);
                                                    ar9Var2.f18979a = bryVar.f30179a.f19163g.intValue() + i2;
                                                    ar9Var = ar9Var2;
                                                }
                                                if (ar9Var == null) {
                                                    abstractC2601y7 = abstractC2601y5;
                                                    i10 = 0;
                                                    i16 = 4;
                                                }
                                            }
                                            ar9Var = null;
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        case 2:
                                            abstractC2601y5 = abstractC2601y7;
                                            if (this.f139070h >= 4) {
                                                ar9Var = null;
                                            } else {
                                                ku31 ku31Var = this.f139063a;
                                                int i28 = this.f139068f;
                                                CharSequence charSequence3 = ku31Var.f126444a;
                                                if (charSequence3.charAt(i28) == '#') {
                                                    ku31 ku31VarM57375a = ku31Var.m57375a(i28, charSequence3.length());
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(ku31VarM57375a);
                                                    zmx0 zmx0Var = new zmx0(arrayList2);
                                                    int iM96501h = zmx0Var.m96501h('#');
                                                    if (iM96501h == 0 || iM96501h > 6) {
                                                        do20Var = null;
                                                    } else if (zmx0Var.m96499f()) {
                                                        char cM96506m = zmx0Var.m96506m();
                                                        if (cM96506m != ' ') {
                                                            c = '\t';
                                                            if (cM96506m != '\t') {
                                                                do20Var = null;
                                                            }
                                                        } else {
                                                            c = '\t';
                                                        }
                                                        zmx0Var.m96510q();
                                                        zpt0 zpt0VarM96507n = zmx0Var.m96507n();
                                                        zpt0 zpt0VarM96507n2 = zpt0VarM96507n;
                                                        boolean z6 = true;
                                                        while (zmx0Var.m96499f()) {
                                                            char cM96506m2 = zmx0Var.m96506m();
                                                            if (cM96506m2 == c || cM96506m2 == ' ') {
                                                                c2 = '#';
                                                                zmx0Var.m96503j();
                                                                z6 = true;
                                                            } else {
                                                                c2 = '#';
                                                                if (cM96506m2 != '#') {
                                                                    zmx0Var.m96503j();
                                                                    zpt0VarM96507n2 = zmx0Var.m96507n();
                                                                    z6 = false;
                                                                } else if (z6) {
                                                                    zmx0Var.m96501h('#');
                                                                    int iM96510q = zmx0Var.m96510q();
                                                                    if (zmx0Var.m96499f()) {
                                                                        zpt0VarM96507n2 = zmx0Var.m96507n();
                                                                    }
                                                                    z6 = iM96510q > 0;
                                                                } else {
                                                                    zmx0Var.m96503j();
                                                                    zpt0VarM96507n2 = zmx0Var.m96507n();
                                                                }
                                                            }
                                                            c = '\t';
                                                        }
                                                        cx10 cx10VarM96498e = zmx0Var.m96498e(zpt0VarM96507n, zpt0VarM96507n2);
                                                        do20Var = cx10VarM96498e.m34171b().isEmpty() ? new do20(iM96501h, new cx10()) : new do20(iM96501h, cx10VarM96498e);
                                                    } else {
                                                        do20Var = new do20(iM96501h, new cx10());
                                                    }
                                                    if (do20Var != null) {
                                                        ar9Var = new ar9(do20Var);
                                                        ar9Var.f18979a = charSequence3.length();
                                                    }
                                                }
                                                char cCharAt5 = charSequence3.charAt(i28);
                                                if (cCharAt5 == '-') {
                                                    int length2 = charSequence3.length();
                                                    for (int i29 = i28 + 1; i29 < length2; i29++) {
                                                        if (charSequence3.charAt(i29) != '-') {
                                                            length2 = i29;
                                                            if (epv0.m39671G(length2, charSequence3.length(), charSequence3) >= charSequence3.length()) {
                                                                i3 = 2;
                                                            } else {
                                                                i3 = 0;
                                                            }
                                                        }
                                                    }
                                                    if (epv0.m39671G(length2, charSequence3.length(), charSequence3) >= charSequence3.length()) {
                                                        i3 = 2;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                } else if (cCharAt5 != '=') {
                                                    i3 = 0;
                                                } else {
                                                    int length3 = charSequence3.length();
                                                    for (int i30 = i28 + 1; i30 < length3; i30++) {
                                                        if (charSequence3.charAt(i30) != '=') {
                                                            length3 = i30;
                                                            if (epv0.m39671G(length3, charSequence3.length(), charSequence3) >= charSequence3.length()) {
                                                                i3 = 1;
                                                            } else {
                                                                i3 = 0;
                                                            }
                                                        }
                                                    }
                                                    if (epv0.m39671G(length3, charSequence3.length(), charSequence3) >= charSequence3.length()) {
                                                        i3 = 1;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                }
                                                if (i3 > 0) {
                                                    cx10 cx10VarM40488c = f0mVar.m40488c();
                                                    ArrayList arrayList3 = cx10VarM40488c.f42884a;
                                                    if (!arrayList3.isEmpty()) {
                                                        ar9Var3 = new ar9(new do20(i3, cx10VarM40488c));
                                                        ar9Var3.f18979a = charSequence3.length();
                                                        int size2 = arrayList3.size();
                                                        if (size2 < 1) {
                                                            throw new IllegalArgumentException("Lines must be >= 1");
                                                        }
                                                        ar9Var3.f18981c = size2;
                                                        ar9Var = ar9Var3;
                                                    }
                                                }
                                                ar9Var = null;
                                            }
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        case 3:
                                            abstractC2601y5 = abstractC2601y7;
                                            int i31 = this.f139068f;
                                            CharSequence charSequence4 = this.f139063a.f126444a;
                                            if (this.f139070h >= 4 || charSequence4.charAt(i31) != '<') {
                                                ar9Var = null;
                                            } else {
                                                int i32 = 1;
                                                while (true) {
                                                    if (i32 <= 7) {
                                                        if (i32 != 7 || (!(((AbstractC2601y5) obj).mo30336f() instanceof lsm0) && !m60544g().mo91497d())) {
                                                            Pattern[] patternArr = ef30.f58924e[i32];
                                                            Pattern pattern = patternArr[0];
                                                            Pattern pattern2 = patternArr[1];
                                                            if (pattern.matcher(charSequence4.subSequence(i31, charSequence4.length())).find()) {
                                                                ar9Var = new ar9(new ef30(pattern2));
                                                                ar9Var.f18979a = this.f139065c;
                                                            }
                                                        }
                                                        i32++;
                                                    } else {
                                                        ar9Var = null;
                                                    }
                                                }
                                            }
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        case 4:
                                            abstractC2601y5 = abstractC2601y7;
                                            if (this.f139070h < 4 || this.f139071i || (m60544g().mo30336f() instanceof lsm0)) {
                                                ar9Var = null;
                                            } else {
                                                ar9Var = new ar9(new do20());
                                                ar9Var.f18980b = this.f139066d + 4;
                                            }
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        case 5:
                                            abstractC2601y5 = abstractC2601y7;
                                            AbstractC2601y5 abstractC2601y8 = (AbstractC2601y5) obj;
                                            int i33 = this.f139070h;
                                            if (i33 < 4) {
                                                int i34 = this.f139068f;
                                                int i35 = this.f139066d + i33;
                                                boolean zIsEmpty = f0mVar.m40488c().f42884a.isEmpty();
                                                CharSequence charSequence5 = this.f139063a.f126444a;
                                                char cCharAt6 = charSequence5.charAt(i34);
                                                if (cCharAt6 == '*' || cCharAt6 == '+' || cCharAt6 == '-') {
                                                    z = zIsEmpty;
                                                    i4 = i35;
                                                    int i36 = i34 + 1;
                                                    if (i36 >= charSequence5.length() || (cCharAt2 = charSequence5.charAt(i36)) == '\t' || cCharAt2 == ' ') {
                                                        dra draVar = new dra();
                                                        draVar.f52271g = String.valueOf(cCharAt6);
                                                        lo80Var = new lo80(draVar, i36);
                                                    } else {
                                                        lo80Var = null;
                                                    }
                                                } else {
                                                    int length4 = charSequence5.length();
                                                    int i37 = i34;
                                                    int i38 = 0;
                                                    while (true) {
                                                        z = zIsEmpty;
                                                        if (i37 < length4) {
                                                            char cCharAt7 = charSequence5.charAt(i37);
                                                            i4 = i35;
                                                            if (cCharAt7 != ')' && cCharAt7 != '.') {
                                                                switch (cCharAt7) {
                                                                    case '0':
                                                                    case '1':
                                                                    case '2':
                                                                    case '3':
                                                                    case '4':
                                                                    case '5':
                                                                    case '6':
                                                                    case '7':
                                                                    case '8':
                                                                    case '9':
                                                                        i38++;
                                                                        if (i38 <= 9) {
                                                                            i37++;
                                                                            zIsEmpty = z;
                                                                            i35 = i4;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            } else if (i38 >= 1 && ((i5 = i37 + 1) >= charSequence5.length() || (cCharAt3 = charSequence5.charAt(i5)) == '\t' || cCharAt3 == ' ')) {
                                                                String string = charSequence5.subSequence(i34, i37).toString();
                                                                rvl0 rvl0Var = new rvl0();
                                                                rvl0Var.f203100h = Integer.valueOf(Integer.parseInt(string));
                                                                rvl0Var.f203099g = String.valueOf(cCharAt7);
                                                                lo80Var = new lo80(rvl0Var, i5);
                                                            }
                                                        } else {
                                                            i4 = i35;
                                                        }
                                                        lo80Var = null;
                                                    }
                                                }
                                                if (lo80Var == null) {
                                                    lo80Var2 = null;
                                                } else {
                                                    ko80 ko80Var = lo80Var.f135350a;
                                                    int i39 = lo80Var.f135351b;
                                                    int i40 = (i39 - i34) + i4;
                                                    int length5 = charSequence5.length();
                                                    int i41 = i40;
                                                    while (true) {
                                                        if (i39 < length5) {
                                                            char cCharAt8 = charSequence5.charAt(i39);
                                                            int i42 = i39;
                                                            if (cCharAt8 == '\t') {
                                                                i41 = (4 - (i41 % 4)) + i41;
                                                            } else if (cCharAt8 == ' ') {
                                                                i41++;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            i39 = i42 + 1;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (z || ((!(ko80Var instanceof rvl0) || ((rvl0) ko80Var).f203100h.intValue() == 1) && z2)) {
                                                        if (!z2 || i41 - i40 > 4) {
                                                            i41 = i40 + 1;
                                                        }
                                                        lo80Var2 = new lo80(ko80Var, i41);
                                                    } else {
                                                        lo80Var2 = null;
                                                    }
                                                }
                                                if (lo80Var2 != null) {
                                                    ko80 ko80Var2 = lo80Var2.f135350a;
                                                    int i43 = lo80Var2.f135351b;
                                                    sw80 sw80Var = new sw80(i43 - this.f139066d);
                                                    if (abstractC2601y8 instanceof mo80) {
                                                        ko80 ko80Var3 = ((mo80) abstractC2601y8).f145624a;
                                                        if (((ko80Var3 instanceof dra) && (ko80Var2 instanceof dra)) ? Objects.equals(((dra) ko80Var3).f52271g, ((dra) ko80Var2).f52271g) : ((ko80Var3 instanceof rvl0) && (ko80Var2 instanceof rvl0)) ? Objects.equals(((rvl0) ko80Var3).f203099g, ((rvl0) ko80Var2).f203099g) : false) {
                                                            ar9Var2 = new ar9(sw80Var);
                                                            ar9Var2.f18980b = i43;
                                                        } else {
                                                            ar9Var2 = new ar9(new mo80(ko80Var2), sw80Var);
                                                            ar9Var2.f18980b = i43;
                                                        }
                                                    } else {
                                                        ar9Var2 = new ar9(new mo80(ko80Var2), sw80Var);
                                                        ar9Var2.f18980b = i43;
                                                    }
                                                    ar9Var = ar9Var2;
                                                }
                                                if (ar9Var == null) {
                                                    abstractC2601y7 = abstractC2601y5;
                                                    i10 = 0;
                                                    i16 = 4;
                                                }
                                            }
                                            ar9Var = null;
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        case 6:
                                            ArrayList arrayList4 = f0mVar.m40488c().f42884a;
                                            if (arrayList4.size() >= 1 && epv0.m39694n('|', ((ku31) edb.m38559h(1, arrayList4)).f126444a, i18) != -1) {
                                                ku31 ku31Var2 = this.f139063a;
                                                CharSequence charSequence6 = ku31Var2.m57375a(this.f139065c, ku31Var2.f126444a.length()).f126444a;
                                                ArrayList arrayList5 = new ArrayList();
                                                int i44 = 0;
                                                boolean z7 = false;
                                                int i45 = 0;
                                                while (true) {
                                                    if (i44 < charSequence6.length()) {
                                                        char cCharAt9 = charSequence6.charAt(i44);
                                                        if (cCharAt9 == c5 || cCharAt9 == ' ') {
                                                            abstractC2601y5 = abstractC2601y7;
                                                            i44++;
                                                        } else {
                                                            abstractC2601y5 = abstractC2601y7;
                                                            if (cCharAt9 == '-' || cCharAt9 == ':') {
                                                                if (i45 != 0 || arrayList5.isEmpty()) {
                                                                    if (cCharAt9 == ':') {
                                                                        i44++;
                                                                        i6 = 1;
                                                                        z3 = true;
                                                                    } else {
                                                                        i6 = 0;
                                                                        z3 = false;
                                                                    }
                                                                    boolean z8 = false;
                                                                    while (i44 < charSequence6.length() && charSequence6.charAt(i44) == '-') {
                                                                        i44++;
                                                                        i6++;
                                                                        z8 = true;
                                                                    }
                                                                    if (z8) {
                                                                        if (i44 >= charSequence6.length() || charSequence6.charAt(i44) != ':') {
                                                                            z4 = false;
                                                                        } else {
                                                                            i44++;
                                                                            i6++;
                                                                            z4 = true;
                                                                        }
                                                                        if (z3 && z4) {
                                                                            i7 = 2;
                                                                        } else if (z3) {
                                                                            i7 = 1;
                                                                        } else {
                                                                            i7 = z4 ? 3 : 0;
                                                                        }
                                                                        arrayList5.add(new wn61(i7, i6));
                                                                        i45 = 0;
                                                                    }
                                                                }
                                                            } else if (cCharAt9 == '|') {
                                                                i44++;
                                                                int i46 = i45 + 1;
                                                                if (i46 <= 1) {
                                                                    i45 = i46;
                                                                    z7 = true;
                                                                }
                                                            }
                                                        }
                                                        abstractC2601y7 = abstractC2601y5;
                                                        c5 = '\t';
                                                    } else {
                                                        abstractC2601y5 = abstractC2601y7;
                                                        if (!z7) {
                                                        }
                                                    }
                                                    arrayList5 = null;
                                                }
                                                if (arrayList5 != null && !arrayList5.isEmpty()) {
                                                    ku31 ku31Var3 = (ku31) edb.m38559h(1, arrayList4);
                                                    if (arrayList5.size() >= xn61.m91496l(ku31Var3).size()) {
                                                        ar9Var3 = new ar9(new xn61(arrayList5, ku31Var3));
                                                        ar9Var3.f18979a = this.f139065c;
                                                        ar9Var3.f18981c = 1;
                                                        ar9Var = ar9Var3;
                                                    }
                                                    if (ar9Var == null) {
                                                        abstractC2601y7 = abstractC2601y5;
                                                        i10 = 0;
                                                        i16 = 4;
                                                    }
                                                }
                                            } else {
                                                abstractC2601y5 = abstractC2601y7;
                                            }
                                            ar9Var = null;
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                        default:
                                            if (this.f139070h >= i16) {
                                                ar9Var = null;
                                            } else {
                                                int i47 = this.f139068f;
                                                CharSequence charSequence7 = this.f139063a.f126444a;
                                                int length6 = charSequence7.length();
                                                int i48 = i18;
                                                int i49 = i48;
                                                int i50 = i49;
                                                while (true) {
                                                    if (i47 >= length6) {
                                                        int i51 = i48;
                                                        int i52 = i49;
                                                        int i53 = i50;
                                                        if ((i51 >= 3 && i52 == 0 && i53 == 0) || ((i52 >= 3 && i51 == 0 && i53 == 0) || (i53 >= 3 && i51 == 0 && i52 == 0))) {
                                                            String.valueOf(charSequence7.subSequence(this.f139065c, charSequence7.length()));
                                                            AbstractC2601y5[] abstractC2601y5Arr = new AbstractC2601y5[1];
                                                            abstractC2601y5Arr[i18] = new i1s(1);
                                                            ar9Var = new ar9(abstractC2601y5Arr);
                                                            ar9Var.f18979a = charSequence7.length();
                                                        }
                                                    } else {
                                                        char cCharAt10 = charSequence7.charAt(i47);
                                                        if (cCharAt10 == '\t' || cCharAt10 == c4) {
                                                            i8 = i48;
                                                            i50 = i50;
                                                            i49 = i49;
                                                        } else if (cCharAt10 != c3) {
                                                            if (cCharAt10 == '-') {
                                                                i48++;
                                                            } else if (cCharAt10 == '_') {
                                                                i49++;
                                                            }
                                                            i8 = i48;
                                                        } else {
                                                            i8 = i48;
                                                            i50++;
                                                        }
                                                        i47++;
                                                        i48 = i8;
                                                        c4 = ' ';
                                                        c3 = '*';
                                                    }
                                                    ar9Var = null;
                                                }
                                            }
                                            abstractC2601y5 = abstractC2601y7;
                                            if (ar9Var == null) {
                                                abstractC2601y7 = abstractC2601y5;
                                                i10 = 0;
                                                i16 = 4;
                                            }
                                            break;
                                    }
                                } else {
                                    abstractC2601y5 = abstractC2601y7;
                                    ar9Var = null;
                                }
                            }
                        }
                        if (ar9Var == null) {
                            m60547j(this.f139068f);
                        } else {
                            int i54 = this.f139065c;
                            if (size > 0) {
                                m60542e(size);
                                size = 0;
                            }
                            int i55 = ar9Var.f18979a;
                            if (i55 != -1) {
                                m60547j(i55);
                            } else {
                                int i56 = ar9Var.f18980b;
                                if (i56 != -1) {
                                    m60546i(i56);
                                }
                            }
                            if (ar9Var.f18981c < 1) {
                                i9 = 0;
                                listUnmodifiableList = null;
                            } else {
                                AbstractC2601y5 abstractC2601y5M60544g = m60544g();
                                if (abstractC2601y5M60544g instanceof ssm0) {
                                    int i57 = ar9Var.f18981c;
                                    zm80 zm80Var = ((ssm0) abstractC2601y5M60544g).f213682b;
                                    zm80Var.getClass();
                                    ArrayList arrayList6 = zm80Var.f284184d;
                                    i9 = 0;
                                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList6.subList(Math.max(arrayList6.size() - i57, 0), arrayList6.size())));
                                    ArrayList arrayList7 = zm80Var.f284182b;
                                    if (i57 >= arrayList7.size()) {
                                        arrayList7.clear();
                                    } else {
                                        for (int i58 = 0; i58 < i57; i58++) {
                                            arrayList7.remove(arrayList7.size() - 1);
                                        }
                                    }
                                    if (i57 >= arrayList6.size()) {
                                        arrayList6.clear();
                                    } else {
                                        for (int i59 = 0; i59 < i57; i59++) {
                                            arrayList6.remove(arrayList6.size() - 1);
                                        }
                                    }
                                    m60542e(1);
                                } else {
                                    i9 = 0;
                                    listUnmodifiableList = null;
                                }
                            }
                            AbstractC2601y5[] abstractC2601y5Arr2 = (AbstractC2601y5[]) ar9Var.f18982d;
                            int length7 = abstractC2601y5Arr2.length;
                            int i60 = i9;
                            while (i60 < length7) {
                                AbstractC2601y5 abstractC2601y9 = abstractC2601y5Arr2[i60];
                                m60538a(new l1s(abstractC2601y9, i54));
                                if (listUnmodifiableList != null) {
                                    abstractC2601y9.mo30336f().m73297e(listUnmodifiableList);
                                }
                                i60++;
                                abstractC2601y5 = abstractC2601y9;
                                zMo49422h = abstractC2601y9.mo49422h();
                            }
                            i10 = i9;
                            abstractC2601y7 = abstractC2601y5;
                            z5 = true;
                        }
                    }
                }
                abstractC2601y5 = abstractC2601y7;
                m60547j(this.f139068f);
            } else {
                abstractC2601y5 = abstractC2601y7;
            }
            if (!z5 && !this.f139071i && m60544g().mo91497d()) {
                ((l1s) edb.m38559h(1, arrayList)).f128779b = i15;
                m60539b();
                return;
            }
            if (size > 0) {
                m60542e(size);
            }
            if (!abstractC2601y5.mo49422h()) {
                m60539b();
                return;
            } else if (this.f139071i) {
                m60540c();
                return;
            } else {
                m60538a(new l1s(new ssm0(), i15));
                m60539b();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m60546i(int i) {
        int i2;
        int i3 = this.f139069g;
        if (i >= i3) {
            this.f139065c = this.f139068f;
            this.f139066d = i3;
        }
        int length = this.f139063a.f126444a.length();
        while (true) {
            i2 = this.f139066d;
            if (i2 >= i || this.f139065c == length) {
                break;
            } else {
                m60541d();
            }
        }
        if (i2 <= i) {
            this.f139067e = false;
            return;
        }
        this.f139065c--;
        this.f139066d = i;
        this.f139067e = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m60547j(int i) {
        int i2 = this.f139068f;
        if (i >= i2) {
            this.f139065c = i2;
            this.f139066d = this.f139069g;
        }
        int length = this.f139063a.f126444a.length();
        while (true) {
            int i3 = this.f139065c;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m60541d();
            }
        }
        this.f139067e = false;
    }
}
