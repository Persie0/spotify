package p204p;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w7j extends v7j {

    /* JADX INFO: renamed from: B0 */
    public int f248693B0;

    /* JADX INFO: renamed from: C0 */
    public int f248694C0;

    /* JADX INFO: renamed from: x0 */
    public int f248711x0;

    /* JADX INFO: renamed from: u0 */
    public ArrayList f248708u0 = new ArrayList();

    /* JADX INFO: renamed from: v0 */
    public i26 f248709v0 = new i26(this);

    /* JADX INFO: renamed from: w0 */
    public xxo f248710w0 = new xxo(this);

    /* JADX INFO: renamed from: y0 */
    public c29 f248712y0 = null;

    /* JADX INFO: renamed from: z0 */
    public boolean f248713z0 = false;

    /* JADX INFO: renamed from: A0 */
    public kl80 f248692A0 = new kl80();

    /* JADX INFO: renamed from: D0 */
    public int f248695D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public int f248696E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public ajc[] f248697F0 = new ajc[4];

    /* JADX INFO: renamed from: G0 */
    public ajc[] f248698G0 = new ajc[4];

    /* JADX INFO: renamed from: H0 */
    public int f248699H0 = 257;

    /* JADX INFO: renamed from: I0 */
    public boolean f248700I0 = false;

    /* JADX INFO: renamed from: J0 */
    public boolean f248701J0 = false;

    /* JADX INFO: renamed from: K0 */
    public WeakReference f248702K0 = null;

    /* JADX INFO: renamed from: L0 */
    public WeakReference f248703L0 = null;

    /* JADX INFO: renamed from: M0 */
    public WeakReference f248704M0 = null;

    /* JADX INFO: renamed from: N0 */
    public WeakReference f248705N0 = null;

    /* JADX INFO: renamed from: O0 */
    public HashSet f248706O0 = new HashSet();

    /* JADX INFO: renamed from: P0 */
    public b29 f248707P0 = new b29();

    /* JADX INFO: renamed from: b0 */
    public static void m87389b0(v7j v7jVar, c29 c29Var, b29 b29Var) {
        int i;
        int i2;
        if (c29Var == null) {
            return;
        }
        int i3 = v7jVar.f238243i0;
        int[] iArr = v7jVar.f238266u;
        if (i3 == 8 || (v7jVar instanceof ka20) || (v7jVar instanceof ix8)) {
            b29Var.f22531e = 0;
            b29Var.f22532f = 0;
            return;
        }
        u7j[] u7jVarArr = v7jVar.f238220U;
        b29Var.f22527a = u7jVarArr[0];
        b29Var.f22528b = u7jVarArr[1];
        b29Var.f22529c = v7jVar.m84886s();
        b29Var.f22530d = v7jVar.m84882m();
        b29Var.f22535i = false;
        b29Var.f22536j = 0;
        u7j u7jVar = b29Var.f22527a;
        u7j u7jVar2 = u7j.f227712c;
        boolean z = u7jVar == u7jVar2;
        boolean z2 = b29Var.f22528b == u7jVar2;
        boolean z3 = z && v7jVar.f238224Y > 0.0f;
        boolean z4 = z2 && v7jVar.f238224Y > 0.0f;
        u7j u7jVar3 = u7j.f227711b;
        u7j u7jVar4 = u7j.f227710a;
        if (z && v7jVar.m84889v(0) && v7jVar.f238262s == 0 && !z3) {
            b29Var.f22527a = u7jVar3;
            if (z2 && v7jVar.f238264t == 0) {
                b29Var.f22527a = u7jVar4;
            }
            z = false;
        }
        if (z2 && v7jVar.m84889v(1) && v7jVar.f238264t == 0 && !z4) {
            b29Var.f22528b = u7jVar3;
            if (z && v7jVar.f238262s == 0) {
                b29Var.f22528b = u7jVar4;
            }
            z2 = false;
        }
        if (v7jVar.mo51861C()) {
            b29Var.f22527a = u7jVar4;
            z = false;
        }
        if (v7jVar.mo51862D()) {
            b29Var.f22528b = u7jVar4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                b29Var.f22527a = u7jVar4;
            } else if (!z2) {
                if (b29Var.f22528b == u7jVar4) {
                    i2 = b29Var.f22530d;
                } else {
                    b29Var.f22527a = u7jVar3;
                    c29Var.mo31319b(v7jVar, b29Var);
                    i2 = b29Var.f22532f;
                }
                b29Var.f22527a = u7jVar4;
                b29Var.f22529c = (int) (v7jVar.f238224Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                b29Var.f22528b = u7jVar4;
            } else if (!z) {
                if (b29Var.f22527a == u7jVar4) {
                    i = b29Var.f22529c;
                } else {
                    b29Var.f22528b = u7jVar3;
                    c29Var.mo31319b(v7jVar, b29Var);
                    i = b29Var.f22531e;
                }
                b29Var.f22528b = u7jVar4;
                if (v7jVar.f238225Z == -1) {
                    b29Var.f22530d = (int) (i / v7jVar.f238224Y);
                } else {
                    b29Var.f22530d = (int) (v7jVar.f238224Y * i);
                }
            }
        }
        c29Var.mo31319b(v7jVar, b29Var);
        v7jVar.m84872T(b29Var.f22531e);
        v7jVar.m84867O(b29Var.f22532f);
        v7jVar.f238205F = b29Var.f22534h;
        v7jVar.m84863K(b29Var.f22533g);
        b29Var.f22536j = 0;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: E */
    public final void mo84859E() {
        this.f248692A0.m56819t();
        this.f248693B0 = 0;
        this.f248694C0 = 0;
        this.f248708u0.clear();
        super.mo84859E();
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: H */
    public final void mo84862H(i26 i26Var) {
        super.mo84862H(i26Var);
        int size = this.f248708u0.size();
        for (int i = 0; i < size; i++) {
            ((v7j) this.f248708u0.get(i)).mo84862H(i26Var);
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: U */
    public final void mo84873U(boolean z, boolean z2) {
        super.mo84873U(z, z2);
        int size = this.f248708u0.size();
        for (int i = 0; i < size; i++) {
            ((v7j) this.f248708u0.get(i)).mo84873U(z, z2);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m87390W(v7j v7jVar) {
        this.f248708u0.add(v7jVar);
        v7j v7jVar2 = v7jVar.f238221V;
        if (v7jVar2 != null) {
            ((w7j) v7jVar2).m87396d0(v7jVar);
        }
        v7jVar.f238221V = this;
    }

    /* JADX INFO: renamed from: X */
    public final void m87391X(v7j v7jVar, int i) {
        if (i == 0) {
            int i2 = this.f248695D0 + 1;
            ajc[] ajcVarArr = this.f248698G0;
            if (i2 >= ajcVarArr.length) {
                this.f248698G0 = (ajc[]) Arrays.copyOf(ajcVarArr, ajcVarArr.length * 2);
            }
            ajc[] ajcVarArr2 = this.f248698G0;
            int i3 = this.f248695D0;
            ajcVarArr2[i3] = new ajc(v7jVar, 0, this.f248713z0);
            this.f248695D0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f248696E0 + 1;
            ajc[] ajcVarArr3 = this.f248697F0;
            if (i4 >= ajcVarArr3.length) {
                this.f248697F0 = (ajc[]) Arrays.copyOf(ajcVarArr3, ajcVarArr3.length * 2);
            }
            ajc[] ajcVarArr4 = this.f248697F0;
            int i5 = this.f248696E0;
            ajcVarArr4[i5] = new ajc(v7jVar, 1, this.f248713z0);
            this.f248696E0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m87392Y(kl80 kl80Var) {
        w7j w7jVar;
        kl80 kl80Var2;
        HashSet hashSet = this.f248706O0;
        boolean zM87395c0 = m87395c0(64);
        mo35148c(kl80Var, zM87395c0);
        int size = this.f248708u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            v7j v7jVar = (v7j) this.f248708u0.get(i);
            boolean[] zArr = v7jVar.f238219T;
            zArr[0] = false;
            zArr[1] = false;
            if (v7jVar instanceof ix8) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                v7j v7jVar2 = (v7j) this.f248708u0.get(i2);
                if (v7jVar2 instanceof ix8) {
                    ix8 ix8Var = (ix8) v7jVar2;
                    for (int i3 = 0; i3 < ix8Var.f114775v0; i3++) {
                        v7j v7jVar3 = ix8Var.f114774u0[i3];
                        if (ix8Var.f106617x0 || v7jVar3.mo51865d()) {
                            int i4 = ix8Var.f106616w0;
                            if (i4 == 0 || i4 == 1) {
                                v7jVar3.f238219T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                v7jVar3.f238219T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            v7j v7jVar4 = (v7j) this.f248708u0.get(i5);
            v7jVar4.getClass();
            boolean z2 = v7jVar4 instanceof vpc1;
            if (z2 || (v7jVar4 instanceof ka20)) {
                if (z2) {
                    hashSet.add(v7jVar4);
                } else {
                    v7jVar4.mo35148c(kl80Var, zM87395c0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                vpc1 vpc1Var = (vpc1) ((v7j) it.next());
                for (int i6 = 0; i6 < vpc1Var.f114775v0; i6++) {
                    if (hashSet.contains(vpc1Var.f114774u0[i6])) {
                        vpc1Var.mo35148c(kl80Var, zM87395c0);
                        hashSet.remove(vpc1Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((v7j) it2.next()).mo35148c(kl80Var, zM87395c0);
                }
                hashSet.clear();
            }
        }
        boolean z3 = kl80.f123823p;
        u7j u7jVar = u7j.f227711b;
        if (z3) {
            HashSet<v7j> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                v7j v7jVar5 = (v7j) this.f248708u0.get(i7);
                v7jVar5.getClass();
                if (!(v7jVar5 instanceof vpc1) && !(v7jVar5 instanceof ka20)) {
                    hashSet2.add(v7jVar5);
                }
            }
            w7jVar = this;
            kl80Var2 = kl80Var;
            w7jVar.m84875b(this, kl80Var2, hashSet2, this.f238220U[0] == u7jVar ? 0 : 1, false);
            for (v7j v7jVar6 : hashSet2) {
                nsf1.m65519e(this, kl80Var2, v7jVar6);
                v7jVar6.mo35148c(kl80Var2, zM87395c0);
            }
        } else {
            w7jVar = this;
            kl80Var2 = kl80Var;
            for (int i8 = 0; i8 < size; i8++) {
                v7j v7jVar7 = (v7j) w7jVar.f248708u0.get(i8);
                if (v7jVar7 instanceof w7j) {
                    u7j[] u7jVarArr = v7jVar7.f238220U;
                    u7j u7jVar2 = u7jVarArr[0];
                    u7j u7jVar3 = u7jVarArr[1];
                    u7j u7jVar4 = u7j.f227710a;
                    if (u7jVar2 == u7jVar) {
                        v7jVar7.m84868P(u7jVar4);
                    }
                    if (u7jVar3 == u7jVar) {
                        v7jVar7.m84870R(u7jVar4);
                    }
                    v7jVar7.mo35148c(kl80Var2, zM87395c0);
                    if (u7jVar2 == u7jVar) {
                        v7jVar7.m84868P(u7jVar2);
                    }
                    if (u7jVar3 == u7jVar) {
                        v7jVar7.m84870R(u7jVar3);
                    }
                } else {
                    nsf1.m65519e(this, kl80Var2, v7jVar7);
                    if (!(v7jVar7 instanceof vpc1) && !(v7jVar7 instanceof ka20)) {
                        v7jVar7.mo35148c(kl80Var2, zM87395c0);
                    }
                }
            }
        }
        if (w7jVar.f248695D0 > 0) {
            grl0.m45538k(this, kl80Var2, null, 0);
        }
        if (w7jVar.f248696E0 > 0) {
            grl0.m45538k(this, kl80Var2, null, 1);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final ArrayList m87393Z() {
        return this.f248708u0;
    }

    /* JADX WARN: Code duplicated, block: B:246:0x040a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0421  */
    /* JADX WARN: Code duplicated, block: B:250:0x0437  */
    /* JADX WARN: Code duplicated, block: B:252:0x043b  */
    /* JADX WARN: Code duplicated, block: B:255:0x0447  */
    /* JADX WARN: Code duplicated, block: B:257:0x0450 A[LOOP:14: B:256:0x044e->B:257:0x0450, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:261:0x0463 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:279:0x04df  */
    /* JADX WARN: Code duplicated, block: B:282:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:283:0x0507  */
    /* JADX WARN: Code duplicated, block: B:285:0x050a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x051a  */
    /* JADX WARN: Code duplicated, block: B:293:0x052c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x0542 A[PHI: r15 r21
      0x0542: PHI (r15v12 ??) = (r15v11 ??), (r15v16 ??), (r15v16 ??), (r15v16 ??) binds: [B:284:0x0508, B:292:0x052a, B:293:0x052c, B:295:0x0532] A[DONT_GENERATE, DONT_INLINE]
      0x0542: PHI (r21v7 boolean) = (r21v6 boolean), (r21v8 boolean), (r21v8 boolean), (r21v8 boolean) binds: [B:284:0x0508, B:292:0x052a, B:293:0x052c, B:295:0x0532] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:299:0x0548  */
    /* JADX WARN: Code duplicated, block: B:362:0x0549 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r28v0, types: [p.v7j, p.w7j] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: a0 */
    public final void m87394a0() {
        c6j c6jVar;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        c6j c6jVar2;
        ?? r15;
        boolean[] zArr;
        boolean[] zArr2;
        int i3;
        boolean z4;
        int i4;
        int iMax;
        boolean z5;
        int iMax2;
        ?? r4;
        ?? r16;
        int i5;
        ?? r17;
        boolean zM87395c0;
        int size;
        int i6;
        boolean z6;
        v7j v7jVar;
        ?? r18;
        int i7;
        c6j c6jVar3;
        kl80 kl80Var = this.f248692A0;
        this.f238227a0 = 0;
        this.f238229b0 = 0;
        this.f248700I0 = false;
        this.f248701J0 = false;
        int size2 = this.f248708u0.size();
        int iMax3 = Math.max(0, m84886s());
        int iMax4 = Math.max(0, m84882m());
        u7j[] u7jVarArr = this.f238220U;
        u7j u7jVar = u7jVarArr[1];
        u7j u7jVar2 = u7jVarArr[0];
        int i8 = this.f248711x0;
        c6j c6jVar4 = this.f238210K;
        c6j c6jVar5 = this.f238209J;
        u7j u7jVar3 = u7j.f227710a;
        if (i8 == 0 && nsf1.m65520f(this.f248699H0, 1)) {
            c29 c29Var = this.f248712y0;
            u7j[] u7jVarArr2 = this.f238220U;
            u7j u7jVar4 = u7jVarArr2[0];
            u7j u7jVar5 = u7jVarArr2[1];
            m84861G();
            ArrayList arrayListM87393Z = m87393Z();
            int size3 = arrayListM87393Z.size();
            for (int i9 = 0; i9 < size3; i9++) {
                ((v7j) arrayListM87393Z.get(i9)).m84861G();
            }
            boolean z7 = this.f248713z0;
            if (u7jVar4 == u7jVar3) {
                m84865M(0, m84886s());
            } else {
                c6jVar5.m31578l(0);
                this.f238227a0 = 0;
            }
            boolean z8 = false;
            int i10 = 0;
            boolean z9 = false;
            while (i10 < size3) {
                boolean z10 = z8;
                v7j v7jVar2 = (v7j) arrayListM87393Z.get(i10);
                int i11 = i10;
                if (v7jVar2 instanceof ka20) {
                    ka20 ka20Var = (ka20) v7jVar2;
                    c6jVar3 = c6jVar5;
                    if (ka20Var.f120764y0 == 1) {
                        int i12 = ka20Var.f120761v0;
                        if (i12 != -1) {
                            ka20Var.m55864W(i12);
                        } else if (ka20Var.f120762w0 != -1 && mo51861C()) {
                            ka20Var.m55864W(m84886s() - ka20Var.f120762w0);
                        } else if (mo51861C()) {
                            ka20Var.m55864W((int) ((ka20Var.f120760u0 * m84886s()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else {
                    c6jVar3 = c6jVar5;
                    if ((v7jVar2 instanceof ix8) && ((ix8) v7jVar2).m51864a0() == 0) {
                        z8 = z10;
                        z9 = true;
                    }
                    i10 = i11 + 1;
                    c6jVar5 = c6jVar3;
                }
                z8 = z10;
                i10 = i11 + 1;
                c6jVar5 = c6jVar3;
            }
            c6jVar = c6jVar5;
            if (z8) {
                for (int i13 = 0; i13 < size3; i13 = i7 + 1) {
                    v7j v7jVar3 = (v7j) arrayListM87393Z.get(i13);
                    if (v7jVar3 instanceof ka20) {
                        ka20 ka20Var2 = (ka20) v7jVar3;
                        i7 = i13;
                        if (ka20Var2.f120764y0 == 1) {
                            xtm0.m92099t(0, c29Var, ka20Var2, z7);
                        }
                    } else {
                        i7 = i13;
                    }
                }
            }
            xtm0.m92099t(0, c29Var, this, z7);
            if (z9) {
                for (int i14 = 0; i14 < size3; i14++) {
                    v7j v7jVar4 = (v7j) arrayListM87393Z.get(i14);
                    if (v7jVar4 instanceof ix8) {
                        ix8 ix8Var = (ix8) v7jVar4;
                        if (ix8Var.m51864a0() == 0 && ix8Var.m51863Z()) {
                            xtm0.m92099t(1, c29Var, ix8Var, z7);
                        }
                    }
                }
            }
            if (u7jVar5 == u7jVar3) {
                m84866N(0, m84882m());
            } else {
                c6jVar4.m31578l(0);
                this.f238229b0 = 0;
            }
            int i15 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i15 < size3) {
                v7j v7jVar5 = (v7j) arrayListM87393Z.get(i15);
                int i16 = i15;
                if (v7jVar5 instanceof ka20) {
                    ka20 ka20Var3 = (ka20) v7jVar5;
                    if (ka20Var3.f120764y0 == 0) {
                        int i17 = ka20Var3.f120761v0;
                        if (i17 != -1) {
                            ka20Var3.m55864W(i17);
                        } else if (ka20Var3.f120762w0 != -1 && mo51862D()) {
                            ka20Var3.m55864W(m84882m() - ka20Var3.f120762w0);
                        } else if (mo51862D()) {
                            ka20Var3.m55864W((int) ((ka20Var3.f120760u0 * m84882m()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((v7jVar5 instanceof ix8) && ((ix8) v7jVar5).m51864a0() == 1) {
                    z12 = true;
                }
                i15 = i16 + 1;
            }
            if (z11) {
                for (int i18 = 0; i18 < size3; i18++) {
                    v7j v7jVar6 = (v7j) arrayListM87393Z.get(i18);
                    if (v7jVar6 instanceof ka20) {
                        ka20 ka20Var4 = (ka20) v7jVar6;
                        if (ka20Var4.f120764y0 == 0) {
                            xtm0.m92075V(1, c29Var, ka20Var4);
                        }
                    }
                }
            }
            xtm0.m92075V(0, c29Var, this);
            if (z12) {
                for (int i19 = 0; i19 < size3; i19++) {
                    v7j v7jVar7 = (v7j) arrayListM87393Z.get(i19);
                    if (v7jVar7 instanceof ix8) {
                        ix8 ix8Var2 = (ix8) v7jVar7;
                        if (ix8Var2.m51864a0() == 1 && ix8Var2.m51863Z()) {
                            xtm0.m92075V(1, c29Var, ix8Var2);
                        }
                    }
                }
            }
            for (int i20 = 0; i20 < size3; i20++) {
                v7j v7jVar8 = (v7j) arrayListM87393Z.get(i20);
                if (v7jVar8.m84858B() && xtm0.m92089j(v7jVar8)) {
                    m87389b0(v7jVar8, c29Var, xtm0.f265892a);
                    if (!(v7jVar8 instanceof ka20)) {
                        xtm0.m92099t(0, c29Var, v7jVar8, z7);
                        xtm0.m92075V(0, c29Var, v7jVar8);
                    } else if (((ka20) v7jVar8).f120764y0 == 0) {
                        xtm0.m92075V(0, c29Var, v7jVar8);
                    } else {
                        xtm0.m92099t(0, c29Var, v7jVar8, z7);
                    }
                }
            }
            for (int i21 = 0; i21 < size2; i21++) {
                v7j v7jVar9 = (v7j) this.f248708u0.get(i21);
                if (v7jVar9.m84858B() && !(v7jVar9 instanceof ka20) && !(v7jVar9 instanceof ix8) && !(v7jVar9 instanceof vpc1) && !v7jVar9.f238206G) {
                    u7j u7jVarM84881l = v7jVar9.m84881l(0);
                    u7j u7jVarM84881l2 = v7jVar9.m84881l(1);
                    u7j u7jVar6 = u7j.f227712c;
                    if (u7jVarM84881l != u7jVar6 || v7jVar9.f238262s == 1 || u7jVarM84881l2 != u7jVar6 || v7jVar9.f238264t == 1) {
                        m87389b0(v7jVar9, this.f248712y0, new b29());
                    }
                }
            }
        } else {
            kl80Var = kl80Var;
            c6jVar = c6jVar5;
        }
        u7j u7jVar7 = u7j.f227711b;
        if (size2 <= 2 || !((u7jVar2 == u7jVar7 || u7jVar == u7jVar7) && nsf1.m65520f(this.f248699H0, 1024) && gwg1.m45954z(this, this.f248712y0))) {
            i = iMax4;
            i2 = iMax3;
            z = false;
        } else {
            if (u7jVar2 == u7jVar7) {
                if (iMax3 >= m84886s() || iMax3 <= 0) {
                    iMax3 = m84886s();
                } else {
                    m84872T(iMax3);
                    this.f248700I0 = true;
                }
            }
            if (u7jVar == u7jVar7) {
                if (iMax4 >= m84882m() || iMax4 <= 0) {
                    iMax4 = m84882m();
                } else {
                    m84867O(iMax4);
                    this.f248701J0 = true;
                }
            }
            i = iMax4;
            i2 = iMax3;
            z = true;
        }
        int i22 = 64;
        boolean z13 = m87395c0(64) || m87395c0(128);
        kl80Var.getClass();
        kl80 kl80Var2 = kl80Var;
        kl80Var2.f123831g = false;
        if (this.f248699H0 == 0 || !z13) {
            z2 = true;
        } else {
            z2 = true;
            kl80Var2.f123831g = true;
        }
        ArrayList arrayList = this.f248708u0;
        u7j[] u7jVarArr3 = this.f238220U;
        boolean z14 = u7jVarArr3[0] == u7jVar7 || u7jVarArr3[z2 ? 1 : 0] == u7jVar7;
        this.f248695D0 = 0;
        this.f248696E0 = 0;
        int i23 = 0;
        while (i23 < size2) {
            v7j v7jVar10 = (v7j) this.f248708u0.get(i23);
            if (v7jVar10 instanceof w7j) {
                ((w7j) v7jVar10).m87394a0();
            }
            i23++;
            i22 = 64;
        }
        boolean zM87395c1 = m87395c0(i22);
        boolean z15 = z;
        int i24 = 0;
        ?? r19 = 1;
        while (r19 != 0) {
            boolean z16 = z14;
            int i25 = i24 + 1;
            try {
                kl80Var2.m56819t();
                z3 = z15;
                try {
                    this.f248695D0 = 0;
                    this.f248696E0 = 0;
                    m84879i(kl80Var2);
                    for (int i26 = 0; i26 < size2; i26++) {
                        ((v7j) this.f248708u0.get(i26)).m84879i(kl80Var2);
                    }
                    m87392Y(kl80Var2);
                    try {
                        WeakReference weakReference = this.f248702K0;
                        if (weakReference == null || weakReference.get() == null) {
                            c6jVar2 = c6jVar4;
                        } else {
                            c6jVar2 = c6jVar4;
                            try {
                                kl80Var2.m56806f(kl80Var2.m56811k((c6j) this.f248702K0.get()), kl80Var2.m56811k(c6jVar4), 0, 5);
                                this.f248702K0 = null;
                            } catch (Exception e) {
                                e = e;
                                r18 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r18;
                                zArr = nsf1.f157763a;
                                if (r15 != 0) {
                                    zArr[2] = false;
                                    zM87395c0 = m87395c0(64);
                                    mo55863V(kl80Var2, zM87395c0);
                                    size = this.f248708u0.size();
                                    i6 = 0;
                                    z6 = false;
                                    while (i6 < size) {
                                        boolean[] zArr3 = zArr;
                                        v7jVar = (v7j) this.f248708u0.get(i6);
                                        v7jVar.mo55863V(kl80Var2, zM87395c0);
                                        int i27 = i6;
                                        boolean z17 = zM87395c0;
                                        if (v7jVar.f238240h == -1) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        i6 = i27 + 1;
                                        zArr = zArr3;
                                        zM87395c0 = z17;
                                        z6 = z6;
                                    }
                                    zArr2 = zArr;
                                    z4 = z6;
                                } else {
                                    zArr2 = zArr;
                                    mo55863V(kl80Var2, zM87395c1);
                                    for (i3 = 0; i3 < size2; i3++) {
                                        ((v7j) this.f248708u0.get(i3)).mo55863V(kl80Var2, zM87395c1);
                                    }
                                    z4 = false;
                                }
                                if (z16) {
                                    i4 = size2;
                                } else {
                                    i4 = size2;
                                }
                                iMax = Math.max(this.f238233d0, m84886s());
                                z5 = z4;
                                if (iMax > m84886s()) {
                                    m84872T(iMax);
                                    this.f238220U[0] = u7jVar3;
                                    z5 = true;
                                    z3 = true;
                                }
                                iMax2 = Math.max(this.f238235e0, m84882m());
                                if (iMax2 > m84882m()) {
                                    m84867O(iMax2);
                                    r4 = 1;
                                    this.f238220U[1] = u7jVar3;
                                    r16 = 1;
                                    z3 = true;
                                } else {
                                    r4 = 1;
                                }
                                if (z3) {
                                    r16 = z5;
                                    z15 = z3;
                                    i5 = 8;
                                    r17 = r16;
                                } else {
                                    r16 = z5;
                                    if (this.f238220U[0] == u7jVar7) {
                                        r16 = r16;
                                        if (m84886s() > i2) {
                                            this.f248700I0 = r4;
                                            this.f238220U[0] = u7jVar3;
                                            m84872T(i2);
                                            ?? r110 = r4;
                                            z3 = r110 == true ? 1 : 0;
                                            r16 = r110;
                                        }
                                    }
                                    r16 = r16;
                                    r16 = r16;
                                    if (this.f238220U[r4] == u7jVar7) {
                                        r16 = z5;
                                        z15 = z3;
                                        i5 = 8;
                                        r17 = r16;
                                    } else {
                                        r16 = z5;
                                        z15 = z3;
                                        i5 = 8;
                                        r17 = r16;
                                    }
                                }
                                if (i25 > i5) {
                                    r17 = 0;
                                }
                                i24 = i25;
                                z14 = z16;
                                u7jVar3 = u7jVar3;
                                c6jVar4 = c6jVar2;
                                size2 = i4;
                                r19 = r17;
                            }
                        }
                        WeakReference weakReference2 = this.f248704M0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            kl80Var2.m56806f(kl80Var2.m56811k(this.f238212M), kl80Var2.m56811k((c6j) this.f248704M0.get()), 0, 5);
                            this.f248704M0 = null;
                        }
                        WeakReference weakReference3 = this.f248703L0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            c6j c6jVar6 = c6jVar;
                            try {
                                c6jVar = c6jVar6;
                                kl80Var2.m56806f(kl80Var2.m56811k((c6j) this.f248703L0.get()), kl80Var2.m56811k(c6jVar6), 0, 5);
                                this.f248703L0 = null;
                            } catch (Exception e2) {
                                e = e2;
                                c6jVar = c6jVar6;
                                r18 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r18;
                            }
                        }
                        WeakReference weakReference4 = this.f248705N0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            kl80Var2.m56806f(kl80Var2.m56811k(this.f238211L), kl80Var2.m56811k((c6j) this.f248705N0.get()), 0, 5);
                            this.f248705N0 = null;
                        }
                        kl80Var2.m56815p();
                        r15 = 1;
                    } catch (Exception e3) {
                        e = e3;
                        c6jVar2 = c6jVar4;
                    }
                } catch (Exception e4) {
                    e = e4;
                    c6jVar2 = c6jVar4;
                    r18 = r19;
                    e.printStackTrace();
                    System.out.println("EXCEPTION : " + e);
                    r15 = r18;
                    zArr = nsf1.f157763a;
                    if (r15 != 0) {
                        zArr[2] = false;
                        zM87395c0 = m87395c0(64);
                        mo55863V(kl80Var2, zM87395c0);
                        size = this.f248708u0.size();
                        i6 = 0;
                        z6 = false;
                        while (i6 < size) {
                            boolean[] zArr4 = zArr;
                            v7jVar = (v7j) this.f248708u0.get(i6);
                            v7jVar.mo55863V(kl80Var2, zM87395c0);
                            int i28 = i6;
                            boolean z18 = zM87395c0;
                            if (v7jVar.f238240h == -1) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            i6 = i28 + 1;
                            zArr = zArr4;
                            zM87395c0 = z18;
                            z6 = z6;
                        }
                        zArr2 = zArr;
                        z4 = z6;
                    } else {
                        zArr2 = zArr;
                        mo55863V(kl80Var2, zM87395c1);
                        while (i3 < size2) {
                            ((v7j) this.f248708u0.get(i3)).mo55863V(kl80Var2, zM87395c1);
                        }
                        z4 = false;
                    }
                    if (z16) {
                        i4 = size2;
                    } else {
                        i4 = size2;
                    }
                    iMax = Math.max(this.f238233d0, m84886s());
                    z5 = z4;
                    if (iMax > m84886s()) {
                        m84872T(iMax);
                        this.f238220U[0] = u7jVar3;
                        z5 = true;
                        z3 = true;
                    }
                    iMax2 = Math.max(this.f238235e0, m84882m());
                    if (iMax2 > m84882m()) {
                        m84867O(iMax2);
                        r4 = 1;
                        this.f238220U[1] = u7jVar3;
                        r16 = 1;
                        z3 = true;
                    } else {
                        r4 = 1;
                    }
                    if (z3) {
                        r16 = z5;
                        if (this.f238220U[0] == u7jVar7) {
                            r16 = r16;
                            if (m84886s() > i2) {
                                this.f248700I0 = r4;
                                this.f238220U[0] = u7jVar3;
                                m84872T(i2);
                                ?? r111 = r4;
                                z3 = r111 == true ? 1 : 0;
                                r16 = r111;
                            }
                        }
                        r16 = r16;
                        r16 = r16;
                        if (this.f238220U[r4] == u7jVar7) {
                            r16 = z5;
                            z15 = z3;
                            i5 = 8;
                            r17 = r16;
                        } else {
                            r16 = z5;
                            z15 = z3;
                            i5 = 8;
                            r17 = r16;
                        }
                    } else {
                        r16 = z5;
                        z15 = z3;
                        i5 = 8;
                        r17 = r16;
                    }
                    if (i25 > i5) {
                        r17 = 0;
                    }
                    i24 = i25;
                    z14 = z16;
                    u7jVar3 = u7jVar3;
                    c6jVar4 = c6jVar2;
                    size2 = i4;
                    r19 = r17;
                }
            } catch (Exception e5) {
                e = e5;
                z3 = z15;
            }
            zArr = nsf1.f157763a;
            if (r15 != 0) {
                zArr[2] = false;
                zM87395c0 = m87395c0(64);
                mo55863V(kl80Var2, zM87395c0);
                size = this.f248708u0.size();
                i6 = 0;
                z6 = false;
                while (i6 < size) {
                    boolean[] zArr5 = zArr;
                    v7jVar = (v7j) this.f248708u0.get(i6);
                    v7jVar.mo55863V(kl80Var2, zM87395c0);
                    int i29 = i6;
                    boolean z19 = zM87395c0;
                    if (v7jVar.f238240h == -1 || v7jVar.f238242i != -1) {
                        z6 = true;
                    }
                    i6 = i29 + 1;
                    zArr = zArr5;
                    zM87395c0 = z19;
                    z6 = z6;
                }
                zArr2 = zArr;
                z4 = z6;
            } else {
                zArr2 = zArr;
                mo55863V(kl80Var2, zM87395c1);
                while (i3 < size2) {
                    ((v7j) this.f248708u0.get(i3)).mo55863V(kl80Var2, zM87395c1);
                }
                z4 = false;
            }
            if (z16 || i25 >= 8 || !zArr2[2]) {
                i4 = size2;
            } else {
                int i30 = 0;
                int iMax5 = 0;
                int iMax6 = 0;
                while (i30 < size2) {
                    v7j v7jVar11 = (v7j) this.f248708u0.get(i30);
                    iMax6 = Math.max(iMax6, v7jVar11.m84886s() + v7jVar11.f238227a0);
                    iMax5 = Math.max(iMax5, v7jVar11.m84882m() + v7jVar11.f238229b0);
                    i30++;
                    size2 = size2;
                }
                i4 = size2;
                int iMax7 = Math.max(this.f238233d0, iMax6);
                int iMax8 = Math.max(this.f238235e0, iMax5);
                z4 = z4;
                if (u7jVar2 == u7jVar7 && m84886s() < iMax7) {
                    z4 = z4;
                    m84872T(iMax7);
                    this.f238220U[0] = u7jVar7;
                    z4 = true;
                    z3 = true;
                }
                if (u7jVar == u7jVar7 && m84882m() < iMax8) {
                    m84867O(iMax8);
                    this.f238220U[1] = u7jVar7;
                    z4 = true;
                    z3 = true;
                }
            }
            iMax = Math.max(this.f238233d0, m84886s());
            z5 = z4;
            if (iMax > m84886s()) {
                m84872T(iMax);
                this.f238220U[0] = u7jVar3;
                z5 = true;
                z3 = true;
            }
            iMax2 = Math.max(this.f238235e0, m84882m());
            if (iMax2 > m84882m()) {
                m84867O(iMax2);
                r4 = 1;
                this.f238220U[1] = u7jVar3;
                r16 = 1;
                z3 = true;
            } else {
                r4 = 1;
            }
            if (z3) {
                r16 = z5;
                if (this.f238220U[0] == u7jVar7 && i2 > 0) {
                    r16 = r16;
                    if (m84886s() > i2) {
                        this.f248700I0 = r4;
                        this.f238220U[0] = u7jVar3;
                        m84872T(i2);
                        ?? r112 = r4;
                        z3 = r112 == true ? 1 : 0;
                        r16 = r112;
                    }
                }
                r16 = r16;
                r16 = r16;
                if (this.f238220U[r4] == u7jVar7 || i <= 0 || m84882m() <= i) {
                    r16 = z5;
                    z15 = z3;
                    i5 = 8;
                    r17 = r16;
                } else {
                    this.f248701J0 = r4;
                    this.f238220U[r4] = u7jVar3;
                    m84867O(i);
                    i5 = 8;
                    z15 = true;
                    r17 = 1;
                }
            } else {
                r16 = z5;
                z15 = z3;
                i5 = 8;
                r17 = r16;
            }
            if (i25 > i5) {
                r17 = 0;
            }
            i24 = i25;
            z14 = z16;
            u7jVar3 = u7jVar3;
            c6jVar4 = c6jVar2;
            size2 = i4;
            r19 = r17;
        }
        boolean z20 = z15;
        this.f248708u0 = arrayList;
        if (z20) {
            u7j[] u7jVarArr4 = this.f238220U;
            u7jVarArr4[0] = u7jVar2;
            u7jVarArr4[1] = u7jVar;
        }
        mo84862H(kl80Var2.f123836l);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m87395c0(int i) {
        return (this.f248699H0 & i) == i;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m87396d0(v7j v7jVar) {
        this.f248708u0.remove(v7jVar);
        v7jVar.mo84859E();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m87397e0() {
        this.f248708u0.clear();
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: p */
    public final void mo84885p(StringBuilder sb) {
        sb.append(this.f238246k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f238222W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f238223X);
        sb.append("\n");
        Iterator it = m87393Z().iterator();
        while (it.hasNext()) {
            ((v7j) it.next()).mo84885p(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
