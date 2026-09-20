package com.spotify.externalintegration.http;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.kyx;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalAccessoryDescriptionModelJsonAdapter extends hk60<ExternalAccessoryDescriptionModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3976a = xl60.C2578b.m91389a("integration", "client_id", "name", "transport_type", kyx.f127932c, "company", "model", "version", kyx.f127934e, "sender_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f3977b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3978c;

    public ExternalAccessoryDescriptionModelJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f3977b = p0i0Var.m68706f(String.class, gbuVar, "integration");
        this.f3978c = p0i0Var.m68706f(String.class, gbuVar, kyx.f127931b);
    }

    @Override // p204p.hk60
    public final ExternalAccessoryDescriptionModel fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (true) {
            String str11 = str;
            if (!xl60Var.mo51079i()) {
                String str12 = str2;
                String str13 = str3;
                xl60Var.mo51078f();
                if (str11 == null) {
                    throw f0b1.m40461o("integration", "integration", xl60Var);
                }
                if (str4 == null) {
                    throw f0b1.m40461o(kyx.f127933d, "transport_type", xl60Var);
                }
                if (str5 == null) {
                    throw f0b1.m40461o(kyx.f127932c, kyx.f127932c, xl60Var);
                }
                if (str9 != null) {
                    return new ExternalAccessoryDescriptionModel(str11, str12, str13, str4, str5, str6, str7, str8, str9, str10);
                }
                throw f0b1.m40461o(kyx.f127934e, kyx.f127934e, xl60Var);
            }
            String str14 = str2;
            int iMo51071K = xl60Var.mo51071K(this.f3976a);
            hk60 hk60Var = this.f3977b;
            String str15 = str3;
            hk60 hk60Var2 = this.f3978c;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 0:
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("integration", "integration", xl60Var);
                    }
                    str2 = str14;
                    str3 = str15;
                    break;
                    break;
                case 1:
                    str2 = (String) hk60Var2.fromJson(xl60Var);
                    str = str11;
                    str3 = str15;
                    break;
                case 2:
                    str3 = (String) hk60Var2.fromJson(xl60Var);
                    str2 = str14;
                    str = str11;
                    break;
                case 3:
                    str4 = (String) hk60Var.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x(kyx.f127933d, "transport_type", xl60Var);
                    }
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 4:
                    str5 = (String) hk60Var.fromJson(xl60Var);
                    if (str5 == null) {
                        throw f0b1.m40470x(kyx.f127932c, kyx.f127932c, xl60Var);
                    }
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 5:
                    str6 = (String) hk60Var2.fromJson(xl60Var);
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 6:
                    str7 = (String) hk60Var2.fromJson(xl60Var);
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 7:
                    str8 = (String) hk60Var2.fromJson(xl60Var);
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 8:
                    str9 = (String) hk60Var.fromJson(xl60Var);
                    if (str9 == null) {
                        throw f0b1.m40470x(kyx.f127934e, kyx.f127934e, xl60Var);
                    }
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                case 9:
                    str10 = (String) hk60Var2.fromJson(xl60Var);
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
                default:
                    str2 = str14;
                    str = str11;
                    str3 = str15;
                    break;
            }
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel) {
        ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel2 = externalAccessoryDescriptionModel;
        if (externalAccessoryDescriptionModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("integration");
        String str = externalAccessoryDescriptionModel2.integration;
        hk60 hk60Var = this.f3977b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("client_id");
        String str2 = externalAccessoryDescriptionModel2.p.kyx.b java.lang.String;
        hk60 hk60Var2 = this.f3978c;
        hk60Var2.toJson(rm60Var, str2);
        rm60Var.mo56894s("name");
        hk60Var2.toJson(rm60Var, externalAccessoryDescriptionModel2.name);
        rm60Var.mo56894s("transport_type");
        hk60Var.toJson(rm60Var, externalAccessoryDescriptionModel2.p.kyx.d java.lang.String);
        rm60Var.mo56894s(kyx.f127932c);
        hk60Var.toJson(rm60Var, externalAccessoryDescriptionModel2.p.kyx.c java.lang.String);
        rm60Var.mo56894s("company");
        hk60Var2.toJson(rm60Var, externalAccessoryDescriptionModel2.company);
        rm60Var.mo56894s("model");
        hk60Var2.toJson(rm60Var, externalAccessoryDescriptionModel2.model);
        rm60Var.mo56894s("version");
        hk60Var2.toJson(rm60Var, externalAccessoryDescriptionModel2.version);
        rm60Var.mo56894s(kyx.f127934e);
        hk60Var.toJson(rm60Var, externalAccessoryDescriptionModel2.p.kyx.e java.lang.String);
        rm60Var.mo56894s("sender_id");
        hk60Var2.toJson(rm60Var, externalAccessoryDescriptionModel2.senderId);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(55, "GeneratedJsonAdapter(ExternalAccessoryDescriptionModel)");
    }
}
