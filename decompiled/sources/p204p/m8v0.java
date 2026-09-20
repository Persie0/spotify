package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m8v0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f141137b;

    public /* synthetic */ m8v0(int i, List list) {
        this.f141136a = i;
        this.f141137b = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f141136a) {
            case 0:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 1:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((oh90) this.f141137b.get(((Number) obj).intValue())).f165377a;
            case 3:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 4:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 5:
                return ((asy0) this.f141137b.get(((Number) obj).intValue())).getUuid();
            case 6:
                return qpv0.f191387a.mo54112b(((asy0) this.f141137b.get(((Number) obj).intValue())).getClass());
            case 7:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 8:
                return ((lbu0) this.f141137b.get(((Number) obj).intValue())).getUuid();
            case 9:
                return qpv0.f191387a.mo54112b(((lbu0) this.f141137b.get(((Number) obj).intValue())).getClass());
            case 10:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 11:
                ra01 ra01Var = (ra01) this.f141137b.get(((Number) obj).intValue());
                return new rd01(ra01Var.f197155a.mo27095c(), ((na01) ra01Var.f197159e).getId());
            case 12:
                return d1z0.class;
            case 13:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 14:
                return ((af11) this.f141137b.get(((Number) obj).intValue())).f14999a;
            case 15:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 16:
                return ((vp11) this.f141137b.get(((Number) obj).intValue())).f243567a;
            case 17:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 18:
                return (String) this.f141137b.get(((Number) obj).intValue());
            case 19:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 20:
                return ((wx51) this.f141137b.get(((Number) obj).intValue())).f255939b;
            case 21:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 22:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 23:
                return ((w261) this.f141137b.get(((Number) obj).intValue())).f247244a;
            case 24:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 25:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 26:
                int iIntValue = ((Number) obj).intValue();
                return tfe.m80649g(iIntValue, "-", ((rt71) this.f141137b.get(iIntValue)).getId());
            case 27:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            case 28:
                this.f141137b.get(((Number) obj).intValue());
                return null;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                return Integer.valueOf(iIntValue2);
        }
    }
}
