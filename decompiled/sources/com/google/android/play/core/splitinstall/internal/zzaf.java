package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ev61;
import p204p.r7l0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaf {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzu zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final com.google.android.play.core.splitinstall.zzak zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.zzx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzaf.zzj(this.zza);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "SplitInstallService";
    private final WeakReference zzj = new WeakReference(null);

    public zzaf(Context context, zzu zzuVar, String str, Intent intent, com.google.android.play.core.splitinstall.zzak zzakVar, zzaa zzaaVar) {
        this.zzb = context;
        this.zzc = zzuVar;
        this.zzi = intent;
        this.zzo = zzakVar;
    }

    public static /* synthetic */ void zzj(zzaf zzafVar) {
        zzafVar.zzc.zzd("reportBinderDeath", new Object[0]);
        zzaa zzaaVar = (zzaa) zzafVar.zzj.get();
        if (zzaaVar != null) {
            zzafVar.zzc.zzd("calling onBinderDied", new Object[0]);
            zzaaVar.zza();
        } else {
            zzafVar.zzc.zzd("%s : Binder has died.", zzafVar.zzd);
            Iterator it = zzafVar.zze.iterator();
            while (it.hasNext()) {
                ((zzv) it.next()).zzb(zzafVar.zzv());
            }
            zzafVar.zze.clear();
        }
        synchronized (zzafVar.zzg) {
            zzafVar.zzw();
        }
    }

    public static void zzn(final zzaf zzafVar, final ev61 ev61Var) {
        zzafVar.zzf.add(ev61Var);
        ev61Var.f63172a.mo1510b(new r7l0() { // from class: com.google.android.play.core.splitinstall.internal.zzw
            @Override // p204p.r7l0
            public final void onComplete(Task task) {
                this.zza.zzt(ev61Var, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzp(zzaf zzafVar, zzv zzvVar) {
        if (zzafVar.zzn != null || zzafVar.zzh) {
            if (!zzafVar.zzh) {
                zzvVar.run();
                return;
            } else {
                zzafVar.zzc.zzd("Waiting to bind to the service.", new Object[0]);
                zzafVar.zze.add(zzvVar);
                return;
            }
        }
        zzafVar.zzc.zzd("Initiate binding to the service.", new Object[0]);
        zzafVar.zze.add(zzvVar);
        zzae zzaeVar = new zzae(zzafVar, null);
        zzafVar.zzm = zzaeVar;
        zzafVar.zzh = true;
        if (zzafVar.zzb.bindService(zzafVar.zzi, zzaeVar, 1)) {
            return;
        }
        zzafVar.zzc.zzd("Failed to bind to the service.", new Object[0]);
        zzafVar.zzh = false;
        Iterator it = zzafVar.zze.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzb(new zzag());
        }
        zzafVar.zze.clear();
    }

    public static /* bridge */ /* synthetic */ void zzq(zzaf zzafVar) {
        zzafVar.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzafVar.zzn.asBinder().linkToDeath(zzafVar.zzk, 0);
        } catch (RemoteException e) {
            zzafVar.zzc.zzc(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void zzr(zzaf zzafVar) {
        zzafVar.zzc.zzd("unlinkToDeath", new Object[0]);
        zzafVar.zzn.asBinder().unlinkToDeath(zzafVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((ev61) it.next()).m40098c(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            try {
                if (!map.containsKey(this.zzd)) {
                    HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                    handlerThread.start();
                    map.put(this.zzd, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.zzd);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzv zzvVar, ev61 ev61Var) {
        zzc().post(new zzy(this, zzvVar.zza(), ev61Var, zzvVar));
    }

    public final /* synthetic */ void zzt(ev61 ev61Var, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(ev61Var);
        }
    }

    public final void zzu(ev61 ev61Var) {
        synchronized (this.zzg) {
            this.zzf.remove(ev61Var);
        }
        zzc().post(new zzz(this));
    }
}
