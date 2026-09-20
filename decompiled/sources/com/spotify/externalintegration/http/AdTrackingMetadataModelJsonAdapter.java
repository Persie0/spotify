package com.spotify.externalintegration.http;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/AdTrackingMetadataModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AdTrackingMetadataModelJsonAdapter extends hk60<AdTrackingMetadataModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3962a = xl60.C2578b.m91389a("event_clicked", "event_viewed", "id", "creativeId", "playbackId", "productName", "lineitemId", "headerText", "headerIconName", "previewEntityUri", "slot");

    /* JADX INFO: renamed from: b */
    public final hk60 f3963b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3964c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f3965d;

    public AdTrackingMetadataModelJsonAdapter(p0i0 p0i0Var) {
        ParameterizedType parameterizedTypeM62457j = mp91.m62457j(List.class, String.class);
        gbu gbuVar = gbu.f78413a;
        this.f3963b = p0i0Var.m68706f(parameterizedTypeM62457j, gbuVar, "eventClickedUrls");
        this.f3964c = p0i0Var.m68706f(String.class, gbuVar, "id");
    }

    @Override // p204p.hk60
    public final AdTrackingMetadataModel fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f3962a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    list = (List) this.f3963b.fromJson(xl60Var);
                    i &= -2;
                    break;
                case 1:
                    list2 = (List) this.f3963b.fromJson(xl60Var);
                    i &= -3;
                    break;
                case 2:
                    str = (String) this.f3964c.fromJson(xl60Var);
                    i &= -5;
                    break;
                case 3:
                    str2 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -9;
                    break;
                case 4:
                    str3 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -17;
                    break;
                case 5:
                    str4 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -33;
                    break;
                case 6:
                    str5 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -65;
                    break;
                case 7:
                    str6 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -129;
                    break;
                case 8:
                    str7 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -257;
                    break;
                case 9:
                    str8 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -513;
                    break;
                case 10:
                    str9 = (String) this.f3964c.fromJson(xl60Var);
                    i &= -1025;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -2048) {
            String str10 = str7;
            String str11 = str6;
            String str12 = str5;
            String str13 = str4;
            String str14 = str3;
            String str15 = str2;
            return new AdTrackingMetadataModel(list, list2, str, str15, str14, str13, str12, str11, str10, str8, str9);
        }
        String str16 = str7;
        String str17 = str6;
        String str18 = str5;
        String str19 = str4;
        String str20 = str3;
        String str21 = str2;
        String str22 = str;
        List list3 = list2;
        List list4 = list;
        Constructor declaredConstructor = this.f3965d;
        if (declaredConstructor == null) {
            declaredConstructor = AdTrackingMetadataModel.class.getDeclaredConstructor(List.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f3965d = declaredConstructor;
        }
        return (AdTrackingMetadataModel) declaredConstructor.newInstance(list4, list3, str22, str21, str20, str19, str18, str17, str16, str8, str9, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AdTrackingMetadataModel adTrackingMetadataModel) {
        AdTrackingMetadataModel adTrackingMetadataModel2 = adTrackingMetadataModel;
        if (adTrackingMetadataModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("event_clicked");
        List list = adTrackingMetadataModel2.eventClickedUrls;
        hk60 hk60Var = this.f3963b;
        hk60Var.toJson(rm60Var, list);
        rm60Var.mo56894s("event_viewed");
        hk60Var.toJson(rm60Var, adTrackingMetadataModel2.eventViewedUrls);
        rm60Var.mo56894s("id");
        String str = adTrackingMetadataModel2.id;
        hk60 hk60Var2 = this.f3964c;
        hk60Var2.toJson(rm60Var, str);
        rm60Var.mo56894s("creativeId");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.creativeId);
        rm60Var.mo56894s("playbackId");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.playbackId);
        rm60Var.mo56894s("productName");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.productName);
        rm60Var.mo56894s("lineitemId");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.lineItemId);
        rm60Var.mo56894s("headerText");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.headerText);
        rm60Var.mo56894s("headerIconName");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.headerIconName);
        rm60Var.mo56894s("previewEntityUri");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.previewEntityUri);
        rm60Var.mo56894s("slot");
        hk60Var2.toJson(rm60Var, adTrackingMetadataModel2.slot);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(45, "GeneratedJsonAdapter(AdTrackingMetadataModel)");
    }
}
