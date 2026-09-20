package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p204p.ilf1;

/* JADX INFO: loaded from: classes.dex */
final class zzut {
    public static final /* synthetic */ int zza = 0;
    private static final zzvf zzb;

    static {
        int i = zzun.zza;
        zzb = new zzvh();
    }

    public static void zzA(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzB(i, list, z);
    }

    public static void zzB(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzD(i, list, z);
    }

    public static void zzC(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzF(i, list, z);
    }

    public static void zzD(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzK(i, list, z);
    }

    public static void zzE(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzM(i, list, z);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzta)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzsc.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzta zztaVar = (zzta) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzsc.zzA(zztaVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzsc.zzz(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzsc.zzz(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzta)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzsc.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzta zztaVar = (zzta) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzsc.zzA(zztaVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztt)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzsc.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zztt zzttVar = (zztt) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzsc.zzA(zzttVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzh(int i, Object obj, zzur zzurVar) {
        int i2 = i << 3;
        if (!(obj instanceof zztp)) {
            return zzsc.zzx((zzuf) obj, zzurVar) + zzsc.zzz(i2);
        }
        int iZzz = zzsc.zzz(i2);
        int iZza = ((zztp) obj).zza();
        return ilf1.m51028p(iZza, iZza, iZzz);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzta)) {
            int iZzz = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzz += zzsc.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzz;
        }
        zzta zztaVar = (zzta) list;
        int iZzz2 = 0;
        while (i < size) {
            int iZze = zztaVar.zze(i);
            iZzz2 += zzsc.zzz((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzz2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztt)) {
            int iZzA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzA += zzsc.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzA;
        }
        zztt zzttVar = (zztt) list;
        int iZzA2 = 0;
        while (i < size) {
            long jZze = zzttVar.zze(i);
            iZzA2 += zzsc.zzA((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzA2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzta)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzsc.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzta zztaVar = (zzta) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzsc.zzz(zztaVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztt)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzsc.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zztt zzttVar = (zztt) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzsc.zzA(zzttVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static zzvf zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, List list, zztc zztcVar, Object obj2, zzvf zzvfVar) {
        if (zztcVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zztcVar.zza()) {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzvfVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zztcVar.zza()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzo(obj, i, iIntValue2, obj2, zzvfVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i, int i2, Object obj2, zzvf zzvfVar) {
        if (obj2 == null) {
            obj2 = zzvfVar.zza(obj);
        }
        zzvfVar.zzh(obj2, i, i2);
        return obj2;
    }

    public static void zzp(zzsl zzslVar, Object obj, Object obj2) {
        if (((zzsv) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzvf zzvfVar, Object obj, Object obj2) {
        zzsz zzszVar = (zzsz) obj;
        zzvg zzvgVarZze = zzszVar.zzc;
        zzvg zzvgVar = ((zzsz) obj2).zzc;
        if (!zzvg.zzc().equals(zzvgVar)) {
            if (zzvg.zzc().equals(zzvgVarZze)) {
                zzvgVarZze = zzvg.zze(zzvgVarZze, zzvgVar);
            } else {
                zzvgVarZze.zzd(zzvgVar);
            }
        }
        zzszVar.zzc = zzvgVarZze;
    }

    public static void zzr(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzg(i, list, z);
    }

    public static void zzt(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzj(i, list, z);
    }

    public static void zzu(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzl(i, list, z);
    }

    public static void zzv(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzn(i, list, z);
    }

    public static void zzw(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzp(i, list, z);
    }

    public static void zzx(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzs(i, list, z);
    }

    public static void zzy(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzu(i, list, z);
    }

    public static void zzz(int i, List list, zzvs zzvsVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzvsVar.zzz(i, list, z);
    }
}
