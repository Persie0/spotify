package com.google.android.gms.internal.meet_coactivities;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzsd implements zzvs {
    private final zzsc zza;

    private zzsd(zzsc zzscVar) {
        byte[] bArr = zzth.zzb;
        this.zza = zzscVar;
        zzscVar.zza = this;
    }

    public static zzsd zza(zzsc zzscVar) {
        zzsd zzsdVar = zzscVar.zza;
        return zzsdVar != null ? zzsdVar : new zzsd(zzscVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzA(int i, long j) {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzB(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zztt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzj(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zztt zzttVar = (zztt) list;
        if (!z) {
            while (i2 < zzttVar.size()) {
                this.zza.zzi(i, zzttVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzttVar.size(); i6++) {
            zzttVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzs(i5);
        while (i2 < zzttVar.size()) {
            this.zza.zzj(zzttVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzC(int i, int i2) {
        this.zza.zzr(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzD(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzta)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzsc zzscVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzscVar.zzr(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzz += zzsc.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzs(iZzz);
            while (i2 < list.size()) {
                zzsc zzscVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzscVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzta zztaVar = (zzta) list;
        if (!z) {
            while (i2 < zztaVar.size()) {
                zzsc zzscVar3 = this.zza;
                int iZze = zztaVar.zze(i2);
                zzscVar3.zzr(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzz2 = 0;
        for (int i4 = 0; i4 < zztaVar.size(); i4++) {
            int iZze2 = zztaVar.zze(i4);
            iZzz2 += zzsc.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzs(iZzz2);
        while (i2 < zztaVar.size()) {
            zzsc zzscVar4 = this.zza;
            int iZze3 = zztaVar.zze(i2);
            zzscVar4.zzs((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzE(int i, long j) {
        this.zza.zzt(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzF(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zztt)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzsc zzscVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzscVar.zzt(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzA += zzsc.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzs(iZzA);
            while (i2 < list.size()) {
                zzsc zzscVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzscVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zztt zzttVar = (zztt) list;
        if (!z) {
            while (i2 < zzttVar.size()) {
                zzsc zzscVar3 = this.zza;
                long jZze = zzttVar.zze(i2);
                zzscVar3.zzt(i, (jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzttVar.size(); i4++) {
            long jZze2 = zzttVar.zze(i4);
            iZzA2 += zzsc.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzs(iZzA2);
        while (i2 < zzttVar.size()) {
            zzsc zzscVar4 = this.zza;
            long jZze3 = zzttVar.zze(i2);
            zzscVar4.zzu((jZze3 >> 63) ^ (jZze3 + jZze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    @Deprecated
    public final void zzG(int i) {
        this.zza.zzq(i, 3);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzH(int i, String str) {
        this.zza.zzo(i, str);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzI(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zztq)) {
            while (i2 < list.size()) {
                this.zza.zzo(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zztq zztqVar = (zztq) list;
        while (i2 < list.size()) {
            Object objZzb = zztqVar.zzb();
            if (objZzb instanceof String) {
                this.zza.zzo(i, (String) objZzb);
            } else {
                this.zza.zze(i, (zzrr) objZzb);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzJ(int i, int i2) {
        this.zza.zzr(i, i2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzK(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzta)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzr(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzz += zzsc.zzz(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzs(iZzz);
            while (i2 < list.size()) {
                this.zza.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzta zztaVar = (zzta) list;
        if (!z) {
            while (i2 < zztaVar.size()) {
                this.zza.zzr(i, zztaVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzz2 = 0;
        for (int i4 = 0; i4 < zztaVar.size(); i4++) {
            iZzz2 += zzsc.zzz(zztaVar.zze(i4));
        }
        this.zza.zzs(iZzz2);
        while (i2 < zztaVar.size()) {
            this.zza.zzs(zztaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzL(int i, long j) {
        this.zza.zzt(i, j);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzM(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zztt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzsc.zzA(((Long) list.get(i3)).longValue());
            }
            this.zza.zzs(iZzA);
            while (i2 < list.size()) {
                this.zza.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zztt zzttVar = (zztt) list;
        if (!z) {
            while (i2 < zzttVar.size()) {
                this.zza.zzt(i, zzttVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzttVar.size(); i4++) {
            iZzA2 += zzsc.zzA(zzttVar.zze(i4));
        }
        this.zza.zzs(iZzA2);
        while (i2 < zzttVar.size()) {
            this.zza.zzu(zzttVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzrh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzrh zzrhVar = (zzrh) list;
        if (!z) {
            while (i2 < zzrhVar.size()) {
                this.zza.zzd(i, zzrhVar.zzf(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzrhVar.size(); i6++) {
            zzrhVar.zzf(i6);
            i5++;
        }
        this.zza.zzs(i5);
        while (i2 < zzrhVar.size()) {
            this.zza.zzb(zzrhVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzd(int i, zzrr zzrrVar) {
        this.zza.zze(i, zzrrVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzrr) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzf(int i, double d) {
        this.zza.zzi(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzse)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzj(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzse zzseVar = (zzse) list;
        if (!z) {
            while (i2 < zzseVar.size()) {
                this.zza.zzi(i, Double.doubleToRawLongBits(zzseVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzseVar.size(); i6++) {
            zzseVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzs(i5);
        while (i2 < zzseVar.size()) {
            this.zza.zzj(Double.doubleToRawLongBits(zzseVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    @Deprecated
    public final void zzh(int i) {
        this.zza.zzq(i, 4);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzi(int i, int i2) {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzta)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzsc.zzA(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzs(iZzA);
            while (i2 < list.size()) {
                this.zza.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzta zztaVar = (zzta) list;
        if (!z) {
            while (i2 < zztaVar.size()) {
                this.zza.zzk(i, zztaVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zztaVar.size(); i4++) {
            iZzA2 += zzsc.zzA(zztaVar.zze(i4));
        }
        this.zza.zzs(iZzA2);
        while (i2 < zztaVar.size()) {
            this.zza.zzl(zztaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzk(int i, int i2) {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzta)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzta zztaVar = (zzta) list;
        if (!z) {
            while (i2 < zztaVar.size()) {
                this.zza.zzg(i, zztaVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zztaVar.size(); i6++) {
            zztaVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzs(i5);
        while (i2 < zztaVar.size()) {
            this.zza.zzh(zztaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzm(int i, long j) {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zztt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzj(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zztt zzttVar = (zztt) list;
        if (!z) {
            while (i2 < zzttVar.size()) {
                this.zza.zzi(i, zzttVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzttVar.size(); i6++) {
            zzttVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzs(i5);
        while (i2 < zzttVar.size()) {
            this.zza.zzj(zzttVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzo(int i, float f) {
        this.zza.zzg(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzsr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzh(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzsr zzsrVar = (zzsr) list;
        if (!z) {
            while (i2 < zzsrVar.size()) {
                this.zza.zzg(i, Float.floatToRawIntBits(zzsrVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsrVar.size(); i6++) {
            zzsrVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzs(i5);
        while (i2 < zzsrVar.size()) {
            this.zza.zzh(Float.floatToRawIntBits(zzsrVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzq(int i, Object obj, zzur zzurVar) {
        zzsc zzscVar = this.zza;
        zzscVar.zzq(i, 3);
        zzurVar.zzj((zzuf) obj, zzscVar.zza);
        zzscVar.zzq(i, 4);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzr(int i, int i2) {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzta)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzsc.zzA(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzs(iZzA);
            while (i2 < list.size()) {
                this.zza.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzta zztaVar = (zzta) list;
        if (!z) {
            while (i2 < zztaVar.size()) {
                this.zza.zzk(i, zztaVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zztaVar.size(); i4++) {
            iZzA2 += zzsc.zzA(zztaVar.zze(i4));
        }
        this.zza.zzs(iZzA2);
        while (i2 < zztaVar.size()) {
            this.zza.zzl(zztaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzt(int i, long j) {
        this.zza.zzt(i, j);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zztt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzsc.zzA(((Long) list.get(i3)).longValue());
            }
            this.zza.zzs(iZzA);
            while (i2 < list.size()) {
                this.zza.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zztt zzttVar = (zztt) list;
        if (!z) {
            while (i2 < zzttVar.size()) {
                this.zza.zzt(i, zzttVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzttVar.size(); i4++) {
            iZzA2 += zzsc.zzA(zzttVar.zze(i4));
        }
        this.zza.zzs(iZzA2);
        while (i2 < zzttVar.size()) {
            this.zza.zzu(zzttVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzv(int i, zztx zztxVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.zza.zzq(i, 2);
            this.zza.zzs(zzty.zzb(zztxVar, entry.getKey(), entry.getValue()));
            zzty.zze(this.zza, zztxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzw(int i, Object obj, zzur zzurVar) {
        zzuf zzufVar = (zzuf) obj;
        zzrz zzrzVar = (zzrz) this.zza;
        zzrzVar.zzs((i << 3) | 2);
        zzrzVar.zzs(((zzra) zzufVar).zzv(zzurVar));
        zzurVar.zzj(zzufVar, zzrzVar.zza);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzx(int i, Object obj) {
        if (obj instanceof zzrr) {
            zzrz zzrzVar = (zzrz) this.zza;
            zzrzVar.zzs(11);
            zzrzVar.zzr(2, i);
            zzrzVar.zze(3, (zzrr) obj);
            zzrzVar.zzs(12);
            return;
        }
        zzrz zzrzVar2 = (zzrz) this.zza;
        zzrzVar2.zzs(11);
        zzrzVar2.zzr(2, i);
        zzrzVar2.zzs(26);
        zzrzVar2.zzn((zzuf) obj);
        zzrzVar2.zzs(12);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzy(int i, int i2) {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvs
    public final void zzz(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzta)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzta zztaVar = (zzta) list;
        if (!z) {
            while (i2 < zztaVar.size()) {
                this.zza.zzg(i, zztaVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zztaVar.size(); i6++) {
            zztaVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzs(i5);
        while (i2 < zztaVar.size()) {
            this.zza.zzh(zztaVar.zze(i2));
            i2++;
        }
    }
}
