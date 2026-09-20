package com.spotify.externalintegration.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0014\u001a\u0004\b$\u0010%¨\u0006'"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationRequestModel;", "", "Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;", "externalAccessoryDescription", "", "", "contextualSignals", "presentationOverride", "restrictionId", "", "dsaModeEnabled", "<init>", "(Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "copy", "(Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spotify/externalintegration/http/ExternalIntegrationRequestModel;", "a", "Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;", "getExternalAccessoryDescription", "()Lcom/spotify/externalintegration/http/ExternalAccessoryDescriptionModel;", "getExternalAccessoryDescription$annotations", "()V", "b", "Ljava/util/List;", "getContextualSignals", "()Ljava/util/List;", "getContextualSignals$annotations", "c", "Ljava/lang/String;", "getPresentationOverride", "()Ljava/lang/String;", "getPresentationOverride$annotations", "d", "getRestrictionId", "getRestrictionId$annotations", "e", "Ljava/lang/Boolean;", "getDsaModeEnabled", "()Ljava/lang/Boolean;", "getDsaModeEnabled$annotations", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ExternalIntegrationRequestModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ExternalAccessoryDescriptionModel externalAccessoryDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List contextualSignals;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String presentationOverride;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String restrictionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Boolean dsaModeEnabled;

    public ExternalIntegrationRequestModel(@gk60(name = "external_accessory_description") ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel, @gk60(name = "contextual_signals") List<String> list, @gk60(name = "presentation_override") String str, @gk60(name = "restriction_id") String str2, @gk60(name = "dsa_mode_enabled") Boolean bool) {
        this.externalAccessoryDescription = externalAccessoryDescriptionModel;
        this.contextualSignals = list;
        this.presentationOverride = str;
        this.restrictionId = str2;
        this.dsaModeEnabled = bool;
    }

    @gk60(name = "contextual_signals")
    public static /* synthetic */ void getContextualSignals$annotations() {
    }

    @gk60(name = "dsa_mode_enabled")
    public static /* synthetic */ void getDsaModeEnabled$annotations() {
    }

    @gk60(name = "external_accessory_description")
    public static /* synthetic */ void getExternalAccessoryDescription$annotations() {
    }

    @gk60(name = "presentation_override")
    public static /* synthetic */ void getPresentationOverride$annotations() {
    }

    @gk60(name = "restriction_id")
    public static /* synthetic */ void getRestrictionId$annotations() {
    }

    public final ExternalIntegrationRequestModel copy(@gk60(name = "external_accessory_description") ExternalAccessoryDescriptionModel externalAccessoryDescription, @gk60(name = "contextual_signals") List<String> contextualSignals, @gk60(name = "presentation_override") String presentationOverride, @gk60(name = "restriction_id") String restrictionId, @gk60(name = "dsa_mode_enabled") Boolean dsaModeEnabled) {
        return new ExternalIntegrationRequestModel(externalAccessoryDescription, contextualSignals, presentationOverride, restrictionId, dsaModeEnabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalIntegrationRequestModel)) {
            return false;
        }
        ExternalIntegrationRequestModel externalIntegrationRequestModel = (ExternalIntegrationRequestModel) obj;
        return wj50.m88271j(this.externalAccessoryDescription, externalIntegrationRequestModel.externalAccessoryDescription) && wj50.m88271j(this.contextualSignals, externalIntegrationRequestModel.contextualSignals) && wj50.m88271j(this.presentationOverride, externalIntegrationRequestModel.presentationOverride) && wj50.m88271j(this.restrictionId, externalIntegrationRequestModel.restrictionId) && wj50.m88271j(this.dsaModeEnabled, externalIntegrationRequestModel.dsaModeEnabled);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.externalAccessoryDescription.hashCode() * 31, 31, this.contextualSignals);
        String str = this.presentationOverride;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.restrictionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.dsaModeEnabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public /* synthetic */ ExternalIntegrationRequestModel(ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel, List list, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(externalAccessoryDescriptionModel, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? Boolean.FALSE : bool);
    }
}
