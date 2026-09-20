package com.google.android.gms.internal.meet_coactivities;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzou extends AbstractMap {
    private static final Comparator zza = new zzor();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd;
    private Integer zze;
    private String zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.meet_coactivities.zzou, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public zzou(zzou zzouVar, zzou zzouVar2) {
        int i;
        Object objZzc;
        Object[] objArr;
        zzou abstractMap = new AbstractMap();
        int i2 = -1;
        abstractMap.zzd = new zzot(abstractMap, -1);
        abstractMap.zze = null;
        abstractMap.zzf = null;
        int size = zzouVar2.size() + zzouVar.size();
        int i3 = zzouVar.zzc[zzouVar.size()] + zzouVar2.zzc[zzouVar2.size()];
        int i4 = size + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr = new int[i4];
        int i5 = 0;
        iArr[0] = size;
        Map.Entry entryZze = zzouVar.zze(0);
        Map.Entry entryZze2 = zzouVar2.zze(0);
        int i6 = 0;
        int i7 = 0;
        int iZzd = size;
        int i8 = 0;
        while (true) {
            int i9 = 1;
            if (entryZze == null && entryZze2 == null) {
                break;
            }
            i8++;
            int iCompareTo = entryZze == null ? 1 : entryZze2 == null ? i2 : i5;
            if (iCompareTo == 0 && (iCompareTo = ((String) entryZze.getKey()).compareTo((String) entryZze2.getKey())) == 0) {
                int i10 = i7 + 1;
                int i11 = i6 + 1;
                objArr2[i8] = abstractMap.zzf((String) entryZze.getKey(), i8);
                zzot zzotVar = (zzot) entryZze.getValue();
                zzot zzotVar2 = (zzot) entryZze2.getValue();
                int i12 = 0;
                int i13 = 0;
                abstractMap = abstractMap;
                while (true) {
                    if (i12 >= zzotVar.zza() - zzotVar.zzb() && i13 >= zzotVar2.zza() - zzotVar2.zzb()) {
                        break;
                    }
                    int iCompare = i12 == zzotVar.zza() - zzotVar.zzb() ? i9 : i13 == zzotVar2.zza() - zzotVar2.zzb() ? -1 : 0;
                    iCompare = iCompare == 0 ? zzow.zza.compare(zzotVar.zzc(i12), zzotVar2.zzc(i13)) : iCompare;
                    if (iCompare < 0) {
                        i = i12 + 1;
                        objZzc = zzotVar.zzc(i12);
                    } else {
                        int i14 = i13 + 1;
                        Object objZzc2 = zzotVar2.zzc(i13);
                        i13 = i14;
                        i = iCompare == 0 ? i12 + 1 : i12;
                        objZzc = objZzc2;
                    }
                    objArr2[iZzd] = objZzc;
                    i12 = i;
                    iZzd++;
                    i9 = 1;
                    abstractMap = this;
                }
                iArr[i8] = iZzd;
                entryZze = zzouVar.zze(i11);
                entryZze2 = zzouVar2.zze(i10);
                i7 = i10;
                i6 = i11;
                i2 = -1;
                i5 = 0;
            } else {
                if (iCompareTo < 0) {
                    i6++;
                    iZzd = zzd(entryZze, i8, iZzd, objArr2, iArr);
                    entryZze = zzouVar.zze(i6);
                } else {
                    Map.Entry entry = entryZze;
                    i7++;
                    int iZzd2 = zzd(entryZze2, i8, iZzd, objArr2, iArr);
                    entryZze2 = zzouVar2.zze(i7);
                    iZzd = iZzd2;
                    entryZze = entry;
                }
                i2 = -1;
                i5 = 0;
                abstractMap = this;
            }
        }
        int i15 = iArr[i5];
        int i16 = i15 - i8;
        if (i16 != 0) {
            for (int i17 = i5; i17 <= i8; i17++) {
                iArr[i17] = iArr[i17] - i16;
            }
            int i18 = iArr[i8];
            int i19 = i18 - i8;
            if (zzg(i3, i18)) {
                objArr = new Object[i18];
                System.arraycopy(objArr2, i5, objArr, i5, i8);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i15, objArr, i8, i19);
            objArr2 = objArr;
        }
        abstractMap.zzb = objArr2;
        int i20 = iArr[i5] + 1;
        abstractMap.zzc = zzg(i4, i20) ? Arrays.copyOf(iArr, i20) : iArr;
    }

    private final int zzd(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        zzot zzotVar = (zzot) entry.getValue();
        int iZza = zzotVar.zza() - zzotVar.zzb();
        System.arraycopy(zzotVar.zzb.zzb, zzotVar.zzb(), objArr, i2, iZza);
        objArr[i] = zzf((String) entry.getKey(), i);
        int i3 = i2 + iZza;
        iArr[i + 1] = i3;
        return i3;
    }

    private final Map.Entry zze(int i) {
        if (i < this.zzc[0]) {
            return (Map.Entry) this.zzb[i];
        }
        return null;
    }

    private final Map.Entry zzf(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new zzot(this, i));
    }

    private static boolean zzg(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    public zzou(List list) {
        this.zzd = new zzot(this, -1);
        this.zze = null;
        this.zzf = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.zzb = zzg(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            zzoq.zza((zzoq) it2.next());
            throw null;
        }
        zzoq.zza((zzoq) it.next());
        throw null;
    }
}
