package com.spotify.connect.castbasic.core.model;

import java.util.Map;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/connect/castbasic/core/model/AuthMessageJsonAdapter;", "Lp/hk60;", "Lcom/spotify/connect/castbasic/core/model/AuthMessage;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_connect_castbasic-castbasic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AuthMessageJsonAdapter extends hk60<AuthMessage> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3377a = xl60.C2578b.m91389a("type", "payload");

    /* JADX INFO: renamed from: b */
    public final hk60 f3378b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3379c;

    public AuthMessageJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f3378b = p0i0Var.m68706f(String.class, gbuVar, "type");
        this.f3379c = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, Object.class), gbuVar, "payload");
    }

    @Override // p204p.hk60
    public final AuthMessage fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        Map map = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3377a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f3378b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("type", "type", xl60Var);
                }
            } else if (iMo51071K == 1 && (map = (Map) this.f3379c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("payload", "payload", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("type", "type", xl60Var);
        }
        if (map != null) {
            return new AuthMessage(str, map);
        }
        throw f0b1.m40461o("payload", "payload", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AuthMessage authMessage) {
        AuthMessage authMessage2 = authMessage;
        if (authMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("type");
        this.f3378b.toJson(rm60Var, authMessage2.type);
        rm60Var.mo56894s("payload");
        this.f3379c.toJson(rm60Var, authMessage2.payload);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(33, "GeneratedJsonAdapter(AuthMessage)");
    }
}
