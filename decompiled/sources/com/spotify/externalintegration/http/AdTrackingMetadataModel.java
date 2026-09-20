package com.spotify.externalintegration.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J \u0001\u0010\u0011\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001d\u0012\u0004\b)\u0010\u0018\u001a\u0004\b(\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001d\u0012\u0004\b,\u0010\u0018\u001a\u0004\b+\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001d\u0012\u0004\b/\u0010\u0018\u001a\u0004\b.\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u001d\u0012\u0004\b2\u0010\u0018\u001a\u0004\b1\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u001d\u0012\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u001d\u0012\u0004\b8\u0010\u0018\u001a\u0004\b7\u0010\u001f¨\u00069"}, m24212d2 = {"Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;", "", "", "", "eventClickedUrls", "eventViewedUrls", "id", "creativeId", "playbackId", "productName", "lineItemId", "headerText", "headerIconName", "previewEntityUri", "slot", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/externalintegration/http/AdTrackingMetadataModel;", "a", "Ljava/util/List;", "getEventClickedUrls", "()Ljava/util/List;", "getEventClickedUrls$annotations", "()V", "b", "getEventViewedUrls", "getEventViewedUrls$annotations", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "d", "getCreativeId", "getCreativeId$annotations", "e", "getPlaybackId", "getPlaybackId$annotations", "f", "getProductName", "getProductName$annotations", "g", "getLineItemId", "getLineItemId$annotations", "h", "getHeaderText", "getHeaderText$annotations", "i", "getHeaderIconName", "getHeaderIconName$annotations", "j", "getPreviewEntityUri", "getPreviewEntityUri$annotations", "k", "getSlot", "getSlot$annotations", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AdTrackingMetadataModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List eventClickedUrls;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List eventViewedUrls;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String creativeId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String playbackId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String productName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String lineItemId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String headerText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String headerIconName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String previewEntityUri;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final String slot;

    public AdTrackingMetadataModel(@gk60(name = "event_clicked") List<String> list, @gk60(name = "event_viewed") List<String> list2, @gk60(name = "id") String str, @gk60(name = "creativeId") String str2, @gk60(name = "playbackId") String str3, @gk60(name = "productName") String str4, @gk60(name = "lineitemId") String str5, @gk60(name = "headerText") String str6, @gk60(name = "headerIconName") String str7, @gk60(name = "previewEntityUri") String str8, @gk60(name = "slot") String str9) {
        this.eventClickedUrls = list;
        this.eventViewedUrls = list2;
        this.id = str;
        this.creativeId = str2;
        this.playbackId = str3;
        this.productName = str4;
        this.lineItemId = str5;
        this.headerText = str6;
        this.headerIconName = str7;
        this.previewEntityUri = str8;
        this.slot = str9;
    }

    @gk60(name = "creativeId")
    public static /* synthetic */ void getCreativeId$annotations() {
    }

    @gk60(name = "event_clicked")
    public static /* synthetic */ void getEventClickedUrls$annotations() {
    }

    @gk60(name = "event_viewed")
    public static /* synthetic */ void getEventViewedUrls$annotations() {
    }

    @gk60(name = "headerIconName")
    public static /* synthetic */ void getHeaderIconName$annotations() {
    }

    @gk60(name = "headerText")
    public static /* synthetic */ void getHeaderText$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "lineitemId")
    public static /* synthetic */ void getLineItemId$annotations() {
    }

    @gk60(name = "playbackId")
    public static /* synthetic */ void getPlaybackId$annotations() {
    }

    @gk60(name = "previewEntityUri")
    public static /* synthetic */ void getPreviewEntityUri$annotations() {
    }

    @gk60(name = "productName")
    public static /* synthetic */ void getProductName$annotations() {
    }

    @gk60(name = "slot")
    public static /* synthetic */ void getSlot$annotations() {
    }

    public final AdTrackingMetadataModel copy(@gk60(name = "event_clicked") List<String> eventClickedUrls, @gk60(name = "event_viewed") List<String> eventViewedUrls, @gk60(name = "id") String id, @gk60(name = "creativeId") String creativeId, @gk60(name = "playbackId") String playbackId, @gk60(name = "productName") String productName, @gk60(name = "lineitemId") String lineItemId, @gk60(name = "headerText") String headerText, @gk60(name = "headerIconName") String headerIconName, @gk60(name = "previewEntityUri") String previewEntityUri, @gk60(name = "slot") String slot) {
        return new AdTrackingMetadataModel(eventClickedUrls, eventViewedUrls, id, creativeId, playbackId, productName, lineItemId, headerText, headerIconName, previewEntityUri, slot);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdTrackingMetadataModel)) {
            return false;
        }
        AdTrackingMetadataModel adTrackingMetadataModel = (AdTrackingMetadataModel) obj;
        return wj50.m88271j(this.eventClickedUrls, adTrackingMetadataModel.eventClickedUrls) && wj50.m88271j(this.eventViewedUrls, adTrackingMetadataModel.eventViewedUrls) && wj50.m88271j(this.id, adTrackingMetadataModel.id) && wj50.m88271j(this.creativeId, adTrackingMetadataModel.creativeId) && wj50.m88271j(this.playbackId, adTrackingMetadataModel.playbackId) && wj50.m88271j(this.productName, adTrackingMetadataModel.productName) && wj50.m88271j(this.lineItemId, adTrackingMetadataModel.lineItemId) && wj50.m88271j(this.headerText, adTrackingMetadataModel.headerText) && wj50.m88271j(this.headerIconName, adTrackingMetadataModel.headerIconName) && wj50.m88271j(this.previewEntityUri, adTrackingMetadataModel.previewEntityUri) && wj50.m88271j(this.slot, adTrackingMetadataModel.slot);
    }

    public final int hashCode() {
        List list = this.eventClickedUrls;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.eventViewedUrls;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.id;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creativeId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.playbackId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lineItemId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.headerText;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.headerIconName;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.previewEntityUri;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.slot;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public /* synthetic */ AdTrackingMetadataModel(List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9);
    }
}
