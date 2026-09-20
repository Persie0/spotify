package com.google.android.gms.internal.meet_coactivities;

import com.spotify.player.model.ContextTrack;
import java.net.URI;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzaku {
    public final URI zza;
    public final zzaao zzb;

    public zzaku(URI uri, zzaao zzaaoVar) {
        c95.m31848n(uri, "targetUri");
        this.zza = uri;
        c95.m31848n(zzaaoVar, ContextTrack.Metadata.KEY_PROVIDER);
        this.zzb = zzaaoVar;
    }
}
