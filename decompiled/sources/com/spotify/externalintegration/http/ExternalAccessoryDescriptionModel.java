package com.spotify.externalintegration.http;

import kotlin.Metadata;
import p204p.gk60;
import p204p.kyx;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0080\u0001\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0012\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0012\u0012\u0004\b%\u0010\u0016\u001a\u0004\b$\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0012\u0012\u0004\b(\u0010\u0016\u001a\u0004\b'\u0010\u0014R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0012\u0012\u0004\b+\u0010\u0016\u001a\u0004\b*\u0010\u0014R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u0012\u0012\u0004\b.\u0010\u0016\u001a\u0004\b-\u0010\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u0012\u0012\u0004\b1\u0010\u0016\u001a\u0004\b0\u0010\u0014¨\u00062"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;", "", "", "integration", kyx.f127931b, "name", kyx.f127933d, kyx.f127932c, "company", "model", "version", kyx.f127934e, "senderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;", "a", "Ljava/lang/String;", "getIntegration", "()Ljava/lang/String;", "getIntegration$annotations", "()V", "b", "getClientId", "getClientId$annotations", "c", "getName", "getName$annotations", "d", "getTransportType", "getTransportType$annotations", "e", "getCategory", "getCategory$annotations", "f", "getCompany", "getCompany$annotations", "g", "getModel", "getModel$annotations", "h", "getVersion", "getVersion$annotations", "i", "getProtocol", "getProtocol$annotations", "j", "getSenderId", "getSenderId$annotations", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ExternalAccessoryDescriptionModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String integration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String clientId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String transportType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String category;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String company;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String model;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String version;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String protocol;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String senderId;

    public ExternalAccessoryDescriptionModel(@gk60(name = "integration") String str, @gk60(name = "client_id") String str2, @gk60(name = "name") String str3, @gk60(name = "transport_type") String str4, @gk60(name = kyx.f127932c) String str5, @gk60(name = "company") String str6, @gk60(name = "model") String str7, @gk60(name = "version") String str8, @gk60(name = kyx.f127934e) String str9, @gk60(name = "sender_id") String str10) {
        this.integration = str;
        this.clientId = str2;
        this.name = str3;
        this.transportType = str4;
        this.category = str5;
        this.company = str6;
        this.model = str7;
        this.version = str8;
        this.protocol = str9;
        this.senderId = str10;
    }

    @gk60(name = kyx.f127932c)
    public static /* synthetic */ void getCategory$annotations() {
    }

    @gk60(name = "client_id")
    public static /* synthetic */ void getClientId$annotations() {
    }

    @gk60(name = "company")
    public static /* synthetic */ void getCompany$annotations() {
    }

    @gk60(name = "integration")
    public static /* synthetic */ void getIntegration$annotations() {
    }

    @gk60(name = "model")
    public static /* synthetic */ void getModel$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = kyx.f127934e)
    public static /* synthetic */ void getProtocol$annotations() {
    }

    @gk60(name = "sender_id")
    public static /* synthetic */ void getSenderId$annotations() {
    }

    @gk60(name = "transport_type")
    public static /* synthetic */ void getTransportType$annotations() {
    }

    @gk60(name = "version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public final ExternalAccessoryDescriptionModel copy(@gk60(name = "integration") String integration, @gk60(name = "client_id") String clientId, @gk60(name = "name") String name, @gk60(name = "transport_type") String transportType, @gk60(name = kyx.f127932c) String category, @gk60(name = "company") String company, @gk60(name = "model") String model, @gk60(name = "version") String version, @gk60(name = kyx.f127934e) String protocol, @gk60(name = "sender_id") String senderId) {
        return new ExternalAccessoryDescriptionModel(integration, clientId, name, transportType, category, company, model, version, protocol, senderId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalAccessoryDescriptionModel)) {
            return false;
        }
        ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel = (ExternalAccessoryDescriptionModel) obj;
        return wj50.m88271j(this.integration, externalAccessoryDescriptionModel.integration) && wj50.m88271j(this.clientId, externalAccessoryDescriptionModel.clientId) && wj50.m88271j(this.name, externalAccessoryDescriptionModel.name) && wj50.m88271j(this.transportType, externalAccessoryDescriptionModel.transportType) && wj50.m88271j(this.category, externalAccessoryDescriptionModel.category) && wj50.m88271j(this.company, externalAccessoryDescriptionModel.company) && wj50.m88271j(this.model, externalAccessoryDescriptionModel.model) && wj50.m88271j(this.version, externalAccessoryDescriptionModel.version) && wj50.m88271j(this.protocol, externalAccessoryDescriptionModel.protocol) && wj50.m88271j(this.senderId, externalAccessoryDescriptionModel.senderId);
    }

    public final int hashCode() {
        int iHashCode = this.integration.hashCode() * 31;
        String str = this.clientId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.transportType), 31, this.category);
        String str3 = this.company;
        int iHashCode3 = (iM77243b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.version;
        int iM77243b2 = s571.m77243b((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.protocol);
        String str6 = this.senderId;
        return iM77243b2 + (str6 != null ? str6.hashCode() : 0);
    }
}
