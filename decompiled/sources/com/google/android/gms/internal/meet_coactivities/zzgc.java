package com.google.android.gms.internal.meet_coactivities;

import p204p.fg90;
import p204p.kj90;

/* JADX INFO: loaded from: classes.dex */
final class zzgc extends zzim {
    private fg90 zza;
    private kj90 zzb;
    private fg90 zzc;
    private fg90 zzd;
    private fg90 zze;
    private fg90 zzf;

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zza(fg90 fg90Var) {
        if (fg90Var == null) {
            throw new NullPointerException("Null coDoingHandlerExecutor");
        }
        this.zzd = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzb(fg90 fg90Var) {
        if (fg90Var == null) {
            throw new NullPointerException("Null coWatchingHandlerExecutor");
        }
        this.zzc = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzc(kj90 kj90Var) {
        if (kj90Var == null) {
            throw new NullPointerException("Null heartbeatExecutor");
        }
        this.zzb = kj90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzd(fg90 fg90Var) {
        if (fg90Var == null) {
            throw new NullPointerException("Null incomingIpcExecutor");
        }
        this.zzf = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zze(fg90 fg90Var) {
        if (fg90Var == null) {
            throw new NullPointerException("Null internalExecutor");
        }
        this.zza = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzim zzf(fg90 fg90Var) {
        if (fg90Var == null) {
            throw new NullPointerException("Null outgoingIpcExecutor");
        }
        this.zze = fg90Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzim
    public final zzin zzg() {
        kj90 kj90Var;
        fg90 fg90Var;
        fg90 fg90Var2;
        fg90 fg90Var3;
        fg90 fg90Var4;
        fg90 fg90Var5 = this.zza;
        if (fg90Var5 != null && (kj90Var = this.zzb) != null && (fg90Var = this.zzc) != null && (fg90Var2 = this.zzd) != null && (fg90Var3 = this.zze) != null && (fg90Var4 = this.zzf) != null) {
            return new zzge(fg90Var5, kj90Var, fg90Var, fg90Var2, fg90Var3, fg90Var4, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" internalExecutor");
        }
        if (this.zzb == null) {
            sb.append(" heartbeatExecutor");
        }
        if (this.zzc == null) {
            sb.append(" coWatchingHandlerExecutor");
        }
        if (this.zzd == null) {
            sb.append(" coDoingHandlerExecutor");
        }
        if (this.zze == null) {
            sb.append(" outgoingIpcExecutor");
        }
        if (this.zzf == null) {
            sb.append(" incomingIpcExecutor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
