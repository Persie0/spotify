package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.kyx;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_HelloDetailsAppProtocol_InfoJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_HelloDetailsAppProtocol_InfoJsonAdapter extends hk60<AppProtocol$HelloDetailsAppProtocol$Info> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4488a = xl60.C2578b.m91389a("protocol_version", "required_features", "id", "name", "model", kyx.f127932c, "version", "manufacturer", "image_type", "default_image_height", "default_image_width", "default_thumbnail_image_height", "default_thumbnail_image_width", "device_identifier");

    /* JADX INFO: renamed from: b */
    public final hk60 f4489b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4490c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4491d;

    public AppProtocol_HelloDetailsAppProtocol_InfoJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4489b = p0i0Var.m68706f(Integer.class, gbuVar, "protocolVersion");
        this.f4490c = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbuVar, "requiredFeatures");
        this.f4491d = p0i0Var.m68706f(String.class, gbuVar, "id");
    }

    @Override // p204p.hk60
    public final AppProtocol$HelloDetailsAppProtocol$Info fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str8 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4488a);
            hk60 hk60Var = this.f4489b;
            hk60 hk60Var2 = this.f4491d;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    num = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 1:
                    list = (List) this.f4490c.fromJson(xl60Var);
                    break;
                case 2:
                    str = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 3:
                    str2 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 4:
                    str3 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 5:
                    str4 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 6:
                    str5 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 7:
                    str6 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 8:
                    str7 = (String) hk60Var2.fromJson(xl60Var);
                    break;
                case 9:
                    num2 = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 10:
                    num3 = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 11:
                    num4 = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 12:
                    num5 = (Integer) hk60Var.fromJson(xl60Var);
                    break;
                case 13:
                    str8 = (String) hk60Var2.fromJson(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$HelloDetailsAppProtocol$Info(num, list, str, str2, str3, str4, str5, str6, str7, num2, num3, num4, num5, str8);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$HelloDetailsAppProtocol$Info appProtocol$HelloDetailsAppProtocol$Info) {
        AppProtocol$HelloDetailsAppProtocol$Info appProtocol$HelloDetailsAppProtocol$Info2 = appProtocol$HelloDetailsAppProtocol$Info;
        if (appProtocol$HelloDetailsAppProtocol$Info2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("protocol_version");
        Integer num = appProtocol$HelloDetailsAppProtocol$Info2.protocolVersion;
        hk60 hk60Var = this.f4489b;
        hk60Var.toJson(rm60Var, num);
        rm60Var.mo56894s("required_features");
        this.f4490c.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.requiredFeatures);
        rm60Var.mo56894s("id");
        String str = appProtocol$HelloDetailsAppProtocol$Info2.id;
        hk60 hk60Var2 = this.f4491d;
        hk60Var2.toJson(rm60Var, str);
        rm60Var.mo56894s("name");
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.name);
        rm60Var.mo56894s("model");
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.model);
        rm60Var.mo56894s(kyx.f127932c);
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.p.kyx.c java.lang.String);
        rm60Var.mo56894s("version");
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.version);
        rm60Var.mo56894s("manufacturer");
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.manufacturer);
        rm60Var.mo56894s("image_type");
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.imageType);
        rm60Var.mo56894s("default_image_height");
        hk60Var.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.defaultImageHeight);
        rm60Var.mo56894s("default_image_width");
        hk60Var.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.defaultImageWidth);
        rm60Var.mo56894s("default_thumbnail_image_height");
        hk60Var.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.defaultThumbnailImageHeight);
        rm60Var.mo56894s("default_thumbnail_image_width");
        hk60Var.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.defaultThumbnailImageWidth);
        rm60Var.mo56894s("device_identifier");
        hk60Var2.toJson(rm60Var, appProtocol$HelloDetailsAppProtocol$Info2.deviceIdentifier);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(62, "GeneratedJsonAdapter(AppProtocol.HelloDetailsAppProtocol.Info)");
    }
}
