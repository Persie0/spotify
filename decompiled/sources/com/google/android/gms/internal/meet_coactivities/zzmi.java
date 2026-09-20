package com.google.android.gms.internal.meet_coactivities;

import p204p.dq60;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zzmi {
    public static final zzmi zza;
    public static final zzmi zzb;
    public static final zzmi zzc;
    public static final zzmi zzd;
    public static final zzmi zze;
    public static final zzmi zzf;
    public static final zzmi zzg;
    public static final zzmi zzh;
    public static final zzmi zzi;
    public static final zzmi zzj;
    private static final zzmi[] zzk;
    private static final /* synthetic */ zzmi[] zzl;
    private final char zzm;
    private final zzmk zzn;
    private final int zzo;
    private final String zzp;

    static {
        zzmi zzmiVar = new zzmi("STRING", 0, 's', zzmk.GENERAL, "-#", true);
        zza = zzmiVar;
        zzmi zzmiVar2 = new zzmi("BOOLEAN", 1, 'b', zzmk.BOOLEAN, "-", true);
        zzb = zzmiVar2;
        zzmi zzmiVar3 = new zzmi("CHAR", 2, 'c', zzmk.CHARACTER, "-", true);
        zzc = zzmiVar3;
        zzmk zzmkVar = zzmk.INTEGRAL;
        zzmi zzmiVar4 = new zzmi("DECIMAL", 3, 'd', zzmkVar, "-0+ ,(", false);
        zzd = zzmiVar4;
        zzmi zzmiVar5 = new zzmi("OCTAL", 4, 'o', zzmkVar, "-#0(", false);
        zze = zzmiVar5;
        zzmi zzmiVar6 = new zzmi("HEX", 5, 'x', zzmkVar, "-#0(", true);
        zzf = zzmiVar6;
        zzmk zzmkVar2 = zzmk.FLOAT;
        zzmi zzmiVar7 = new zzmi("FLOAT", 6, 'f', zzmkVar2, "-#0+ ,(", false);
        zzg = zzmiVar7;
        zzmi zzmiVar8 = new zzmi("EXPONENT", 7, 'e', zzmkVar2, "-#0+ (", true);
        zzh = zzmiVar8;
        zzmi zzmiVar9 = new zzmi("GENERAL", 8, 'g', zzmkVar2, "-0+ ,(", true);
        zzi = zzmiVar9;
        zzmi zzmiVar10 = new zzmi("EXPONENT_HEX", 9, 'a', zzmkVar2, "-#0+ ", true);
        zzj = zzmiVar10;
        zzl = new zzmi[]{zzmiVar, zzmiVar2, zzmiVar3, zzmiVar4, zzmiVar5, zzmiVar6, zzmiVar7, zzmiVar8, zzmiVar9, zzmiVar10};
        zzk = new zzmi[26];
        for (zzmi zzmiVar11 : values()) {
            zzk[zzf(zzmiVar11.zzm)] = zzmiVar11;
        }
    }

    private zzmi(String str, int i, char c, zzmk zzmkVar, String str2, boolean z) {
        super(str, i);
        this.zzm = c;
        this.zzn = zzmkVar;
        this.zzo = zzmj.zzd(str2, z);
        this.zzp = dq60.m36612l("%", c);
    }

    public static zzmi[] values() {
        return (zzmi[]) zzl.clone();
    }

    public static zzmi zzc(char c) {
        zzmi zzmiVar = zzk[zzf(c)];
        if ((c & ' ') != 0) {
            return zzmiVar;
        }
        if (zzmiVar == null || (zzmiVar.zzo & 128) == 0) {
            return null;
        }
        return zzmiVar;
    }

    private static int zzf(char c) {
        return (c | ' ') - 97;
    }

    public final char zza() {
        return this.zzm;
    }

    public final int zzb() {
        return this.zzo;
    }

    public final zzmk zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzp;
    }
}
