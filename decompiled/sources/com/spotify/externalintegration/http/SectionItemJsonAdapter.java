package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/SectionItemJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/SectionItem;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SectionItemJsonAdapter extends hk60<SectionItem> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4070a = xl60.C2578b.m91389a("image", "links", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "spotify_uri");

    /* JADX INFO: renamed from: b */
    public final hk60 f4071b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4072c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4073d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4074e;

    public SectionItemJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4071b = p0i0Var.m68706f(Image.class, gbuVar, "image");
        this.f4072c = p0i0Var.m68706f(Links.class, gbuVar, "links");
        this.f4073d = p0i0Var.m68706f(String.class, gbuVar, ContextTrack.Metadata.KEY_TITLE);
        this.f4074e = p0i0Var.m68706f(String.class, gbuVar, ContextTrack.Metadata.KEY_SUBTITLE);
    }

    @Override // p204p.hk60
    public final SectionItem fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Image image = null;
        Links links = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4070a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                image = (Image) this.f4071b.fromJson(xl60Var);
                if (image == null) {
                    throw f0b1.m40470x("image", "image", xl60Var);
                }
            } else if (iMo51071K == 1) {
                links = (Links) this.f4072c.fromJson(xl60Var);
                if (links == null) {
                    throw f0b1.m40470x("links", "links", xl60Var);
                }
            } else if (iMo51071K != 2) {
                hk60 hk60Var = this.f4074e;
                if (iMo51071K == 3) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 4) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                str = (String) this.f4073d.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
                }
            }
        }
        xl60Var.mo51078f();
        if (image == null) {
            throw f0b1.m40461o("image", "image", xl60Var);
        }
        if (links == null) {
            throw f0b1.m40461o("links", "links", xl60Var);
        }
        if (str != null) {
            return new SectionItem(image, links, str, str2, str3);
        }
        throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SectionItem sectionItem) {
        SectionItem sectionItem2 = sectionItem;
        if (sectionItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("image");
        this.f4071b.toJson(rm60Var, sectionItem2.f4065a);
        rm60Var.mo56894s("links");
        this.f4072c.toJson(rm60Var, sectionItem2.f4066b);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        this.f4073d.toJson(rm60Var, sectionItem2.f4067c);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
        String str = sectionItem2.f4068d;
        hk60 hk60Var = this.f4074e;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("spotify_uri");
        hk60Var.toJson(rm60Var, sectionItem2.spotifyUri);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(33, "GeneratedJsonAdapter(SectionItem)");
    }
}
