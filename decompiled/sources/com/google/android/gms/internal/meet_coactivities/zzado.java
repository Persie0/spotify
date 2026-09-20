package com.google.android.gms.internal.meet_coactivities;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.UserHandle;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class zzado implements ServiceConnection, zzacc {
    private static final Logger zza = Logger.getLogger(zzado.class.getName());
    private final Intent zzb;
    private final int zzc;
    private final zzacb zzd;
    private final Executor zze;
    private Context zzf;
    private int zzg;
    private int zzh;

    public zzado(Executor executor, Context context, zzabu zzabuVar, Intent intent, UserHandle userHandle, int i, zzacb zzacbVar) {
        synchronized (this) {
            this.zzb = intent;
            this.zzc = i;
            this.zzd = zzacbVar;
            this.zzf = context;
            this.zze = executor;
            this.zzg = 1;
            this.zzh = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc(zzabe zzabeVar) {
        Logger logger = zza;
        Level level = Level.FINEST;
        logger.logp(level, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", zzabeVar);
        this.zzf = null;
        if (this.zzh != 4) {
            this.zzh = 4;
            logger.logp(level, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.zzd.zzb(zzabeVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zzd(zzabe.zzk.zze("onBindingDied: ".concat(String.valueOf(componentName))));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        zzd(zzabe.zzi.zze("onNullBinding: ".concat(String.valueOf(componentName))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            try {
                if (this.zzg == 2) {
                    this.zzg = 3;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && this.zzh == 1) {
            this.zzh = 3;
            zza.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.zzd.zza(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzd(zzabe.zzk.zze("onServiceDisconnected: ".concat(String.valueOf(componentName))));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #6 {all -> 0x002e, blocks: (B:31:0x0051, B:35:0x00ab, B:37:0x00b1, B:38:0x00b3, B:43:0x00c6, B:42:0x00b9, B:13:0x0029, B:29:0x004d, B:49:0x00d8, B:33:0x0079, B:34:0x0092, B:26:0x003f, B:27:0x0046), top: B:55:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzacc
    public final synchronized void zza() throws Throwable {
        zzado zzadoVar;
        zzabe zzabeVarZze;
        final zzabe zzabeVar;
        boolean zBindService;
        try {
            try {
                if (this.zzg == 1) {
                    this.zzg = 2;
                    Context context = this.zzf;
                    Intent intent = this.zzb;
                    int i = this.zzc;
                    zzadn zzadnVar = zzadn.BIND_SERVICE;
                    try {
                        int iOrdinal = zzadnVar.ordinal();
                        try {
                            if (iOrdinal == 0) {
                                zzadoVar = this;
                                zBindService = context.bindService(intent, this, i);
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    zzadoVar = this;
                                } else {
                                    zzadoVar = this;
                                    zBindService = ((DevicePolicyManager) context.getSystemService("device_policy")).bindDeviceAdminServiceAsUser((ComponentName) null, intent, zzadoVar, i, (UserHandle) null);
                                }
                                zzabeVarZze = zzabe.zzi.zze(zzadnVar.zza() + "(" + String.valueOf(intent) + ") returned false");
                                zzabeVar = zzabeVarZze;
                                if (!zzabeVar.zzj()) {
                                    try {
                                        zzadoVar.zzf.unbindService(this);
                                    } catch (RuntimeException e) {
                                        zza.logp(Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", (Throwable) e);
                                    }
                                    zzadoVar.zzg = 4;
                                    zzadoVar.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzadl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzb(zzabeVar);
                                        }
                                    });
                                }
                            } else {
                                zzadoVar = this;
                                zBindService = context.bindServiceAsUser(intent, this, i, (UserHandle) null);
                            }
                            if (zBindService) {
                                zzabeVarZze = zzabe.zza;
                            } else {
                                zzabeVarZze = zzabe.zzi.zze(zzadnVar.zza() + "(" + String.valueOf(intent) + ") returned false");
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            zzabeVarZze = zzabe.zze.zzd(e).zze("SecurityException from ".concat(String.valueOf(zzadnVar.zza())));
                        } catch (RuntimeException e3) {
                            e = e3;
                            zzabeVarZze = zzabe.zzj.zzd(e).zze("RuntimeException from ".concat(String.valueOf(zzadnVar.zza())));
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        zzadoVar = this;
                    } catch (RuntimeException e5) {
                        e = e5;
                        zzadoVar = this;
                    }
                    zzabeVar = zzabeVarZze;
                    if (!zzabeVar.zzj()) {
                        zzadoVar.zzf.unbindService(this);
                        zzadoVar.zzg = 4;
                        zzadoVar.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzadl
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzb(zzabeVar);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void zzd(final zzabe zzabeVar) {
        Context context;
        synchronized (this) {
            int i = this.zzg;
            context = (i == 2 || i == 3) ? this.zzf : null;
            this.zzg = 4;
        }
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzadm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzabeVar);
            }
        });
        if (context != null) {
            context.unbindService(this);
        }
    }
}
