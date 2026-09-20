package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fgf1 extends laf1 {
    private static final fgf1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private int zzd;
    private int zze;

    static {
        fgf1 fgf1Var = new fgf1();
        zzf = fgf1Var;
        laf1.m58546m(fgf1.class, fgf1Var);
    }

    /* JADX INFO: renamed from: x */
    public static fgf1 m41579x(byte[] bArr) {
        return (fgf1) laf1.m58550q(zzf, bArr);
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
            return new sbf1(zzf, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new fgf1();
        }
        if (i2 == 4) {
            return new pcf1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzg;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (fgf1.class) {
            try {
                kaf1Var = zzg;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzf);
                    zzg = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final ggf1 m41580w() {
        ggf1 ggf1Var;
        switch (this.zze) {
            case 0:
                ggf1Var = ggf1.JS_CODE_UNSPECIFIED;
                break;
            case 1:
                ggf1Var = ggf1.JS_CODE_SUCCESS;
                break;
            case 2:
                ggf1Var = ggf1.JS_NETWORK_ERROR;
                break;
            case 3:
                ggf1Var = ggf1.JS_INTERNAL_ERROR;
                break;
            case 4:
                ggf1Var = ggf1.JS_INVALID_SITE_KEY;
                break;
            case 5:
                ggf1Var = ggf1.JS_INVALID_SITE_KEY_TYPE;
                break;
            case 6:
                ggf1Var = ggf1.JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED;
                break;
            case 7:
                ggf1Var = ggf1.JS_INVALID_ACTION;
                break;
            case 8:
                ggf1Var = ggf1.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED;
                break;
            case 9:
                ggf1Var = ggf1.JS_PROGRAM_ERROR;
                break;
            default:
                ggf1Var = null;
                break;
        }
        return ggf1Var == null ? ggf1.UNRECOGNIZED : ggf1Var;
    }
}
