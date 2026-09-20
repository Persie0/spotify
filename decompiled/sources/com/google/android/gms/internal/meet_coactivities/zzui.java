package com.google.android.gms.internal.meet_coactivities;

import androidx.car.app.model.Alert;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p204p.edb;
import p204p.ikc0;
import p204p.ilf1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzui<T> implements zzur<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzvm.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzuf zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzvf zzm;
    private final zzsl zzn;

    private zzui(int[] iArr, Object[] objArr, int i, int i2, zzuf zzufVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzuk zzukVar, zztr zztrVar, zzvf zzvfVar, zzsl zzslVar, zzua zzuaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzufVar instanceof zzsz;
        boolean z2 = false;
        if (zzslVar != null && (zzufVar instanceof zzsv)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzm = zzvfVar;
        this.zzn = zzslVar;
        this.zzg = zzufVar;
    }

    private final Object zzA(Object obj, int i) {
        zzur zzurVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzurVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzurVarZzx.zze();
        if (object != null) {
            zzurVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzur zzurVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzurVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzurVarZzx.zze();
        if (object != null) {
            zzurVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbM38573v = edb.m38573v("Field ", str, " for ", name, " not found. Known fields are ");
            sbM38573v.append(string);
            throw new RuntimeException(sbM38573v.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException(ikc0.m50939k("Source subfield ", " is present but null: ", this.zzc[i], obj2.toString()));
            }
            zzur zzurVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzurVarZzx.zze();
                    zzurVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzurVarZzx.zze();
                zzurVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzurVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException(ikc0.m50939k("Source subfield ", " is present but null: ", this.zzc[i], obj2.toString()));
            }
            zzur zzurVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzurVarZzx.zze();
                    zzurVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzurVarZzx.zze();
                zzurVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzurVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzuq zzuqVar) {
        long j = i & 1048575;
        if (zzM(i)) {
            zzvm.zzs(obj, j, zzuqVar.zzs());
        } else if (this.zzi) {
            zzvm.zzs(obj, j, zzuqVar.zzr());
        } else {
            zzvm.zzs(obj, j, zzuqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzvm.zzq(obj, j, (1 << (iZzr >>> 20)) | zzvm.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzvm.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzvm.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzvm.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvm.zzb(obj, j2)) != 0;
            case 2:
                return zzvm.zzd(obj, j2) != 0;
            case 3:
                return zzvm.zzd(obj, j2) != 0;
            case 4:
                return zzvm.zzc(obj, j2) != 0;
            case 5:
                return zzvm.zzd(obj, j2) != 0;
            case 6:
                return zzvm.zzc(obj, j2) != 0;
            case 7:
                return zzvm.zzw(obj, j2);
            case 8:
                Object objZzf = zzvm.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzrr) {
                    return !zzrr.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzvm.zzf(obj, j2) != null;
            case 10:
                return !zzrr.zzb.equals(zzvm.zzf(obj, j2));
            case 11:
                return zzvm.zzc(obj, j2) != 0;
            case 12:
                return zzvm.zzc(obj, j2) != 0;
            case 13:
                return zzvm.zzc(obj, j2) != 0;
            case 14:
                return zzvm.zzd(obj, j2) != 0;
            case 15:
                return zzvm.zzc(obj, j2) != 0;
            case 16:
                return zzvm.zzd(obj, j2) != 0;
            case 17:
                return zzvm.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzur zzurVar) {
        return zzurVar.zzl(zzvm.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzsz) {
            return ((zzsz) obj).zzQ();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzvm.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzvm.zzf(obj, j)).booleanValue();
    }

    private static final int zzT(byte[] bArr, int i, int i2, zzvq zzvqVar, Class cls, zzrf zzrfVar) {
        zzvq zzvqVar2 = zzvq.zza;
        switch (zzvqVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                zzrfVar.zzc = Double.valueOf(Double.longBitsToDouble(zzrg.zzp(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                zzrfVar.zzc = Float.valueOf(Float.intBitsToFloat(zzrg.zzb(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iZzl = zzrg.zzl(bArr, i, zzrfVar);
                zzrfVar.zzc = Long.valueOf(zzrfVar.zzb);
                return iZzl;
            case 4:
            case 12:
            case 13:
                int iZzi = zzrg.zzi(bArr, i, zzrfVar);
                zzrfVar.zzc = Integer.valueOf(zzrfVar.zza);
                return iZzi;
            case 5:
            case 15:
                int i5 = i + 8;
                zzrfVar.zzc = Long.valueOf(zzrg.zzp(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                zzrfVar.zzc = Integer.valueOf(zzrg.zzb(bArr, i));
                return i6;
            case 7:
                int iZzl2 = zzrg.zzl(bArr, i, zzrfVar);
                zzrfVar.zzc = Boolean.valueOf(zzrfVar.zzb != 0);
                return iZzl2;
            case 8:
                return zzrg.zzg(bArr, i, zzrfVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzrg.zzd(zzun.zza().zzb(cls), bArr, i, i2, zzrfVar);
            case 11:
                return zzrg.zza(bArr, i, zzrfVar);
            case 16:
                int iZzi2 = zzrg.zzi(bArr, i, zzrfVar);
                zzrfVar.zzc = Integer.valueOf(zzrx.zzF(zzrfVar.zza));
                return iZzi2;
            case 17:
                int iZzl3 = zzrg.zzl(bArr, i, zzrfVar);
                zzrfVar.zzc = Long.valueOf(zzrx.zzH(zzrfVar.zzb));
                return iZzl3;
        }
    }

    private static final void zzU(int i, Object obj, zzvs zzvsVar) {
        if (obj instanceof String) {
            zzvsVar.zzH(i, (String) obj);
        } else {
            zzvsVar.zzd(i, (zzrr) obj);
        }
    }

    public static zzvg zzd(Object obj) {
        zzsz zzszVar = (zzsz) obj;
        zzvg zzvgVar = zzszVar.zzc;
        if (zzvgVar != zzvg.zzc()) {
            return zzvgVar;
        }
        zzvg zzvgVarZzf = zzvg.zzf();
        zzszVar.zzc = zzvgVarZzf;
        return zzvgVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03af  */
    public static zzui zzm(Class cls, zzuc zzucVar, zzuk zzukVar, zztr zztrVar, zzvf zzvfVar, zzsl zzslVar, zzua zzuaVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c;
        int i21;
        int i22;
        Field fieldZzC;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Field fieldZzC2;
        Field fieldZzC3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzucVar instanceof zzup)) {
            throw null;
        }
        zzup zzupVar = (zzup) zzucVar;
        String strZzd = zzupVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            i2 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = iCharAt7;
            i3 = iCharAt5;
            i4 = i60;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = iCharAt9;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzupVar.zze();
        Class<?> cls2 = zzupVar.zza().getClass();
        int i61 = i6 + i4;
        int i62 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i62];
        int i63 = i6;
        int i64 = i61;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c2) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strZzd.charAt(i69);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strZzd.charAt(i73);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i17 = i29;
            } else {
                i17 = i71;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i65;
                i66++;
            }
            int i75 = iCharAt11 & 255;
            zzup zzupVar2 = zzupVar;
            int i76 = iCharAt11 & 2048;
            if (i75 >= 51) {
                int i77 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = strZzd.charAt(i79);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i80);
                    i26 = i28;
                } else {
                    i26 = i77;
                }
                int i81 = i26;
                int i82 = i75 - 51;
                i18 = length;
                if (i82 == 9 || i82 == 17) {
                    objArr[ilf1.m51029q(i65, 3, 1)] = objArrZze[i2];
                    i27 = i76;
                    i2++;
                } else if (i82 != 12) {
                    i27 = i76;
                } else if (zzupVar2.zzc() == 1 || i76 != 0) {
                    objArr[ilf1.m51029q(i65, 3, 1)] = objArrZze[i2];
                    i2++;
                    i27 = i76;
                } else {
                    i27 = 0;
                }
                int i83 = iCharAt12 + iCharAt12;
                Object obj = objArrZze[i83];
                i76 = i27;
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i83] = fieldZzC2;
                }
                int i84 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i85 = i83 + 1;
                Object obj2 = objArrZze[i85];
                i19 = i84;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i85] = fieldZzC3;
                }
                i20 = i2;
                i21 = i81;
                i22 = 0;
                c = 55296;
                i65 = i65;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                objArr = objArr;
            } else {
                i18 = length;
                i19 = i7;
                int i86 = i2 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i2]);
                if (i75 == 9 || i75 == 17) {
                    i20 = i86;
                    objArr[ilf1.m51029q(i65, 3, 1)] = fieldZzC4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i25 = i2 + 2;
                            i23 = 1;
                            i24 = 3;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i20 = i86;
                            if (zzupVar2.zzc() == 1 || i76 != 0) {
                                i25 = i2 + 2;
                                objArr[ilf1.m51029q(i65, 3, 1)] = objArrZze[i20];
                                i20 = i25;
                            } else {
                                i76 = 0;
                            }
                        } else if (i75 == 50) {
                            int i87 = i2 + 2;
                            int i88 = i63 + 1;
                            iArr[i63] = i65;
                            int i89 = i65 / 3;
                            int i90 = i89 + i89;
                            objArr[i90] = objArrZze[i86];
                            if (i76 != 0) {
                                objArr[i90 + 1] = objArrZze[i87];
                                i63 = i88;
                                i20 = i2 + 3;
                            } else {
                                i63 = i88;
                                i76 = 0;
                                i20 = i87;
                            }
                        } else {
                            i20 = i86;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            c = 55296;
                            i21 = i17;
                            i22 = 0;
                        } else {
                            int i91 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i92 = iCharAt13 & 8191;
                                int i93 = 13;
                                while (true) {
                                    i21 = i91 + 1;
                                    cCharAt9 = strZzd.charAt(i91);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i92 |= (cCharAt9 & 8191) << i93;
                                    i93 += 13;
                                    i91 = i21;
                                }
                                iCharAt13 = i92 | (cCharAt9 << i93);
                            } else {
                                i21 = i91;
                            }
                            int i94 = (iCharAt13 / 32) + i19 + i19;
                            Object obj3 = objArrZze[i94];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i94] = fieldZzC;
                            }
                            i22 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                            c = 55296;
                        }
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i64] = iObjectFieldOffset;
                            i64++;
                        }
                    } else {
                        i23 = 1;
                        i24 = 3;
                        i25 = i2 + 2;
                    }
                    objArr[ilf1.m51029q(i65, i24, i23)] = objArrZze[i86];
                    i20 = i25;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    i21 = i17;
                    i22 = 0;
                } else {
                    c = 55296;
                    i21 = i17;
                    i22 = 0;
                }
                if (i75 >= 18) {
                    iArr[i64] = iObjectFieldOffset;
                    i64++;
                }
            }
            int i95 = i65 + 1;
            iArr3[i65] = iCharAt10;
            int i96 = i65 + 2;
            iArr3[i95] = iObjectFieldOffset | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20);
            iArr3[i96] = (i22 << 20) | iObjectFieldOffset2;
            objArr = objArr;
            i65 += 3;
            c2 = c;
            i33 = i21;
            zzupVar = zzupVar2;
            i2 = i20;
            length = i18;
            i7 = i19;
        }
        zzup zzupVar3 = zzupVar;
        return new zzui(iArr3, objArr, i3, i5, zzupVar3.zza(), zzupVar3.zzc(), false, iArr, i6, i61, zzukVar, zztrVar, zzvfVar, zzslVar, zzuaVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzvm.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzvm.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzvm.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzvm.zzf(obj, j)).longValue();
    }

    private final zztc zzw(int i) {
        int i2 = i / 3;
        return (zztc) this.zzd[i2 + i2 + 1];
    }

    private final zzur zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzur zzurVar = (zzur) objArr[i3];
        if (zzurVar != null) {
            return zzurVar;
        }
        zzur zzurVarZzb = zzun.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzurVarZzb;
        return zzurVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzvf zzvfVar, Object obj3) {
        zztc zztcVarZzw;
        int i2 = this.zzc[i];
        Object objZzf = zzvm.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || (zztcVarZzw = zzw(i)) == null) {
            return obj2;
        }
        zztx zztxVarZzc = ((zzty) zzz(i)).zzc();
        Iterator it = ((zztz) objZzf).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!zztcVarZzw.zza()) {
                if (obj2 == null) {
                    obj2 = zzvfVar.zza(obj3);
                }
                int iZzb = zzty.zzb(zztxVarZzc, entry.getKey(), entry.getValue());
                zzrr zzrrVar = zzrr.zzb;
                byte[] bArr = new byte[iZzb];
                zzrz zzrzVar = new zzrz(bArr, 0, iZzb);
                try {
                    zzty.zze(zzrzVar, zztxVarZzc, entry.getKey(), entry.getValue());
                    zzvfVar.zzg(obj2, i2, zzrn.zza(zzrzVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:206:0x0529  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e1  */
    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final int zza(Object obj) {
        int i;
        int iZzz;
        int iZzA;
        int iZzz2;
        int iZzd;
        int iZzz3;
        int iZzh;
        int iZzz4;
        int size;
        int iZzl;
        int iZzz5;
        int iZzd2;
        boolean z;
        int iZzb;
        int iZzy;
        int iZzz6;
        int iZzz7;
        int size2;
        int iZzk;
        int iZzz8;
        int size3;
        int iZzi;
        int iZzz9;
        int iZza;
        int iZze;
        int iZzz10;
        int iZzz11;
        int iZzz12;
        int iZzA2;
        zzui<T> zzuiVar = this;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iM51028p = 0;
        while (i4 < zzuiVar.zzc.length) {
            int iZzu = zzuiVar.zzu(i4);
            int iZzt = zzt(iZzu);
            int[] iArr = zzuiVar.zzc;
            int i6 = iArr[i4];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & i2;
            if (iZzt <= 17) {
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzu & i2;
            if (iZzt >= zzsq.zzJ.zza()) {
                zzsq.zzW.zza();
            }
            long j = i9;
            switch (iZzt) {
                case 0:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 8, iM51028p);
                    }
                    break;
                case 1:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 4, iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 2:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz = zzsc.zzz(i6 << 3);
                        iZzA = zzsc.zzA(j2);
                        iM51028p += iZzA + iZzz;
                    }
                    zzuiVar = this;
                    break;
                case 3:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzz = zzsc.zzz(i6 << 3);
                        iZzA = zzsc.zzA(j3);
                        iM51028p += iZzA + iZzz;
                    }
                    zzuiVar = this;
                    break;
                case 4:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzz = zzsc.zzz(i6 << 3);
                        iZzA = zzsc.zzA(j4);
                        iM51028p += iZzA + iZzz;
                    }
                    zzuiVar = this;
                    break;
                case 5:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 8, iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 6:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 4, iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 7:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 1, iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 8:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzrr) {
                            iZzz2 = zzsc.zzz(i10);
                            iZzd = ((zzrr) object).zzd();
                            iZzz3 = zzsc.zzz(iZzd);
                            iM51028p += iZzz3 + iZzd + iZzz2;
                        } else {
                            iZzz = zzsc.zzz(i10);
                            iZzA = zzsc.zzy((String) object);
                            iM51028p += iZzA + iZzz;
                        }
                    }
                    zzuiVar = this;
                    break;
                case 9:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iZzh = zzut.zzh(i6, unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                        iM51028p += iZzh;
                    }
                    break;
                case 10:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzrr zzrrVar = (zzrr) unsafe.getObject(obj, j);
                        iZzz2 = zzsc.zzz(i6 << 3);
                        iZzd = zzrrVar.zzd();
                        iZzz3 = zzsc.zzz(iZzd);
                        iM51028p += iZzz3 + iZzd + iZzz2;
                    }
                    zzuiVar = this;
                    break;
                case 11:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(unsafe.getInt(obj, j), zzsc.zzz(i6 << 3), iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 12:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz = zzsc.zzz(i6 << 3);
                        iZzA = zzsc.zzA(j5);
                        iM51028p += iZzA + iZzz;
                    }
                    zzuiVar = this;
                    break;
                case 13:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 4, iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 14:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 8, iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 15:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        iM51028p = ilf1.m51028p((i11 >> 31) ^ (i11 + i11), zzsc.zzz(i6 << 3), iM51028p);
                    }
                    zzuiVar = this;
                    break;
                case 16:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzz = zzsc.zzz(i6 << 3);
                        iZzA = zzsc.zzA((j6 >> 63) ^ (j6 + j6));
                        iM51028p += iZzA + iZzz;
                    }
                    zzuiVar = this;
                    break;
                case 17:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        iM51028p += zzsc.zzv(i6, (zzuf) unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                    }
                    break;
                case 18:
                    iZzh = zzut.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iM51028p += iZzh;
                    break;
                case 19:
                    iZzh = zzut.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iM51028p += iZzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzut.zza;
                    if (list.size() == 0) {
                        iZzz4 = 0;
                    } else {
                        iZzz4 = (zzsc.zzz(i6 << 3) * list.size()) + zzut.zzg(list);
                    }
                    iM51028p += iZzz4;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i13 = zzut.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz4 = 0;
                    } else {
                        iZzl = zzut.zzl(list2);
                        iZzz5 = zzsc.zzz(i6 << 3);
                        iZzz4 = (iZzz5 * size) + iZzl;
                    }
                    iM51028p += iZzz4;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i14 = zzut.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz4 = 0;
                    } else {
                        iZzl = zzut.zzf(list3);
                        iZzz5 = zzsc.zzz(i6 << 3);
                        iZzz4 = (iZzz5 * size) + iZzl;
                    }
                    iM51028p += iZzz4;
                    break;
                case 23:
                    iZzd2 = zzut.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iM51028p += iZzd2;
                    break;
                case 24:
                    z = false;
                    iZzb = zzut.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iM51028p += iZzb;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i15 = zzut.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzd2 = size4 * (zzsc.zzz(i6 << 3) + 1);
                    }
                    iM51028p += iZzd2;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i16 = zzut.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzy = 0;
                    } else {
                        int iZzz13 = zzsc.zzz(i6 << 3) * size5;
                        if (list5 instanceof zztq) {
                            zztq zztqVar = (zztq) list5;
                            iZzy = iZzz13;
                            for (int i17 = 0; i17 < size5; i17++) {
                                Object objZzb = zztqVar.zzb();
                                if (objZzb instanceof zzrr) {
                                    int iZzd3 = ((zzrr) objZzb).zzd();
                                    iZzy = ilf1.m51028p(iZzd3, iZzd3, iZzy);
                                } else {
                                    iZzy = zzsc.zzy((String) objZzb) + iZzy;
                                }
                            }
                        } else {
                            iZzy = iZzz13;
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object obj2 = list5.get(i18);
                                if (obj2 instanceof zzrr) {
                                    int iZzd4 = ((zzrr) obj2).zzd();
                                    iZzy = ilf1.m51028p(iZzd4, iZzd4, iZzy);
                                } else {
                                    iZzy = zzsc.zzy((String) obj2) + iZzy;
                                }
                            }
                        }
                    }
                    iM51028p += iZzy;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzur zzurVarZzx = zzuiVar.zzx(i4);
                    int i19 = zzut.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzz6 = 0;
                    } else {
                        iZzz6 = zzsc.zzz(i6 << 3) * size6;
                        for (int i20 = 0; i20 < size6; i20++) {
                            Object obj3 = list6.get(i20);
                            if (obj3 instanceof zztp) {
                                int iZza2 = ((zztp) obj3).zza();
                                iZzz6 = ilf1.m51028p(iZza2, iZza2, iZzz6);
                            } else {
                                iZzz6 = zzsc.zzx((zzuf) obj3, zzurVarZzx) + iZzz6;
                            }
                        }
                    }
                    iM51028p += iZzz6;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i21 = zzut.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = zzsc.zzz(i6 << 3) * size7;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int iZzd5 = ((zzrr) list7.get(i22)).zzd();
                            iZzz7 = ilf1.m51028p(iZzd5, iZzd5, iZzz7);
                        }
                    }
                    iM51028p += iZzz7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i23 = zzut.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzut.zzk(list8);
                        iZzz8 = zzsc.zzz(i6 << 3);
                        iZzd2 = iZzk + (iZzz8 * size2);
                    }
                    iM51028p += iZzd2;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i24 = zzut.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzut.zza(list9);
                        iZzz8 = zzsc.zzz(i6 << 3);
                        iZzd2 = iZzk + (iZzz8 * size2);
                    }
                    iM51028p += iZzd2;
                    break;
                case 31:
                    iZzd2 = zzut.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iM51028p += iZzd2;
                    break;
                case 32:
                    z = false;
                    iZzb = zzut.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iM51028p += iZzb;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i25 = zzut.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        iZza = 0;
                    } else {
                        iZzi = zzut.zzi(list10);
                        iZzz9 = zzsc.zzz(i6 << 3);
                        iZza = (iZzz9 * size3) + iZzi;
                    }
                    iM51028p += iZza;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i26 = zzut.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        iZza = 0;
                    } else {
                        iZzi = zzut.zzj(list11);
                        iZzz9 = zzsc.zzz(i6 << 3);
                        iZza = (iZzz9 * size3) + iZzi;
                    }
                    iM51028p += iZza;
                    break;
                case 35:
                    iZze = zzut.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 36:
                    iZze = zzut.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 37:
                    iZze = zzut.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 38:
                    iZze = zzut.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 39:
                    iZze = zzut.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 40:
                    iZze = zzut.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 41:
                    iZze = zzut.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i27 = zzut.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 43:
                    iZze = zzut.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 44:
                    iZze = zzut.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 45:
                    iZze = zzut.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 46:
                    iZze = zzut.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 47:
                    iZze = zzut.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 48:
                    iZze = zzut.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzsc.zzz(i6 << 3);
                        iZzz11 = zzsc.zzz(iZze);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzur zzurVarZzx2 = zzuiVar.zzx(i4);
                    int i28 = zzut.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        iZza = 0;
                    } else {
                        int iZzv = 0;
                        for (int i29 = 0; i29 < size8; i29++) {
                            iZzv += zzsc.zzv(i6, (zzuf) list13.get(i29), zzurVarZzx2);
                        }
                        iZza = iZzv;
                    }
                    iM51028p += iZza;
                    break;
                case 50:
                    zztz zztzVar = (zztz) unsafe.getObject(obj, j);
                    zzty zztyVar = (zzty) zzuiVar.zzz(i4);
                    if (zztzVar.isEmpty()) {
                        iZza = 0;
                    } else {
                        iZza = 0;
                        for (Map.Entry entry : zztzVar.entrySet()) {
                            iZza += zztyVar.zza(i6, entry.getKey(), entry.getValue());
                        }
                    }
                    iM51028p += iZza;
                    break;
                case 51:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 8, iM51028p);
                    }
                    break;
                case 52:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 4, iM51028p);
                    }
                    break;
                case 53:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        long jZzv = zzv(obj, j);
                        iZzz12 = zzsc.zzz(i6 << 3);
                        iZzA2 = zzsc.zzA(jZzv);
                        iM51028p += iZzA2 + iZzz12;
                    }
                    break;
                case 54:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        long jZzv2 = zzv(obj, j);
                        iZzz12 = zzsc.zzz(i6 << 3);
                        iZzA2 = zzsc.zzA(jZzv2);
                        iM51028p += iZzA2 + iZzz12;
                    }
                    break;
                case 55:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        long jZzp = zzp(obj, j);
                        iZzz12 = zzsc.zzz(i6 << 3);
                        iZzA2 = zzsc.zzA(jZzp);
                        iM51028p += iZzA2 + iZzz12;
                    }
                    break;
                case 56:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 8, iM51028p);
                    }
                    break;
                case 57:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 4, iM51028p);
                    }
                    break;
                case 58:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 1, iM51028p);
                    }
                    break;
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        int i30 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzrr) {
                            iZze = zzsc.zzz(i30);
                            iZzz10 = ((zzrr) object2).zzd();
                            iZzz11 = zzsc.zzz(iZzz10);
                            iM51028p += iZzz11 + iZzz10 + iZze;
                        } else {
                            iZzz12 = zzsc.zzz(i30);
                            iZzA2 = zzsc.zzy((String) object2);
                            iM51028p += iZzA2 + iZzz12;
                        }
                    }
                    break;
                case 60:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iZzd2 = zzut.zzh(i6, unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                        iM51028p += iZzd2;
                    }
                    break;
                case 61:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzrr zzrrVar2 = (zzrr) unsafe.getObject(obj, j);
                        iZze = zzsc.zzz(i6 << 3);
                        iZzz10 = zzrrVar2.zzd();
                        iZzz11 = zzsc.zzz(iZzz10);
                        iM51028p += iZzz11 + iZzz10 + iZze;
                    }
                    break;
                case 62:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(zzp(obj, j), zzsc.zzz(i6 << 3), iM51028p);
                    }
                    break;
                case 63:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        long jZzp2 = zzp(obj, j);
                        iZzz12 = zzsc.zzz(i6 << 3);
                        iZzA2 = zzsc.zzA(jZzp2);
                        iM51028p += iZzA2 + iZzz12;
                    }
                    break;
                case 64:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 4, iM51028p);
                    }
                    break;
                case 65:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p = ilf1.m51028p(i6 << 3, 8, iM51028p);
                    }
                    break;
                case 66:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        int iZzp = zzp(obj, j);
                        iM51028p = ilf1.m51028p((iZzp >> 31) ^ (iZzp + iZzp), zzsc.zzz(i6 << 3), iM51028p);
                    }
                    break;
                case 67:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        long jZzv3 = zzv(obj, j);
                        iZzz12 = zzsc.zzz(i6 << 3);
                        iZzA2 = zzsc.zzA((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iM51028p += iZzA2 + iZzz12;
                    }
                    break;
                case 68:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        iM51028p += zzsc.zzv(i6, (zzuf) unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        int iZzc = 0;
        int iZza3 = ((zzsz) obj).zzc.zza() + iM51028p;
        if (!zzuiVar.zzh) {
            return iZza3;
        }
        zzsp zzspVar = ((zzsv) obj).zzb;
        for (int i31 = 0; i31 < zzspVar.zza.zzb(); i31++) {
            Map.Entry entryZzg = zzspVar.zza.zzg(i31);
            iZzc += zzsp.zzc((zzso) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzspVar.zza.zzc()) {
            iZzc += zzsp.zzc((zzso) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzvm.zza(obj, j));
                    byte[] bArr = zzth.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzvm.zzb(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzvm.zzd(obj, j);
                    byte[] bArr2 = zzth.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzvm.zzd(obj, j);
                    byte[] bArr3 = zzth.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 4:
                    i = i4 * 53;
                    iZzc = zzvm.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzvm.zzd(obj, j);
                    byte[] bArr4 = zzth.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 6:
                    i = i4 * 53;
                    iZzc = zzvm.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzth.zza(zzvm.zzw(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzvm.zzf(obj, j)).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzvm.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzvm.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    iZzc = zzvm.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 12:
                    i = i4 * 53;
                    iZzc = zzvm.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 13:
                    i = i4 * 53;
                    iZzc = zzvm.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzvm.zzd(obj, j);
                    byte[] bArr5 = zzth.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 15:
                    i = i4 * 53;
                    iZzc = zzvm.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzvm.zzd(obj, j);
                    byte[] bArr6 = zzth.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzvm.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzvm.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzvm.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzth.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzth.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzth.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzth.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzth.zza(zzS(obj, j));
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzvm.zzf(obj, j)).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzvm.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzvm.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzth.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzth.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzvm.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzsz) obj).zzc.hashCode() + (i4 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzsv) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.meet_coactivities.zzrf r37) {
        /*
            Method dump skipped, instruction units count: 3598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.meet_coactivities.zzui.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.meet_coactivities.zzrf):int");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final Object zze() {
        return ((zzsz) this.zzg).zzD();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzsz) {
                zzsz zzszVar = (zzsz) obj;
                zzszVar.zzO(Alert.DURATION_SHOW_INDEFINITELY);
                zzszVar.zza = 0;
                zzszVar.zzM();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zztg) zzvm.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zztz) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzvm.zzo(obj, j, zzvm.zza(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzvm.zzp(obj, j, zzvm.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzvm.zzr(obj, j, zzvm.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzvm.zzr(obj, j, zzvm.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzvm.zzq(obj, j, zzvm.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzvm.zzr(obj, j, zzvm.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzvm.zzq(obj, j, zzvm.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzvm.zzm(obj, j, zzvm.zzw(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzvm.zzs(obj, j, zzvm.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzvm.zzs(obj, j, zzvm.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzvm.zzq(obj, j, zzvm.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzvm.zzq(obj, j, zzvm.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzvm.zzq(obj, j, zzvm.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzvm.zzr(obj, j, zzvm.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzvm.zzq(obj, j, zzvm.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzvm.zzr(obj, j, zzvm.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zztg zztgVarZzd = (zztg) zzvm.zzf(obj, j);
                    zztg zztgVar = (zztg) zzvm.zzf(obj2, j);
                    int size = zztgVarZzd.size();
                    int size2 = zztgVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zztgVarZzd.zzc()) {
                            zztgVarZzd = zztgVarZzd.zzd(size2 + size);
                        }
                        zztgVarZzd.addAll(zztgVar);
                    }
                    if (size > 0) {
                        zztgVar = zztgVarZzd;
                    }
                    zzvm.zzs(obj, j, zztgVar);
                    break;
                case 50:
                    int i4 = zzut.zza;
                    zzvm.zzs(obj, j, zzua.zzb(zzvm.zzf(obj, j), zzvm.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    if (zzR(obj2, i3, i)) {
                        zzvm.zzs(obj, j, zzvm.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzvm.zzs(obj, j, zzvm.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzut.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzut.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0579 A[LOOP:1: B:172:0x0575->B:174:0x0579, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x058b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0593  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a9 A[LOOP:2: B:188:0x05a5->B:190:0x05a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:202:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzh(Object obj, zzuq zzuqVar, zzsk zzskVar) throws Throwable {
        zzui<T> zzuiVar;
        Object obj2;
        Throwable th;
        int i;
        Object objZzy;
        Object objZzy2;
        Object obj3;
        zzui<T> zzuiVar2;
        int i2;
        zzskVar.getClass();
        zzD(obj);
        zzvf zzvfVar = this.zzm;
        Object objZza = null;
        while (true) {
            try {
                int iZzc = zzuqVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj3 = obj;
                    zzuiVar2 = this;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            try {
                                switch (zzt(iZzu)) {
                                    case 0:
                                        obj2 = obj3;
                                        zzvm.zzo(obj2, iZzu & 1048575, zzuqVar.zza());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        zzvm.zzp(obj2, iZzu & 1048575, zzuqVar.zzb());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        zzvm.zzr(obj2, iZzu & 1048575, zzuqVar.zzl());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        zzvm.zzr(obj2, iZzu & 1048575, zzuqVar.zzo());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        zzvm.zzq(obj2, iZzu & 1048575, zzuqVar.zzg());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        zzvm.zzr(obj2, iZzu & 1048575, zzuqVar.zzk());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        zzvm.zzq(obj2, iZzu & 1048575, zzuqVar.zzf());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        zzvm.zzm(obj2, iZzu & 1048575, zzuqVar.zzO());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        zzG(obj2, iZzu, zzuqVar);
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zzuf zzufVar = (zzuf) zzA(obj2, iZzq);
                                        zzuqVar.zzu(zzufVar, zzx(iZzq), zzskVar);
                                        zzJ(obj2, iZzq, zzufVar);
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        zzvm.zzs(obj2, iZzu & 1048575, zzuqVar.zzp());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        zzvm.zzq(obj2, iZzu & 1048575, zzuqVar.zzj());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZze = zzuqVar.zze();
                                        zztc zztcVarZzw = zzw(iZzq);
                                        if (zztcVarZzw == null || zztcVarZzw.zza()) {
                                            zzvm.zzq(obj2, iZzu & 1048575, iZze);
                                            zzH(obj2, iZzq);
                                        } else {
                                            objZza = zzut.zzo(obj2, iZzc, iZze, objZza, zzvfVar);
                                        }
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        zzvm.zzq(obj2, iZzu & 1048575, zzuqVar.zzh());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        zzvm.zzr(obj2, iZzu & 1048575, zzuqVar.zzm());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        zzvm.zzq(obj2, iZzu & 1048575, zzuqVar.zzi());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        zzvm.zzr(obj2, iZzu & 1048575, zzuqVar.zzn());
                                        zzH(obj2, iZzq);
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zzuf zzufVar2 = (zzuf) zzA(obj2, iZzq);
                                        zzuqVar.zzt(zzufVar2, zzx(iZzq), zzskVar);
                                        zzJ(obj2, iZzq, zzufVar2);
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        zzuqVar.zzx(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        zzuqVar.zzB(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        zzuqVar.zzE(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        zzuqVar.zzN(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        zzuqVar.zzD(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        zzuqVar.zzA(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        zzuqVar.zzz(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        zzuqVar.zzv(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        if (zzM(iZzu)) {
                                            ((zzry) zzuqVar).zzL(zztr.zza(obj2, iZzu & 1048575), true);
                                        } else {
                                            ((zzry) zzuqVar).zzL(zztr.zza(obj2, iZzu & 1048575), false);
                                        }
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        zzuqVar.zzG(zztr.zza(obj2, iZzu & 1048575), zzx(iZzq), zzskVar);
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        zzuqVar.zzw(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        zzuqVar.zzM(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listZza = zztr.zza(obj3, iZzu & 1048575);
                                        zzuqVar.zzy(listZza);
                                        objZza = zzut.zzn(obj3, iZzc, listZza, zzw(iZzq), objZza, zzvfVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        zzuqVar.zzH(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        zzuqVar.zzI(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        zzuqVar.zzJ(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        zzuqVar.zzK(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        zzuqVar.zzx(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        zzuqVar.zzB(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        zzuqVar.zzE(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        zzuqVar.zzN(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        zzuqVar.zzD(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        zzuqVar.zzA(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        zzuqVar.zzz(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        zzuqVar.zzv(zztr.zza(obj2, iZzu & 1048575));
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            zzuqVar.zzM(zztr.zza(obj2, iZzu & 1048575));
                                            break;
                                        } catch (zzti unused) {
                                            if (objZza == null) {
                                                try {
                                                    objZza = zzvfVar.zza(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    zzuiVar = zzuiVar2;
                                                    i = zzuiVar.zzk;
                                                    objZzy = objZza;
                                                    while (i < zzuiVar.zzl) {
                                                        zzvf zzvfVar2 = zzvfVar;
                                                        objZzy = zzuiVar.zzy(obj2, zzuiVar.zzj[i], objZzy, zzvfVar2, obj2);
                                                        i++;
                                                        zzuiVar = this;
                                                        zzvfVar = zzvfVar2;
                                                    }
                                                    if (objZzy != null) {
                                                        throw th;
                                                    }
                                                    ((zzsz) obj2).zzc = (zzvg) objZzy;
                                                    throw th;
                                                }
                                            }
                                            try {
                                                if (!zzvfVar.zzj(objZza, zzuqVar)) {
                                                    objZzy2 = objZza;
                                                    for (i2 = zzuiVar2.zzk; i2 < zzuiVar2.zzl; i2++) {
                                                        zzvf zzvfVar3 = zzvfVar;
                                                        objZzy2 = zzuiVar2.zzy(obj2, zzuiVar2.zzj[i2], objZzy2, zzvfVar3, obj2);
                                                        zzvfVar = zzvfVar3;
                                                    }
                                                    if (objZzy2 != null) {
                                                        ((zzsz) obj2).zzc = (zzvg) objZzy2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzuiVar = zzuiVar2;
                                                th = th;
                                                i = zzuiVar.zzk;
                                                objZzy = objZza;
                                                while (i < zzuiVar.zzl) {
                                                    zzvf zzvfVar4 = zzvfVar;
                                                    objZzy = zzuiVar.zzy(obj2, zzuiVar.zzj[i], objZzy, zzvfVar4, obj2);
                                                    i++;
                                                    zzuiVar = this;
                                                    zzvfVar = zzvfVar4;
                                                }
                                                if (objZzy != null) {
                                                    throw th;
                                                }
                                                ((zzsz) obj2).zzc = (zzvg) objZzy;
                                                throw th;
                                            }
                                        }
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listZza2 = zztr.zza(obj3, iZzu & 1048575);
                                        zzuqVar.zzy(listZza2);
                                        try {
                                            objZza = zzut.zzn(obj3, iZzc, listZza2, zzw(iZzq), objZza, zzvfVar);
                                            obj2 = obj3;
                                        } catch (zzti unused2) {
                                            obj2 = obj3;
                                            if (objZza == null) {
                                                objZza = zzvfVar.zza(obj2);
                                            }
                                            if (!zzvfVar.zzj(objZza, zzuqVar)) {
                                                objZzy2 = objZza;
                                                while (i2 < zzuiVar2.zzl) {
                                                    zzvf zzvfVar5 = zzvfVar;
                                                    objZzy2 = zzuiVar2.zzy(obj2, zzuiVar2.zzj[i2], objZzy2, zzvfVar5, obj2);
                                                    zzvfVar = zzvfVar5;
                                                }
                                                if (objZzy2 != null) {
                                                    ((zzsz) obj2).zzc = (zzvg) objZzy2;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj3;
                                            th = th;
                                            zzuiVar = zzuiVar2;
                                            i = zzuiVar.zzk;
                                            objZzy = objZza;
                                            while (i < zzuiVar.zzl) {
                                                zzvf zzvfVar6 = zzvfVar;
                                                objZzy = zzuiVar.zzy(obj2, zzuiVar.zzj[i], objZzy, zzvfVar6, obj2);
                                                i++;
                                                zzuiVar = this;
                                                zzvfVar = zzvfVar6;
                                            }
                                            if (objZzy != null) {
                                                throw th;
                                            }
                                            ((zzsz) obj2).zzc = (zzvg) objZzy;
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 45:
                                        zzuqVar.zzH(zztr.zza(obj3, iZzu & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 46:
                                        zzuqVar.zzI(zztr.zza(obj3, iZzu & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 47:
                                        zzuqVar.zzJ(zztr.zza(obj3, iZzu & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        zzuqVar.zzK(zztr.zza(obj3, iZzu & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        zzuqVar.zzC(zztr.zza(obj3, iZzu & 1048575), zzx(iZzq), zzskVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objZzz = zzz(iZzq);
                                        long jZzu = zzu(iZzq) & 1048575;
                                        Object objZzf = zzvm.zzf(obj3, jZzu);
                                        if (objZzf == null) {
                                            objZzf = zztz.zza().zzb();
                                            zzvm.zzs(obj3, jZzu, objZzf);
                                        } else if (zzua.zza(objZzf)) {
                                            Object objZzb = zztz.zza().zzb();
                                            zzua.zzb(objZzb, objZzf);
                                            zzvm.zzs(obj3, jZzu, objZzb);
                                            objZzf = objZzb;
                                        }
                                        zzuqVar.zzF((zztz) objZzf, ((zzty) objZzz).zzc(), zzskVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 51:
                                        zzvm.zzs(obj3, iZzu & 1048575, Double.valueOf(zzuqVar.zza()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        zzvm.zzs(obj3, iZzu & 1048575, Float.valueOf(zzuqVar.zzb()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        zzvm.zzs(obj3, iZzu & 1048575, Long.valueOf(zzuqVar.zzl()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        zzvm.zzs(obj3, iZzu & 1048575, Long.valueOf(zzuqVar.zzo()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        zzvm.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzuqVar.zzg()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 56:
                                        zzvm.zzs(obj3, iZzu & 1048575, Long.valueOf(zzuqVar.zzk()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 57:
                                        zzvm.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzuqVar.zzf()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 58:
                                        zzvm.zzs(obj3, iZzu & 1048575, Boolean.valueOf(zzuqVar.zzO()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        zzG(obj3, iZzu, zzuqVar);
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        zzuf zzufVar3 = (zzuf) zzB(obj3, iZzc, iZzq);
                                        zzuqVar.zzu(zzufVar3, zzx(iZzq), zzskVar);
                                        zzK(obj3, iZzc, iZzq, zzufVar3);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 61:
                                        zzvm.zzs(obj3, iZzu & 1048575, zzuqVar.zzp());
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 62:
                                        zzvm.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzuqVar.zzj()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 63:
                                        int iZze2 = zzuqVar.zze();
                                        zztc zztcVarZzw2 = zzw(iZzq);
                                        if (zztcVarZzw2 != null && !zztcVarZzw2.zza()) {
                                            objZza = zzut.zzo(obj3, iZzc, iZze2, objZza, zzvfVar);
                                            obj = obj3;
                                        }
                                        zzvm.zzs(obj3, iZzu & 1048575, Integer.valueOf(iZze2));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        zzvm.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzuqVar.zzh()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        zzvm.zzs(obj3, iZzu & 1048575, Long.valueOf(zzuqVar.zzm()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 66:
                                        zzvm.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzuqVar.zzi()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 67:
                                        zzvm.zzs(obj3, iZzu & 1048575, Long.valueOf(zzuqVar.zzn()));
                                        zzI(obj3, iZzc, iZzq);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 68:
                                        zzuf zzufVar4 = (zzuf) zzB(obj3, iZzc, iZzq);
                                        zzuqVar.zzt(zzufVar4, zzx(iZzq), zzskVar);
                                        zzK(obj3, iZzc, iZzq, zzufVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objZza == null) {
                                            try {
                                                objZza = zzvfVar.zza(obj3);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                zzuiVar = zzuiVar2;
                                                obj2 = obj3;
                                                i = zzuiVar.zzk;
                                                objZzy = objZza;
                                                while (i < zzuiVar.zzl) {
                                                    zzvf zzvfVar7 = zzvfVar;
                                                    objZzy = zzuiVar.zzy(obj2, zzuiVar.zzj[i], objZzy, zzvfVar7, obj2);
                                                    i++;
                                                    zzuiVar = this;
                                                    zzvfVar = zzvfVar7;
                                                }
                                                if (objZzy != null) {
                                                    throw th;
                                                }
                                                ((zzsz) obj2).zzc = (zzvg) objZzy;
                                                throw th;
                                            }
                                        }
                                        if (!zzvfVar.zzj(objZza, zzuqVar)) {
                                            objZzy2 = objZza;
                                            for (int i3 = zzuiVar2.zzk; i3 < zzuiVar2.zzl; i3++) {
                                                zzvf zzvfVar8 = zzvfVar;
                                                Object obj4 = obj3;
                                                objZzy2 = zzuiVar2.zzy(obj4, zzuiVar2.zzj[i3], objZzy2, zzvfVar8, obj3);
                                                obj3 = obj4;
                                                zzvfVar = zzvfVar8;
                                            }
                                            obj2 = obj3;
                                        }
                                        obj = obj3;
                                        break;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj3;
                            }
                        } catch (zzti unused3) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        zzuiVar = zzuiVar2;
                        obj2 = obj3;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    objZzy2 = objZza;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzvf zzvfVar9 = zzvfVar;
                        objZzy2 = zzy(obj, this.zzj[i4], objZzy2, zzvfVar9, obj);
                        zzvfVar = zzvfVar9;
                    }
                    obj2 = obj;
                } else {
                    zzuiVar = this;
                    try {
                        if ((!zzuiVar.zzh ? null : zzskVar.zzb(zzuiVar.zzg, iZzc)) != null) {
                            obj3 = obj;
                            zzuiVar2 = zzuiVar;
                            throw null;
                        }
                        if (objZza == null) {
                            try {
                                objZza = zzvfVar.zza(obj);
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = obj;
                                i = zzuiVar.zzk;
                                objZzy = objZza;
                                while (i < zzuiVar.zzl) {
                                    zzvf zzvfVar10 = zzvfVar;
                                    objZzy = zzuiVar.zzy(obj2, zzuiVar.zzj[i], objZzy, zzvfVar10, obj2);
                                    i++;
                                    zzuiVar = this;
                                    zzvfVar = zzvfVar10;
                                }
                                if (objZzy != null) {
                                    throw th;
                                }
                                ((zzsz) obj2).zzc = (zzvg) objZzy;
                                throw th;
                            }
                        }
                        if (zzvfVar.zzj(objZza, zzuqVar)) {
                            obj3 = obj;
                            obj = obj3;
                        } else {
                            int i5 = zzuiVar.zzk;
                            objZzy2 = objZza;
                            while (i5 < zzuiVar.zzl) {
                                zzvf zzvfVar11 = zzvfVar;
                                Object obj5 = obj;
                                objZzy2 = zzuiVar.zzy(obj5, zzuiVar.zzj[i5], objZzy2, zzvfVar11, obj);
                                zzvfVar = zzvfVar11;
                                i5++;
                                obj = obj5;
                            }
                            obj3 = obj;
                            obj2 = obj3;
                        }
                    } catch (Throwable th9) {
                        obj3 = obj;
                        th = th9;
                        obj2 = obj3;
                        i = zzuiVar.zzk;
                        objZzy = objZza;
                        while (i < zzuiVar.zzl) {
                            zzvf zzvfVar12 = zzvfVar;
                            objZzy = zzuiVar.zzy(obj2, zzuiVar.zzj[i], objZzy, zzvfVar12, obj2);
                            i++;
                            zzuiVar = this;
                            zzvfVar = zzvfVar12;
                        }
                        if (objZzy != null) {
                            throw th;
                        }
                        ((zzsz) obj2).zzc = (zzvg) objZzy;
                        throw th;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                zzuiVar = this;
                obj2 = obj;
            }
        }
        if (objZzy2 != null) {
            ((zzsz) obj2).zzc = (zzvg) objZzy2;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzrf zzrfVar) {
        zzc(obj, bArr, i, i2, 0, zzrfVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final void zzj(Object obj, zzvs zzvsVar) {
        Map.Entry entry;
        int i;
        zzui<T> zzuiVar = this;
        if (zzuiVar.zzh) {
            zzsp zzspVar = ((zzsv) obj).zzb;
            if (zzspVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzspVar.zzf().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzuiVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iZzu = zzuiVar.zzu(i4);
            int[] iArr2 = zzuiVar.zzc;
            int iZzt = zzt(iZzu);
            int i6 = iArr2[i4];
            if (iZzt <= 17) {
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iZzu & i2;
            switch (iZzt) {
                case 0:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzf(i6, zzvm.zza(obj, j));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 1:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzo(i6, zzvm.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 2:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 3:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzL(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 4:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 5:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 6:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 7:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzb(i6, zzvm.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 8:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzU(i6, unsafe.getObject(obj, j), zzvsVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 9:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzw(i6, unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 10:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzd(i6, (zzrr) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 11:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzJ(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 12:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 13:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzy(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 14:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzA(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 15:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzC(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 16:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzE(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 17:
                    if (zzuiVar.zzO(obj, i4, i3, i5, i)) {
                        zzvsVar.zzq(i6, unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 18:
                    zzut.zzs(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 19:
                    zzut.zzw(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 20:
                    zzut.zzy(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 21:
                    zzut.zzE(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 22:
                    zzut.zzx(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 23:
                    zzut.zzv(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 24:
                    zzut.zzu(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 25:
                    zzut.zzr(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 26:
                    int i9 = zzuiVar.zzc[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zzut.zza;
                    if (list != null && !list.isEmpty()) {
                        zzvsVar.zzI(i9, list);
                    }
                    break;
                case 27:
                    int i11 = zzuiVar.zzc[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzur zzurVarZzx = zzuiVar.zzx(i4);
                    int i12 = zzut.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzsd) zzvsVar).zzw(i11, list2.get(i13), zzurVarZzx);
                        }
                    }
                    break;
                case 28:
                    int i14 = zzuiVar.zzc[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzut.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzvsVar.zze(i14, list3);
                    }
                    break;
                case 29:
                    zzut.zzD(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 30:
                    zzut.zzt(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 31:
                    zzut.zzz(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 32:
                    zzut.zzA(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 33:
                    zzut.zzB(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 34:
                    zzut.zzC(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzuiVar = this;
                    break;
                case 35:
                    zzut.zzs(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 36:
                    zzut.zzw(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 37:
                    zzut.zzy(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 38:
                    zzut.zzE(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 39:
                    zzut.zzx(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 40:
                    zzut.zzv(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 41:
                    zzut.zzu(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 42:
                    zzut.zzr(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 43:
                    zzut.zzD(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 44:
                    zzut.zzt(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 45:
                    zzut.zzz(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 46:
                    zzut.zzA(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 47:
                    zzut.zzB(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 48:
                    zzut.zzC(zzuiVar.zzc[i4], (List) unsafe.getObject(obj, j), zzvsVar, true);
                    break;
                case 49:
                    int i16 = zzuiVar.zzc[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzur zzurVarZzx2 = zzuiVar.zzx(i4);
                    int i17 = zzut.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zzsd) zzvsVar).zzq(i16, list4.get(i18), zzurVarZzx2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        zzvsVar.zzv(i6, ((zzty) zzuiVar.zzz(i4)).zzc(), (zztz) object);
                    }
                    break;
                case 51:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzt(i6, zzv(obj, j));
                    }
                    break;
                case 54:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzL(i6, zzv(obj, j));
                    }
                    break;
                case 55:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzr(i6, zzp(obj, j));
                    }
                    break;
                case 56:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzm(i6, zzv(obj, j));
                    }
                    break;
                case 57:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzk(i6, zzp(obj, j));
                    }
                    break;
                case 58:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzb(i6, zzS(obj, j));
                    }
                    break;
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzU(i6, unsafe.getObject(obj, j), zzvsVar);
                    }
                    break;
                case 60:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzw(i6, unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                    }
                    break;
                case 61:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzd(i6, (zzrr) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzJ(i6, zzp(obj, j));
                    }
                    break;
                case 63:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzi(i6, zzp(obj, j));
                    }
                    break;
                case 64:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzy(i6, zzp(obj, j));
                    }
                    break;
                case 65:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzA(i6, zzv(obj, j));
                    }
                    break;
                case 66:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzC(i6, zzp(obj, j));
                    }
                    break;
                case 67:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzE(i6, zzv(obj, j));
                    }
                    break;
                case 68:
                    if (zzuiVar.zzR(obj, i6, i4)) {
                        zzvsVar.zzq(i6, unsafe.getObject(obj, j), zzuiVar.zzx(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            zzuiVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzsz) obj).zzc.zzl(zzvsVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzvm.zza(obj, j)) != Double.doubleToLongBits(zzvm.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzvm.zzb(obj, j)) != Float.floatToIntBits(zzvm.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzvm.zzd(obj, j) != zzvm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzvm.zzd(obj, j) != zzvm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzvm.zzc(obj, j) != zzvm.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzvm.zzd(obj, j) != zzvm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzvm.zzc(obj, j) != zzvm.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzvm.zzw(obj, j) != zzvm.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzvm.zzc(obj, j) != zzvm.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzvm.zzc(obj, j) != zzvm.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzvm.zzc(obj, j) != zzvm.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzvm.zzd(obj, j) != zzvm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzvm.zzc(obj, j) != zzvm.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzvm.zzd(obj, j) != zzvm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzF = zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzr = zzr(i) & 1048575;
                    if (zzvm.zzc(obj, jZzr) != zzvm.zzc(obj2, jZzr) || !zzut.zzF(zzvm.zzf(obj, j), zzvm.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zzsz) obj).zzc.equals(((zzsz) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzsv) obj).zzb.equals(((zzsv) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzur
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzur zzurVarZzx;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iZzu = zzu(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i7, i, i2, i11) && !zzP(obj2, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzvm.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzurVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzurVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i8, i7) && !zzP(obj2, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzvm.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzurVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzurVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt != 50) {
                continue;
            } else {
                zztz zztzVar = (zztz) zzvm.zzf(obj2, iZzu & 1048575);
                if (!zztzVar.isEmpty() && ((zzty) zzz(i7)).zzc().zzc.zzb() == zzvr.MESSAGE) {
                    zzur zzurVarZzb = null;
                    for (Object obj3 : zztzVar.values()) {
                        if (zzurVarZzb == null) {
                            zzurVarZzb = zzun.zza().zzb(obj3.getClass());
                        }
                        if (!zzurVarZzb.zzl(obj3)) {
                            return false;
                        }
                    }
                }
            }
            i4++;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.zzh || ((zzsv) obj).zzb.zzj();
    }
}
