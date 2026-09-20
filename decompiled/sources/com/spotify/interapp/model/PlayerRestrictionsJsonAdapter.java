package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/PlayerRestrictionsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/PlayerRestrictions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayerRestrictionsJsonAdapter extends hk60<PlayerRestrictions> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4602a = xl60.C2578b.m91389a("can_skip_next", "can_skip_prev", "can_repeat_track", "can_repeat_context", "can_toggle_shuffle", "can_seek");

    /* JADX INFO: renamed from: b */
    public final hk60 f4603b;

    public PlayerRestrictionsJsonAdapter(p0i0 p0i0Var) {
        this.f4603b = p0i0Var.m68706f(Boolean.TYPE, gbu.f78413a, "canSkipNext");
    }

    @Override // p204p.hk60
    public final PlayerRestrictions fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (true) {
            Boolean bool7 = bool;
            Boolean bool8 = bool2;
            Boolean bool9 = bool3;
            Boolean bool10 = bool4;
            Boolean bool11 = bool5;
            if (!xl60Var.mo51079i()) {
                Boolean bool12 = bool6;
                xl60Var.mo51078f();
                if (bool7 == null) {
                    throw f0b1.m40461o("canSkipNext", "can_skip_next", xl60Var);
                }
                boolean zBooleanValue = bool7.booleanValue();
                if (bool8 == null) {
                    throw f0b1.m40461o("canSkipPrev", "can_skip_prev", xl60Var);
                }
                boolean zBooleanValue2 = bool8.booleanValue();
                if (bool9 == null) {
                    throw f0b1.m40461o("canRepeatTrack", "can_repeat_track", xl60Var);
                }
                boolean zBooleanValue3 = bool9.booleanValue();
                if (bool10 == null) {
                    throw f0b1.m40461o("canRepeatContext", "can_repeat_context", xl60Var);
                }
                boolean zBooleanValue4 = bool10.booleanValue();
                if (bool11 == null) {
                    throw f0b1.m40461o("canToggleShuffle", "can_toggle_shuffle", xl60Var);
                }
                boolean zBooleanValue5 = bool11.booleanValue();
                if (bool12 != null) {
                    return new PlayerRestrictions(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool12.booleanValue());
                }
                throw f0b1.m40461o("canSeek", "can_seek", xl60Var);
            }
            int iMo51071K = xl60Var.mo51071K(this.f4602a);
            Boolean bool13 = bool6;
            hk60 hk60Var = this.f4603b;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    bool = bool7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool13;
                    break;
                case 0:
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool == null) {
                        throw f0b1.m40470x("canSkipNext", "can_skip_next", xl60Var);
                    }
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool13;
                    break;
                case 1:
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("canSkipPrev", "can_skip_prev", xl60Var);
                    }
                    bool = bool7;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool13;
                    break;
                    break;
                case 2:
                    bool3 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool3 == null) {
                        throw f0b1.m40470x("canRepeatTrack", "can_repeat_track", xl60Var);
                    }
                    bool = bool7;
                    bool2 = bool8;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool13;
                    break;
                    break;
                case 3:
                    bool4 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool4 == null) {
                        throw f0b1.m40470x("canRepeatContext", "can_repeat_context", xl60Var);
                    }
                    bool = bool7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool5 = bool11;
                    bool6 = bool13;
                    break;
                    break;
                case 4:
                    bool5 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool5 == null) {
                        throw f0b1.m40470x("canToggleShuffle", "can_toggle_shuffle", xl60Var);
                    }
                    bool = bool7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool6 = bool13;
                    break;
                    break;
                case 5:
                    bool6 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool6 == null) {
                        throw f0b1.m40470x("canSeek", "can_seek", xl60Var);
                    }
                    bool = bool7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    break;
                    break;
                default:
                    bool = bool7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool13;
                    break;
            }
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, PlayerRestrictions playerRestrictions) {
        PlayerRestrictions playerRestrictions2 = playerRestrictions;
        if (playerRestrictions2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("can_skip_next");
        boolean z = playerRestrictions2.canSkipNext;
        hk60 hk60Var = this.f4603b;
        ydj.m93455n(z, hk60Var, rm60Var, "can_skip_prev");
        ydj.m93455n(playerRestrictions2.canSkipPrev, hk60Var, rm60Var, "can_repeat_track");
        ydj.m93455n(playerRestrictions2.canRepeatTrack, hk60Var, rm60Var, "can_repeat_context");
        ydj.m93455n(playerRestrictions2.canRepeatContext, hk60Var, rm60Var, "can_toggle_shuffle");
        ydj.m93455n(playerRestrictions2.canToggleShuffle, hk60Var, rm60Var, "can_seek");
        hk60Var.toJson(rm60Var, Boolean.valueOf(playerRestrictions2.canSeek));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(40, "GeneratedJsonAdapter(PlayerRestrictions)");
    }
}
