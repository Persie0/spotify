package com.google.android.gms.internal.meet_coactivities;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import p204p.c95;
import p204p.u651;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahe extends zzaao {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1875a = 0;
    private static final boolean zza = zzym.zza(zzahe.class.getClassLoader());

    @Override // com.google.android.gms.internal.meet_coactivities.zzaai
    public final zzaan zza(URI uri, zzaag zzaagVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        c95.m31848n(path, "targetPath");
        c95.m31846l(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        return new zzahd(uri.getAuthority(), path.substring(1), zzaagVar, zzahx.zzi, new u651(), zza);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaai
    public final String zzb() {
        return "dns";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final Collection zzd() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final boolean zze() {
        return true;
    }
}
