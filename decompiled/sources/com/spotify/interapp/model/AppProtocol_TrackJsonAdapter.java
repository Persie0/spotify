package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_TrackJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$Track;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_TrackJsonAdapter extends hk60<AppProtocol$Track> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4571a = xl60.C2578b.m91389a("artist", "artists", "album", "saved", "duration_ms", "name", "uri", "uid", "image_id", "is_episode", "is_podcast");

    /* JADX INFO: renamed from: b */
    public final hk60 f4572b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4573c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4574d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4575e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4576f;

    /* JADX INFO: renamed from: g */
    public final hk60 f4577g;

    public AppProtocol_TrackJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4572b = p0i0Var.m68706f(AppProtocol$Artist.class, gbuVar, "artist");
        this.f4573c = p0i0Var.m68706f(mp91.m62457j(List.class, AppProtocol$Artist.class), gbuVar, "artists");
        this.f4574d = p0i0Var.m68706f(AppProtocol$Album.class, gbuVar, "album");
        this.f4575e = p0i0Var.m68706f(Boolean.class, gbuVar, "saved");
        this.f4576f = p0i0Var.m68706f(Long.class, gbuVar, "duration");
        this.f4577g = p0i0Var.m68706f(String.class, gbuVar, "name");
    }

    @Override // p204p.hk60
    public final AppProtocol$Track fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        AppProtocol$Artist appProtocol$Artist = null;
        List list = null;
        AppProtocol$Album appProtocol$Album = null;
        Boolean bool = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4571a);
            hk60 hk60Var = this.f4575e;
            hk60 hk60Var2 = this.f4577g;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    appProtocol$Artist = (AppProtocol$Artist) this.f4572b.fromJson(xl60Var);
                    break;
                case 1:
                    list = (List) this.f4573c.fromJson(xl60Var);
                    break;
                case 2:
                    appProtocol$Album = (AppProtocol$Album) this.f4574d.fromJson(xl60Var);
                    break;
                case 3:
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                    break;
                case 4:
                    l = (Long) this.f4576f.fromJson(xl60Var);
                    break;
                case 5:
                    str = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 6:
                    str2 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 7:
                    str3 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 8:
                    str4 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 9:
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                    break;
                case 10:
                    bool3 = (Boolean) hk60Var.fromJson(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$Track(appProtocol$Artist, list, appProtocol$Album, bool, l, str, str2, str3, str4, bool2, bool3);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$Track appProtocol$Track) {
        AppProtocol$Track appProtocol$Track2 = appProtocol$Track;
        if (appProtocol$Track2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("artist");
        this.f4572b.toJson(rm60Var, appProtocol$Track2.artist);
        rm60Var.mo56894s("artists");
        this.f4573c.toJson(rm60Var, appProtocol$Track2.artists);
        rm60Var.mo56894s("album");
        this.f4574d.toJson(rm60Var, appProtocol$Track2.album);
        rm60Var.mo56894s("saved");
        Boolean bool = appProtocol$Track2.saved;
        hk60 hk60Var = this.f4575e;
        hk60Var.toJson(rm60Var, bool);
        rm60Var.mo56894s("duration_ms");
        this.f4576f.toJson(rm60Var, appProtocol$Track2.duration);
        rm60Var.mo56894s("name");
        String str = appProtocol$Track2.name;
        hk60 hk60Var2 = this.f4577g;
        hk60Var2.toJson(rm60Var, str);
        rm60Var.mo56894s("uri");
        hk60Var2.toJson(rm60Var, appProtocol$Track2.uri);
        rm60Var.mo56894s("uid");
        hk60Var2.toJson(rm60Var, appProtocol$Track2.uid);
        rm60Var.mo56894s("image_id");
        hk60Var2.toJson(rm60Var, appProtocol$Track2.imageUri);
        rm60Var.mo56894s("is_episode");
        hk60Var.toJson(rm60Var, appProtocol$Track2.isEpisode);
        rm60Var.mo56894s("is_podcast");
        hk60Var.toJson(rm60Var, appProtocol$Track2.isPodcast);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(39, "GeneratedJsonAdapter(AppProtocol.Track)");
    }
}
