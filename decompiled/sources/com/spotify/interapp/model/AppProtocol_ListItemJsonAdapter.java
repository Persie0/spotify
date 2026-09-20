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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_ListItemJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$ListItem;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_ListItemJsonAdapter extends hk60<AppProtocol$ListItem> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4504a = xl60.C2578b.m91389a("id", "uid", "uri", "image_id", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "playable", "has_children", "available_offline", "metadata");

    /* JADX INFO: renamed from: b */
    public final hk60 f4505b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4506c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4507d;

    public AppProtocol_ListItemJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4505b = p0i0Var.m68706f(String.class, gbuVar, "id");
        this.f4506c = p0i0Var.m68706f(Boolean.class, gbuVar, "playable");
        this.f4507d = p0i0Var.m68706f(AppProtocol$Metadata.class, gbuVar, "metadata");
    }

    @Override // p204p.hk60
    public final AppProtocol$ListItem fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        AppProtocol$Metadata appProtocol$Metadata = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4504a);
            hk60 hk60Var = this.f4506c;
            hk60 hk60Var2 = this.f4505b;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 1:
                    str2 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 2:
                    str3 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 3:
                    str4 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 4:
                    str5 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 5:
                    str6 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 6:
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                    break;
                case 7:
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                    break;
                case 8:
                    bool3 = (Boolean) hk60Var.fromJson(xl60Var);
                    break;
                case 9:
                    appProtocol$Metadata = (AppProtocol$Metadata) this.f4507d.fromJson(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$ListItem(str, str2, str3, str4, str5, str6, bool, bool2, bool3, appProtocol$Metadata);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$ListItem appProtocol$ListItem) {
        AppProtocol$ListItem appProtocol$ListItem2 = appProtocol$ListItem;
        if (appProtocol$ListItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("id");
        String str = appProtocol$ListItem2.id;
        hk60 hk60Var = this.f4505b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("uid");
        hk60Var.toJson(rm60Var, appProtocol$ListItem2.uid);
        rm60Var.mo56894s("uri");
        hk60Var.toJson(rm60Var, appProtocol$ListItem2.uri);
        rm60Var.mo56894s("image_id");
        hk60Var.toJson(rm60Var, appProtocol$ListItem2.imageUri);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        hk60Var.toJson(rm60Var, appProtocol$ListItem2.com.spotify.player.model.ContextTrack.Metadata.KEY_TITLE java.lang.String);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
        hk60Var.toJson(rm60Var, appProtocol$ListItem2.com.spotify.player.model.ContextTrack.Metadata.KEY_SUBTITLE java.lang.String);
        rm60Var.mo56894s("playable");
        Boolean bool = appProtocol$ListItem2.playable;
        hk60 hk60Var2 = this.f4506c;
        hk60Var2.toJson(rm60Var, bool);
        rm60Var.mo56894s("has_children");
        hk60Var2.toJson(rm60Var, appProtocol$ListItem2.hasChildren);
        rm60Var.mo56894s("available_offline");
        hk60Var2.toJson(rm60Var, appProtocol$ListItem2.availableOffline);
        rm60Var.mo56894s("metadata");
        this.f4507d.toJson(rm60Var, appProtocol$ListItem2.metadata);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(42, "GeneratedJsonAdapter(AppProtocol.ListItem)");
    }
}
