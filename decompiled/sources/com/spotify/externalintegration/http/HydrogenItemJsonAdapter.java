package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/HydrogenItemJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/HydrogenItem;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HydrogenItemJsonAdapter extends hk60<HydrogenItem> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4040a = xl60.C2578b.m91389a("spotify_uri", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "image", "enhancing_attributes", ContextTrack.Metadata.KEY_CONTEXT_URI);

    /* JADX INFO: renamed from: b */
    public final hk60 f4041b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4042c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4043d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4044e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4045f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor f4046g;

    public HydrogenItemJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4041b = p0i0Var.m68706f(String.class, gbuVar, "uri");
        this.f4042c = p0i0Var.m68706f(mp91.m62457j(List.class, HydrogenSubtitle.class), gbuVar, ContextTrack.Metadata.KEY_SUBTITLE);
        this.f4043d = p0i0Var.m68706f(HydrogenImage.class, gbuVar, "image");
        this.f4044e = p0i0Var.m68706f(HydrogenEnhancingAttributes.class, gbuVar, "enhancingAttributes");
        this.f4045f = p0i0Var.m68706f(String.class, gbuVar, "contextUri");
    }

    @Override // p204p.hk60
    public final HydrogenItem fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        HydrogenImage hydrogenImage = null;
        HydrogenEnhancingAttributes hydrogenEnhancingAttributes = null;
        String str3 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f4040a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) this.f4041b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("uri", "spotify_uri", xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.f4041b.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
                    }
                    break;
                    break;
                case 2:
                    list = (List) this.f4042c.fromJson(xl60Var);
                    if (list == null) {
                        throw f0b1.m40470x(ContextTrack.Metadata.KEY_SUBTITLE, ContextTrack.Metadata.KEY_SUBTITLE, xl60Var);
                    }
                    break;
                    break;
                case 3:
                    hydrogenImage = (HydrogenImage) this.f4043d.fromJson(xl60Var);
                    if (hydrogenImage == null) {
                        throw f0b1.m40470x("image", "image", xl60Var);
                    }
                    break;
                    break;
                case 4:
                    hydrogenEnhancingAttributes = (HydrogenEnhancingAttributes) this.f4044e.fromJson(xl60Var);
                    break;
                case 5:
                    str3 = (String) this.f4045f.fromJson(xl60Var);
                    i = -33;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -33) {
            String str4 = str3;
            HydrogenEnhancingAttributes hydrogenEnhancingAttributes2 = hydrogenEnhancingAttributes;
            HydrogenImage hydrogenImage2 = hydrogenImage;
            List list2 = list;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw f0b1.m40461o("uri", "spotify_uri", xl60Var);
            }
            if (str5 == null) {
                throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
            }
            if (list2 == null) {
                throw f0b1.m40461o(ContextTrack.Metadata.KEY_SUBTITLE, ContextTrack.Metadata.KEY_SUBTITLE, xl60Var);
            }
            if (hydrogenImage2 != null) {
                return new HydrogenItem(str6, str5, list2, hydrogenImage2, hydrogenEnhancingAttributes2, str4);
            }
            throw f0b1.m40461o("image", "image", xl60Var);
        }
        String str7 = str3;
        HydrogenEnhancingAttributes hydrogenEnhancingAttributes3 = hydrogenEnhancingAttributes;
        HydrogenImage hydrogenImage3 = hydrogenImage;
        List list3 = list;
        String str8 = str2;
        String str9 = str;
        Constructor declaredConstructor = this.f4046g;
        if (declaredConstructor == null) {
            declaredConstructor = HydrogenItem.class.getDeclaredConstructor(String.class, String.class, List.class, HydrogenImage.class, HydrogenEnhancingAttributes.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4046g = declaredConstructor;
        }
        if (str9 == null) {
            throw f0b1.m40461o("uri", "spotify_uri", xl60Var);
        }
        if (str8 == null) {
            throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
        }
        if (list3 == null) {
            throw f0b1.m40461o(ContextTrack.Metadata.KEY_SUBTITLE, ContextTrack.Metadata.KEY_SUBTITLE, xl60Var);
        }
        if (hydrogenImage3 != null) {
            return (HydrogenItem) declaredConstructor.newInstance(str9, str8, list3, hydrogenImage3, hydrogenEnhancingAttributes3, str7, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("image", "image", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, HydrogenItem hydrogenItem) {
        HydrogenItem hydrogenItem2 = hydrogenItem;
        if (hydrogenItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("spotify_uri");
        String str = hydrogenItem2.uri;
        hk60 hk60Var = this.f4041b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        hk60Var.toJson(rm60Var, hydrogenItem2.f4034b);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
        this.f4042c.toJson(rm60Var, hydrogenItem2.f4035c);
        rm60Var.mo56894s("image");
        this.f4043d.toJson(rm60Var, hydrogenItem2.f4036d);
        rm60Var.mo56894s("enhancing_attributes");
        this.f4044e.toJson(rm60Var, hydrogenItem2.enhancingAttributes);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_CONTEXT_URI);
        this.f4045f.toJson(rm60Var, hydrogenItem2.contextUri);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(HydrogenItem)");
    }
}
