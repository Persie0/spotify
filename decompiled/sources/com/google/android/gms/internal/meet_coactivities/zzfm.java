package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import com.comscore.streaming.AdvertisementType;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import p204p.AbstractRunnableC2605y9;
import p204p.c95;
import p204p.fbf;
import p204p.gbf;
import p204p.hm6;
import p204p.hue;
import p204p.i3n0;
import p204p.iue;
import p204p.jue;
import p204p.lk00;
import p204p.pf40;
import p204p.qh00;
import p204p.rv1;
import p204p.rve;
import p204p.sv1;
import p204p.sve;
import p204p.u790;
import p204p.uv1;
import p204p.uve;
import p204p.vgg1;
import p204p.vxe;
import p204p.wsv0;
import p204p.xv1;

/* JADX INFO: loaded from: classes4.dex */
final class zzfm implements sv1 {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/AddonSessionBuilderImpl");
    private final xv1 zzb;
    private final zzie zzc;
    private final zzip zzd;
    private vxe zzi;
    private Optional zze = Optional.empty();
    private Optional zzf = Optional.empty();
    private Optional zzg = Optional.empty();
    private zzrr zzh = zzrr.zzb;
    private boolean zzj = false;
    private Optional zzk = Optional.empty();
    private Optional zzl = Optional.empty();

    public zzfm(xv1 xv1Var, zzie zzieVar, zzip zzipVar) {
        this.zzb = xv1Var;
        this.zzc = zzieVar;
        this.zzd = zzipVar;
    }

    @Override // p204p.sv1
    public final u790 begin(Context context) {
        c95.m31856v(!this.zzc.zzW(), "Cannot call begin() while a meeting connection already exists.");
        return AbstractRunnableC2605y9.m93137z(this.zzj ? this.zzc.zzm(context, this.zzb) : this.zzc.zzc(context, this.zzb), new hm6() { // from class: com.google.android.gms.internal.meet_coactivities.zzfh
            @Override // p204p.hm6
            public final u790 apply(Object obj) {
                return this.zza.zze((rv1) obj);
            }
        }, zzir.zza);
    }

    @Override // p204p.sv1
    public final sv1 verifyRecordingInfo() {
        this.zzj = true;
        return this;
    }

    public final sv1 withCoDoing(iue iueVar) {
        Optional optionalEmpty = Optional.empty();
        c95.m31848n(iueVar, "Parameter 'coDoingHandler' cannot be null.");
        c95.m31848n(optionalEmpty, "Parameter 'initiatorInitialCoDoingState' cannot be null.");
        this.zzf = Optional.of(iueVar);
        this.zzl = optionalEmpty;
        return this;
    }

    public final sv1 withCoWatching(sve sveVar) {
        Optional optionalEmpty = Optional.empty();
        c95.m31848n(sveVar, "Parameter 'coWatchingHandler' cannot be null.");
        c95.m31848n(optionalEmpty, "Parameter 'initiatorInitialCoWatchingState' cannot be null.");
        this.zze = Optional.of(sveVar);
        this.zzk = optionalEmpty;
        return this;
    }

    public final sv1 withCollaborationStartingState(vxe vxeVar) {
        c95.m31848n(vxeVar, "Parameter 'startingState' cannot be null.");
        this.zzi = vxeVar;
        return this;
    }

    public final sv1 withParticipantMetadata(i3n0 i3n0Var) {
        c95.m31848n(i3n0Var, "Parameter 'handler' cannot be null.");
        this.zzg = Optional.of(i3n0Var);
        return this;
    }

    public final /* synthetic */ uv1 zza(rv1 rv1Var, u790 u790Var, u790 u790Var2) {
        return new zzfs(this.zzc, rv1Var, (Optional) vgg1.m85481v(u790Var), (Optional) vgg1.m85481v(u790Var2), this.zzd);
    }

    public final u790 zze(final rv1 rv1Var) {
        final u790 u790Var = (u790) this.zze.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzfg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzfm zzfmVar = this.zza;
                if (obj == null) {
                    return zzfmVar.zzg(null);
                }
                throw new ClassCastException();
            }
        }).orElse(vgg1.m85445A(Optional.empty()));
        final u790 u790Var2 = (u790) this.zzf.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzfb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.zza.zzf((iue) obj);
            }
        }).orElse(vgg1.m85445A(Optional.empty()));
        wsv0 wsv0VarM69792q = pf40.m69792q(new u790[]{u790Var, u790Var2});
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(rv1Var, u790Var, u790Var2);
            }
        };
        Executor executor = zzir.zza;
        final gbf gbfVar = new gbf(wsv0VarM69792q, true);
        gbfVar.f78292i = new fbf(gbfVar, callable, executor, 1);
        gbfVar.m44216F();
        int i = 22;
        gbfVar.mo28322a(new lk00(i, gbfVar, new zzfl(this)), executor);
        this.zzg.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzfd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                vgg1.m85465f(gbfVar, new zzfi(this.zza, (i3n0) obj), zzir.zza);
            }
        });
        if (this.zzi == null) {
            ((zzkv) zza.zzc().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl", "maybeConfigureCollaborationStartingState", AdvertisementType.BRANDED_AS_CONTENT, "AddonSessionBuilderImpl.java")).zzo("Collaboration starting state is null.");
            return gbfVar;
        }
        gbfVar.mo28322a(new lk00(i, gbfVar, new zzfj(this)), executor);
        return gbfVar;
    }

    public final u790 zzf(iue iueVar) {
        return AbstractRunnableC2605y9.m93136y(this.zzc.zza(iueVar, this.zzl), new qh00() { // from class: com.google.android.gms.internal.meet_coactivities.zzfc
            @Override // p204p.qh00
            public final Object apply(Object obj) {
                return Optional.of((hue) obj);
            }
        }, zzir.zza);
    }

    public final u790 zzg(sve sveVar) {
        return AbstractRunnableC2605y9.m93136y(this.zzc.zzb(sveVar, this.zzk), new qh00() { // from class: com.google.android.gms.internal.meet_coactivities.zzff
            @Override // p204p.qh00
            public final Object apply(Object obj) {
                return Optional.of((rve) obj);
            }
        }, zzir.zza);
    }

    public final sv1 withParticipantMetadata(i3n0 i3n0Var, byte[] bArr) {
        c95.m31848n(bArr, "Parameter 'metadata' cannot be null.");
        c95.m31848n(i3n0Var, "Parameter 'handler' cannot be null.");
        int length = bArr.length;
        c95.m31842h("Participant metadata size cannot exceed %s bytes.", 200, length <= 200);
        this.zzg = Optional.of(i3n0Var);
        this.zzh = zzrr.zzk(bArr, 0, length);
        return this;
    }

    @Override // p204p.sv1
    public final sv1 withCoDoing(iue iueVar, Optional<jue> optional) {
        c95.m31848n(iueVar, "Parameter 'coDoingHandler' cannot be null.");
        c95.m31848n(optional, "Parameter 'initiatorInitialCoDoingState' cannot be null.");
        this.zzf = Optional.of(iueVar);
        this.zzl = optional;
        return this;
    }

    public final sv1 withCoWatching(sve sveVar, Optional<uve> optional) {
        c95.m31848n(sveVar, "Parameter 'coWatchingHandler' cannot be null.");
        c95.m31848n(optional, "Parameter 'initiatorInitialCoWatchingState' cannot be null.");
        this.zze = Optional.of(sveVar);
        this.zzk = optional;
        return this;
    }
}
