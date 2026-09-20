package com.spotify.betamax.contextplayercoordinatorimpl.model;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptionsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContextPlayerOptionsJsonAdapter extends hk60<ContextPlayerOptions> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3022a = xl60.C2578b.m91389a("shuffling_context", "repeating_context", "repeating_track");

    /* JADX INFO: renamed from: b */
    public final hk60 f3023b;

    public ContextPlayerOptionsJsonAdapter(p0i0 p0i0Var) {
        this.f3023b = p0i0Var.m68706f(Boolean.TYPE, gbu.f78413a, "shufflingContext");
    }

    @Override // p204p.hk60
    public final ContextPlayerOptions fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3022a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f3023b;
                if (iMo51071K == 0) {
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool == null) {
                        throw f0b1.m40470x("shufflingContext", "shuffling_context", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("repeatingContext", "repeating_context", xl60Var);
                    }
                } else if (iMo51071K == 2 && (bool3 = (Boolean) hk60Var.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("repeatingTrack", "repeating_track", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (bool == null) {
            throw f0b1.m40461o("shufflingContext", "shuffling_context", xl60Var);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (bool2 == null) {
            throw f0b1.m40461o("repeatingContext", "repeating_context", xl60Var);
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        if (bool3 != null) {
            return new ContextPlayerOptions(zBooleanValue, zBooleanValue2, bool3.booleanValue());
        }
        throw f0b1.m40461o("repeatingTrack", "repeating_track", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ContextPlayerOptions contextPlayerOptions) {
        ContextPlayerOptions contextPlayerOptions2 = contextPlayerOptions;
        if (contextPlayerOptions2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("shuffling_context");
        boolean z = contextPlayerOptions2.shufflingContext;
        hk60 hk60Var = this.f3023b;
        ydj.m93455n(z, hk60Var, rm60Var, "repeating_context");
        ydj.m93455n(contextPlayerOptions2.repeatingContext, hk60Var, rm60Var, "repeating_track");
        hk60Var.toJson(rm60Var, Boolean.valueOf(contextPlayerOptions2.repeatingTrack));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(42, "GeneratedJsonAdapter(ContextPlayerOptions)");
    }
}
