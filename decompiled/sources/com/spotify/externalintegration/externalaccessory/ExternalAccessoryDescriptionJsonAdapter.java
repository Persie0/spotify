package com.spotify.externalintegration.externalaccessory;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.kyx;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/externalaccessory/ExternalAccessoryDescriptionJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/externalaccessory/ExternalAccessoryDescription;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_externalaccessory-externalaccessory"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalAccessoryDescriptionJsonAdapter extends hk60<ExternalAccessoryDescription> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3948a = xl60.C2578b.m91389a("integration_type", "client_id", "name", "transport_type", "connection_label", kyx.f127932c, "company", "model", "version", kyx.f127934e, "sender_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f3949b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f3950c;

    public ExternalAccessoryDescriptionJsonAdapter(p0i0 p0i0Var) {
        this.f3949b = p0i0Var.m68706f(String.class, gbu.f78413a, "integrationType");
    }

    @Override // p204p.hk60
    public final ExternalAccessoryDescription fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
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
        String str11 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f3948a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) this.f3949b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("integrationType", "integration_type", xl60Var);
                    }
                    i &= -2;
                    break;
                    break;
                case 1:
                    str2 = (String) this.f3949b.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x(kyx.f127931b, "client_id", xl60Var);
                    }
                    i &= -3;
                    break;
                    break;
                case 2:
                    str3 = (String) this.f3949b.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("name", "name", xl60Var);
                    }
                    i &= -5;
                    break;
                    break;
                case 3:
                    str4 = (String) this.f3949b.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x(kyx.f127933d, "transport_type", xl60Var);
                    }
                    i &= -9;
                    break;
                    break;
                case 4:
                    str5 = (String) this.f3949b.fromJson(xl60Var);
                    if (str5 == null) {
                        throw f0b1.m40470x("connectionLabel", "connection_label", xl60Var);
                    }
                    i &= -17;
                    break;
                    break;
                case 5:
                    str6 = (String) this.f3949b.fromJson(xl60Var);
                    if (str6 == null) {
                        throw f0b1.m40470x(kyx.f127932c, kyx.f127932c, xl60Var);
                    }
                    i &= -33;
                    break;
                    break;
                case 6:
                    str7 = (String) this.f3949b.fromJson(xl60Var);
                    if (str7 == null) {
                        throw f0b1.m40470x("company", "company", xl60Var);
                    }
                    i &= -65;
                    break;
                    break;
                case 7:
                    str8 = (String) this.f3949b.fromJson(xl60Var);
                    if (str8 == null) {
                        throw f0b1.m40470x("model", "model", xl60Var);
                    }
                    i &= -129;
                    break;
                    break;
                case 8:
                    str9 = (String) this.f3949b.fromJson(xl60Var);
                    if (str9 == null) {
                        throw f0b1.m40470x("version", "version", xl60Var);
                    }
                    i &= -257;
                    break;
                    break;
                case 9:
                    str10 = (String) this.f3949b.fromJson(xl60Var);
                    if (str10 == null) {
                        throw f0b1.m40470x(kyx.f127934e, kyx.f127934e, xl60Var);
                    }
                    i &= -513;
                    break;
                    break;
                case 10:
                    str11 = (String) this.f3949b.fromJson(xl60Var);
                    if (str11 == null) {
                        throw f0b1.m40470x("senderId", "sender_id", xl60Var);
                    }
                    i &= -1025;
                    break;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -2048) {
            String str12 = str9;
            String str13 = str8;
            String str14 = str7;
            String str15 = str6;
            String str16 = str5;
            String str17 = str4;
            return new ExternalAccessoryDescription(str, str2, str3, str17, str16, str15, str14, str13, str12, str10, str11);
        }
        String str18 = str9;
        String str19 = str8;
        String str20 = str7;
        String str21 = str6;
        String str22 = str5;
        String str23 = str4;
        String str24 = str3;
        String str25 = str2;
        String str26 = str;
        Constructor declaredConstructor = this.f3950c;
        if (declaredConstructor == null) {
            declaredConstructor = ExternalAccessoryDescription.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f3950c = declaredConstructor;
        }
        return (ExternalAccessoryDescription) declaredConstructor.newInstance(str26, str25, str24, str23, str22, str21, str20, str19, str18, str10, str11, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ExternalAccessoryDescription externalAccessoryDescription) {
        ExternalAccessoryDescription externalAccessoryDescription2 = externalAccessoryDescription;
        if (externalAccessoryDescription2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("integration_type");
        String str = externalAccessoryDescription2.integrationType;
        hk60 hk60Var = this.f3949b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("client_id");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.p.kyx.b java.lang.String);
        rm60Var.mo56894s("name");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.name);
        rm60Var.mo56894s("transport_type");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.p.kyx.d java.lang.String);
        rm60Var.mo56894s("connection_label");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.connectionLabel);
        rm60Var.mo56894s(kyx.f127932c);
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.p.kyx.c java.lang.String);
        rm60Var.mo56894s("company");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.company);
        rm60Var.mo56894s("model");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.model);
        rm60Var.mo56894s("version");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.version);
        rm60Var.mo56894s(kyx.f127934e);
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.p.kyx.e java.lang.String);
        rm60Var.mo56894s("sender_id");
        hk60Var.toJson(rm60Var, externalAccessoryDescription2.senderId);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(50, "GeneratedJsonAdapter(ExternalAccessoryDescription)");
    }
}
