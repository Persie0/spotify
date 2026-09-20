package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mgq {

    /* JADX INFO: renamed from: a */
    public final int f143605a;

    /* JADX INFO: renamed from: b */
    public final long f143606b;

    /* JADX INFO: renamed from: c */
    public final Object f143607c;

    /* JADX INFO: renamed from: d */
    public final Object f143608d;

    public mgq(yb81 yb81Var, dp01 dp01Var, int i, long j) {
        this.f143607c = yb81Var;
        this.f143608d = dp01Var;
        this.f143605a = i;
        this.f143606b = j;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public Object m61729a(mbc1 mbc1Var, ibk ibkVar) {
        krq0 krq0Var;
        hcc1 hcc1Var;
        Object objM56684z;
        long jLongValue;
        mbc1 mbc1Var2 = mbc1Var;
        if (ibkVar instanceof krq0) {
            krq0Var = (krq0) ibkVar;
            int i = krq0Var.f125715e;
            if ((i & Integer.MIN_VALUE) != 0) {
                krq0Var.f125715e = i - Integer.MIN_VALUE;
            } else {
                krq0Var = new krq0(this, ibkVar);
            }
        } else {
            krq0Var = new krq0(this, ibkVar);
        }
        Object obj = krq0Var.f125713c;
        int i2 = krq0Var.f125715e;
        if (i2 == 0) {
            bga.m29073P(obj);
            hcc1Var = mbc1Var2.f141878e;
            krq0Var.f125711a = mbc1Var2;
            krq0Var.f125712b = hcc1Var;
            krq0Var.f125715e = 1;
            if (((dp01) this.f143608d).m36555a(this.f143605a).contains(mbc1Var2.f141874a.mo89604c())) {
                hcc1 hcc1Var2 = mbc1Var2.f141878e;
                if (hcc1Var2.f89754N0 != null) {
                    long j = hcc1Var2.f89768t;
                    yb81 yb81Var = (yb81) this.f143607c;
                    String string = hcc1Var2.f89756X.toString();
                    String str = hcc1Var2.f89759a;
                    nu71 nu71Var = hcc1Var2.f89758Z;
                    Long l = nu71Var != null ? new Long(nu71Var.f158526a) : null;
                    long j2 = this.f143606b;
                    if (l != null) {
                        jLongValue = l.longValue();
                        if (jLongValue - j > j2) {
                            jLongValue = j + j2;
                        }
                    } else {
                        jLongValue = j + j2;
                    }
                    objM56684z = kk40.m56684z(new x8c1(j, jLongValue, string, str, hcc1Var2.f89767i.f213201a.f201919b.m91911g(), null, yb81Var), krq0Var);
                } else {
                    objM56684z = Boolean.FALSE;
                }
            } else {
                objM56684z = Boolean.FALSE;
            }
            yuk yukVar = yuk.f276404a;
            if (objM56684z == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hcc1 hcc1Var3 = krq0Var.f125712b;
            mbc1 mbc1Var3 = krq0Var.f125711a;
            bga.m29073P(obj);
            hcc1Var = hcc1Var3;
            mbc1Var2 = mbc1Var3;
            objM56684z = obj;
        }
        if (((Boolean) objM56684z).booleanValue()) {
            return new acc1(mbc1Var2.f141874a);
        }
        z0r z0rVar = mbc1Var2.f141874a;
        int i3 = hcc1Var.f89763e;
        return new wbc1(z0rVar, new c3r(i3, i3), mbc1Var2.f141875b, mbc1Var2.f141876c);
    }

    public mgq(int i, long j, List list, r300 r300Var) {
        this.f143605a = i;
        this.f143607c = r300Var;
        this.f143608d = list;
        this.f143606b = j;
    }
}
