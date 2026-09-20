package p204p;

import com.google.android.gms.internal.wearable.zzcf;
import com.google.android.gms.internal.wearable.zzed;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u9h1 extends qlf1 {
    private static final u9h1 zzb;
    private byte zzf = 2;
    private gnf1 zze = ttf1.f223589d;

    static {
        u9h1 u9h1Var = new u9h1();
        zzb = u9h1Var;
        qlf1.m73183f(u9h1.class, u9h1Var);
    }

    /* JADX INFO: renamed from: h */
    public static vpg1 m82637h() {
        return (vpg1) ((hlf1) zzb.mo58162b(5, null));
    }

    /* JADX INFO: renamed from: i */
    public static u9h1 m82638i(byte[] bArr, akf1 akf1Var) {
        u9h1 u9h1Var = zzb;
        int length = bArr.length;
        qlf1 qlf1Var = (qlf1) u9h1Var.mo58162b(4, null);
        try {
            duf1 duf1VarM62822a = mtf1.f147064c.m62822a(qlf1Var.getClass());
            mgb mgbVar = new mgb();
            akf1Var.getClass();
            duf1VarM62822a.mo36937e(qlf1Var, bArr, 0, length, mgbVar);
            duf1VarM62822a.zzf(qlf1Var);
            if (qlf1Var.zza != 0) {
                throw new RuntimeException();
            }
            if (qlf1Var.m73184g()) {
                return (u9h1) qlf1Var;
            }
            throw new zzcf(new zzed().getMessage());
        } catch (zzcf e) {
            throw e;
        } catch (zzed e2) {
            throw new zzcf(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzcf) {
                throw ((zzcf) e3.getCause());
            }
            throw new zzcf(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzcf.m1506c();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m82639k(u9h1 u9h1Var, ArrayList arrayList) {
        gnf1 gnf1Var = u9h1Var.zze;
        if (!((kbf1) gnf1Var).f121199a) {
            u9h1Var.zze = qlf1.m73181d(gnf1Var);
        }
        vaf1.m85079a(arrayList, u9h1Var.zze);
    }

    @Override // p204p.qlf1
    /* JADX INFO: renamed from: b */
    public final Object mo58162b(int i, qlf1 qlf1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return new ytf1(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", x7h1.class});
        }
        if (i2 == 3) {
            return new u9h1();
        }
        if (i2 == 4) {
            return new vpg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzf = qlf1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final gnf1 m82640j() {
        return this.zze;
    }
}
