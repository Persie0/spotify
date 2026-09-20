package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class ycq extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f271545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ycq(int i, gh00 gh00Var) {
        super(1);
        this.f271544a = i;
        this.f271545b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object htrVar;
        switch (this.f271544a) {
            case 0:
                this.f271545b.invoke(mf81.f142991e);
                return w2a1.f247311a;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f271545b.invoke(mf81.f142992f);
                return w2a1.f247311a;
            case 2:
                this.f271545b.invoke(mf81.f142994h);
                return w2a1.f247311a;
            case 3:
                this.f271545b.invoke(fn81.f71225c);
                return w2a1.f247311a;
            case 4:
                int iOrdinal = ((jut0) obj).ordinal();
                gh00 gh00Var = this.f271545b;
                if (iOrdinal == 0) {
                    gh00Var.invoke(fn81.f71226d);
                } else if (iOrdinal == 1) {
                    gh00Var.invoke(fn81.f71227e);
                } else if (iOrdinal == 2) {
                    gh00Var.invoke(fn81.f71228f);
                } else if (iOrdinal == 3) {
                    gh00Var.invoke(fn81.f71229g);
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(fn81.f71230h);
                }
                return w2a1.f247311a;
            case 5:
                int iOrdinal2 = ((jut0) obj).ordinal();
                gh00 gh00Var2 = this.f271545b;
                if (iOrdinal2 == 0) {
                    gh00Var2.invoke(on81.f167193a);
                } else if (iOrdinal2 == 1) {
                    gh00Var2.invoke(on81.f167195c);
                }
                return w2a1.f247311a;
            case 6:
                this.f271545b.invoke(on81.f167194b);
                return w2a1.f247311a;
            case 7:
                kjv kjvVar = (kjv) obj;
                boolean z = kjvVar instanceof hjv;
                gh00 gh00Var3 = this.f271545b;
                if (z) {
                    gh00Var3.invoke(vn81.f243021a);
                } else if (kjvVar instanceof gjv) {
                    gh00Var3.invoke(vn81.f243023c);
                } else if (kjvVar instanceof fjv) {
                    gh00Var3.invoke(vn81.f243024d);
                }
                return w2a1.f247311a;
            case 8:
                int iOrdinal3 = ((jut0) obj).ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                    this.f271545b.invoke(vn81.f243022b);
                }
                return w2a1.f247311a;
            case 9:
                this.f271545b.invoke(zn81.f284437c);
                return w2a1.f247311a;
            case 10:
                this.f271545b.invoke(co81.f40202d);
                return w2a1.f247311a;
            case 11:
                int iOrdinal4 = ((jut0) obj).ordinal();
                gh00 gh00Var4 = this.f271545b;
                if (iOrdinal4 == 0) {
                    gh00Var4.invoke(co81.f40199a);
                } else if (iOrdinal4 == 1) {
                    gh00Var4.invoke(co81.f40203e);
                } else if (iOrdinal4 == 2) {
                    gh00Var4.invoke(co81.f40204f);
                } else if (iOrdinal4 == 3) {
                    gh00Var4.invoke(co81.f40205g);
                }
                return w2a1.f247311a;
            case 12:
                this.f271545b.invoke((aq81) obj);
                return w2a1.f247311a;
            case 13:
                this.f271545b.invoke(cq81.f40797b);
                return w2a1.f247311a;
            case 14:
                int iOrdinal5 = ((v10) obj).ordinal();
                gh00 gh00Var5 = this.f271545b;
                if (iOrdinal5 == 0) {
                    gh00Var5.invoke(hq81.f94066e);
                } else {
                    if (iOrdinal5 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var5.invoke(hq81.f94064c);
                }
                return w2a1.f247311a;
            case 15:
                this.f271545b.invoke(f8b1.f66950a);
                return w2a1.f247311a;
            case 16:
                this.f271545b.invoke(new yyc1(((Number) obj).floatValue()));
                return w2a1.f247311a;
            case 17:
                this.f271545b.invoke(new abd1(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 18:
                this.f271545b.invoke(new wbd1(((pac1) obj).f175502a));
                return w2a1.f247311a;
            case 19:
                slu sluVar = (slu) obj;
                boolean zEquals = sluVar.equals(mlu.f144923a);
                gh00 gh00Var6 = this.f271545b;
                if (zEquals) {
                    gh00Var6.invoke(fpe1.f71832a);
                } else {
                    if (!sluVar.equals(nlu.f155170a)) {
                        throw new IllegalStateException("Only ClearFilters and MoreFilters events are expected here");
                    }
                    gh00Var6.invoke(gpe1.f83179a);
                }
                return w2a1.f247311a;
            case 20:
                this.f271545b.invoke(new wuw((jyy) obj));
                return w2a1.f247311a;
            case 21:
                int iOrdinal6 = ((dpq) obj).ordinal();
                gh00 gh00Var7 = this.f271545b;
                if (iOrdinal6 == 0) {
                    gh00Var7.invoke(qzs.f194259a);
                } else {
                    if (iOrdinal6 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var7.invoke(pzs.f183792a);
                }
                return w2a1.f247311a;
            case 22:
                if (((yf11) obj) == yf11.f272099a) {
                    this.f271545b.invoke(gbr.f78373a);
                }
                return Boolean.TRUE;
            case 23:
                if (slr.f210472a[((bmr) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f271545b.invoke(n8o0.f151572a);
                return w2a1.f247311a;
            case 24:
                y4u y4uVar = (y4u) obj;
                if (y4uVar.equals(v4u.f237240a)) {
                    htrVar = etr.f62789a;
                } else if (y4uVar.equals(v4u.f237241b)) {
                    htrVar = ftr.f73280a;
                } else if (y4uVar.equals(v4u.f237242c)) {
                    htrVar = gtr.f84259a;
                } else if (y4uVar instanceof w4u) {
                    htrVar = new htr(((w4u) y4uVar).f247889a);
                } else {
                    if (!(y4uVar instanceof x4u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    htrVar = itr.f105673a;
                }
                this.f271545b.invoke(htrVar);
                return w2a1.f247311a;
            case 25:
                kqy kqyVar = (kqy) obj;
                if ((kqyVar instanceof fqy) || (kqyVar instanceof iqy) || (kqyVar instanceof jqy)) {
                    this.f271545b.invoke(gtr.f84259a);
                } else if (!(kqyVar instanceof gqy) && !(kqyVar instanceof hqy) && !(kqyVar instanceof dqy)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 26:
                this.f271545b.invoke(new z821((String) obj, 2));
                return w2a1.f247311a;
            case 27:
                int iOrdinal7 = ((d5a1) obj).ordinal();
                gh00 gh00Var8 = this.f271545b;
                if (iOrdinal7 == 0) {
                    gh00Var8.invoke(new vxs(1));
                } else {
                    if (iOrdinal7 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var8.invoke(new vxs(2));
                }
                return w2a1.f247311a;
            case 28:
                this.f271545b.invoke(new f0t(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            default:
                int iOrdinal8 = ((j0c0) obj).ordinal();
                boolean z2 = true;
                if (iOrdinal8 != 0) {
                    if (iOrdinal8 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z2 = false;
                }
                this.f271545b.invoke(new c1t(z2));
                return w2a1.f247311a;
        }
    }
}
