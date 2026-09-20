package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJp\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001c\u0010\u0014R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\u0017\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u0012\u0004\b$\u0010\u0016\u001a\u0004\b#\u0010\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0016\u001a\u0004\b'\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0013\u0012\u0004\b,\u0010\u0016\u001a\u0004\b+\u0010\u0014¨\u0006-"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationSectionContentModel;", "", "", "name", ContextTrack.Metadata.KEY_TITLE, "uri", "imageUri", "", "Lcom/spotify/externalintegration/http/ExternalIntegrationSectionItemModel;", "sectionItems", "presentation", "Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;", "adTrackingMetadata", "responseId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;Ljava/lang/String;)Lcom/spotify/externalintegration/http/ExternalIntegrationSectionContentModel;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getName$annotations", "()V", "b", "c", "getTitle$annotations", "d", "getUri$annotations", "getImageUri", "getImageUri$annotations", "e", "Ljava/util/List;", "()Ljava/util/List;", "getSectionItems$annotations", "f", "getPresentation", "getPresentation$annotations", "g", "Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;", "getAdTrackingMetadata", "()Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;", "getAdTrackingMetadata$annotations", "h", "getResponseId", "getResponseId$annotations", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ExternalIntegrationSectionContentModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String imageUri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final List sectionItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String presentation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final AdTrackingMetadataModel adTrackingMetadata;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String responseId;

    public ExternalIntegrationSectionContentModel(@gk60(name = "name") String str, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str2, @gk60(name = "uri") String str3, @gk60(name = "image_uri") String str4, @gk60(name = "section_items") List<ExternalIntegrationSectionItemModel> list, @gk60(name = "presentation") String str5) {
        this(str, str2, str3, str4, list, str5, null, null, 192, null);
    }

    @gk60(name = "ad_tracking_metadata")
    public static /* synthetic */ void getAdTrackingMetadata$annotations() {
    }

    @gk60(name = "image_uri")
    public static /* synthetic */ void getImageUri$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = "presentation")
    public static /* synthetic */ void getPresentation$annotations() {
    }

    @gk60(name = "response_id")
    public static /* synthetic */ void getResponseId$annotations() {
    }

    @gk60(name = "section_items")
    public static /* synthetic */ void getSectionItems$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSectionItems() {
        return this.sectionItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ExternalIntegrationSectionContentModel copy(@gk60(name = "name") String name, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String title, @gk60(name = "uri") String uri, @gk60(name = "image_uri") String imageUri, @gk60(name = "section_items") List<ExternalIntegrationSectionItemModel> sectionItems, @gk60(name = "presentation") String presentation, @gk60(name = "ad_tracking_metadata") AdTrackingMetadataModel adTrackingMetadata, @gk60(name = "response_id") String responseId) {
        return new ExternalIntegrationSectionContentModel(name, title, uri, imageUri, sectionItems, presentation, adTrackingMetadata, responseId);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalIntegrationSectionContentModel)) {
            return false;
        }
        ExternalIntegrationSectionContentModel externalIntegrationSectionContentModel = (ExternalIntegrationSectionContentModel) obj;
        return wj50.m88271j(this.name, externalIntegrationSectionContentModel.name) && wj50.m88271j(this.title, externalIntegrationSectionContentModel.title) && wj50.m88271j(this.uri, externalIntegrationSectionContentModel.uri) && wj50.m88271j(this.imageUri, externalIntegrationSectionContentModel.imageUri) && wj50.m88271j(this.sectionItems, externalIntegrationSectionContentModel.sectionItems) && wj50.m88271j(this.presentation, externalIntegrationSectionContentModel.presentation) && wj50.m88271j(this.adTrackingMetadata, externalIntegrationSectionContentModel.adTrackingMetadata) && wj50.m88271j(this.responseId, externalIntegrationSectionContentModel.responseId);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.name.hashCode() * 31, 31, this.title);
        String str = this.uri;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUri;
        int iM77244c = s571.m77244c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sectionItems);
        String str3 = this.presentation;
        int iHashCode2 = (iM77244c + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdTrackingMetadataModel adTrackingMetadataModel = this.adTrackingMetadata;
        int iHashCode3 = (iHashCode2 + (adTrackingMetadataModel == null ? 0 : adTrackingMetadataModel.hashCode())) * 31;
        String str4 = this.responseId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public ExternalIntegrationSectionContentModel(@gk60(name = "name") String str, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str2, @gk60(name = "uri") String str3, @gk60(name = "image_uri") String str4, @gk60(name = "section_items") List<ExternalIntegrationSectionItemModel> list, @gk60(name = "presentation") String str5, @gk60(name = "ad_tracking_metadata") AdTrackingMetadataModel adTrackingMetadataModel) {
        this(str, str2, str3, str4, list, str5, adTrackingMetadataModel, null, 128, null);
    }

    public ExternalIntegrationSectionContentModel(@gk60(name = "name") String str, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str2, @gk60(name = "uri") String str3, @gk60(name = "image_uri") String str4, @gk60(name = "section_items") List<ExternalIntegrationSectionItemModel> list, @gk60(name = "presentation") String str5, @gk60(name = "ad_tracking_metadata") AdTrackingMetadataModel adTrackingMetadataModel, @gk60(name = "response_id") String str6) {
        this.name = str;
        this.title = str2;
        this.uri = str3;
        this.imageUri = str4;
        this.sectionItems = list;
        this.presentation = str5;
        this.adTrackingMetadata = adTrackingMetadataModel;
        this.responseId = str6;
    }

    public /* synthetic */ ExternalIntegrationSectionContentModel(String str, String str2, String str3, String str4, List list, String str5, AdTrackingMetadataModel adTrackingMetadataModel, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, str5, (i & 64) != 0 ? null : adTrackingMetadataModel, (i & 128) != 0 ? null : str6);
    }
}
