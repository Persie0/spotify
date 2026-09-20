package com.google.android.gms.internal.meet_coactivities;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import p196j$.time.Duration;
import p204p.AbstractRunnableC2605y9;
import p204p.ckr;
import p204p.fg90;
import p204p.hl91;
import p204p.iue;
import p204p.qh00;
import p204p.sve;
import p204p.t7h1;
import p204p.u790;
import p204p.uve;
import p204p.vgg1;

/* JADX INFO: loaded from: classes4.dex */
final class zzhs {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/CoXClientFactory");
    private final zzin zzb;
    private final zzcf zzc;
    private final String zzd;
    private final zzgg zze;
    private final zzpr zzf;
    private final zzip zzg;
    private final long zzh;

    public zzhs(zzcf zzcfVar, String str, zzgg zzggVar, zzpr zzprVar, zzin zzinVar, zzip zzipVar, long j) {
        this.zzc = zzcfVar;
        this.zzd = str;
        this.zze = zzggVar;
        this.zzf = zzprVar;
        this.zzb = zzinVar;
        this.zzg = zzipVar;
        this.zzh = j;
    }

    public static /* synthetic */ void zzf(zzib zzibVar, zzkm zzkmVar, Object obj) {
        try {
            zzibVar.zzb(zzkmVar.zza(obj));
        } catch (AssertionError e) {
            ((zzkv) ((zzkv) zza.zzd().zzg(e)).zzh("com/google/android/meet/addons/internal/CoXClientFactory", "lambda$createAndActivateCoActivity$5", 175, "CoXClientFactory.java")).zzo("Invalid update proto.");
        } catch (RuntimeException e2) {
            ((zzkv) ((zzkv) zza.zzd().zzg(e2)).zzh("com/google/android/meet/addons/internal/CoXClientFactory", "lambda$createAndActivateCoActivity$5", 177, "CoXClientFactory.java")).zzo("Unexpected error while applying an update.");
        }
    }

    private final zzhe zzh(Function function, zzjr zzjrVar, final zzib zzibVar, final zzkm zzkmVar, zzhr zzhrVar, final Supplier supplier) {
        Consumer consumer = new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzhk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzhs.zzf(zzibVar, zzkmVar, obj);
            }
        };
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzhl
            @Override // java.lang.Runnable
            public final void run() {
                vgg1.m85465f((u790) supplier.get(), new zzhq(this.zza), ckr.f39074a);
            }
        };
        zzfw zzfwVar = new zzfw();
        zzfwVar.zzd(this.zzc);
        zzfwVar.zze(zzjrVar);
        zzfwVar.zzc(zzid.zza(this.zze, runnable, this.zzb.zzf()));
        final zzcf zzcfVar = this.zzc;
        Objects.requireNonNull(zzcfVar);
        zzfwVar.zzf(zzhrVar.zza(zzjrVar, consumer, new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzhm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzcfVar.zzg((zzpy) obj);
            }
        }));
        zzfwVar.zza(this.zze);
        zzfwVar.zzb(zzibVar);
        return (zzhe) function.apply(zzfwVar.zzg());
    }

    public final zzif zzb(final sve sveVar) {
        zzhr zzhrVar = new zzhr() { // from class: com.google.android.gms.internal.meet_coactivities.zzhg
            @Override // com.google.android.gms.internal.meet_coactivities.zzhr
            public final zzjv zza(zzjr zzjrVar, Consumer consumer, Consumer consumer2) {
                return this.zza.zzd((zzjq) zzjrVar, consumer, consumer2);
            }
        };
        final zzjq zzjqVarZza = zzjq.zza(this.zzd, this.zzh, this.zzf, this.zze);
        return (zzif) zzh(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzhj
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new zzhb((zzhw) obj);
            }
        }, zzjqVarZza, zzhd.zza(sveVar, this.zzb.zzb()), zzki.zzc(), zzhrVar, new Supplier(sveVar, zzjqVarZza) { // from class: com.google.android.gms.internal.meet_coactivities.zzhi
            public final /* synthetic */ sve zzb;
            public final /* synthetic */ zzjq zzc;

            {
                this.zzc = zzjqVarZza;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zze(null, this.zzc);
            }
        });
    }

    public final /* synthetic */ zzjv zzc(zzjo zzjoVar, Consumer consumer, Consumer consumer2) {
        return new zzjk(zzjoVar, consumer, this.zze, this.zzg);
    }

    public final /* synthetic */ zzjv zzd(zzjq zzjqVar, Consumer consumer, Consumer consumer2) {
        return new zzjm(zzjqVar, consumer, this.zze, this.zzg);
    }

    public final u790 zze(final sve sveVar, final zzjq zzjqVar) {
        Objects.requireNonNull(sveVar);
        Callable callable = new Callable(sveVar) { // from class: com.google.android.gms.internal.meet_coactivities.zzho
            public final /* synthetic */ sve zza;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                throw null;
            }
        };
        fg90 fg90VarZzb = this.zzb.zzb();
        hl91 hl91Var = new hl91(callable);
        fg90VarZzb.execute(hl91Var);
        return AbstractRunnableC2605y9.m93136y(hl91Var, new qh00() { // from class: com.google.android.gms.internal.meet_coactivities.zzhp
            @Override // p204p.qh00
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                return zzjqVar.zzc(optional.isPresent() ? ((t7h1) ((uve) optional.get())).f217773b : Duration.ZERO);
            }
        }, ckr.f39074a);
    }

    public final zzgm zzg(iue iueVar) {
        zzhr zzhrVar = new zzhr() { // from class: com.google.android.gms.internal.meet_coactivities.zzhn
            @Override // com.google.android.gms.internal.meet_coactivities.zzhr
            public final zzjv zza(zzjr zzjrVar, Consumer consumer, Consumer consumer2) {
                return this.zza.zzc((zzjo) zzjrVar, consumer, consumer2);
            }
        };
        final zzjo zzjoVar = new zzjo(this.zzd, this.zzh);
        return (zzgm) zzh(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzhh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new zzgm((zzhw) obj);
            }
        }, zzjoVar, zzgo.zza(iueVar, this.zzb.zza()), zzjz.zzb(), zzhrVar, new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return vgg1.m85445A(zzjoVar.zzb());
            }
        });
    }
}
