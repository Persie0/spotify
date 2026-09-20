package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilitiesJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AvailableJamCapabilitiesJsonAdapter extends hk60<AvailableJamCapabilities> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4691a = xl60.C2578b.m91389a("block_host");

    /* JADX INFO: renamed from: b */
    public final hk60 f4692b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f4693c;

    public AvailableJamCapabilitiesJsonAdapter(p0i0 p0i0Var) {
        this.f4692b = p0i0Var.m68706f(Boolean.TYPE, gbu.f78413a, "blockHost");
    }

    @Override // p204p.hk60
    public final AvailableJamCapabilities fromJson(xl60 xl60Var) throws NoSuchMethodException {
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4691a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                bool = (Boolean) this.f4692b.fromJson(xl60Var);
                if (bool == null) {
                    throw f0b1.m40470x("blockHost", "block_host", xl60Var);
                }
                i = -2;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -2) {
            return new AvailableJamCapabilities(bool.booleanValue());
        }
        Constructor declaredConstructor = this.f4693c;
        if (declaredConstructor == null) {
            declaredConstructor = AvailableJamCapabilities.class.getDeclaredConstructor(Boolean.TYPE, Integer.TYPE, f0b1.f64588c);
            this.f4693c = declaredConstructor;
        }
        return (AvailableJamCapabilities) declaredConstructor.newInstance(bool, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AvailableJamCapabilities availableJamCapabilities) {
        AvailableJamCapabilities availableJamCapabilities2 = availableJamCapabilities;
        if (availableJamCapabilities2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("block_host");
        this.f4692b.toJson(rm60Var, Boolean.valueOf(availableJamCapabilities2.getBlockHost()));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(46, "GeneratedJsonAdapter(AvailableJamCapabilities)");
    }
}
