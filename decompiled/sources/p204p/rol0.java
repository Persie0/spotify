package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public final class rol0 implements pol0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201294a;

    /* JADX INFO: renamed from: b */
    public final voc1 f201295b;

    /* JADX INFO: renamed from: c */
    public final boolean f201296c;

    /* JADX INFO: renamed from: d */
    public final i3k f201297d;

    /* JADX INFO: renamed from: e */
    public final Object f201298e;

    public /* synthetic */ rol0(voc1 voc1Var, boolean z, i3k i3kVar, Object obj, int i) {
        this.f201294a = i;
        this.f201295b = voc1Var;
        this.f201296c = z;
        this.f201297d = i3kVar;
        this.f201298e = obj;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ikp0 hkp0Var;
        int i = this.f201294a;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f201298e;
        boolean z = this.f201296c;
        switch (i) {
            case 0:
                fhe0 fhe0Var = (fhe0) obj;
                qyq0 qyq0Var = qyq0.f193989M0;
                String str = fhe0Var.f69645f;
                boolean z2 = str != null;
                x401 x401Var = new x401();
                kxq0 kxq0Var = kxq0.f127553N0;
                x401Var.add(kxq0Var);
                f8r0 f8r0Var = f8r0.f67047N0;
                x401Var.add(f8r0Var);
                oyq0 oyq0Var = oyq0.f171844N0;
                x401Var.add(oyq0Var);
                if (z2) {
                    x401Var.add(qyq0Var);
                }
                x401 x401VarM63425d = n0e1.m63425d(x401Var);
                if (z || !x401VarM63425d.f257925a.isEmpty()) {
                    jkp0 jkp0Var = (jkp0) obj2;
                    String str2 = this.f201295b.f243453a;
                    String str3 = fhe0Var.f69645f;
                    String str4 = fhe0Var.f69641b;
                    mec0 mec0Var = x401VarM63425d.f257925a;
                    mec0 mec0Var2 = x401VarM63425d.f257925a;
                    boolean zContainsKey = mec0Var.containsKey(kxq0Var);
                    String str5 = fhe0Var.f69643d;
                    boolean zContainsKey2 = mec0Var2.containsKey(oyq0Var);
                    if (!mec0Var2.containsKey(qyq0Var)) {
                        hkp0Var = wby.f249896Z0;
                    } else {
                        if (str == null) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        hkp0Var = new hkp0(str);
                    }
                    Observable map = jkp0Var.f113368g.m38175q1(str4, str5).map(new x4j0(27, jkp0Var, new gkp0(str2, zContainsKey2, mec0Var2.containsKey(f8r0Var), this.f201296c, str3, str4, str5, zContainsKey, hkp0Var, fhe0Var.f69646g)));
                    AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                    i3k.m49622b(this.f201297d, map, xgg1.m90835m1(), new z6k(fhe0Var.f69641b, (String) null, 6), fhe0Var.f69644e.f46380a.f279709a, 48);
                }
                return w2a1Var;
            case 1:
                fhe0 fhe0Var2 = (fhe0) obj;
                boolean z3 = fhe0Var2.f69642c;
                String str6 = fhe0Var2.f69641b;
                if (z3 || z) {
                    qh80 qh80Var = (qh80) obj2;
                    String str7 = fhe0Var2.f69643d;
                    Observable observableCombineLatest = Observable.combineLatest(qh80Var.f188679j.m38175q1(str6, str7), qh80Var.f188672c.m87764a(str6), k0e1.m54988g(qh80Var.f188675f.m55835b(), dau.f47107a), new bmx(qh80Var, this.f201295b, str6, str7, new rh80(z3), 13));
                    AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                    i3k.m49622b(this.f201297d, observableCombineLatest, xgg1.m90835m1(), new z6k(str6, (String) null, 6), fhe0Var2.f69644e.f46380a.f279709a, 48);
                }
                return w2a1Var;
            case 2:
                fhe0 fhe0Var3 = (fhe0) obj;
                if (z) {
                    fda0 fda0Var = (fda0) obj2;
                    String str8 = fhe0Var3.f69641b;
                    String str9 = fhe0Var3.f69643d;
                    Observable map2 = fda0Var.f68417d.m38175q1(str8, str9).map(new e6a0(fda0Var, this.f201295b, str8, str9, 1));
                    AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
                    i3k.m49622b(this.f201297d, map2, xgg1.m90835m1(), null, fhe0Var3.f69644e.f46380a.f279709a, 52);
                }
                return w2a1Var;
            case 3:
                fhe0 fhe0Var4 = (fhe0) obj;
                if (z) {
                    uij0 uij0Var = (uij0) obj2;
                    String str10 = fhe0Var4.f69641b;
                    String str11 = fhe0Var4.f69643d;
                    Observable map3 = uij0Var.f230723d.m38175q1(str10, str11).map(new d5a0(uij0Var, this.f201295b, str10, str11, 14));
                    AtomicReferenceArray atomicReferenceArray4 = cbm0.f36163e;
                    i3k.m49622b(this.f201297d, map3, xgg1.m90835m1(), new z6k(fhe0Var4.f69641b, (String) null, 6), fhe0Var4.f69644e.f46380a.f279709a, 48);
                }
                return w2a1Var;
            default:
                fhe0 fhe0Var5 = (fhe0) obj;
                if (z) {
                    ewq0 ewq0Var = (ewq0) obj2;
                    String str12 = fhe0Var5.f69641b;
                    String str13 = fhe0Var5.f69643d;
                    Observable map4 = ewq0Var.f63592b.m38175q1(str12, str13).map(new da80(ewq0Var, this.f201295b, str12, str13, 29));
                    AtomicReferenceArray atomicReferenceArray5 = cbm0.f36163e;
                    i3k.m49622b(this.f201297d, map4, xgg1.m90835m1(), null, fhe0Var5.f69644e.f46380a.f279709a, 52);
                }
                return w2a1Var;
        }
    }

    public rol0(voc1 voc1Var, boolean z, qh80 qh80Var, i3k i3kVar) {
        this.f201294a = 1;
        this.f201295b = voc1Var;
        this.f201296c = z;
        this.f201298e = qh80Var;
        this.f201297d = i3kVar;
    }

    public rol0(voc1 voc1Var, boolean z, i3k i3kVar, bx3 bx3Var, jkp0 jkp0Var) {
        this.f201294a = 0;
        this.f201295b = voc1Var;
        this.f201296c = z;
        this.f201297d = i3kVar;
        this.f201298e = jkp0Var;
    }
}
