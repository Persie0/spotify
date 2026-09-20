package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q130 extends p0y0 {

    /* JADX INFO: renamed from: K */
    public final Map f184171K;

    /* JADX INFO: renamed from: L */
    public ahs f184172L;

    public q130(mn3 mn3Var, ihs ihsVar, ehs ehsVar, Map map) {
        super(mn3Var, ihsVar, ehsVar);
        this.f184171K = map;
    }

    @Override // p204p.p0y0
    /* JADX INFO: renamed from: n */
    public final r300 mo68744n(r300 r300Var) {
        ahs ahsVar;
        ahs ahsVar2 = this.f184172L;
        if (ahsVar2 == null) {
            ahsVar2 = r300Var.f195391t;
        }
        if (ahsVar2 != null && (ahsVar = (ahs) this.f184171K.get(ahsVar2.f15761c)) != null) {
            ahsVar2 = ahsVar;
        }
        j6f0 j6f0Var = r300Var.f195384m;
        j6f0 j6f0Var2 = null;
        if (j6f0Var == null) {
            j6f0Var = j6f0Var2;
        } else {
            s5f0[] s5f0VarArr = j6f0Var.f109303a;
            int length = s5f0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                s5f0 s5f0Var = s5f0VarArr[i2];
                if ((s5f0Var instanceof qer0) && "com.apple.streaming.transportStreamTimestamp".equals(((qer0) s5f0Var).f188011b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    s5f0[] s5f0VarArr2 = new s5f0[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            s5f0VarArr2[i < i2 ? i : i - 1] = s5f0VarArr[i];
                        }
                        i++;
                    }
                    j6f0Var2 = new j6f0(s5f0VarArr2);
                }
                j6f0Var = j6f0Var2;
            }
        }
        if (ahsVar2 != r300Var.f195391t || j6f0Var != r300Var.f195384m) {
            p300 p300VarM74564a = r300Var.m74564a();
            p300VarM74564a.f173531s = ahsVar2;
            p300VarM74564a.f173524l = j6f0Var;
            r300Var = new r300(p300VarM74564a);
        }
        return super.mo68744n(r300Var);
    }
}
