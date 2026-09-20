package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationSectionItemModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/ExternalIntegrationSectionItemModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalIntegrationSectionItemModelJsonAdapter extends hk60<ExternalIntegrationSectionItemModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4017a = xl60.C2578b.m91389a(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "uri", "image_url", ContextTrack.Metadata.KEY_IS_EXPLICIT, ContextTrack.Metadata.KEY_IS_19_PLUS, "episode_release_date", "duration", "num_items", "background_hex_color");

    /* JADX INFO: renamed from: b */
    public final hk60 f4018b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4019c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4020d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4021e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4022f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor f4023g;

    public ExternalIntegrationSectionItemModelJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4018b = p0i0Var.m68706f(String.class, gbuVar, ContextTrack.Metadata.KEY_TITLE);
        this.f4019c = p0i0Var.m68706f(String.class, gbuVar, ContextTrack.Metadata.KEY_SUBTITLE);
        this.f4020d = p0i0Var.m68706f(Boolean.class, gbuVar, "isExplicit");
        this.f4021e = p0i0Var.m68706f(Long.class, gbuVar, "episodeReleaseDate");
        this.f4022f = p0i0Var.m68706f(Integer.class, gbuVar, "numItems");
    }

    @Override // p204p.hk60
    public final ExternalIntegrationSectionItemModel fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Long l2 = null;
        Integer num = null;
        String str5 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f4017a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) this.f4018b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.f4019c.fromJson(xl60Var);
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f4019c.fromJson(xl60Var);
                    break;
                case 3:
                    str4 = (String) this.f4019c.fromJson(xl60Var);
                    break;
                case 4:
                    bool = (Boolean) this.f4020d.fromJson(xl60Var);
                    i &= -17;
                    break;
                case 5:
                    bool2 = (Boolean) this.f4020d.fromJson(xl60Var);
                    i &= -33;
                    break;
                case 6:
                    l = (Long) this.f4021e.fromJson(xl60Var);
                    i &= -65;
                    break;
                case 7:
                    l2 = (Long) this.f4021e.fromJson(xl60Var);
                    i &= -129;
                    break;
                case 8:
                    num = (Integer) this.f4022f.fromJson(xl60Var);
                    i &= -257;
                    break;
                case 9:
                    str5 = (String) this.f4019c.fromJson(xl60Var);
                    i &= -513;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -1011) {
            Integer num2 = num;
            Long l3 = l2;
            Long l4 = l;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            String str6 = str4;
            String str7 = str3;
            String str8 = str2;
            String str9 = str;
            if (str9 != null) {
                return new ExternalIntegrationSectionItemModel(str9, str8, str7, str6, bool4, bool3, l4, l3, num2, str5);
            }
            throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
        }
        Integer num3 = num;
        Long l5 = l2;
        Long l6 = l;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        Constructor declaredConstructor = this.f4023g;
        if (declaredConstructor == null) {
            declaredConstructor = ExternalIntegrationSectionItemModel.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Boolean.class, Boolean.class, Long.class, Long.class, Integer.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4023g = declaredConstructor;
        }
        if (str13 == null) {
            throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
        }
        return (ExternalIntegrationSectionItemModel) declaredConstructor.newInstance(str13, str12, str11, str10, bool6, bool5, l6, l5, num3, str5, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ExternalIntegrationSectionItemModel externalIntegrationSectionItemModel) {
        ExternalIntegrationSectionItemModel externalIntegrationSectionItemModel2 = externalIntegrationSectionItemModel;
        if (externalIntegrationSectionItemModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        this.f4018b.toJson(rm60Var, externalIntegrationSectionItemModel2.com.spotify.player.model.ContextTrack.Metadata.KEY_TITLE java.lang.String);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
        String str = externalIntegrationSectionItemModel2.com.spotify.player.model.ContextTrack.Metadata.KEY_SUBTITLE java.lang.String;
        hk60 hk60Var = this.f4019c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("uri");
        hk60Var.toJson(rm60Var, externalIntegrationSectionItemModel2.uri);
        rm60Var.mo56894s("image_url");
        hk60Var.toJson(rm60Var, externalIntegrationSectionItemModel2.imageUrl);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_IS_EXPLICIT);
        Boolean bool = externalIntegrationSectionItemModel2.isExplicit;
        hk60 hk60Var2 = this.f4020d;
        hk60Var2.toJson(rm60Var, bool);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_IS_19_PLUS);
        hk60Var2.toJson(rm60Var, externalIntegrationSectionItemModel2.is19Plus);
        rm60Var.mo56894s("episode_release_date");
        Long l = externalIntegrationSectionItemModel2.episodeReleaseDate;
        hk60 hk60Var3 = this.f4021e;
        hk60Var3.toJson(rm60Var, l);
        rm60Var.mo56894s("duration");
        hk60Var3.toJson(rm60Var, externalIntegrationSectionItemModel2.duration);
        rm60Var.mo56894s("num_items");
        this.f4022f.toJson(rm60Var, externalIntegrationSectionItemModel2.numItems);
        rm60Var.mo56894s("background_hex_color");
        hk60Var.toJson(rm60Var, externalIntegrationSectionItemModel2.backgroundHexColor);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(57, "GeneratedJsonAdapter(ExternalIntegrationSectionItemModel)");
    }
}
