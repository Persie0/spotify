package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/VisibilityJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/Visibility;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VisibilityJsonAdapter extends hk60<Visibility> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4975a = xl60.C2578b.m91389a("nudge", "persistent_surface", "invite_notification");

    /* JADX INFO: renamed from: b */
    public final hk60 f4976b;

    public VisibilityJsonAdapter(p0i0 p0i0Var) {
        this.f4976b = p0i0Var.m68706f(Boolean.TYPE, gbu.f78413a, "nudge");
    }

    @Override // p204p.hk60
    public final Visibility fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4975a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4976b;
                if (iMo51071K == 0) {
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool == null) {
                        throw f0b1.m40470x("nudge", "nudge", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("persistentSurface", "persistent_surface", xl60Var);
                    }
                } else if (iMo51071K == 2 && (bool3 = (Boolean) hk60Var.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("inviteNotification", "invite_notification", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (bool == null) {
            throw f0b1.m40461o("nudge", "nudge", xl60Var);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (bool2 == null) {
            throw f0b1.m40461o("persistentSurface", "persistent_surface", xl60Var);
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        if (bool3 != null) {
            return new Visibility(zBooleanValue, zBooleanValue2, bool3.booleanValue());
        }
        throw f0b1.m40461o("inviteNotification", "invite_notification", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Visibility visibility) {
        Visibility visibility2 = visibility;
        if (visibility2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("nudge");
        Boolean boolValueOf = Boolean.valueOf(visibility2.getNudge());
        hk60 hk60Var = this.f4976b;
        hk60Var.toJson(rm60Var, boolValueOf);
        rm60Var.mo56894s("persistent_surface");
        hk60Var.toJson(rm60Var, Boolean.valueOf(visibility2.getPersistentSurface()));
        rm60Var.mo56894s("invite_notification");
        hk60Var.toJson(rm60Var, Boolean.valueOf(visibility2.getInviteNotification()));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(32, "GeneratedJsonAdapter(Visibility)");
    }
}
