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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/PlayerOptionsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/PlayerOptions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayerOptionsJsonAdapter extends hk60<PlayerOptions> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4593a = xl60.C2578b.m91389a("shuffle", "repeat");

    /* JADX INFO: renamed from: b */
    public final hk60 f4594b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4595c;

    public PlayerOptionsJsonAdapter(p0i0 p0i0Var) {
        Class cls = Boolean.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f4594b = p0i0Var.m68706f(cls, gbuVar, "shuffle");
        this.f4595c = p0i0Var.m68706f(Integer.TYPE, gbuVar, "repeat");
    }

    @Override // p204p.hk60
    public final PlayerOptions fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Integer num = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4593a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                bool = (Boolean) this.f4594b.fromJson(xl60Var);
                if (bool == null) {
                    throw f0b1.m40470x("shuffle", "shuffle", xl60Var);
                }
            } else if (iMo51071K == 1 && (num = (Integer) this.f4595c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("repeat", "repeat", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (bool == null) {
            throw f0b1.m40461o("shuffle", "shuffle", xl60Var);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (num != null) {
            return new PlayerOptions(zBooleanValue, num.intValue());
        }
        throw f0b1.m40461o("repeat", "repeat", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, PlayerOptions playerOptions) {
        PlayerOptions playerOptions2 = playerOptions;
        if (playerOptions2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("shuffle");
        ydj.m93455n(playerOptions2.shuffle, this.f4594b, rm60Var, "repeat");
        this.f4595c.toJson(rm60Var, Integer.valueOf(playerOptions2.repeat));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(35, "GeneratedJsonAdapter(PlayerOptions)");
    }
}
