package com.google.android.gms.internal.meet_coactivities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p204p.AbstractRunnableC2605y9;
import p204p.C2564x9;
import p204p.b8e0;
import p204p.bg7;
import p204p.c8e0;
import p204p.c95;
import p204p.e8g1;
import p204p.ehv0;
import p204p.ftz0;
import p204p.hg40;
import p204p.hm6;
import p204p.hue;
import p204p.i3n0;
import p204p.i8f1;
import p204p.iue;
import p204p.jf40;
import p204p.jhc1;
import p204p.jue;
import p204p.kf40;
import p204p.kj90;
import p204p.lk00;
import p204p.lv1;
import p204p.pf40;
import p204p.qe40;
import p204p.qh00;
import p204p.qv1;
import p204p.rv1;
import p204p.rve;
import p204p.sli0;
import p204p.sv1;
import p204p.sve;
import p204p.syh0;
import p204p.te40;
import p204p.tv1;
import p204p.u790;
import p204p.uve;
import p204p.vgg1;
import p204p.vie1;
import p204p.vxe;
import p204p.wsv0;
import p204p.xv1;
import p204p.y9f1;
import p204p.ycm0;
import p204p.zh21;
import p204p.zl6;
import p204p.zmn0;

/* JADX INFO: loaded from: classes.dex */
public final class zzfa implements zzie {
    static final rv1 zza;
    static final zzrr zzb;
    public static final /* synthetic */ int zzc = 0;
    private static final zzkz zzd;
    private static final Object zze;
    private List zzC;
    private final zziv zzD;
    private final zzin zzi;
    private final long zzj;
    private final zzig zzk;
    private final Function zzn;
    private final Optional zzo;
    private final Executor zzp;
    private zzip zzr;
    private Optional zzf = Optional.empty();
    private Optional zzg = Optional.empty();
    private final zzez zzh = new zzez(this, null);
    private final zzkl zzl = zzkl.zzb();
    private final zzki zzm = zzki.zzc();
    private final ArrayList zzq = new ArrayList(1);
    private Optional zzs = Optional.empty();
    private Optional zzt = Optional.empty();
    private Optional zzu = Optional.empty();
    private Optional zzv = Optional.empty();
    private Optional zzw = Optional.empty();
    private Optional zzx = Optional.empty();
    private Optional zzy = Optional.empty();
    private Optional zzz = Optional.empty();
    private rv1 zzA = zza;
    private zzgg zzB = zzgg.zza;

    static {
        ycm0 ycm0Var = new ycm0();
        ycm0Var.m93373v("");
        ycm0Var.m93375x("");
        jhc1 jhc1Var = new jhc1(9);
        jhc1Var.m53382g(ehv0.f59678a);
        ycm0Var.m93376y(jhc1Var.m53379d());
        ycm0Var.m93374w(qv1.f192850a);
        zza = ycm0Var.m93361j();
        zzb = zzrr.zzl("{}");
        zzd = zzkz.zzj("com/google/android/meet/addons/internal/AddonClientImpl");
        zze = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzfa(long j, Optional optional, Optional optional2, zzig zzigVar) {
        syh0 syh0Var;
        kj90 kj90Var;
        kf40 kf40Var = pf40.f176960b;
        this.zzC = wsv0.f254763e;
        this.zzj = j;
        this.zzk = zzigVar;
        this.zzo = Optional.empty();
        this.zzD = zziv.zza();
        this.zzr = new zzip();
        zzgc zzgcVar = new zzgc();
        zzgcVar.zze(zzir.zza(optional));
        if (optional2.isPresent()) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) optional2.get();
            if (scheduledExecutorService instanceof kj90) {
                kj90Var = (kj90) scheduledExecutorService;
            } else {
                syh0Var = new syh0(scheduledExecutorService);
                kj90Var = syh0Var;
            }
        } else {
            bg7 bg7Var = new bg7();
            bg7Var.m29050d();
            bg7Var.m29049c();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1, bg7Var.m29048b());
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            if (scheduledThreadPoolExecutor instanceof kj90) {
                kj90Var = (kj90) scheduledThreadPoolExecutor;
            } else {
                syh0Var = new syh0(scheduledThreadPoolExecutor);
                kj90Var = syh0Var;
            }
        }
        zzgcVar.zzc(kj90Var);
        zzgcVar.zzb(zzir.zza(optional));
        zzgcVar.zza(zzir.zza(optional));
        zzgcVar.zzd(zzir.zza(optional));
        zzgcVar.zzf(zzir.zza(optional));
        zzin zzinVarZzg = zzgcVar.zzg();
        this.zzi = zzinVarZzg;
        this.zzn = new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzdv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.zza.zzf((Context) obj);
            }
        };
        this.zzp = new ftz0(zzinVarZzg.zzd());
    }

    private final rv1 zzab(rv1 rv1Var, zzpy zzpyVar) {
        try {
            e8g1 e8g1Var = (e8g1) rv1Var;
            e8g1Var.getClass();
            ycm0 ycm0Var = new ycm0(e8g1Var);
            ycm0Var.m93372u(this.zzm.zza(zzpyVar.zzg().zza()));
            return ycm0Var.m93361j();
        } catch (AssertionError e) {
            ((zzkv) ((zzkv) zzd.zzd().zzg(e)).zzh("com/google/android/meet/addons/internal/AddonClientImpl", "updateInitialCoWatchingState", 407, "AddonClientImpl.java")).zzo("Invalid update proto.");
            return rv1Var;
        }
    }

    private final zzhs zzac() {
        this.zzo.isPresent();
        return new zzhs(((zzil) this.zzs.get()).zzc(), ((zzil) this.zzs.get()).zze(), this.zzB, zzpq.zza(), this.zzi, this.zzr, this.zzj);
    }

    private final u790 zzad(final Context context, final xv1 xv1Var, final boolean z) {
        c95.m31848n(context, "Expected 'appContext' to be provided.");
        c95.m31848n(xv1Var, "Expected 'handler' to be provided.");
        final String strZza = this.zzk.zza(this.zzj);
        return vgg1.m85450F(new zl6() { // from class: com.google.android.gms.internal.meet_coactivities.zzeg
            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzq(context, strZza, z, xv1Var);
            }
        }, this.zzp);
    }

    private final void zzae(String str) {
        c95.m31857w(zzak(), "Expected meeting to be connected before calling %s.", str);
    }

    private final void zzaf(String str) {
        c95.m31857w(this.zzu.isPresent(), "Expected meeting to be connected before calling %s.", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag() {
        ((zzhu) this.zzf.get()).zzc();
        this.zzf = Optional.empty();
        this.zzw = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.meet_coactivities.zzhe, java.lang.Object] */
    public final void zzah() {
        this.zzg.get().zzc();
        this.zzg = Optional.empty();
        this.zzv = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai() {
        ((zzkv) zzd.zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "resetDisconnectState", 984, "AddonClientImpl.java")).zzo("Resetting client to disconnected state.");
        this.zzs.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzea
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzil zzilVar = (zzil) obj;
                int i = zzfa.zzc;
                if (zzilVar.zzb().zzk()) {
                    zzilVar.zzc().zzh(new y9f1(ehv0.f59678a));
                }
            }
        });
        this.zzs = Optional.empty();
        this.zzA = zza;
        this.zzB = zzgg.zza;
        this.zzu = Optional.empty();
        this.zzv = Optional.empty();
        this.zzw = Optional.empty();
        this.zzx = Optional.empty();
        this.zzy = Optional.empty();
        this.zzq.clear();
        this.zzr = new zzip();
    }

    private final void zzaj(final zzrr zzrrVar, final Runnable runnable) {
        if (!(((long) zzrrVar.zzd()) <= 200)) {
            throw new IllegalStateException(vie1.m85638t("Participant metadata size cannot exceed %s.", 200L));
        }
        if (zzrrVar.zzm()) {
            zzrrVar = zzb;
        }
        zzia.zza(vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzeo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP(zzrrVar, runnable);
            }
        }, this.zzp), "Failed to setParticipantMetadata or setParticipantMetadataDelegateOptional in MeetIpcManager.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzak() {
        return ((e8g1) this.zzA).f57197c == qv1.f192851b && this.zzs.isPresent();
    }

    private static final zzp zzal(zzgi zzgiVar) {
        zzp zzpVarZza = zzgiVar.zza();
        boolean zZzb = zzgiVar.zzb();
        zzj zzjVarZzb = zzpVarZza.zzb();
        if (zzjVarZzb.equals(zzj.HOST_APP_UNKNOWN)) {
            throw sli0.m78493t("No apps are available for live sharing.", "com.google.android.gm");
        }
        String str = (String) zzde.zzb.get(zzjVarZzb);
        if (!zZzb) {
            return zzpVarZza;
        }
        String str2 = "Package " + str + " is too old. Please update.";
        str.getClass();
        throw sli0.m78493t(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.u790] */
    private final u790 zzam(final int i) {
        c95.m31856v(this.zzu.isPresent(), "Unexpected call to disconnectMeeting before calling connectMeeting");
        return AbstractRunnableC2605y9.m93137z(this.zzu.get(), new hm6() { // from class: com.google.android.gms.internal.meet_coactivities.zzdu
            @Override // p204p.hm6
            public final u790 apply(Object obj) {
                return this.zza.zzaa(i, (rv1) obj);
            }
        }, this.zzp);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie, p204p.mv1
    public final sv1 newSessionBuilder(xv1 xv1Var) {
        return new zzfm(xv1Var, this, this.zzr);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void notifyAddonFailureEvent(final Context context, final lv1 lv1Var) {
        c95.m31848n(context, "Expected 'appContext' to be provided.");
        c95.m31848n(lv1Var, "Expected 'failureEventType' to be provided.");
        zzia.zza(vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzeb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL(context, lv1Var);
            }
        }, this.zzp), "Failed to get start info or to broadcast failure event in MeetIpcManager.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie, p204p.mv1
    public final void registerMeetingStatusListener(Context context, c8e0 c8e0Var, Optional<Handler> optional) {
        synchronized (zze) {
            try {
                c95.m31848n(context, "Expected 'appContext' to be provided.");
                c95.m31848n(context.getApplicationContext(), "Expected 'appContext#getApplicationContext()' to resolve to a non-null value.");
                c95.m31848n(context.getApplicationContext().getPackageName(), "Expected 'appContext#getPackageName()' to be provided.");
                c95.m31848n(optional, "Expected 'handler' to be non-null, even if Optional#empty().");
                c95.m31848n(c8e0Var, "Expected 'listener' to be provided.");
                c95.m31856v(!this.zzz.isPresent(), "Unexpected call to registerMeetingStatusListener before calling unRegisterMeetingStatusListener.");
                Optional optionalOf = Optional.of(new zziy(new zziz(hg40.m47408t(c8e0Var, new c8e0() { // from class: com.google.android.gms.internal.meet_coactivities.zzdw
                    @Override // p204p.c8e0
                    public final void onMeetingStatusChange(b8e0 b8e0Var) {
                        this.zza.zzs.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzdo
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                zzil zzilVar = (zzil) obj;
                                int i = zzfa.zzc;
                                if (zzilVar.zzb().zzk()) {
                                    zzilVar.zzc().zzh(((i8f1) b8e0Var).f99780b);
                                }
                            }
                        });
                    }
                })), context.getApplicationContext().getPackageName(), this.zzj));
                this.zzz = optionalOf;
                zzjb.zza(context, optional, (BroadcastReceiver) optionalOf.get(), Optional.empty(), this.zzj);
                Object obj = this.zzz.get();
                if (Build.VERSION.SDK_INT >= 33) {
                    context.getApplicationContext().registerReceiver((BroadcastReceiver) obj, new IntentFilter("ACTION_S11Y_EVENT_BUS"), null, optional.orElse(null), 2);
                } else {
                    context.getApplicationContext().registerReceiver((BroadcastReceiver) obj, new IntentFilter("ACTION_S11Y_EVENT_BUS"), null, optional.orElse(null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie, p204p.mv1
    public final void unregisterMeetingStatusListener(Context context) {
        synchronized (zze) {
            c95.m31848n(context, "Expected 'appContext' to be provided.");
            c95.m31848n(context.getApplicationContext(), "Expected 'appContext#getApplicationContext()' to resolve to a non-null value.");
            c95.m31856v(this.zzz.isPresent(), "Unexpected call to `unRegisterMeetingStatusListener` before calling `registerStatusListener`");
            this.zzs.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzef
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfa.zzc;
                    c95.m31856v(!((zzil) obj).zzb().zzk(), "Unexpected call to `unRegisterMeetingStatusListener` after calling `verifyRecordingInfo` before connecting to the meeting.");
                }
            });
            context.unregisterReceiver((BroadcastReceiver) this.zzz.get());
            this.zzz = Optional.empty();
        }
    }

    public final /* synthetic */ void zzL(Context context, lv1 lv1Var) {
        int i;
        zzp zzpVarZzal = zzal(zzgj.zza(context, "", this.zzj, this.zzD, false));
        zzcf zzcfVar = (zzcf) this.zzn.apply(context);
        switch (lv1Var.ordinal()) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                throw new AssertionError();
        }
        zzcfVar.zzm(context, i, zzpVarZzal.zzb());
    }

    public final /* synthetic */ void zzM() {
        ((zzil) this.zzs.get()).zzc().zzi();
    }

    public final /* synthetic */ void zzN(vxe vxeVar) {
        ((zzil) this.zzs.get()).zzc().zzj(vxeVar);
    }

    public final /* synthetic */ void zzO(i3n0 i3n0Var) {
        this.zzt = Optional.of(i3n0Var);
    }

    public final /* synthetic */ void zzP(zzrr zzrrVar, Runnable runnable) {
        ((zzil) this.zzs.get()).zzc().zzk(zzrrVar);
        runnable.run();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzQ(Runnable runnable) {
        this.zzq.add(runnable);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzR() {
        zzia.zza(vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzed
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        }, this.zzp), "Failed to resetCollaborationStartingState in MeetIpcManager.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzS(final vxe vxeVar) {
        c95.m31848n(vxeVar, "Expected parameter 'startingState' to be provided.");
        zzia.zza(vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzdx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN(vxeVar);
            }
        }, this.zzp), "Failed to setCollaborationStartingState in MeetIpcManager.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzT(zzrr zzrrVar) {
        zzaj(zzrrVar, new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzdr
            @Override // java.lang.Runnable
            public final void run() {
                int i = zzfa.zzc;
            }
        });
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final void zzU(zzrr zzrrVar, final i3n0 i3n0Var) {
        c95.m31848n(i3n0Var, "Expected 'handler' to be provided.");
        zzaj(zzrrVar, new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzel
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(i3n0Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final boolean zzW() {
        return this.zzs.isPresent();
    }

    public final /* synthetic */ zzgm zzX(iue iueVar, Optional optional) {
        Optional optionalOf = Optional.of(zzac().zzg(iueVar));
        this.zzf = optionalOf;
        Object obj = optionalOf.get();
        if (optional.isPresent()) {
            ((zzkv) zzd.zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "handleInitialCoDoingStates", 644, "AddonClientImpl.java")).zzo("CoDoing initial state present");
            jue jueVar = (jue) optional.get();
            c95.m31848n(jueVar, "Expected 'newGlobalState' to be provided.");
            c95.m31854t("Blob size cannot be greater than %s bytes.", 16384, zzjz.zzd(jueVar).zzd().zzd() <= 16384);
            ((zzhu) obj).zze(new zzgl((zzgm) obj, jueVar));
        } else {
            Stream streamFilter = this.zzC.stream().filter(new zzen());
            Objects.requireNonNull(obj);
            final zzgm zzgmVar = (zzgm) obj;
            streamFilter.forEach(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzee
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    zzgmVar.zzd((zzpy) obj2);
                }
            });
        }
        return (zzgm) this.zzf.get();
    }

    public final /* synthetic */ u790 zzY(int i) {
        return ((zzil) this.zzs.get()).zzc().zzl(i);
    }

    public final /* synthetic */ u790 zzZ(final int i) {
        return vgg1.m85450F(new zl6() { // from class: com.google.android.gms.internal.meet_coactivities.zzdq
            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzY(i);
            }
        }, this.zzp);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final u790 zza(final iue iueVar, final Optional optional) {
        c95.m31848n(iueVar, "Expected 'handler' to be provided.");
        c95.m31848n(optional, "Expected 'initiatorInitialCoDoingState' to be provided.");
        return vgg1.m85450F(new zl6() { // from class: com.google.android.gms.internal.meet_coactivities.zzdn
            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzo(iueVar, optional);
            }
        }, this.zzp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.meet_coactivities.zzdl] */
    public final u790 zzaa(final int i, rv1 rv1Var) {
        c95.m31856v(this.zzs.isPresent(), "Unexpected call to disconnectMeeting before calling connectMeeting");
        jf40 jf40VarM69788m = pf40.m69788m();
        boolean z = false;
        jf40VarM69788m.m28985c(zzia.zza(this.zzw.isPresent() ? (u790) this.zzy.orElseGet(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zzt();
            }
        }) : te40.f219571b, "Failed to end co-doing.", new Object[0]));
        jf40VarM69788m.m28985c(zzia.zza(this.zzv.isPresent() ? (u790) this.zzx.orElseGet(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zzu();
            }
        }) : te40.f219571b, "Failed to end co-watching.", new Object[0]));
        zmn0 zmn0Var = new zmn0(z, pf40.m69790o(jf40VarM69788m.m53150g()), 21);
        ?? r6 = new zl6() { // from class: com.google.android.gms.internal.meet_coactivities.zzdl
            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzZ(i);
            }
        };
        Executor executor = zzir.zza;
        return zzia.zzb(AbstractRunnableC2605y9.m93137z(zmn0Var.m96482o(r6, executor), new hm6() { // from class: com.google.android.gms.internal.meet_coactivities.zzdm
            @Override // p204p.hm6
            public final u790 apply(Object obj) {
                return this.zza.zzv((Void) obj);
            }
        }, executor), "Unexpected error when trying to disconnect from meeting.");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final u790 zzb(final sve sveVar, final Optional optional) {
        c95.m31848n(sveVar, "Expected 'handler' to be provided.");
        c95.m31848n(optional, "Expected 'initiatorInitialCoWatchingState' to be provided.");
        return vgg1.m85450F(new zl6(sveVar, optional) { // from class: com.google.android.gms.internal.meet_coactivities.zzdg
            public final /* synthetic */ sve zzb;
            public final /* synthetic */ Optional zzc;

            {
                this.zzc = optional;
            }

            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzp(null, this.zzc);
            }
        }, this.zzp);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final u790 zzc(Context context, xv1 xv1Var) {
        return zzad(context, xv1Var, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final u790 zzd() {
        return vgg1.m85450F(new zl6() { // from class: com.google.android.gms.internal.meet_coactivities.zzep
            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzr();
            }
        }, this.zzp);
    }

    public final /* synthetic */ zzce zze() {
        return this.zzh;
    }

    public final /* synthetic */ zzcf zzf(Context context) {
        Context applicationContext = context.getApplicationContext();
        Supplier supplier = new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zze();
            }
        };
        zzin zzinVar = this.zzi;
        zzbx zzbxVarZzc = zzby.zzc();
        zzbxVarZzc.zza(zzinVar.zzc());
        zzbxVarZzc.zzb(this.zzi.zze());
        return zzcf.zze(applicationContext, supplier, zzbxVarZzc.zzc());
    }

    public final rv1 zzg(zzx zzxVar) {
        this.zzA = zzjw.zzb(zzxVar.zzb());
        ((zzkv) zzd.zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "lambda$handleConnectMeeting$4", 335, "AddonClientImpl.java")).zzp("Received meetingInfo with status : %s", zzxVar.zzb().zzd());
        this.zzB = zzgg.zzf(((zzil) this.zzs.get()).zzc().zzd());
        List listZzg = zzxVar.zzg();
        this.zzC = listZzg;
        rv1 rv1VarM93361j = this.zzA;
        List list = (List) listZzg.stream().filter(new zzej()).collect(Collectors.toCollection(new zzem()));
        if (list.size() > 1) {
            throw new IllegalStateException("More than one CoWatching initial state received.");
        }
        if (!list.isEmpty()) {
            rv1VarM93361j = zzab(rv1VarM93361j, (zzpy) list.get(0));
        }
        List list2 = (List) this.zzC.stream().filter(new zzen()).collect(Collectors.toCollection(new zzem()));
        if (list2.size() > 1) {
            throw new IllegalStateException("More than one CoDoing initial state received.");
        }
        if (!list2.isEmpty()) {
            zzpy zzpyVar = (zzpy) list2.get(0);
            e8g1 e8g1Var = (e8g1) rv1VarM93361j;
            e8g1Var.getClass();
            ycm0 ycm0Var = new ycm0(e8g1Var);
            ycm0Var.m93371t(zzjz.zzc(zzpyVar.zzf().zza()));
            rv1VarM93361j = ycm0Var.m93361j();
        }
        this.zzA = rv1VarM93361j;
        return rv1VarM93361j;
    }

    public final /* synthetic */ hue zzh(final iue iueVar, final Optional optional, rv1 rv1Var) {
        zzae("beginCoDoing");
        c95.m31856v(!this.zzf.isPresent(), "Unexpected call to beginCoDoing during an existing co-doing activity.");
        return (hue) zzia.zzc(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zzX(iueVar, optional);
            }
        }, "Unexpected error when trying to begin co-doing.");
    }

    public final /* synthetic */ rve zzi(final sve sveVar, final Optional optional, rv1 rv1Var) {
        zzae("beginCoWatching");
        c95.m31856v(!this.zzg.isPresent(), "Unexpected call to beginCoWatching during an existing co-watching activity.");
        return (rve) zzia.zzc(new Supplier(sveVar, optional) { // from class: com.google.android.gms.internal.meet_coactivities.zzds
            public final /* synthetic */ sve zzb;
            public final /* synthetic */ Optional zzc;

            {
                this.zzc = optional;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zzj(null, this.zzc);
            }
        }, "Unexpected error when trying to begin co-watching.");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.meet_coactivities.zzif, java.lang.Object, p.rve] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.android.gms.internal.meet_coactivities.zzif, java.lang.Object] */
    public final /* synthetic */ zzif zzj(sve sveVar, Optional optional) {
        Optional optionalOf = Optional.of(zzac().zzb(sveVar));
        this.zzg = optionalOf;
        final ?? r6 = optionalOf.get();
        if (optional.isPresent()) {
            ((zzkv) zzd.zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl", "handleInitialCoWatchingStates", 763, "AddonClientImpl.java")).zzo("CoWatching initial state present");
            uve uveVar = (uve) optional.get();
            r6.notifySwitchedToMedia("", uveVar.mo80219c(), uveVar.mo80220d(), uveVar.mo80218b());
        } else {
            Stream streamFilter = this.zzC.stream().filter(new zzej());
            Objects.requireNonNull(r6);
            streamFilter.forEach(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzec
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    r6.zzd((zzpy) obj);
                }
            });
        }
        return this.zzg.get();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final u790 zzm(Context context, xv1 xv1Var) {
        return zzad(context, xv1Var, true);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzie
    public final u790 zzn(final tv1 tv1Var) {
        return vgg1.m85450F(new zl6() { // from class: com.google.android.gms.internal.meet_coactivities.zzek
            @Override // p204p.zl6
            public final u790 call() {
                return this.zza.zzs(tv1Var);
            }
        }, this.zzp);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.u790] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, p.u790] */
    public final u790 zzo(final iue iueVar, final Optional optional) {
        this.zzy = Optional.empty();
        zzaf("beginCoDoing");
        Optional optionalOf = Optional.of(AbstractRunnableC2605y9.m93136y(this.zzu.get(), new qh00() { // from class: com.google.android.gms.internal.meet_coactivities.zzeh
            @Override // p204p.qh00
            public final Object apply(Object obj) {
                return this.zza.zzh(iueVar, optional, (rv1) obj);
            }
        }, this.zzp));
        this.zzw = optionalOf;
        return optionalOf.get();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.u790] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, p.u790] */
    public final u790 zzp(final sve sveVar, final Optional optional) {
        this.zzx = Optional.empty();
        zzaf("beginCoWatching");
        Optional optionalOf = Optional.of(AbstractRunnableC2605y9.m93136y(this.zzu.get(), new qh00(sveVar, optional) { // from class: com.google.android.gms.internal.meet_coactivities.zzdy
            public final /* synthetic */ sve zzb;
            public final /* synthetic */ Optional zzc;

            {
                this.zzc = optional;
            }

            @Override // p204p.qh00
            public final Object apply(Object obj) {
                return this.zza.zzi(null, this.zzc, (rv1) obj);
            }
        }, this.zzp));
        this.zzv = optionalOf;
        return optionalOf.get();
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, p.u790] */
    public final u790 zzq(Context context, String str, boolean z, xv1 xv1Var) {
        c95.m31856v(!this.zzs.isPresent(), "Unexpected call to connectMeeting before calling disconnectMeeting");
        zzp zzpVarZzal = zzal(zzgj.zza(context, str, this.zzj, this.zzD, z));
        zzfz zzfzVar = new zzfz();
        zzfzVar.zzc(context);
        zzfzVar.zzd((zzcf) this.zzn.apply(context));
        zzfzVar.zzb(xv1Var);
        zzfzVar.zza(str);
        zzfzVar.zze(zzpVarZzal);
        this.zzs = Optional.of(zzfzVar.zzf());
        if (z && !this.zzz.isPresent()) {
            zzai();
            return new qe40(new IllegalStateException("Meeting status listener is not registered before tracking recording info."));
        }
        zzcf zzcfVarZzc = ((zzil) this.zzs.get()).zzc();
        zzp zzpVarZzb = ((zzil) this.zzs.get()).zzb();
        zzt zztVar = zzt.SESSION_LEAVING;
        int i = hg40.f91023c;
        u790 u790VarZzf = zzcfVarZzc.zzf(zzpVarZzb, new zh21(zztVar));
        qh00 qh00Var = new qh00() { // from class: com.google.android.gms.internal.meet_coactivities.zzdp
            @Override // p204p.qh00
            public final Object apply(Object obj) {
                return this.zza.zzg((zzx) obj);
            }
        };
        Executor executor = zzir.zza;
        C2564x9 c2564x9M93136y = AbstractRunnableC2605y9.m93136y(u790VarZzf, qh00Var, executor);
        c2564x9M93136y.mo28322a(new lk00(22, c2564x9M93136y, new zzeq(this)), executor);
        Optional optionalOf = Optional.of(c2564x9M93136y);
        this.zzu = optionalOf;
        return zzia.zzb(optionalOf.get(), "Unexpected error when trying to connect to meeting.");
    }

    public final /* synthetic */ u790 zzr() {
        return zzam(2);
    }

    public final /* synthetic */ u790 zzs(tv1 tv1Var) {
        return zzam(tv1Var.ordinal() != 1 ? 2 : 3);
    }

    public final u790 zzt() {
        zzae("endCoDoing");
        c95.m31856v(this.zzf.isPresent(), "Expected co-doing activity to exist before calling endCoDoing.");
        zzia.zzd(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzei
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzag();
            }
        }, "Unexpected error when trying to end co-doing.");
        return te40.f219571b;
    }

    public final u790 zzu() {
        zzae("endCoWatching");
        c95.m31856v(this.zzg.isPresent(), "Expected co-watching activity to exist before calling endCoWatching.");
        zzia.zzd(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzdt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzah();
            }
        }, "Unexpected error when trying to end co-watching.");
        return te40.f219571b;
    }

    public final /* synthetic */ u790 zzv(Void r2) {
        return vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzdz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzai();
            }
        }, this.zzp);
    }
}
