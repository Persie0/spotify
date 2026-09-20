package com.google.android.gms.internal.meet_coactivities;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class zztk {
    public static final zztk zza;
    public static final zztk zzb;
    public static final zztk zzc;
    public static final zztk zzd;
    public static final zztk zze;
    public static final zztk zzf;
    public static final zztk zzg;
    public static final zztk zzh;
    public static final zztk zzi;
    public static final zztk zzj;
    private static final /* synthetic */ zztk[] zzk;
    private final Class zzl;

    static {
        zztk zztkVar = new zztk("VOID", 0, Void.class, Void.class, null);
        zza = zztkVar;
        Class cls = Integer.TYPE;
        zztk zztkVar2 = new zztk("INT", 1, cls, Integer.class, 0);
        zzb = zztkVar2;
        zztk zztkVar3 = new zztk("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zztkVar3;
        zztk zztkVar4 = new zztk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zztkVar4;
        zztk zztkVar5 = new zztk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zztkVar5;
        zztk zztkVar6 = new zztk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zztkVar6;
        zztk zztkVar7 = new zztk("STRING", 6, String.class, String.class, "");
        zzg = zztkVar7;
        zztk zztkVar8 = new zztk("BYTE_STRING", 7, zzrr.class, zzrr.class, zzrr.zzb);
        zzh = zztkVar8;
        zztk zztkVar9 = new zztk("ENUM", 8, cls, Integer.class, null);
        zzi = zztkVar9;
        zztk zztkVar10 = new zztk("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zztkVar10;
        zzk = new zztk[]{zztkVar, zztkVar2, zztkVar3, zztkVar4, zztkVar5, zztkVar6, zztkVar7, zztkVar8, zztkVar9, zztkVar10};
    }

    private zztk(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.zzl = cls2;
    }

    public static zztk[] values() {
        return (zztk[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
