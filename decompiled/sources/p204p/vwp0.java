package p204p;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class vwp0 implements ktz0, l5b {

    /* JADX INFO: renamed from: a */
    public final String f245521a;

    /* JADX INFO: renamed from: b */
    public final g210 f245522b;

    /* JADX INFO: renamed from: c */
    public final int f245523c;

    /* JADX INFO: renamed from: d */
    public int f245524d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f245525e;

    /* JADX INFO: renamed from: f */
    public final List[] f245526f;

    /* JADX INFO: renamed from: g */
    public ArrayList f245527g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f245528h;

    /* JADX INFO: renamed from: i */
    public Object f245529i;

    /* JADX INFO: renamed from: j */
    public final Object f245530j;

    /* JADX INFO: renamed from: k */
    public final Object f245531k;

    /* JADX INFO: renamed from: l */
    public final Object f245532l;

    public vwp0(String str, g210 g210Var, int i) {
        this.f245521a = str;
        this.f245522b = g210Var;
        this.f245523c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f245525e = strArr;
        int i3 = this.f245523c;
        this.f245526f = new List[i3];
        this.f245528h = new boolean[i3];
        this.f245529i = nau.f152117a;
        final int i4 = 0;
        this.f245530j = q3d0.m72078I(2, new eh00(this) { // from class: p.uwp0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vwp0 f234712b;

            {
                this.f234712b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p.fr70] */
            @Override // p204p.eh00
            public final Object invoke() {
                rr60[] rr60VarArrChildSerializers;
                ArrayList arrayList;
                rr60[] rr60VarArrTypeParametersSerializers;
                switch (i4) {
                    case 0:
                        g210 g210Var2 = this.f234712b.f245522b;
                        return (g210Var2 == null || (rr60VarArrChildSerializers = g210Var2.childSerializers()) == null) ? kvf1.f126859a : rr60VarArrChildSerializers;
                    case 1:
                        g210 g210Var3 = this.f234712b.f245522b;
                        if (g210Var3 == null || (rr60VarArrTypeParametersSerializers = g210Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(rr60VarArrTypeParametersSerializers.length);
                            for (rr60 rr60Var : rr60VarArrTypeParametersSerializers) {
                                arrayList.add(rr60Var.getDescriptor());
                            }
                        }
                        return xuf1.m92166e(arrayList);
                    default:
                        vwp0 vwp0Var = this.f234712b;
                        return Integer.valueOf(opo.m67558h(vwp0Var, (ktz0[]) vwp0Var.f245531k.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f245531k = q3d0.m72078I(2, new eh00(this) { // from class: p.uwp0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vwp0 f234712b;

            {
                this.f234712b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p.fr70] */
            @Override // p204p.eh00
            public final Object invoke() {
                rr60[] rr60VarArrChildSerializers;
                ArrayList arrayList;
                rr60[] rr60VarArrTypeParametersSerializers;
                switch (i5) {
                    case 0:
                        g210 g210Var2 = this.f234712b.f245522b;
                        return (g210Var2 == null || (rr60VarArrChildSerializers = g210Var2.childSerializers()) == null) ? kvf1.f126859a : rr60VarArrChildSerializers;
                    case 1:
                        g210 g210Var3 = this.f234712b.f245522b;
                        if (g210Var3 == null || (rr60VarArrTypeParametersSerializers = g210Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(rr60VarArrTypeParametersSerializers.length);
                            for (rr60 rr60Var : rr60VarArrTypeParametersSerializers) {
                                arrayList.add(rr60Var.getDescriptor());
                            }
                        }
                        return xuf1.m92166e(arrayList);
                    default:
                        vwp0 vwp0Var = this.f234712b;
                        return Integer.valueOf(opo.m67558h(vwp0Var, (ktz0[]) vwp0Var.f245531k.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f245532l = q3d0.m72078I(2, new eh00(this) { // from class: p.uwp0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vwp0 f234712b;

            {
                this.f234712b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p.fr70] */
            @Override // p204p.eh00
            public final Object invoke() {
                rr60[] rr60VarArrChildSerializers;
                ArrayList arrayList;
                rr60[] rr60VarArrTypeParametersSerializers;
                switch (i6) {
                    case 0:
                        g210 g210Var2 = this.f234712b.f245522b;
                        return (g210Var2 == null || (rr60VarArrChildSerializers = g210Var2.childSerializers()) == null) ? kvf1.f126859a : rr60VarArrChildSerializers;
                    case 1:
                        g210 g210Var3 = this.f234712b.f245522b;
                        if (g210Var3 == null || (rr60VarArrTypeParametersSerializers = g210Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(rr60VarArrTypeParametersSerializers.length);
                            for (rr60 rr60Var : rr60VarArrTypeParametersSerializers) {
                                arrayList.add(rr60Var.getDescriptor());
                            }
                        }
                        return xuf1.m92166e(arrayList);
                    default:
                        vwp0 vwp0Var = this.f234712b;
                        return Integer.valueOf(opo.m67558h(vwp0Var, (ktz0[]) vwp0Var.f245531k.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.l5b
    /* JADX INFO: renamed from: a */
    public final Set mo58213a() {
        return this.f245529i.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.ktz0
    /* JADX INFO: renamed from: c */
    public final int mo33221c(String str) {
        Integer num = (Integer) this.f245529i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: e */
    public final int mo33222e() {
        return this.f245523c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, p.fr70] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, p.fr70] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vwp0) {
            ktz0 ktz0Var = (ktz0) obj;
            if (wj50.m88271j(this.f245521a, ktz0Var.mo33226i()) && Arrays.equals((ktz0[]) this.f245531k.getValue(), (ktz0[]) ((vwp0) obj).f245531k.getValue())) {
                int iMo33222e = ktz0Var.mo33222e();
                int i = this.f245523c;
                if (i == iMo33222e) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (wj50.m88271j(mo33225h(i2).mo33226i(), ktz0Var.mo33225h(i2).mo33226i()) && wj50.m88271j(mo33225h(i2).getKind(), ktz0Var.mo33225h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: f */
    public final String mo33223f(int i) {
        return this.f245525e[i];
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: g */
    public final List mo33224g(int i) {
        List list = this.f245526f[i];
        return list == null ? lau.f131415a : list;
    }

    @Override // p204p.ktz0
    public final List getAnnotations() {
        ArrayList arrayList = this.f245527g;
        return arrayList == null ? lau.f131415a : arrayList;
    }

    @Override // p204p.ktz0
    public k0e1 getKind() {
        return in51.f103873z0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.ktz0
    /* JADX INFO: renamed from: h */
    public ktz0 mo33225h(int i) {
        return ((rr60[]) this.f245530j.getValue())[i].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    public int hashCode() {
        return ((Number) this.f245532l.getValue()).intValue();
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: i */
    public final String mo33226i() {
        return this.f245521a;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: j */
    public final boolean mo33227j(int i) {
        return this.f245528h[i];
    }

    /* JADX INFO: renamed from: k */
    public final void m86594k(String str, boolean z) {
        int i = this.f245524d + 1;
        this.f245524d = i;
        String[] strArr = this.f245525e;
        strArr[i] = str;
        this.f245528h[i] = z;
        this.f245526f[i] = null;
        if (i == this.f245523c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f245529i = map;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m86595l(Annotation annotation) {
        if (this.f245527g == null) {
            this.f245527g = new ArrayList(1);
        }
        ArrayList arrayList = this.f245527g;
        wj50.m88279p(arrayList);
        arrayList.add(annotation);
    }

    public String toString() {
        return opo.m67549F(this);
    }
}
