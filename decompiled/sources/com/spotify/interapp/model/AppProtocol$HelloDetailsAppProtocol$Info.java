package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.kyx;
import p204p.ok60;
import p204p.sc5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\bR\b\u0007\u0018\u00002\u00020\u0001B·\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0001\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR2\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010\u001c\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010%\u0012\u0004\b.\u0010\u001c\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R*\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u0010%\u0012\u0004\b2\u0010\u001c\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R*\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010%\u0012\u0004\b6\u0010\u001c\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R*\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u0010%\u0012\u0004\b:\u0010\u001c\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R*\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010%\u0012\u0004\b>\u0010\u001c\u001a\u0004\b<\u0010'\"\u0004\b=\u0010)R*\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b?\u0010%\u0012\u0004\bB\u0010\u001c\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R*\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010\u0016\u0012\u0004\bF\u0010\u001c\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010\u001aR*\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010\u0016\u0012\u0004\bJ\u0010\u001c\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010\u001aR*\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bK\u0010\u0016\u0012\u0004\bN\u0010\u001c\u001a\u0004\bL\u0010\u0018\"\u0004\bM\u0010\u001aR*\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bO\u0010\u0016\u0012\u0004\bR\u0010\u001c\u001a\u0004\bP\u0010\u0018\"\u0004\bQ\u0010\u001aR*\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010%\u0012\u0004\bV\u0010\u001c\u001a\u0004\bT\u0010'\"\u0004\bU\u0010)¨\u0006W"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info", "Lp/sc5;", "", "protocolVersion", "", "", "requiredFeatures", "id", "name", "model", kyx.f127932c, "version", "manufacturer", "imageType", "defaultImageHeight", "defaultImageWidth", "defaultThumbnailImageHeight", "defaultThumbnailImageWidth", "deviceIdentifier", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "c", "Ljava/lang/Integer;", "getProtocolVersion", "()Ljava/lang/Integer;", "setProtocolVersion", "(Ljava/lang/Integer;)V", "getProtocolVersion$annotations", "()V", "d", "Ljava/util/List;", "getRequiredFeatures", "()Ljava/util/List;", "setRequiredFeatures", "(Ljava/util/List;)V", "getRequiredFeatures$annotations", "e", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getId$annotations", "f", "getName", "setName", "getName$annotations", "g", "getModel", "setModel", "getModel$annotations", "h", "getCategory", "setCategory", "getCategory$annotations", "i", "getVersion", "setVersion", "getVersion$annotations", "j", "getManufacturer", "setManufacturer", "getManufacturer$annotations", "k", "getImageType", "setImageType", "getImageType$annotations", "l", "getDefaultImageHeight", "setDefaultImageHeight", "getDefaultImageHeight$annotations", "m", "getDefaultImageWidth", "setDefaultImageWidth", "getDefaultImageWidth$annotations", "n", "getDefaultThumbnailImageHeight", "setDefaultThumbnailImageHeight", "getDefaultThumbnailImageHeight$annotations", "o", "getDefaultThumbnailImageWidth", "setDefaultThumbnailImageWidth", "getDefaultThumbnailImageWidth$annotations", "p", "getDeviceIdentifier", "setDeviceIdentifier", "getDeviceIdentifier$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$HelloDetailsAppProtocol$Info extends sc5 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer protocolVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List requiredFeatures;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String model;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String category;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String version;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String manufacturer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final String imageType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final Integer defaultImageHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Integer defaultImageWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final Integer defaultThumbnailImageHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final Integer defaultThumbnailImageWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final String deviceIdentifier;

    public AppProtocol$HelloDetailsAppProtocol$Info(@gk60(name = "protocol_version") Integer num, @gk60(name = "required_features") List<String> list, @gk60(name = "id") String str, @gk60(name = "name") String str2, @gk60(name = "model") String str3, @gk60(name = kyx.f127932c) String str4, @gk60(name = "version") String str5, @gk60(name = "manufacturer") String str6, @gk60(name = "image_type") String str7, @gk60(name = "default_image_height") Integer num2, @gk60(name = "default_image_width") Integer num3, @gk60(name = "default_thumbnail_image_height") Integer num4, @gk60(name = "default_thumbnail_image_width") Integer num5, @gk60(name = "device_identifier") String str8) {
        this.protocolVersion = num;
        this.requiredFeatures = list;
        this.id = str;
        this.name = str2;
        this.model = str3;
        this.category = str4;
        this.version = str5;
        this.manufacturer = str6;
        this.imageType = str7;
        this.defaultImageHeight = num2;
        this.defaultImageWidth = num3;
        this.defaultThumbnailImageHeight = num4;
        this.defaultThumbnailImageWidth = num5;
        this.deviceIdentifier = str8;
    }

    @gk60(name = kyx.f127932c)
    public static /* synthetic */ void getCategory$annotations() {
    }

    @gk60(name = "default_image_height")
    public static /* synthetic */ void getDefaultImageHeight$annotations() {
    }

    @gk60(name = "default_image_width")
    public static /* synthetic */ void getDefaultImageWidth$annotations() {
    }

    @gk60(name = "default_thumbnail_image_height")
    public static /* synthetic */ void getDefaultThumbnailImageHeight$annotations() {
    }

    @gk60(name = "default_thumbnail_image_width")
    public static /* synthetic */ void getDefaultThumbnailImageWidth$annotations() {
    }

    @gk60(name = "device_identifier")
    public static /* synthetic */ void getDeviceIdentifier$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "image_type")
    public static /* synthetic */ void getImageType$annotations() {
    }

    @gk60(name = "manufacturer")
    public static /* synthetic */ void getManufacturer$annotations() {
    }

    @gk60(name = "model")
    public static /* synthetic */ void getModel$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = "protocol_version")
    public static /* synthetic */ void getProtocolVersion$annotations() {
    }

    @gk60(name = "required_features")
    public static /* synthetic */ void getRequiredFeatures$annotations() {
    }

    @gk60(name = "version")
    public static /* synthetic */ void getVersion$annotations() {
    }
}
