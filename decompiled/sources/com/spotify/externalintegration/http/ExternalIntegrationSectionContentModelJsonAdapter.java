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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationSectionContentModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/ExternalIntegrationSectionContentModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalIntegrationSectionContentModelJsonAdapter extends hk60<ExternalIntegrationSectionContentModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4001a = xl60.C2578b.m91389a("name", ContextTrack.Metadata.KEY_TITLE, "uri", "image_uri", "section_items", "presentation", "ad_tracking_metadata", "response_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f4002b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4003c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4004d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4005e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor f4006f;

    public ExternalIntegrationSectionContentModelJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4002b = p0i0Var.m68706f(String.class, gbuVar, "name");
        this.f4003c = p0i0Var.m68706f(String.class, gbuVar, "uri");
        this.f4004d = p0i0Var.m68706f(mp91.m62457j(List.class, ExternalIntegrationSectionItemModel.class), gbuVar, "sectionItems");
        this.f4005e = p0i0Var.m68706f(AdTrackingMetadataModel.class, gbuVar, "adTrackingMetadata");
    }

    @Override // p204p.hk60
    public final ExternalIntegrationSectionContentModel fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        AdTrackingMetadataModel adTrackingMetadataModel = null;
        String str6 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f4001a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) this.f4002b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("name", "name", xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.f4002b.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
                    }
                    break;
                    break;
                case 2:
                    str3 = (String) this.f4003c.fromJson(xl60Var);
                    break;
                case 3:
                    str4 = (String) this.f4003c.fromJson(xl60Var);
                    break;
                case 4:
                    list = (List) this.f4004d.fromJson(xl60Var);
                    if (list == null) {
                        throw f0b1.m40470x("sectionItems", "section_items", xl60Var);
                    }
                    break;
                    break;
                case 5:
                    str5 = (String) this.f4003c.fromJson(xl60Var);
                    break;
                case 6:
                    adTrackingMetadataModel = (AdTrackingMetadataModel) this.f4005e.fromJson(xl60Var);
                    i &= -65;
                    break;
                case 7:
                    str6 = (String) this.f4003c.fromJson(xl60Var);
                    i &= -129;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -193) {
            String str7 = str6;
            AdTrackingMetadataModel adTrackingMetadataModel2 = adTrackingMetadataModel;
            String str8 = str5;
            List list2 = list;
            String str9 = str4;
            String str10 = str3;
            String str11 = str2;
            String str12 = str;
            if (str12 == null) {
                throw f0b1.m40461o("name", "name", xl60Var);
            }
            if (str11 == null) {
                throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
            }
            if (list2 != null) {
                return new ExternalIntegrationSectionContentModel(str12, str11, str10, str9, list2, str8, adTrackingMetadataModel2, str7);
            }
            throw f0b1.m40461o("sectionItems", "section_items", xl60Var);
        }
        String str13 = str6;
        AdTrackingMetadataModel adTrackingMetadataModel3 = adTrackingMetadataModel;
        String str14 = str5;
        List list3 = list;
        String str15 = str4;
        String str16 = str3;
        String str17 = str2;
        String str18 = str;
        Constructor declaredConstructor = this.f4006f;
        if (declaredConstructor == null) {
            declaredConstructor = ExternalIntegrationSectionContentModel.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, String.class, AdTrackingMetadataModel.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4006f = declaredConstructor;
        }
        Constructor constructor = declaredConstructor;
        if (str18 == null) {
            throw f0b1.m40461o("name", "name", xl60Var);
        }
        if (str17 == null) {
            throw f0b1.m40461o(ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_TITLE, xl60Var);
        }
        if (list3 != null) {
            return (ExternalIntegrationSectionContentModel) constructor.newInstance(str18, str17, str16, str15, list3, str14, adTrackingMetadataModel3, str13, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("sectionItems", "section_items", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ExternalIntegrationSectionContentModel externalIntegrationSectionContentModel) {
        ExternalIntegrationSectionContentModel externalIntegrationSectionContentModel2 = externalIntegrationSectionContentModel;
        if (externalIntegrationSectionContentModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("name");
        String str = externalIntegrationSectionContentModel2.name;
        hk60 hk60Var = this.f4002b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        hk60Var.toJson(rm60Var, externalIntegrationSectionContentModel2.com.spotify.player.model.ContextTrack.Metadata.KEY_TITLE java.lang.String);
        rm60Var.mo56894s("uri");
        String str2 = externalIntegrationSectionContentModel2.uri;
        hk60 hk60Var2 = this.f4003c;
        hk60Var2.toJson(rm60Var, str2);
        rm60Var.mo56894s("image_uri");
        hk60Var2.toJson(rm60Var, externalIntegrationSectionContentModel2.imageUri);
        rm60Var.mo56894s("section_items");
        this.f4004d.toJson(rm60Var, externalIntegrationSectionContentModel2.sectionItems);
        rm60Var.mo56894s("presentation");
        hk60Var2.toJson(rm60Var, externalIntegrationSectionContentModel2.presentation);
        rm60Var.mo56894s("ad_tracking_metadata");
        this.f4005e.toJson(rm60Var, externalIntegrationSectionContentModel2.adTrackingMetadata);
        rm60Var.mo56894s("response_id");
        hk60Var2.toJson(rm60Var, externalIntegrationSectionContentModel2.responseId);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(60, "GeneratedJsonAdapter(ExternalIntegrationSectionContentModel)");
    }
}
