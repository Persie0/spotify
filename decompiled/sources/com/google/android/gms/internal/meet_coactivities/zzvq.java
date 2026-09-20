package com.google.android.gms.internal.meet_coactivities;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zzvq {
    public static final zzvq zza;
    public static final zzvq zzb;
    public static final zzvq zzc;
    public static final zzvq zzd;
    public static final zzvq zze;
    public static final zzvq zzf;
    public static final zzvq zzg;
    public static final zzvq zzh;
    public static final zzvq zzi;
    public static final zzvq zzj;
    public static final zzvq zzk;
    public static final zzvq zzl;
    public static final zzvq zzm;
    public static final zzvq zzn;
    public static final zzvq zzo;
    public static final zzvq zzp;
    public static final zzvq zzq;
    public static final zzvq zzr;
    private static final /* synthetic */ zzvq[] zzs;
    private final zzvr zzt;
    private final int zzu;

    static {
        zzvq zzvqVar = new zzvq("DOUBLE", 0, zzvr.DOUBLE, 1);
        zza = zzvqVar;
        zzvq zzvqVar2 = new zzvq("FLOAT", 1, zzvr.FLOAT, 5);
        zzb = zzvqVar2;
        zzvr zzvrVar = zzvr.LONG;
        zzvq zzvqVar3 = new zzvq("INT64", 2, zzvrVar, 0);
        zzc = zzvqVar3;
        zzvq zzvqVar4 = new zzvq("UINT64", 3, zzvrVar, 0);
        zzd = zzvqVar4;
        zzvr zzvrVar2 = zzvr.INT;
        zzvq zzvqVar5 = new zzvq("INT32", 4, zzvrVar2, 0);
        zze = zzvqVar5;
        zzvq zzvqVar6 = new zzvq("FIXED64", 5, zzvrVar, 1);
        zzf = zzvqVar6;
        zzvq zzvqVar7 = new zzvq("FIXED32", 6, zzvrVar2, 5);
        zzg = zzvqVar7;
        zzvq zzvqVar8 = new zzvq("BOOL", 7, zzvr.BOOLEAN, 0);
        zzh = zzvqVar8;
        zzvq zzvqVar9 = new zzvq("STRING", 8, zzvr.STRING, 2);
        zzi = zzvqVar9;
        zzvr zzvrVar3 = zzvr.MESSAGE;
        zzvq zzvqVar10 = new zzvq("GROUP", 9, zzvrVar3, 3);
        zzj = zzvqVar10;
        zzvq zzvqVar11 = new zzvq("MESSAGE", 10, zzvrVar3, 2);
        zzk = zzvqVar11;
        zzvq zzvqVar12 = new zzvq("BYTES", 11, zzvr.BYTE_STRING, 2);
        zzl = zzvqVar12;
        zzvq zzvqVar13 = new zzvq("UINT32", 12, zzvrVar2, 0);
        zzm = zzvqVar13;
        zzvq zzvqVar14 = new zzvq("ENUM", 13, zzvr.ENUM, 0);
        zzn = zzvqVar14;
        zzvq zzvqVar15 = new zzvq("SFIXED32", 14, zzvrVar2, 5);
        zzo = zzvqVar15;
        zzvq zzvqVar16 = new zzvq("SFIXED64", 15, zzvrVar, 1);
        zzp = zzvqVar16;
        zzvq zzvqVar17 = new zzvq("SINT32", 16, zzvrVar2, 0);
        zzq = zzvqVar17;
        zzvq zzvqVar18 = new zzvq("SINT64", 17, zzvrVar, 0);
        zzr = zzvqVar18;
        zzs = new zzvq[]{zzvqVar, zzvqVar2, zzvqVar3, zzvqVar4, zzvqVar5, zzvqVar6, zzvqVar7, zzvqVar8, zzvqVar9, zzvqVar10, zzvqVar11, zzvqVar12, zzvqVar13, zzvqVar14, zzvqVar15, zzvqVar16, zzvqVar17, zzvqVar18};
    }

    private zzvq(String str, int i, zzvr zzvrVar, int i2) {
        super(str, i);
        this.zzt = zzvrVar;
        this.zzu = i2;
    }

    public static zzvq[] values() {
        return (zzvq[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzvr zzb() {
        return this.zzt;
    }
}
