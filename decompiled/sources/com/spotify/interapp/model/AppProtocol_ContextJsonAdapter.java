package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_ContextJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$Context;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_ContextJsonAdapter extends hk60<AppProtocol$Context> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4475a = xl60.C2578b.m91389a("id", "uri", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "type", "repeat_track", "repeat_context", "shuffle", "can_repeat_track", "can_repeat_context", "can_shuffle");

    /* JADX INFO: renamed from: b */
    public final hk60 f4476b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4477c;

    public AppProtocol_ContextJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4476b = p0i0Var.m68706f(String.class, gbuVar, "id");
        this.f4477c = p0i0Var.m68706f(Boolean.class, gbuVar, "repeatTrack");
    }

    @Override // p204p.hk60
    public final AppProtocol$Context fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4475a);
            hk60 hk60Var = this.f4476b;
            hk60 hk60Var2 = this.f4477c;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 1:
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 2:
                    str3 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 3:
                    str4 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 4:
                    str5 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 5:
                    bool = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 6:
                    bool2 = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 7:
                    bool3 = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 8:
                    bool4 = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 9:
                    bool5 = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 10:
                    bool6 = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$Context(str, str2, str3, str4, str5, bool, bool2, bool3, bool4, bool5, bool6);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$Context appProtocol$Context) {
        AppProtocol$Context appProtocol$Context2 = appProtocol$Context;
        if (appProtocol$Context2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("id");
        String str = appProtocol$Context2.id;
        hk60 hk60Var = this.f4476b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("uri");
        hk60Var.toJson(rm60Var, appProtocol$Context2.uri);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        hk60Var.toJson(rm60Var, appProtocol$Context2.com.spotify.player.model.ContextTrack.Metadata.KEY_TITLE java.lang.String);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
        hk60Var.toJson(rm60Var, appProtocol$Context2.com.spotify.player.model.ContextTrack.Metadata.KEY_SUBTITLE java.lang.String);
        rm60Var.mo56894s("type");
        hk60Var.toJson(rm60Var, appProtocol$Context2.type);
        rm60Var.mo56894s("repeat_track");
        Boolean bool = appProtocol$Context2.repeatTrack;
        hk60 hk60Var2 = this.f4477c;
        hk60Var2.toJson(rm60Var, bool);
        rm60Var.mo56894s("repeat_context");
        hk60Var2.toJson(rm60Var, appProtocol$Context2.repeatContext);
        rm60Var.mo56894s("shuffle");
        hk60Var2.toJson(rm60Var, appProtocol$Context2.shuffle);
        rm60Var.mo56894s("can_repeat_track");
        hk60Var2.toJson(rm60Var, appProtocol$Context2.canRepeatTrack);
        rm60Var.mo56894s("can_repeat_context");
        hk60Var2.toJson(rm60Var, appProtocol$Context2.canRepeatContext);
        rm60Var.mo56894s("can_shuffle");
        hk60Var2.toJson(rm60Var, appProtocol$Context2.canShuffle);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(41, "GeneratedJsonAdapter(AppProtocol.Context)");
    }
}
