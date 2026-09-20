package p204p;

import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzia;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class leg1 extends r3g1 {
    private static final leg1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private tfg1 zzh;
    private int zzi;

    static {
        leg1 leg1Var = new leg1();
        zzb = leg1Var;
        r3g1.m74640f(leg1.class, leg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m58781p(leg1 leg1Var, qig1 qig1Var) {
        leg1Var.zzf = qig1Var;
        leg1Var.zze = 7;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m58782q(leg1 leg1Var, lkg1 lkg1Var) {
        leg1Var.zzf = lkg1Var;
        leg1Var.zze = 6;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m58783r(leg1 leg1Var, int i) {
        leg1Var.zzg = i - 1;
        leg1Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static eeg1 m58784s() {
        return (eeg1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: t */
    public static leg1 m58785t(byte[] bArr) throws zzgc {
        r3g1 r3g1Var = zzb;
        int length = bArr.length;
        e2g1 e2g1Var = e2g1.f55468b;
        int i = dyf1.f54334a;
        e2g1 e2g1Var2 = e2g1.f55468b;
        if (length != 0) {
            r3g1 r3g1VarM74652n = r3g1Var.m74652n();
            try {
                w9g1 w9g1VarM58515a = l9g1.f131088c.m58515a(r3g1VarM74652n.getClass());
                n9f1 n9f1Var = new n9f1();
                e2g1Var2.getClass();
                w9g1VarM58515a.mo28476b(r3g1VarM74652n, bArr, 0, length, n9f1Var);
                w9g1VarM58515a.zzf(r3g1VarM74652n);
                r3g1Var = r3g1VarM74652n;
            } catch (zzgc e) {
                throw e;
            } catch (zzia e2) {
                throw new zzgc(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzgc) {
                    throw ((zzgc) e3.getCause());
                }
                throw new zzgc(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (r3g1Var == null || r3g1.m74641i(r3g1Var, true)) {
            return (leg1) r3g1Var;
        }
        throw new zzgc(new zzia().getMessage());
    }

    /* JADX INFO: renamed from: v */
    public static void m58786v(leg1 leg1Var, hgg1 hgg1Var) {
        leg1Var.zzi = hgg1Var.f91162a;
        leg1Var.zzd |= 4;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m58787w(leg1 leg1Var, tfg1 tfg1Var) {
        leg1Var.zzh = tfg1Var;
        leg1Var.zzd |= 2;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m58788x(leg1 leg1Var, shg1 shg1Var) {
        leg1Var.zzf = shg1Var;
        leg1Var.zze = 4;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", hxf1.f96217c, "zzh", shg1.class, "zzi", hxf1.f96219e, lkg1.class, qig1.class});
        }
        if (i2 == 3) {
            return new leg1();
        }
        if (i2 == 4) {
            return new eeg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public final qig1 m58789u() {
        return this.zze == 7 ? (qig1) this.zzf : qig1.m72855p();
    }
}
