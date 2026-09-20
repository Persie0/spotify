package com.google.android.gms.internal.meet_coactivities;

import androidx.car.app.model.Alert;
import com.google.android.gms.internal.meet_coactivities.zzst;
import com.google.android.gms.internal.meet_coactivities.zzsz;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzsz<MessageType extends zzsz<MessageType, BuilderType>, BuilderType extends zzst<MessageType, BuilderType>> extends zzra<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public static final /* synthetic */ int zzd = 0;
    private int zze = -1;
    protected zzvg zzc = zzvg.zzc();

    public static zzsz zzC(Class cls) {
        Map map = zzb;
        zzsz zzszVar = (zzsz) map.get(cls);
        if (zzszVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzszVar = (zzsz) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzszVar != null) {
            return zzszVar;
        }
        zzsz zzszVar2 = (zzsz) ((zzsz) zzvm.zze(cls)).zzi(6, null, null);
        if (zzszVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzszVar2);
        return zzszVar2;
    }

    public static zzsz zzE(zzsz zzszVar, byte[] bArr, zzsk zzskVar) throws zztj {
        zzsz zzszVarZzd = zzd(zzszVar, bArr, 0, bArr.length, zzskVar);
        if (zzszVarZzd == null || zzP(zzszVarZzd, true)) {
            return zzszVarZzd;
        }
        throw new zzve(zzszVarZzd).zza();
    }

    public static zztd zzF() {
        return zzta.zzf();
    }

    public static zztg zzG() {
        return zzuo.zze();
    }

    public static zztg zzH(zztg zztgVar) {
        int size = zztgVar.size();
        return zztgVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzJ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzK(zzuf zzufVar, String str, Object[] objArr) {
        return new zzup(zzufVar, str, objArr);
    }

    public static void zzN(Class cls, zzsz zzszVar) {
        zzszVar.zzM();
        zzb.put(cls, zzszVar);
    }

    public static final boolean zzP(zzsz zzszVar, boolean z) {
        byte bByteValue = ((Byte) zzszVar.zzi(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzun.zza().zzb(zzszVar.getClass()).zzl(zzszVar);
        if (z) {
            zzszVar.zzi(2, true != zZzl ? null : zzszVar, null);
        }
        return zZzl;
    }

    private final int zzc(zzur zzurVar) {
        return zzun.zza().zzb(getClass()).zza(this);
    }

    private static zzsz zzd(zzsz zzszVar, byte[] bArr, int i, int i2, zzsk zzskVar) throws zztj {
        if (i2 == 0) {
            return zzszVar;
        }
        zzsz zzszVarZzD = zzszVar.zzD();
        try {
            zzur zzurVarZzb = zzun.zza().zzb(zzszVarZzD.getClass());
            zzurVarZzb.zzi(zzszVarZzD, bArr, 0, i2, new zzrf(zzskVar));
            zzurVarZzb.zzf(zzszVarZzD);
            return zzszVarZzD;
        } catch (zztj e) {
            if (e.zzk()) {
                throw new zztj(e);
            }
            throw e;
        } catch (zzve e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zztj) {
                throw ((zztj) e3.getCause());
            }
            throw new zztj(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zztj.zzi();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzun.zza().zzb(getClass()).zzk(this, (zzsz) obj);
    }

    public final int hashCode() {
        if (zzQ()) {
            return zzy();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzy = zzy();
        this.zza = iZzy;
        return iZzy;
    }

    public final String toString() {
        return zzuh.zza(this, super.toString());
    }

    public final zzst zzA() {
        return (zzst) zzi(5, null, null);
    }

    public final zzst zzB() {
        zzst zzstVar = (zzst) zzi(5, null, null);
        zzstVar.zzj(this);
        return zzstVar;
    }

    public final zzsz zzD() {
        return (zzsz) zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuf
    public final zzum zzI() {
        return (zzum) zzi(7, null, null);
    }

    public final void zzL() {
        zzun.zza().zzb(getClass()).zzf(this);
        zzM();
    }

    public final void zzM() {
        this.zze &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final void zzO(int i) {
        this.zze = (this.zze & Integer.MIN_VALUE) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final boolean zzQ() {
        return (this.zze & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuf
    public final /* synthetic */ zzue zzR() {
        return (zzst) zzi(5, null, null);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuf
    public final void zzS(zzsc zzscVar) {
        zzun.zza().zzb(getClass()).zzj(this, zzsd.zza(zzscVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzug
    public final /* synthetic */ zzuf zzT() {
        return (zzsz) zzi(6, null, null);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzug
    public final boolean zzU() {
        return zzP(this, true);
    }

    public abstract Object zzi(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.meet_coactivities.zzra
    public final int zzv(zzur zzurVar) {
        if (zzQ()) {
            int iZza = zzurVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(s571.m77246e(iZza, "serialized size must be non-negative, was "));
        }
        int i = this.zze & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzurVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(s571.m77246e(iZza2, "serialized size must be non-negative, was "));
        }
        this.zze = (this.zze & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    public final int zzy() {
        return zzun.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuf
    public final int zzz() {
        if (zzQ()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(s571.m77246e(iZzc, "serialized size must be non-negative, was "));
        }
        int i = this.zze & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 < 0) {
            throw new IllegalStateException(s571.m77246e(iZzc2, "serialized size must be non-negative, was "));
        }
        this.zze = (this.zze & Integer.MIN_VALUE) | iZzc2;
        return iZzc2;
    }
}
