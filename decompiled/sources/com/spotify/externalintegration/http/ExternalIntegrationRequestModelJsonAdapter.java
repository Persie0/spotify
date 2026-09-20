package com.spotify.externalintegration.http;

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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationRequestModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/ExternalIntegrationRequestModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalIntegrationRequestModelJsonAdapter extends hk60<ExternalIntegrationRequestModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3987a = xl60.C2578b.m91389a("external_accessory_description", "contextual_signals", "presentation_override", "restriction_id", "dsa_mode_enabled");

    /* JADX INFO: renamed from: b */
    public final hk60 f3988b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3989c;

    /* JADX INFO: renamed from: d */
    public final hk60 f3990d;

    /* JADX INFO: renamed from: e */
    public final hk60 f3991e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor f3992f;

    public ExternalIntegrationRequestModelJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f3988b = p0i0Var.m68706f(ExternalAccessoryDescriptionModel.class, gbuVar, "externalAccessoryDescription");
        this.f3989c = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbuVar, "contextualSignals");
        this.f3990d = p0i0Var.m68706f(String.class, gbuVar, "presentationOverride");
        this.f3991e = p0i0Var.m68706f(Boolean.class, gbuVar, "dsaModeEnabled");
    }

    @Override // p204p.hk60
    public final ExternalIntegrationRequestModel fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel = null;
        List list = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3987a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                externalAccessoryDescriptionModel = (ExternalAccessoryDescriptionModel) this.f3988b.fromJson(xl60Var);
                if (externalAccessoryDescriptionModel == null) {
                    throw f0b1.m40470x("externalAccessoryDescription", "external_accessory_description", xl60Var);
                }
            } else if (iMo51071K == 1) {
                list = (List) this.f3989c.fromJson(xl60Var);
                if (list == null) {
                    throw f0b1.m40470x("contextualSignals", "contextual_signals", xl60Var);
                }
            } else if (iMo51071K == 2) {
                str = (String) this.f3990d.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                str2 = (String) this.f3990d.fromJson(xl60Var);
                i &= -9;
            } else if (iMo51071K == 4) {
                bool = (Boolean) this.f3991e.fromJson(xl60Var);
                i &= -17;
            }
        }
        xl60Var.mo51078f();
        if (i == -29) {
            Boolean bool2 = bool;
            String str3 = str2;
            String str4 = str;
            List list2 = list;
            ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel2 = externalAccessoryDescriptionModel;
            if (externalAccessoryDescriptionModel2 == null) {
                throw f0b1.m40461o("externalAccessoryDescription", "external_accessory_description", xl60Var);
            }
            if (list2 != null) {
                return new ExternalIntegrationRequestModel(externalAccessoryDescriptionModel2, list2, str4, str3, bool2);
            }
            throw f0b1.m40461o("contextualSignals", "contextual_signals", xl60Var);
        }
        Boolean bool3 = bool;
        String str5 = str2;
        String str6 = str;
        List list3 = list;
        ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel3 = externalAccessoryDescriptionModel;
        Constructor declaredConstructor = this.f3992f;
        if (declaredConstructor == null) {
            declaredConstructor = ExternalIntegrationRequestModel.class.getDeclaredConstructor(ExternalAccessoryDescriptionModel.class, List.class, String.class, String.class, Boolean.class, Integer.TYPE, f0b1.f64588c);
            this.f3992f = declaredConstructor;
        }
        if (externalAccessoryDescriptionModel3 == null) {
            throw f0b1.m40461o("externalAccessoryDescription", "external_accessory_description", xl60Var);
        }
        if (list3 != null) {
            return (ExternalIntegrationRequestModel) declaredConstructor.newInstance(externalAccessoryDescriptionModel3, list3, str6, str5, bool3, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("contextualSignals", "contextual_signals", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ExternalIntegrationRequestModel externalIntegrationRequestModel) {
        ExternalIntegrationRequestModel externalIntegrationRequestModel2 = externalIntegrationRequestModel;
        if (externalIntegrationRequestModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("external_accessory_description");
        this.f3988b.toJson(rm60Var, externalIntegrationRequestModel2.externalAccessoryDescription);
        rm60Var.mo56894s("contextual_signals");
        this.f3989c.toJson(rm60Var, externalIntegrationRequestModel2.contextualSignals);
        rm60Var.mo56894s("presentation_override");
        String str = externalIntegrationRequestModel2.presentationOverride;
        hk60 hk60Var = this.f3990d;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("restriction_id");
        hk60Var.toJson(rm60Var, externalIntegrationRequestModel2.restrictionId);
        rm60Var.mo56894s("dsa_mode_enabled");
        this.f3991e.toJson(rm60Var, externalIntegrationRequestModel2.dsaModeEnabled);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(53, "GeneratedJsonAdapter(ExternalIntegrationRequestModel)");
    }
}
