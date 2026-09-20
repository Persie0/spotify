package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_TrackDataJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$TrackData;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_TrackDataJsonAdapter extends hk60<AppProtocol$TrackData> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4563a = xl60.C2578b.m91389a("album", "artist", "duration_ms", "name", "track_number", "type", "uri", "saved", "rated", "can_save", "can_rate", "can_start_radio", "can_show_more_albums", "can_skip_next", "can_skip_prev", "can_pause", "can_resume", "can_seek", "image_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f4564b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4565c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4566d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4567e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4568f;

    public AppProtocol_TrackDataJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4564b = p0i0Var.m68706f(AppProtocol$Album.class, gbuVar, "album");
        this.f4565c = p0i0Var.m68706f(AppProtocol$Artist.class, gbuVar, "artist");
        this.f4566d = p0i0Var.m68706f(Integer.class, gbuVar, "durationMs");
        this.f4567e = p0i0Var.m68706f(String.class, gbuVar, "name");
        this.f4568f = p0i0Var.m68706f(Boolean.class, gbuVar, "saved");
    }

    @Override // p204p.hk60
    public final AppProtocol$TrackData fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        AppProtocol$Album appProtocol$Album = null;
        AppProtocol$Artist appProtocol$Artist = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Integer num3 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        String str4 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4563a);
            hk60 hk60Var = this.f4566d;
            hk60 hk60Var2 = this.f4567e;
            AppProtocol$Album appProtocol$Album2 = appProtocol$Album;
            hk60 hk60Var3 = this.f4568f;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    appProtocol$Album = (AppProtocol$Album) this.f4564b.fromJson(xl60Var);
                    continue;
                case 1:
                    appProtocol$Artist = (AppProtocol$Artist) this.f4565c.fromJson(xl60Var);
                    break;
                case 2:
                    num = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 3:
                    str = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 4:
                    num2 = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 5:
                    str2 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 6:
                    str3 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 7:
                    bool = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 8:
                    num3 = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 9:
                    bool2 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 10:
                    bool3 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 11:
                    bool4 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 12:
                    bool5 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 13:
                    bool6 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 14:
                    bool7 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 15:
                    bool8 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 16:
                    bool9 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 17:
                    bool10 = (Boolean) hk60Var3.fromJson(xl60Var);
                    break;
                case 18:
                    str4 = (String) hk60Var2.fromJson(xl60Var);
                    break;
            }
            appProtocol$Album = appProtocol$Album2;
        }
        xl60Var.mo51078f();
        return new AppProtocol$TrackData(appProtocol$Album, appProtocol$Artist, num, str, num2, str2, str3, bool, num3, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, str4);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$TrackData appProtocol$TrackData) {
        AppProtocol$TrackData appProtocol$TrackData2 = appProtocol$TrackData;
        if (appProtocol$TrackData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("album");
        this.f4564b.toJson(rm60Var, appProtocol$TrackData2.album);
        rm60Var.mo56894s("artist");
        this.f4565c.toJson(rm60Var, appProtocol$TrackData2.artist);
        rm60Var.mo56894s("duration_ms");
        Integer num = appProtocol$TrackData2.durationMs;
        hk60 hk60Var = this.f4566d;
        hk60Var.toJson(rm60Var, num);
        rm60Var.mo56894s("name");
        String str = appProtocol$TrackData2.name;
        hk60 hk60Var2 = this.f4567e;
        hk60Var2.toJson(rm60Var, str);
        rm60Var.mo56894s("track_number");
        hk60Var.toJson(rm60Var, appProtocol$TrackData2.trackNumber);
        rm60Var.mo56894s("type");
        hk60Var2.toJson(rm60Var, appProtocol$TrackData2.type);
        rm60Var.mo56894s("uri");
        hk60Var2.toJson(rm60Var, appProtocol$TrackData2.uri);
        rm60Var.mo56894s("saved");
        Boolean bool = appProtocol$TrackData2.saved;
        hk60 hk60Var3 = this.f4568f;
        hk60Var3.toJson(rm60Var, bool);
        rm60Var.mo56894s("rated");
        hk60Var.toJson(rm60Var, appProtocol$TrackData2.rated);
        rm60Var.mo56894s("can_save");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canSave);
        rm60Var.mo56894s("can_rate");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canRate);
        rm60Var.mo56894s("can_start_radio");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canStartRadio);
        rm60Var.mo56894s("can_show_more_albums");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canShowMoreAlbums);
        rm60Var.mo56894s("can_skip_next");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canSkipNext);
        rm60Var.mo56894s("can_skip_prev");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canSkipPrev);
        rm60Var.mo56894s("can_pause");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canPause);
        rm60Var.mo56894s("can_resume");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canResume);
        rm60Var.mo56894s("can_seek");
        hk60Var3.toJson(rm60Var, appProtocol$TrackData2.canSeek);
        rm60Var.mo56894s("image_id");
        hk60Var2.toJson(rm60Var, appProtocol$TrackData2.imageUri);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(43, "GeneratedJsonAdapter(AppProtocol.TrackData)");
    }
}
