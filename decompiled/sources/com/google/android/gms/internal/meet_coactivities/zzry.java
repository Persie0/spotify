package com.google.android.gms.internal.meet_coactivities;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzry implements zzuq {
    private final zzrx zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzry(zzrx zzrxVar) {
        byte[] bArr = zzth.zzb;
        this.zza = zzrxVar;
        zzrxVar.zzd = this;
    }

    private final Object zzQ(zzvq zzvqVar, Class cls, zzsk zzskVar) throws zzti {
        zzvq zzvqVar2 = zzvq.zza;
        switch (zzvqVar.ordinal()) {
            case 0:
                return Double.valueOf(zza());
            case 1:
                return Float.valueOf(zzb());
            case 2:
                return Long.valueOf(zzl());
            case 3:
                return Long.valueOf(zzo());
            case 4:
                return Integer.valueOf(zzg());
            case 5:
                return Long.valueOf(zzk());
            case 6:
                return Integer.valueOf(zzf());
            case 7:
                return Boolean.valueOf(zzO());
            case 8:
                return zzs();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzV(2);
                return zzR(zzun.zza().zzb(cls), zzskVar);
            case 11:
                return zzp();
            case 12:
                return Integer.valueOf(zzj());
            case 13:
                return Integer.valueOf(zze());
            case 14:
                return Integer.valueOf(zzh());
            case 15:
                return Long.valueOf(zzm());
            case 16:
                return Integer.valueOf(zzi());
            case 17:
                return Long.valueOf(zzn());
        }
    }

    private final Object zzR(zzur zzurVar, zzsk zzskVar) throws zztj {
        Object objZze = zzurVar.zze();
        zzT(objZze, zzurVar, zzskVar);
        zzurVar.zzf(objZze);
        return objZze;
    }

    private final void zzS(Object obj, zzur zzurVar, zzsk zzskVar) {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzurVar.zzh(obj, this, zzskVar);
            if (this.zzb != this.zzc) {
                throw zztj.zzg();
            }
            this.zzc = i;
        } catch (Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final void zzT(Object obj, zzur zzurVar, zzsk zzskVar) throws zztj {
        zzrx zzrxVar = this.zza;
        int iZzn = zzrxVar.zzn();
        if (zzrxVar.zza >= zzrxVar.zzb) {
            throw new zztj("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = this.zza.zze(iZzn);
        this.zza.zza++;
        zzurVar.zzh(obj, this, zzskVar);
        this.zza.zzz(0);
        zzrx zzrxVar2 = this.zza;
        zzrxVar2.zza--;
        zzrxVar2.zzA(iZze);
    }

    private final void zzU(int i) throws zztj {
        if (this.zza.zzd() != i) {
            throw zztj.zzi();
        }
    }

    private final void zzV(int i) throws zzti {
        if ((this.zzb & 7) != i) {
            throw zztj.zza();
        }
    }

    private static final void zzW(int i) throws zztj {
        if ((i & 3) != 0) {
            throw zztj.zzg();
        }
    }

    private static final void zzX(int i) throws zztj {
        if ((i & 7) != 0) {
            throw zztj.zzg();
        }
    }

    public static zzry zzq(zzrx zzrxVar) {
        zzry zzryVar = zzrxVar.zzd;
        return zzryVar != null ? zzryVar : new zzry(zzrxVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzA(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zztt) {
            zztt zzttVar = (zztt) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zztj.zza();
                }
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzttVar.zzf(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzttVar.zzf(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzB(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzsr) {
            zzsr zzsrVar = (zzsr) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzW(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzsrVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zztj.zza();
            }
            do {
                zzsrVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzW(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zztj.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    @Deprecated
    public final void zzC(List list, zzur zzurVar, zzsk zzskVar) throws zzti {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zztj.zza();
        }
        do {
            Object objZze = zzurVar.zze();
            zzS(objZze, zzurVar, zzskVar);
            zzurVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzD(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzta) {
            zzta zztaVar = (zzta) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zztaVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zztaVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzE(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zztt) {
            zztt zzttVar = (zztt) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zzttVar.zzf(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zzttVar.zzf(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzF(Map map, zztx zztxVar, zzsk zzskVar) throws zzti {
        zzV(2);
        zzrx zzrxVar = this.zza;
        int iZze = zzrxVar.zze(zzrxVar.zzn());
        Object objZzQ = zztxVar.zzd;
        Object objZzQ2 = zztxVar.zzb;
        while (true) {
            try {
                int iZzc = zzc();
                if (iZzc == Integer.MAX_VALUE || this.zza.zzC()) {
                    break;
                }
                if (iZzc == 1) {
                    objZzQ2 = zzQ(zztxVar.zza, null, null);
                } else if (iZzc != 2) {
                    try {
                        if (!zzP()) {
                            throw new zztj("Unable to parse map entry.");
                        }
                    } catch (zzti unused) {
                        if (!zzP()) {
                            throw new zztj("Unable to parse map entry.");
                        }
                    }
                } else {
                    objZzQ = zzQ(zztxVar.zzc, zztxVar.zzd.getClass(), zzskVar);
                }
            } catch (Throwable th) {
                this.zza.zzA(iZze);
                throw th;
            }
        }
        map.put(objZzQ2, objZzQ);
        this.zza.zzA(iZze);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzG(List list, zzur zzurVar, zzsk zzskVar) throws zzti {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zztj.zza();
        }
        do {
            list.add(zzR(zzurVar, zzskVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzH(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzta) {
            zzta zztaVar = (zzta) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzW(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zztaVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zztj.zza();
            }
            do {
                zztaVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzW(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zztj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzI(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zztt) {
            zztt zzttVar = (zztt) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zztj.zza();
                }
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzttVar.zzf(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzttVar.zzf(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzJ(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzta) {
            zzta zztaVar = (zzta) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zztaVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zztaVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzK(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zztt) {
            zztt zzttVar = (zztt) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zzttVar.zzf(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zzttVar.zzf(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzL(List list, boolean z) throws zzti {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zztj.zza();
        }
        if ((list instanceof zztq) && !z) {
            zztq zztqVar = (zztq) list;
            do {
                zzp();
                zztqVar.zza();
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzM(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzta) {
            zzta zztaVar = (zzta) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zztaVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zztaVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzN(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zztt) {
            zztt zzttVar = (zztt) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zzttVar.zzf(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zzttVar.zzf(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final boolean zzO() throws zzti {
        zzV(0);
        return this.zza.zzD();
    }

    public final boolean zzP() {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final double zza() throws zzti {
        zzV(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final float zzb() throws zzti {
        zzV(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzc() {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        return (iZzm == 0 || iZzm == this.zzc) ? Alert.DURATION_SHOW_INDEFINITELY : iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zze() throws zzti {
        zzV(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzf() throws zzti {
        zzV(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzg() throws zzti {
        zzV(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzh() throws zzti {
        zzV(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzi() throws zzti {
        zzV(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final int zzj() throws zzti {
        zzV(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final long zzk() throws zzti {
        zzV(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final long zzl() throws zzti {
        zzV(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final long zzm() throws zzti {
        zzV(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final long zzn() throws zzti {
        zzV(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final long zzo() throws zzti {
        zzV(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final zzrr zzp() throws zzti {
        zzV(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final String zzr() throws zzti {
        zzV(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final String zzs() throws zzti {
        zzV(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzt(Object obj, zzur zzurVar, zzsk zzskVar) throws zzti {
        zzV(3);
        zzS(obj, zzurVar, zzskVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzu(Object obj, zzur zzurVar, zzsk zzskVar) throws zztj {
        zzV(2);
        zzT(obj, zzurVar, zzskVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzv(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzrh) {
            zzrh zzrhVar = (zzrh) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zzrhVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zzrhVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzw(List list) throws zzti {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zztj.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzx(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzse) {
            zzse zzseVar = (zzse) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zztj.zza();
                }
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzseVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzseVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzy(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzta) {
            zzta zztaVar = (zzta) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar = this.zza;
                int iZzd = zzrxVar.zzd() + zzrxVar.zzn();
                do {
                    zztaVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzU(iZzd);
                return;
            }
            do {
                zztaVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zztj.zza();
                }
                zzrx zzrxVar2 = this.zza;
                int iZzd2 = zzrxVar2.zzd() + zzrxVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzU(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuq
    public final void zzz(List list) throws zztj {
        int iZzm;
        int iZzm2;
        if (list instanceof zzta) {
            zzta zztaVar = (zzta) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzW(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zztaVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zztj.zza();
            }
            do {
                zztaVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzW(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zztj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}
