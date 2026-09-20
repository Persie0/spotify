package com.google.android.gms.internal.meet_coactivities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Formattable;
import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmh extends zzpe implements zzpa {
    protected final Object[] zza;
    protected final StringBuilder zzb;
    private int zzc;

    public zzmh(zznu zznuVar, Object[] objArr, StringBuilder sb) {
        super(zznuVar);
        this.zzc = 0;
        zzpj.zza(objArr, "arguments");
        this.zza = objArr;
        this.zzb = sb;
    }

    public static StringBuilder zzb(zzmm zzmmVar, StringBuilder sb) {
        Object obj;
        Object objZzj;
        if (zzmmVar.zzj() != null) {
            zzmh zzmhVar = new zzmh(zzmmVar.zzj(), zzmmVar.zzw(), sb);
            objZzj = zzmhVar.zzj();
            if (zzmmVar.zzw().length > zzmhVar.zzh()) {
                obj = objZzj;
                StringBuilder sb2 = (StringBuilder) objZzj;
                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                return sb2;
            }
        } else {
            sb.append(zzmq.zza(zzmmVar.zzk()));
            obj = sb;
        }
        obj = objZzj;
        return (StringBuilder) obj;
    }

    private static void zzm(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(zzmq.zza(obj));
        sb.append("]");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpe
    public final /* bridge */ /* synthetic */ Object zza() {
        zzi().zzb(this.zzb, zzk(), this.zzc, zzk().length());
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpe
    public final void zzc(int i, int i2, zzoz zzozVar) {
        zzi().zzb(this.zzb, zzk(), this.zzc, i);
        zzozVar.zze(this, this.zza);
        this.zzc = i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    @Override // com.google.android.gms.internal.meet_coactivities.zzpa
    public final void zzd(Object obj, zzmi zzmiVar, zzmj zzmjVar) {
        boolean zIsValidCodePoint;
        int iOrdinal = zzmiVar.zzd().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                zzm(this.zzb, obj, zzmiVar.zze());
                return;
            }
        }
        StringBuilder sb = this.zzb;
        int iOrdinal2 = zzmiVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (zzmjVar.zzj()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5 && zzmjVar.zze(128, false, false).equals(zzmjVar)) {
                        zzmq.zzb(sb, (Number) obj, zzmjVar);
                        return;
                    }
                } else if (zzmjVar.zzj()) {
                    sb.append(obj);
                    return;
                }
            } else if (zzmjVar.zzj()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else if (obj instanceof Formattable) {
            zzmq.zzc((Formattable) obj, sb, zzmjVar);
            return;
        } else if (zzmjVar.zzj()) {
            sb.append(zzmq.zza(obj));
            return;
        }
        String strZze = zzmiVar.zze();
        if (!zzmjVar.zzj()) {
            int iZza = zzmiVar.zza();
            if (zzmjVar.zzk()) {
                iZza &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            zzmjVar.zzh(sb2);
            sb2.append((char) iZza);
            strZze = sb2.toString();
        }
        sb.append(String.format(zzmq.zza, strZze, obj));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpa
    public final void zze(Object obj, zzox zzoxVar, zzmj zzmjVar) {
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            zzm(this.zzb, obj, dq60.m36612l("%t", zzoxVar.zza()));
            return;
        }
        StringBuilder sb = new StringBuilder("%");
        zzmjVar.zzh(sb);
        sb.append(true != zzmjVar.zzk() ? 't' : 'T');
        sb.append(zzoxVar.zza());
        this.zzb.append(String.format(zzmq.zza, sb.toString(), obj));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpa
    public final void zzf() {
        this.zzb.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpa
    public final void zzg() {
        this.zzb.append("null");
    }
}
