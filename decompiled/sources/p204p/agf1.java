package p204p;

import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class agf1 extends laf1 {
    private static final agf1 zze;
    private static volatile obf1 zzf;
    private int zza = 0;
    private Object zzd;

    static {
        agf1 agf1Var = new agf1();
        zze = agf1Var;
        laf1.m58546m(agf1.class, agf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static vff1 m25853w() {
        return (vff1) zze.m58556i();
    }

    @Override // p204p.laf1
    /* JADX INFO: renamed from: u */
    public final Object mo25248u(int i) {
        obf1 kaf1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sbf1(zze, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzd", "zza"});
        }
        if (i2 == 3) {
            return new agf1();
        }
        if (i2 == 4) {
            return new vff1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzf;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (agf1.class) {
            try {
                kaf1Var = zzf;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zze);
                    zzf = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m25854x() {
        this.zza = 1;
        this.zzd = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m25855y() {
        long j = Build.TIME;
        this.zza = 7;
        this.zzd = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m25856z(String str) {
        Objects.requireNonNull(str);
        this.zza = 11;
        this.zzd = str;
    }
}
