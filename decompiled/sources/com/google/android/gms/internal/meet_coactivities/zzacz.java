package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
final class zzacz implements zzaeu {
    private final zzacr zza;
    private final zzadf zzb;

    public zzacz(zzacr zzacrVar, zzadf zzadfVar, zzvz zzvzVar) {
        this.zza = zzacrVar;
        this.zzb = zzadfVar;
    }

    public final String toString() {
        return dq60.m36615o("MultiMessageClientStream[", this.zza.toString(), "/", this.zzb.toString(), "]");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zza(zzaia zzaiaVar) {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzb(zzabe zzabeVar) {
        synchronized (this.zza) {
            this.zza.zzh(zzabeVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzd() {
        try {
            synchronized (this.zzb) {
                zzadf zzadfVar = this.zzb;
                zzadfVar.zzf();
                zzadfVar.zzg();
            }
        } catch (zzabf e) {
            synchronized (this.zza) {
                this.zza.zzg(e.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzf(int i) {
        synchronized (this.zza) {
            this.zza.zzn(i);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzg(zzww zzwwVar) {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzh(zzxj zzxjVar) {
        synchronized (this.zzb) {
            this.zzb.zzb(zzxjVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzi(zzxm zzxmVar) {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzj(int i) {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzk(int i) {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzl(zzaew zzaewVar) {
        synchronized (this.zza) {
            this.zza.zzk(this.zzb, zzaewVar);
        }
        if (this.zzb.zzh()) {
            zzaewVar.zzg();
        }
        try {
            synchronized (this.zzb) {
                this.zzb.zze();
                this.zzb.zzg();
            }
        } catch (zzabf e) {
            synchronized (this.zza) {
                this.zza.zzg(e.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzm(InputStream inputStream) {
        try {
            synchronized (this.zzb) {
                this.zzb.zzd(inputStream);
                this.zzb.zzg();
            }
        } catch (zzabf e) {
            synchronized (this.zza) {
                this.zza.zzg(e.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final boolean zzn() {
        return this.zzb.zzh();
    }
}
