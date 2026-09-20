package com.google.android.gms.internal.meet_coactivities;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzacn implements IBinder.DeathRecipient, zzacw {
    protected zzvz zzd;
    protected zzabe zze;
    private final zzalf zzg;
    private final ScheduledExecutorService zzh;
    private final zzyj zzi;
    private zzade zzl;
    private long zzo;
    private static final Logger zzf = Logger.getLogger(zzacn.class.getName());
    public static final zzvx zza = zzvx.zza("internal:remote-uid");
    public static final zzvx zzb = zzvx.zza("internal:inbound-parcelable-policy");
    private final LinkedHashSet zzk = new LinkedHashSet();
    private int zzp = 1;
    private final zzacx zzj = new zzacx(this);
    protected final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final zzacq zzm = new zzacq(131072);
    private final AtomicLong zzn = new AtomicLong();

    public /* synthetic */ zzacn(zzalf zzalfVar, zzvz zzvzVar, zzada zzadaVar, zzyj zzyjVar, zzacm zzacmVar) {
        this.zzg = zzalfVar;
        this.zzd = zzvzVar;
        this.zzi = zzyjVar;
        this.zzh = (ScheduledExecutorService) zzalfVar.zza();
    }

    private static zzabe zza(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? zzabe.zzk.zzd(remoteException) : zzabe.zzj.zzd(remoteException);
    }

    private final void zzb() {
        zzade zzadeVar = this.zzl;
        if (zzadeVar != null) {
            try {
                zzadeVar.zza.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                zzadi zzadiVarZzc = zzadi.zzc();
                try {
                    zzadiVarZzc.zza().writeInt(0);
                    this.zzl.zza(2, zzadiVarZzc);
                    zzadiVarZzc.close();
                } catch (Throwable th) {
                    try {
                        zzadiVarZzc.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        zzs(zzabe.zzk.zze("binderDied"), true);
    }

    public final zzyj zzc() {
        return this.zzi;
    }

    public void zzf(Parcel parcel) {
    }

    public void zzg(Parcel parcel) {
    }

    public abstract void zzj(zzabe zzabeVar);

    public abstract void zzk();

    public void zzl() {
        this.zzg.zzb(this.zzh);
    }

    public void zzn(zzacv zzacvVar) {
        throw null;
    }

    public final synchronized zzvz zzo() {
        return this.zzd;
    }

    public final void zzp(int i, zzabe zzabeVar) {
        try {
            zzadi zzadiVarZzc = zzadi.zzc();
            try {
                zzadiVarZzc.zza().writeInt(0);
                Parcel parcelZza = zzadiVarZzc.zza();
                int iZza = zzabeVar.zza().zza() << 16;
                String strZzg = zzabeVar.zzg();
                if (strZzg != null && strZzg.length() > 1000) {
                    strZzg = strZzg.substring(0, 1000);
                }
                if (strZzg != null) {
                    iZza |= 32;
                    parcelZza.writeString(strZzg);
                }
                zzadq.zzb(zzadiVarZzc.zza(), iZza | 8);
                zzr(i, zzadiVarZzc);
                zzadiVarZzc.close();
            } catch (Throwable th) {
                try {
                    zzadiVarZzc.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (zzabf e) {
            zzf.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
        }
    }

    public final void zzq(zzade zzadeVar) {
        try {
            zzadi zzadiVarZzc = zzadi.zzc();
            try {
                zzadiVarZzc.zza().writeInt(1);
                zzadiVarZzc.zza().writeStrongBinder(this.zzj);
                zzadeVar.zza(1, zzadiVarZzc);
                zzadiVarZzc.close();
            } catch (Throwable th) {
                try {
                    zzadiVarZzc.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RemoteException e) {
            zzs(zza(e), true);
        }
    }

    public final void zzr(int i, zzadi zzadiVar) throws zzabf {
        int iDataSize = zzadiVar.zza().dataSize();
        try {
            this.zzl.zza(i, zzadiVar);
            if (this.zzm.zzc(iDataSize)) {
                zzf.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e) {
            throw new zzabf(zza(e), null);
        }
    }

    public final void zzs(final zzabe zzabeVar, boolean z) {
        if (!zzw()) {
            this.zze = zzabeVar;
            zzy(4);
            zzj(zzabeVar);
        }
        if (zzz(5)) {
            return;
        }
        if (z || this.zzc.isEmpty()) {
            this.zzj.zza();
            zzy(5);
            zzb();
            final ArrayList arrayList = new ArrayList(this.zzc.values());
            this.zzc.clear();
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzach
                @Override // java.lang.Runnable
                public final void run() {
                    zzabe zzabeVar2 = zzabeVar;
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        zzacv zzacvVar = (zzacv) arrayList2.get(i);
                        synchronized (zzacvVar) {
                            zzacvVar.zzg(zzabeVar2);
                        }
                    }
                    zzacn zzacnVar = this.zza;
                    zzacnVar.zzk();
                    zzacnVar.zzl();
                }
            });
        }
    }

    public final void zzt(int i) {
        if (this.zzc.remove(Integer.valueOf(i)) == null || !this.zzc.isEmpty()) {
            return;
        }
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzacg
            @Override // java.lang.Runnable
            public final void run() {
                zzacn zzacnVar = this.zza;
                synchronized (zzacnVar) {
                    try {
                        if (zzacnVar.zzz(4)) {
                            zzacnVar.zzs(zzacnVar.zze, true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacw
    public final boolean zzu(int i, Parcel parcel) {
        try {
            if (i < 1001) {
                synchronized (this) {
                    try {
                        if (i == 1) {
                            zzg(parcel);
                        } else if (i == 2) {
                            zzs(zzabe.zzk.zze("transport shutdown by peer"), true);
                        } else if (i == 3) {
                            if (this.zzm.zza(parcel.readLong())) {
                                zzf.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                                this.zzk.addAll(this.zzc.keySet());
                                Iterator it = this.zzk.iterator();
                                while (zzv() && it.hasNext()) {
                                    zzacv zzacvVar = (zzacv) this.zzc.get(it.next());
                                    it.remove();
                                    if (zzacvVar != null) {
                                        zzacvVar.zzm();
                                    }
                                }
                            }
                        } else if (i == 4) {
                            int i2 = parcel.readInt();
                            if (this.zzp == 3) {
                                try {
                                    zzadi zzadiVarZzc = zzadi.zzc();
                                    try {
                                        zzadiVarZzc.zza().writeInt(i2);
                                        this.zzl.zza(5, zzadiVarZzc);
                                        zzadiVarZzc.close();
                                    } catch (Throwable th) {
                                        try {
                                            zzadiVarZzc.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        } else {
                            if (i != 5) {
                                return false;
                            }
                            zzf(parcel);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                int iDataSize = parcel.dataSize();
                zzacv zzacvVar2 = (zzacv) this.zzc.get(Integer.valueOf(i));
                if (zzacvVar2 == null) {
                    synchronized (this) {
                    }
                    zzacvVar2 = null;
                }
                if (zzacvVar2 != null) {
                    zzacvVar2.zzj(parcel);
                }
                if (this.zzn.addAndGet(iDataSize) - this.zzo <= PlaybackStateCompat.ACTION_PREPARE) {
                    return true;
                }
                synchronized (this) {
                    zzade zzadeVar = this.zzl;
                    zzadeVar.getClass();
                    long j = this.zzn.get();
                    this.zzo = j;
                    try {
                        zzadi zzadiVarZzc2 = zzadi.zzc();
                        try {
                            zzadiVarZzc2.zza().writeLong(j);
                            zzadeVar.zza(3, zzadiVarZzc2);
                            zzadiVarZzc2.close();
                        } catch (Throwable th4) {
                            try {
                                zzadiVarZzc2.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (RemoteException e) {
                        zzs(zza(e), true);
                    }
                }
            }
            return true;
        } catch (RuntimeException e2) {
            zzf.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", s571.m77246e(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e2);
            synchronized (this) {
                zzs(zzabe.zzj.zzd(e2), true);
                return false;
            }
        }
    }

    public final boolean zzv() {
        return !this.zzm.zzb();
    }

    public final boolean zzw() {
        return zzz(4) || zzz(5);
    }

    public final boolean zzx(zzade zzadeVar) {
        this.zzl = zzadeVar;
        try {
            zzadeVar.zza.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void zzy(int i) {
        int i2 = this.zzp;
        int i3 = i - 1;
        if (i3 == 1) {
            c95.m31855u(i2 == 1);
        } else if (i3 == 2) {
            c95.m31855u(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            c95.m31855u(i2 == 4);
        } else {
            c95.m31855u(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.zzp = i;
    }

    public final boolean zzz(int i) {
        return this.zzp == i;
    }
}
