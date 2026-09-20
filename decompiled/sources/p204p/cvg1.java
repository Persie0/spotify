package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class cvg1 extends gbh1 {
    private static final cvg1 zzh;
    private int zzb;
    private xvg1 zzd;
    private n2h1 zze;
    private qbh1 zzf = ich1.f100820e;
    private nbh1 zzg = hbh1.f89541e;

    static {
        cvg1 cvg1Var = new cvg1();
        zzh = cvg1Var;
        gbh1.m44223h(cvg1.class, cvg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static avg1 m34060m() {
        return (avg1) zzh.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", y1h1.class, "zzg", qyq0.f194005Z0});
        }
        if (i2 == 3) {
            return new cvg1();
        }
        if (i2 == 4) {
            return new avg1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m34061n(xvg1 xvg1Var) {
        this.zzd = xvg1Var;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: o */
    public final void m34062o(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzg;
        if (!((y9h1) randomAccess).f270602a) {
            hbh1 hbh1Var = (hbh1) randomAccess;
            int i = hbh1Var.f89543c;
            this.zzg = hbh1Var.zzf(i + i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kug1 kug1Var = (kug1) it.next();
            ((hbh1) this.zzg).zzh(kug1Var.f126614a);
        }
    }
}
