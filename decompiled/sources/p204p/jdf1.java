package p204p;

import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class jdf1 extends laf1 {
    private static final jdf1 zzv;
    private static volatile obf1 zzw;
    private int zza;
    private Object zze;
    private int zzf;
    private int zzg;
    private long zzl;
    private gaf1 zzm;
    private int zzn;
    private edf1 zzo;
    private pdf1 zzp;
    private ybf1 zzr;
    private gaf1 zzs;
    private int zzu;
    private int zzd = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private xaf1 zzt = maf1.f141585e;

    static {
        jdf1 jdf1Var = new jdf1();
        zzv = jdf1Var;
        laf1.m58546m(jdf1.class, jdf1Var);
    }

    /* JADX INFO: renamed from: A */
    public static idf1 m53021A() {
        return (idf1) zzv.m58556i();
    }

    /* JADX INFO: renamed from: B */
    public static jdf1 m53022B() {
        return zzv;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m53023C(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m53024D(String str) {
        Objects.requireNonNull(str);
        this.zzi = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m53025E(String str) {
        Objects.requireNonNull(str);
        this.zzj = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m53026F(gaf1 gaf1Var) {
        this.zzm = gaf1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m53027G(edf1 edf1Var) {
        Objects.requireNonNull(edf1Var);
        this.zzo = edf1Var;
        this.zza |= 2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m53028H(pdf1 pdf1Var) {
        this.zzp = pdf1Var;
        this.zza |= 4;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m53029I(ybf1 ybf1Var) {
        this.zzr = ybf1Var;
        this.zza |= 8;
    }

    /* JADX INFO: renamed from: J */
    public final void m53030J(int i) {
        RandomAccess randomAccess = this.zzt;
        if (!((l9f1) randomAccess).f131083a) {
            maf1 maf1Var = (maf1) randomAccess;
            int i2 = maf1Var.f141587c;
            this.zzt = maf1Var.zzg(i2 + i2);
        }
        ((maf1) this.zzt).zzh(0);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m53031K(int i) {
        this.zza |= 32;
        this.zzu = i;
    }

    /* JADX INFO: renamed from: L */
    public final int m53032L() {
        int i;
        switch (this.zzf) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case 37:
                i = 39;
                break;
            case 38:
                i = 40;
                break;
            case 39:
                i = 41;
                break;
            case 40:
                i = 42;
                break;
            case 41:
                i = 43;
                break;
            case 42:
                i = 44;
                break;
            case 43:
                i = 45;
                break;
            case 44:
                i = 46;
                break;
            case 45:
                i = 47;
                break;
            case 46:
                i = 48;
                break;
            case 47:
                i = 49;
                break;
            case 48:
                i = 50;
                break;
            case 49:
                i = 51;
                break;
            case 50:
                i = 52;
                break;
            case 51:
                i = 53;
                break;
            case 52:
                i = 54;
                break;
            case 53:
                i = 55;
                break;
            case 54:
                i = 56;
                break;
            case 55:
                i = 57;
                break;
            case 56:
                i = 58;
                break;
            case 57:
                i = 59;
                break;
            case 58:
                i = 60;
                break;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                i = 61;
                break;
            case 60:
                i = 62;
                break;
            case 61:
                i = 63;
                break;
            case 62:
                i = 64;
                break;
            case 63:
                i = 65;
                break;
            case 64:
                i = 66;
                break;
            case 65:
                i = 67;
                break;
            case 66:
                i = 68;
                break;
            case 67:
                i = 69;
                break;
            case 68:
                i = 70;
                break;
            case 69:
                i = 71;
                break;
            case 70:
                i = 72;
                break;
            case 71:
                i = 73;
                break;
            case 72:
                i = 74;
                break;
            case 73:
                i = 75;
                break;
            case 74:
                i = 76;
                break;
            case 75:
                i = 77;
                break;
            case 76:
                i = 78;
                break;
            case 77:
                i = 79;
                break;
            case 78:
                i = 80;
                break;
            case 79:
                i = 81;
                break;
            case 80:
                i = 82;
                break;
            case 81:
                i = 83;
                break;
            case 82:
                i = 84;
                break;
            case 83:
                i = 85;
                break;
            case 84:
                i = 86;
                break;
            case 85:
                i = 87;
                break;
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                i = 88;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m53033M(int i) {
        this.zzf = k2z0.m55198A(i);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m53034N(int i) {
        this.zzg = i - 2;
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
            return new sbf1(zzv, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zze", "zzd", "zza", "zzf", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", qcf1.class, "zzt", "zzu", "zzg"});
        }
        if (i2 == 3) {
            return new jdf1();
        }
        if (i2 == 4) {
            return new idf1(zzv);
        }
        if (i2 == 5) {
            return zzv;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzw;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (jdf1.class) {
            try {
                kaf1Var = zzw;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzv);
                    zzw = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final gaf1 m53035w() {
        gaf1 gaf1Var = this.zzm;
        return gaf1Var == null ? gaf1.m44160z() : gaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m53036x(int i) {
        this.zzn = i - 2;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m53037y() {
        return (this.zza & 32) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m53038z() {
        return this.zzu;
    }
}
