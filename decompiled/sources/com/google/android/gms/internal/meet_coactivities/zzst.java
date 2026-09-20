package com.google.android.gms.internal.meet_coactivities;

import com.google.android.gms.internal.meet_coactivities.zzst;
import com.google.android.gms.internal.meet_coactivities.zzsz;

/* JADX INFO: loaded from: classes.dex */
public class zzst<MessageType extends zzsz<MessageType, BuilderType>, BuilderType extends zzst<MessageType, BuilderType>> extends zzqz<MessageType, BuilderType> {
    protected zzsz zza;
    private final zzsz zzb;

    public zzst(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzQ()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzD();
    }

    private static void zza(Object obj, Object obj2) {
        zzun.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzug
    public final /* synthetic */ zzuf zzT() {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzug
    public final boolean zzU() {
        return zzsz.zzP(this.zza, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzqz
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzst zzh() {
        zzst zzstVar = (zzst) this.zzb.zzi(5, null, null);
        zzstVar.zza = zzm();
        return zzstVar;
    }

    public final zzst zzj(zzsz zzszVar) {
        if (!this.zzb.equals(zzszVar)) {
            if (!this.zza.zzQ()) {
                zzp();
            }
            zza(this.zza, zzszVar);
        }
        return this;
    }

    public final MessageType zzk() {
        MessageType messagetype = (MessageType) zzm();
        if (zzsz.zzP(messagetype, true)) {
            return messagetype;
        }
        throw new zzve(messagetype);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzue
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public MessageType zzm() {
        if (!this.zza.zzQ()) {
            return (MessageType) this.zza;
        }
        this.zza.zzL();
        return (MessageType) this.zza;
    }

    public final void zzo() {
        if (this.zza.zzQ()) {
            return;
        }
        zzp();
    }

    public void zzp() {
        zzsz zzszVarZzD = this.zzb.zzD();
        zza(zzszVarZzD, this.zza);
        this.zza = zzszVarZzD;
    }
}
