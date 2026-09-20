package com.google.android.gms.internal.meet_coactivities;

import p204p.vf40;
import p204p.xf40;

/* JADX INFO: loaded from: classes.dex */
public final class zzij implements zzig {
    private static final xf40 zza;

    static {
        vf40 vf40VarM90449a = xf40.m90449a();
        vf40VarM90449a.mo85345e(845714248040L, "youtube");
        vf40VarM90449a.mo85345e(523214873043L, "youtube-music");
        vf40VarM90449a.mo85345e(583859152812L, "testapp");
        vf40VarM90449a.mo85345e(32147523519L, "samsung-notes");
        vf40VarM90449a.mo85345e(878579687799L, "kahoot");
        vf40VarM90449a.mo85345e(135083966748L, "spotify");
        zza = vf40VarM90449a.m85342b(true);
    }

    private zzij() {
        throw null;
    }

    public static zzij zzb() {
        return zzih.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzig
    public final String zza(long j) {
        Object obj = zza.get(Long.valueOf(j));
        if (obj == null) {
            obj = "";
        }
        return (String) obj;
    }

    public /* synthetic */ zzij(zzii zziiVar) {
    }
}
