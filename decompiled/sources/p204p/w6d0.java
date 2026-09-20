package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w6d0 implements c29 {

    /* JADX INFO: renamed from: a */
    public final w7j f248331a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f248332b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f248333c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f248334d;

    /* JADX INFO: renamed from: e */
    public final xu41 f248335e;

    /* JADX INFO: renamed from: f */
    public final int[] f248336f;

    /* JADX INFO: renamed from: g */
    public final int[] f248337g;

    /* JADX INFO: renamed from: h */
    public float f248338h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f248339i;

    public w6d0(yqq yqqVar) {
        w7j w7jVar = new w7j(0, 0);
        w7jVar.f248708u0 = new ArrayList();
        w7jVar.f248709v0 = new i26(w7jVar);
        xxo xxoVar = new xxo(w7jVar);
        w7jVar.f248710w0 = xxoVar;
        w7jVar.f248712y0 = null;
        w7jVar.f248713z0 = false;
        w7jVar.f248692A0 = new kl80();
        w7jVar.f248695D0 = 0;
        w7jVar.f248696E0 = 0;
        w7jVar.f248697F0 = new ajc[4];
        w7jVar.f248698G0 = new ajc[4];
        w7jVar.f248699H0 = 257;
        w7jVar.f248700I0 = false;
        w7jVar.f248701J0 = false;
        w7jVar.f248702K0 = null;
        w7jVar.f248703L0 = null;
        w7jVar.f248704M0 = null;
        w7jVar.f248705N0 = null;
        w7jVar.f248706O0 = new HashSet();
        w7jVar.f248707P0 = new b29();
        w7jVar.f248712y0 = this;
        xxoVar.m92359u(this);
        this.f248331a = w7jVar;
        this.f248332b = new LinkedHashMap();
        this.f248333c = new LinkedHashMap();
        this.f248334d = new LinkedHashMap();
        this.f248335e = new xu41(yqqVar);
        this.f248336f = new int[2];
        this.f248337g = new int[2];
        this.f248338h = Float.NaN;
        this.f248339i = new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static void m87280f(u7j u7jVar, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int iOrdinal = u7jVar.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 1) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (iOrdinal == 2) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 3) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((u7jVar + " is not supported").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x019d  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00b4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.c29
    /* JADX INFO: renamed from: b */
    public final void mo31319b(v7j v7jVar, b29 b29Var) {
        Object obj;
        Object obj2;
        int i;
        Integer numValueOf;
        int i2;
        Integer numValueOf2;
        Integer num;
        int iIntValue;
        int i3;
        Integer numValueOf3;
        Integer num2;
        char c;
        int iIntValue2;
        boolean z;
        int iMo34818R;
        char c2;
        Object obj3;
        String str = v7jVar.f238246k;
        LinkedHashMap linkedHashMap = this.f248333c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        u7j u7jVar = b29Var.f22527a;
        int i4 = b29Var.f22529c;
        int i5 = v7jVar.f238262s;
        int i6 = b29Var.f22536j;
        boolean z2 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != v7jVar.m84882m()) {
            z2 = false;
        }
        boolean zMo51861C = v7jVar.mo51861C();
        xu41 xu41Var = this.f248335e;
        m87280f(u7jVar, i4, i5, i6, z2, zMo51861C, b8j.m28430i(xu41Var.f266002l), this.f248336f);
        m87280f(b29Var.f22528b, b29Var.f22530d, v7jVar.f238264t, b29Var.f22536j, (numArr != null ? numArr[0].intValue() : 0) == v7jVar.m84886s(), v7jVar.mo51862D(), b8j.m28429h(xu41Var.f266002l), this.f248337g);
        int[] iArr = this.f248336f;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int[] iArr2 = this.f248337g;
        long jM38110a = e8j.m38110a(i7, i8, iArr2[0], iArr2[1]);
        int i9 = b29Var.f22536j;
        if (i9 == 1 || i9 == 2) {
            pqm0 pqm0VarM87283e = m87283e(v7jVar, jM38110a);
            obj = pqm0VarM87283e.f180351b;
            obj2 = pqm0VarM87283e.f180350a;
            v7jVar.f238238g = false;
            Comparable comparable = (Comparable) obj2;
            i = v7jVar.f238267v;
            numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            i2 = v7jVar.f238268w;
            numValueOf2 = Integer.valueOf(i2);
            if (i2 > 0) {
                num = numValueOf2;
            } else {
                num = null;
            }
            iIntValue = ((Number) n0e1.m63441r(comparable, numValueOf, num)).intValue();
            Comparable comparable2 = (Comparable) obj;
            i3 = v7jVar.f238270y;
            numValueOf3 = Integer.valueOf(i3);
            if (i3 > 0) {
                num2 = numValueOf3;
            } else {
                num2 = null;
            }
            c = 2;
            int i10 = v7jVar.f238271z;
            iIntValue2 = ((Number) n0e1.m63441r(comparable2, num2, i10 > 0 ? Integer.valueOf(i10) : null)).intValue();
            if (iIntValue != ((Number) obj2).intValue()) {
                jM38110a = e8j.m38110a(iIntValue, iIntValue, b8j.m28431j(jM38110a), b8j.m28429h(jM38110a));
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 != ((Number) obj).intValue()) {
                jM38110a = e8j.m38110a(b8j.m28432k(jM38110a), b8j.m28430i(jM38110a), iIntValue2, iIntValue2);
                z = true;
            }
            if (z) {
                m87283e(v7jVar, jM38110a);
                v7jVar.f238238g = false;
            }
        } else {
            u7j u7jVar2 = b29Var.f22527a;
            u7j u7jVar3 = u7j.f227712c;
            if (u7jVar2 == u7jVar3 && v7jVar.f238262s == 0 && b29Var.f22528b == u7jVar3 && v7jVar.f238264t == 0) {
                c = 2;
            } else {
                pqm0 pqm0VarM87283e2 = m87283e(v7jVar, jM38110a);
                obj = pqm0VarM87283e2.f180351b;
                obj2 = pqm0VarM87283e2.f180350a;
                v7jVar.f238238g = false;
                Comparable comparable3 = (Comparable) obj2;
                i = v7jVar.f238267v;
                numValueOf = Integer.valueOf(i);
                if (i <= 0) {
                    numValueOf = null;
                }
                i2 = v7jVar.f238268w;
                numValueOf2 = Integer.valueOf(i2);
                if (i2 > 0) {
                    num = numValueOf2;
                } else {
                    num = null;
                }
                iIntValue = ((Number) n0e1.m63441r(comparable3, numValueOf, num)).intValue();
                Comparable comparable4 = (Comparable) obj;
                i3 = v7jVar.f238270y;
                numValueOf3 = Integer.valueOf(i3);
                if (i3 > 0) {
                    num2 = numValueOf3;
                } else {
                    num2 = null;
                }
                c = 2;
                int i11 = v7jVar.f238271z;
                iIntValue2 = ((Number) n0e1.m63441r(comparable4, num2, i11 > 0 ? Integer.valueOf(i11) : null)).intValue();
                if (iIntValue != ((Number) obj2).intValue()) {
                    jM38110a = e8j.m38110a(iIntValue, iIntValue, b8j.m28431j(jM38110a), b8j.m28429h(jM38110a));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != ((Number) obj).intValue()) {
                    jM38110a = e8j.m38110a(b8j.m28432k(jM38110a), b8j.m28430i(jM38110a), iIntValue2, iIntValue2);
                    z = true;
                }
                if (z) {
                    m87283e(v7jVar, jM38110a);
                    v7jVar.f238238g = false;
                }
            }
        }
        t5o0 t5o0Var = (t5o0) this.f248332b.get(v7jVar.f238241h0);
        b29Var.f22531e = t5o0Var != null ? t5o0Var.f217322a : v7jVar.m84886s();
        b29Var.f22532f = t5o0Var != null ? t5o0Var.f217323b : v7jVar.m84882m();
        if (t5o0Var != null) {
            ArrayList arrayList = xu41Var.f265999i;
            if (xu41Var.f266000j) {
                arrayList.clear();
                Iterator it = xu41Var.f265998h.iterator();
                while (it.hasNext()) {
                    v7j v7jVarMo48198b = ((ulv0) xu41Var.f265993c.get(it.next())).mo48198b();
                    if (v7jVarMo48198b != null) {
                        arrayList.add(v7jVarMo48198b);
                    }
                }
                xu41Var.f266000j = false;
            }
            if (arrayList.contains(v7jVar)) {
                iMo34818R = t5o0Var.mo34818R(sb3.f207328a);
            } else {
                iMo34818R = Integer.MIN_VALUE;
            }
        } else {
            iMo34818R = Integer.MIN_VALUE;
        }
        b29Var.f22534h = iMo34818R != Integer.MIN_VALUE;
        b29Var.f22533g = iMo34818R;
        Object obj4 = linkedHashMap.get(str);
        if (obj4 == null) {
            Integer[] numArr2 = new Integer[3];
            c2 = 0;
            numArr2[0] = 0;
            numArr2[1] = 0;
            numArr2[c] = Integer.MIN_VALUE;
            linkedHashMap.put(str, numArr2);
            obj3 = numArr2;
        } else {
            c2 = 0;
            obj3 = obj4;
        }
        Integer[] numArr3 = (Integer[]) obj3;
        numArr3[c2] = Integer.valueOf(b29Var.f22531e);
        numArr3[1] = Integer.valueOf(b29Var.f22532f);
        numArr3[c] = Integer.valueOf(b29Var.f22533g);
        b29Var.f22535i = (b29Var.f22531e == b29Var.f22529c && b29Var.f22532f == b29Var.f22530d) ? c2 : 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m87281c(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1750959258);
        Iterator it = this.f248339i.iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v == null) {
            return;
        }
        pgv0VarM91796v.f177419d = new jtb0(this, i, 19);
    }

    /* JADX INFO: renamed from: d */
    public final void m87282d(float f, xq00 xq00Var, int i) {
        xq00Var.m91775k0(2126574786);
        xud.m92135b(0, new gj8(this, f, 3), xq00Var, pha.f177517a.mo66946b(cxh0.f43038a));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v == null) {
            return;
        }
        pgv0VarM91796v.f177419d = new jed(this, f, i, 7);
    }

    /* JADX INFO: renamed from: e */
    public final pqm0 m87283e(v7j v7jVar, long j) {
        int i;
        int i2 = 0;
        Object obj = v7jVar.f238241h0;
        if (!(v7jVar instanceof vpc1)) {
            if (!(obj instanceof h6d0)) {
                return new pqm0(0, 0);
            }
            t5o0 t5o0VarMo39619B = ((h6d0) obj).mo39619B(j);
            this.f248332b.put(obj, t5o0VarMo39619B);
            return new pqm0(Integer.valueOf(t5o0VarMo39619B.f217322a), Integer.valueOf(t5o0VarMo39619B.f217323b));
        }
        if (b8j.m28428g(j)) {
            i = 1073741824;
        } else {
            i = b8j.m28426e(j) ? Integer.MIN_VALUE : 0;
        }
        if (b8j.m28427f(j)) {
            i2 = 1073741824;
        } else if (b8j.m28425d(j)) {
            i2 = Integer.MIN_VALUE;
        }
        vpc1 vpc1Var = (vpc1) v7jVar;
        vpc1Var.mo35147Z(i, b8j.m28430i(j), i2, b8j.m28429h(j));
        return new pqm0(Integer.valueOf(vpc1Var.f243662D0), Integer.valueOf(vpc1Var.f243663E0));
    }

    /* JADX INFO: renamed from: g */
    public final void m87284g(s5o0 s5o0Var, List list) {
        h6d0 h6d0Var;
        t5o0 t5o0Var;
        Object next;
        LinkedHashMap linkedHashMap = this.f248334d;
        if (linkedHashMap.isEmpty()) {
            for (v7j v7jVar : this.f248331a.f248708u0) {
                Object obj = v7jVar.f238241h0;
                if (obj instanceof h6d0) {
                    itd1 itd1Var = v7jVar.f238244j;
                    v7j v7jVar2 = itd1Var.f105522a;
                    if (v7jVar2 != null) {
                        itd1Var.f105523b = v7jVar2.m84887t();
                        itd1Var.f105524c = v7jVar2.m84888u();
                        v7jVar2.m84887t();
                        v7jVar2.m84888u();
                        itd1Var.m51627a(v7jVar2.f238244j);
                    }
                    linkedHashMap.put(obj, new itd1(itd1Var));
                }
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h6d0 h6d0Var2 = (h6d0) list.get(i);
            if (linkedHashMap.containsKey(h6d0Var2)) {
                h6d0Var = h6d0Var2;
            } else {
                Iterator it = linkedHashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    h6d0 h6d0Var3 = (h6d0) next;
                    if (wze1.m89447w(h6d0Var3) != null && wj50.m88271j(wze1.m89447w(h6d0Var3), wze1.m89447w(h6d0Var2))) {
                        break;
                    }
                }
                h6d0Var = (h6d0) next;
                if (h6d0Var == null) {
                    continue;
                }
            }
            itd1 itd1Var2 = (itd1) linkedHashMap.get(h6d0Var);
            if (itd1Var2 == null || (t5o0Var = (t5o0) this.f248332b.get(h6d0Var)) == null) {
                return;
            }
            if (linkedHashMap.containsKey(h6d0Var2)) {
                hxg1.m49013z(s5o0Var, t5o0Var, itd1Var2);
            } else {
                int i2 = t5o0Var.f217322a;
                int i3 = t5o0Var.f217323b;
                if (!((i3 >= 0) & (i2 >= 0))) {
                    ot40.m67767a("width and height must be >= 0");
                }
                hxg1.m49013z(s5o0Var, h6d0Var2.mo39619B(e8j.m38117h(i2, i2, i3, i3)), itd1Var2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m87285h(long j, ko70 ko70Var, d7j d7jVar, List list) {
        rjr rjrVarM75664l;
        rjr rjrVarM75664l2;
        hq20 hq20Var;
        jq20 jq20VarMo43252a0;
        jq20 jq20VarMo43252a1;
        if (b8j.m28428g(j)) {
            rjrVarM75664l = rjr.m75659e(b8j.m28430i(j));
        } else {
            rjrVarM75664l = rjr.m75664l();
            int iM28432k = b8j.m28432k(j);
            if (iM28432k >= 0) {
                rjrVarM75664l.f199893b = iM28432k;
            }
        }
        xu41 xu41Var = this.f248335e;
        v6j v6jVar = xu41Var.f265996f;
        HashMap map = xu41Var.f265994d;
        HashMap map2 = xu41Var.f265993c;
        v6j v6jVar2 = xu41Var.f265996f;
        v6jVar.f237883d0 = rjrVarM75664l;
        if (b8j.m28427f(j)) {
            rjrVarM75664l2 = rjr.m75659e(b8j.m28429h(j));
        } else {
            rjrVarM75664l2 = rjr.m75664l();
            int iM28431j = b8j.m28431j(j);
            if (iM28431j >= 0) {
                rjrVarM75664l2.f199893b = iM28431j;
            }
        }
        v6jVar2.f237885e0 = rjrVarM75664l2;
        rjr rjrVar = v6jVar2.f237883d0;
        w7j w7jVar = this.f248331a;
        rjrVar.m75665b(w7jVar, 0);
        v6jVar2.f237885e0.m75665b(w7jVar, 1);
        xu41Var.f266002l = j;
        xu41Var.f265992b = ko70Var == ko70.f124556a;
        this.f248332b.clear();
        this.f248333c.clear();
        this.f248334d.clear();
        if (d7jVar.mo35203a(list)) {
            Iterator it = map2.keySet().iterator();
            while (it.hasNext()) {
                ((ulv0) map2.get(it.next())).mo48198b().mo84859E();
            }
            map2.clear();
            map2.put(0, v6jVar2);
            map.clear();
            xu41Var.f265995e.clear();
            xu41Var.f265998h.clear();
            xu41Var.f266000j = true;
            d7jVar.mo35204c(xu41Var, list);
            hxg1.m49005r(xu41Var, list);
            w7jVar.m87397e0();
            v6jVar2.f237883d0.m75665b(w7jVar, 0);
            v6jVar2.f237885e0.m75665b(w7jVar, 1);
            for (Object obj : map.keySet()) {
                jq20 jq20VarMo43252a2 = ((hq20) map.get(obj)).mo43252a0();
                if (jq20VarMo43252a2 != null) {
                    ulv0 ulv0VarM92121b = (ulv0) map2.get(obj);
                    if (ulv0VarM92121b == null) {
                        ulv0VarM92121b = xu41Var.m92121b(obj);
                    }
                    ulv0VarM92121b.mo61241a(jq20VarMo43252a2);
                }
            }
            for (Object obj2 : map2.keySet()) {
                ulv0 ulv0Var = (ulv0) map2.get(obj2);
                if (ulv0Var != v6jVar2 && (ulv0Var.mo61242c() instanceof hq20) && (jq20VarMo43252a1 = ((hq20) ulv0Var.mo61242c()).mo43252a0()) != null) {
                    ulv0 ulv0VarM92121b2 = (ulv0) map2.get(obj2);
                    if (ulv0VarM92121b2 == null) {
                        ulv0VarM92121b2 = xu41Var.m92121b(obj2);
                    }
                    ulv0VarM92121b2.mo61241a(jq20VarMo43252a1);
                }
            }
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                ulv0 ulv0Var2 = (ulv0) map2.get(it2.next());
                if (ulv0Var2 != v6jVar2) {
                    v7j v7jVarMo48198b = ulv0Var2.mo48198b();
                    v7jVarMo48198b.f238247k0 = ulv0Var2.getKey().toString();
                    v7jVarMo48198b.f238221V = null;
                    if (ulv0Var2.mo61242c() instanceof ma20) {
                        ulv0Var2.apply();
                    }
                    w7jVar.m87390W(v7jVarMo48198b);
                } else {
                    ulv0Var2.mo61241a(w7jVar);
                }
            }
            Iterator it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                hq20 hq20Var2 = (hq20) map.get(it3.next());
                if (hq20Var2.mo43252a0() != null) {
                    Iterator it4 = hq20Var2.f94003m0.iterator();
                    while (it4.hasNext()) {
                        hq20Var2.mo43252a0().m54027W(((ulv0) map2.get(it4.next())).mo48198b());
                    }
                    hq20Var2.apply();
                } else {
                    hq20Var2.apply();
                }
            }
            Iterator it5 = map2.keySet().iterator();
            while (it5.hasNext()) {
                ulv0 ulv0Var3 = (ulv0) map2.get(it5.next());
                if (ulv0Var3 != v6jVar2 && (ulv0Var3.mo61242c() instanceof hq20) && (jq20VarMo43252a0 = (hq20Var = (hq20) ulv0Var3.mo61242c()).mo43252a0()) != null) {
                    for (Object obj3 : hq20Var.f94003m0) {
                        ulv0 ulv0Var4 = (ulv0) map2.get(obj3);
                        if (ulv0Var4 != null) {
                            jq20VarMo43252a0.m54027W(ulv0Var4.mo48198b());
                        } else if (obj3 instanceof ulv0) {
                            jq20VarMo43252a0.m54027W(((ulv0) obj3).mo48198b());
                        } else {
                            System.out.println("couldn't find reference for " + obj3);
                        }
                    }
                    ulv0Var3.apply();
                }
            }
            for (Object obj4 : map2.keySet()) {
                ulv0 ulv0Var5 = (ulv0) map2.get(obj4);
                ulv0Var5.apply();
                v7j v7jVarMo48198b2 = ulv0Var5.mo48198b();
                if (v7jVarMo48198b2 != null && obj4 != null) {
                    v7jVarMo48198b2.f238246k = obj4.toString();
                }
            }
        } else {
            hxg1.m49005r(xu41Var, list);
        }
        w7jVar.m84872T(b8j.m28430i(j));
        w7jVar.m84867O(b8j.m28429h(j));
        this.f248338h = Float.NaN;
        w7jVar.f248709v0.m49454C(w7jVar);
        w7jVar.f248699H0 = 257;
        kl80.f123823p = w7jVar.m87395c0(512);
        int i = w7jVar.f248699H0;
        w7jVar.f248693B0 = 0;
        w7jVar.f248694C0 = 0;
        w7jVar.f248709v0.m49453B(w7jVar, i, 0, 0, 0, 0);
        return epv0.m39682b(w7jVar.m84886s(), w7jVar.m84882m());
    }

    @Override // p204p.c29
    /* JADX INFO: renamed from: a */
    public final void mo31318a() {
    }
}
