package com.spotify.connect.castbasic.core.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.kyx;
import p204p.mt60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\bJ\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\t\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJÞ\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\t2\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\u0011\u001a\u00020\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001e\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010 R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001e\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010 R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001e\u0012\u0004\b.\u0010\"\u001a\u0004\b-\u0010 R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u001e\u0012\u0004\b1\u0010\"\u001a\u0004\b0\u0010 R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u0010\"\u001a\u0004\b\n\u00104R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u001e\u0012\u0004\b8\u0010\"\u001a\u0004\b7\u0010 R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u001e\u0012\u0004\b;\u0010\"\u001a\u0004\b:\u0010 R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00103\u0012\u0004\b>\u0010\"\u001a\u0004\b=\u00104R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u001e\u0012\u0004\bA\u0010\"\u001a\u0004\b@\u0010 R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010\u001e\u0012\u0004\bD\u0010\"\u001a\u0004\bC\u0010 R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010\"\u001a\u0004\bG\u0010HR \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010\u001e\u0012\u0004\bL\u0010\"\u001a\u0004\bK\u0010 R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010\u001e\u0012\u0004\bO\u0010\"\u001a\u0004\bN\u0010 R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010\u001e\u0012\u0004\bR\u0010\"\u001a\u0004\bQ\u0010 R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010\u001e\u0012\u0004\bU\u0010\"\u001a\u0004\bT\u0010 R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010\u001e\u0012\u0004\bX\u0010\"\u001a\u0004\bW\u0010 R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u0010\u001e\u0012\u0004\b[\u0010\"\u001a\u0004\bZ\u0010 R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010\"\u001a\u0004\b^\u0010_¨\u0006a"}, m24212d2 = {"Lcom/spotify/connect/castbasic/core/model/DiscoveredDevice;", "", "", "deviceId", "remoteName", "brandDisplayName", "modelDisplayName", "ipAddress", "version", "", "isAudioGroup", "deviceType", "accountReq", "status", "publicKey", "libraryVersion", "errorCode", "tokenType", "scope", kyx.f127931b, "deviceClass", "activeUser", "statusString", "", "supportsStreamExpansion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/connect/castbasic/core/model/DiscoveredDevice;", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "getDeviceId$annotations", "()V", "b", "getRemoteName", "getRemoteName$annotations", "c", "getBrandDisplayName", "getBrandDisplayName$annotations", "d", "getModelDisplayName", "getModelDisplayName$annotations", "e", "getIpAddress", "getIpAddress$annotations", "f", "getVersion", "getVersion$annotations", "g", "I", "()I", "isAudioGroup$annotations", "h", "getDeviceType", "getDeviceType$annotations", "i", "getAccountReq", "getAccountReq$annotations", "j", "getStatus", "getStatus$annotations", "k", "getPublicKey", "getPublicKey$annotations", "l", "getLibraryVersion", "getLibraryVersion$annotations", "m", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "getErrorCode$annotations", "n", "getTokenType", "getTokenType$annotations", "o", "getScope", "getScope$annotations", "p", "getClientId", "getClientId$annotations", "q", "getDeviceClass", "getDeviceClass$annotations", "r", "getActiveUser", "getActiveUser$annotations", "s", "getStatusString", "getStatusString$annotations", "t", "Z", "getSupportsStreamExpansion", "()Z", "getSupportsStreamExpansion$annotations", "src_main_java_com_spotify_connect_castbasic-castbasic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class DiscoveredDevice {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String deviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String remoteName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String brandDisplayName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String modelDisplayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String ipAddress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String version;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int isAudioGroup;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String deviceType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String accountReq;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int status;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final String publicKey;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final String libraryVersion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Integer errorCode;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final String tokenType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final String scope;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final String clientId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final String deviceClass;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final String activeUser;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final String statusString;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final boolean supportsStreamExpansion;

    public DiscoveredDevice(@gk60(name = "deviceID") String str, @gk60(name = "remoteName") String str2, @gk60(name = "brandDisplayName") String str3, @gk60(name = "modelDisplayName") String str4, @gk60(name = "deviceAPI_ipAddress") String str5, @gk60(name = "version") String str6, @gk60(name = "deviceAPI_isGroup") int i, @gk60(name = "deviceType") String str7, @gk60(name = "accountReq") String str8, @gk60(name = "status") int i2, @gk60(name = "publicKey") String str9, @gk60(name = "libraryVersion") String str10, @gk60(name = "spotifyError") Integer num, @gk60(name = "tokenType") String str11, @gk60(name = "scope") String str12, @gk60(name = "clientID") String str13, @gk60(name = "deviceAPI_deviceClass") String str14, @gk60(name = "activeUser") String str15, @gk60(name = "statusString") String str16, @gk60(name = "supportsStreamExpansion") boolean z) {
        this.deviceId = str;
        this.remoteName = str2;
        this.brandDisplayName = str3;
        this.modelDisplayName = str4;
        this.ipAddress = str5;
        this.version = str6;
        this.isAudioGroup = i;
        this.deviceType = str7;
        this.accountReq = str8;
        this.status = i2;
        this.publicKey = str9;
        this.libraryVersion = str10;
        this.errorCode = num;
        this.tokenType = str11;
        this.scope = str12;
        this.clientId = str13;
        this.deviceClass = str14;
        this.activeUser = str15;
        this.statusString = str16;
        this.supportsStreamExpansion = z;
    }

    @gk60(name = "accountReq")
    public static /* synthetic */ void getAccountReq$annotations() {
    }

    @gk60(name = "activeUser")
    public static /* synthetic */ void getActiveUser$annotations() {
    }

    @gk60(name = "brandDisplayName")
    public static /* synthetic */ void getBrandDisplayName$annotations() {
    }

    @gk60(name = "clientID")
    public static /* synthetic */ void getClientId$annotations() {
    }

    @gk60(name = "deviceAPI_deviceClass")
    public static /* synthetic */ void getDeviceClass$annotations() {
    }

    @gk60(name = "deviceID")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @gk60(name = "deviceType")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @gk60(name = "spotifyError")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @gk60(name = "deviceAPI_ipAddress")
    public static /* synthetic */ void getIpAddress$annotations() {
    }

    @gk60(name = "libraryVersion")
    public static /* synthetic */ void getLibraryVersion$annotations() {
    }

    @gk60(name = "modelDisplayName")
    public static /* synthetic */ void getModelDisplayName$annotations() {
    }

    @gk60(name = "publicKey")
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @gk60(name = "remoteName")
    public static /* synthetic */ void getRemoteName$annotations() {
    }

    @gk60(name = "scope")
    public static /* synthetic */ void getScope$annotations() {
    }

    @gk60(name = "status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @gk60(name = "statusString")
    public static /* synthetic */ void getStatusString$annotations() {
    }

    @gk60(name = "supportsStreamExpansion")
    public static /* synthetic */ void getSupportsStreamExpansion$annotations() {
    }

    @gk60(name = "tokenType")
    public static /* synthetic */ void getTokenType$annotations() {
    }

    @gk60(name = "version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @gk60(name = "deviceAPI_isGroup")
    public static /* synthetic */ void isAudioGroup$annotations() {
    }

    public final DiscoveredDevice copy(@gk60(name = "deviceID") String deviceId, @gk60(name = "remoteName") String remoteName, @gk60(name = "brandDisplayName") String brandDisplayName, @gk60(name = "modelDisplayName") String modelDisplayName, @gk60(name = "deviceAPI_ipAddress") String ipAddress, @gk60(name = "version") String version, @gk60(name = "deviceAPI_isGroup") int isAudioGroup, @gk60(name = "deviceType") String deviceType, @gk60(name = "accountReq") String accountReq, @gk60(name = "status") int status, @gk60(name = "publicKey") String publicKey, @gk60(name = "libraryVersion") String libraryVersion, @gk60(name = "spotifyError") Integer errorCode, @gk60(name = "tokenType") String tokenType, @gk60(name = "scope") String scope, @gk60(name = "clientID") String clientId, @gk60(name = "deviceAPI_deviceClass") String deviceClass, @gk60(name = "activeUser") String activeUser, @gk60(name = "statusString") String statusString, @gk60(name = "supportsStreamExpansion") boolean supportsStreamExpansion) {
        return new DiscoveredDevice(deviceId, remoteName, brandDisplayName, modelDisplayName, ipAddress, version, isAudioGroup, deviceType, accountReq, status, publicKey, libraryVersion, errorCode, tokenType, scope, clientId, deviceClass, activeUser, statusString, supportsStreamExpansion);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveredDevice)) {
            return false;
        }
        DiscoveredDevice discoveredDevice = (DiscoveredDevice) obj;
        return wj50.m88271j(this.deviceId, discoveredDevice.deviceId) && wj50.m88271j(this.remoteName, discoveredDevice.remoteName) && wj50.m88271j(this.brandDisplayName, discoveredDevice.brandDisplayName) && wj50.m88271j(this.modelDisplayName, discoveredDevice.modelDisplayName) && wj50.m88271j(this.ipAddress, discoveredDevice.ipAddress) && wj50.m88271j(this.version, discoveredDevice.version) && this.isAudioGroup == discoveredDevice.isAudioGroup && wj50.m88271j(this.deviceType, discoveredDevice.deviceType) && wj50.m88271j(this.accountReq, discoveredDevice.accountReq) && this.status == discoveredDevice.status && wj50.m88271j(this.publicKey, discoveredDevice.publicKey) && wj50.m88271j(this.libraryVersion, discoveredDevice.libraryVersion) && wj50.m88271j(this.errorCode, discoveredDevice.errorCode) && wj50.m88271j(this.tokenType, discoveredDevice.tokenType) && wj50.m88271j(this.scope, discoveredDevice.scope) && wj50.m88271j(this.clientId, discoveredDevice.clientId) && wj50.m88271j(this.deviceClass, discoveredDevice.deviceClass) && wj50.m88271j(this.activeUser, discoveredDevice.activeUser) && wj50.m88271j(this.statusString, discoveredDevice.statusString) && this.supportsStreamExpansion == discoveredDevice.supportsStreamExpansion;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.status, s571.m77243b(s571.m77243b(mt60.m62800g(this.isAudioGroup, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.deviceId.hashCode() * 31, 31, this.remoteName), 31, this.brandDisplayName), 31, this.modelDisplayName), 31, this.ipAddress), 31, this.version), 31), 31, this.deviceType), 31, this.accountReq), 31), 31, this.publicKey), 31, this.libraryVersion);
        Integer num = this.errorCode;
        int iM77243b2 = s571.m77243b((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.tokenType);
        String str = this.scope;
        int iHashCode = (iM77243b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientId;
        return Boolean.hashCode(this.supportsStreamExpansion) + s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.deviceClass), 31, this.activeUser), 31, this.statusString);
    }

    public /* synthetic */ DiscoveredDevice(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, String str9, String str10, Integer num, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i3 & 32) != 0 ? "2.2.0" : str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? "CASTVIDEO" : str7, (i3 & 256) != 0 ? "FREE" : str8, (i3 & 512) != 0 ? 101 : i2, (i3 & 1024) != 0 ? "SU5WQUxJRA==" : str9, (i3 & 2048) != 0 ? "" : str10, (i3 & 4096) != 0 ? null : num, (i3 & 8192) != 0 ? "" : str11, (i3 & 16384) != 0 ? null : str12, (32768 & i3) != 0 ? null : str13, (65536 & i3) != 0 ? "cast-js" : str14, (131072 & i3) != 0 ? "" : str15, (262144 & i3) != 0 ? "" : str16, (i3 & 524288) != 0 ? false : z);
    }
}
