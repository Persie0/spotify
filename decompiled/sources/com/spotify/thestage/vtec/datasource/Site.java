package com.spotify.thestage.vtec.datasource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.kyx;
import p204p.ok60;
import p204p.s571;
import p204p.vi7;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\b\u0012\b\b\u0003\u0010\f\u001a\u00020\b\u0012\b\b\u0003\u0010\r\u001a\u00020\b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\b\u0012\b\b\u0003\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0080\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010\u0019\u001a\u0004\b\u0014\u0010'R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010&\u0012\u0004\b+\u0010\u0019\u001a\u0004\b*\u0010'R \u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010&\u0012\u0004\b.\u0010\u0019\u001a\u0004\b-\u0010'R \u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010&\u0012\u0004\b1\u0010\u0019\u001a\u0004\b0\u0010'R \u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010&\u0012\u0004\b4\u0010\u0019\u001a\u0004\b3\u0010'R \u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010&\u0012\u0004\b7\u0010\u0019\u001a\u0004\b6\u0010'R \u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010&\u0012\u0004\b:\u0010\u0019\u001a\u0004\b9\u0010'¨\u0006;"}, m24212d2 = {"Lcom/spotify/thestage/vtec/datasource/Site;", "", "", "lookupToken", "url", "Lp/vi7;", "authType", kyx.f127931b, "", "hasAudio", "enableLegacySharing", "hidePlayer", "legacyBackBehavior", "enableCheckout", "restoreOnKilled", "enableMediaDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lp/vi7;Ljava/lang/String;ZZZZZZZ)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lp/vi7;Ljava/lang/String;ZZZZZZZ)Lcom/spotify/thestage/vtec/datasource/Site;", "a", "Ljava/lang/String;", "getLookupToken", "()Ljava/lang/String;", "getLookupToken$annotations", "()V", "b", "getUrl", "getUrl$annotations", "c", "Lp/vi7;", "getAuthType", "()Lp/vi7;", "getAuthType$annotations", "d", "getClientId", "getClientId$annotations", "e", "Z", "()Z", "getHasAudio$annotations", "f", "getEnableLegacySharing", "getEnableLegacySharing$annotations", "g", "getHidePlayer", "getHidePlayer$annotations", "h", "getLegacyBackBehavior", "getLegacyBackBehavior$annotations", "i", "getEnableCheckout", "getEnableCheckout$annotations", "j", "getRestoreOnKilled", "getRestoreOnKilled$annotations", "k", "getEnableMediaDevices", "getEnableMediaDevices$annotations", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Site {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String lookupToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final vi7 authType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String clientId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean hasAudio;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean enableLegacySharing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean hidePlayer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean legacyBackBehavior;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean enableCheckout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean restoreOnKilled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean enableMediaDevices;

    public Site(@gk60(name = "lookupToken") String str, @gk60(name = "url") String str2, @gk60(name = "authType") vi7 vi7Var, @gk60(name = kyx.f127931b) String str3, @gk60(name = "hasAudio") boolean z, @gk60(name = "enableLegacySharing") boolean z2, @gk60(name = "hidePlayer") boolean z3, @gk60(name = "legacyBackBehavior") boolean z4, @gk60(name = "enableCheckout") boolean z5, @gk60(name = "restoreOnKilled") boolean z6, @gk60(name = "enableMediaDevices") boolean z7) {
        this.lookupToken = str;
        this.url = str2;
        this.authType = vi7Var;
        this.clientId = str3;
        this.hasAudio = z;
        this.enableLegacySharing = z2;
        this.hidePlayer = z3;
        this.legacyBackBehavior = z4;
        this.enableCheckout = z5;
        this.restoreOnKilled = z6;
        this.enableMediaDevices = z7;
    }

    @gk60(name = "authType")
    public static /* synthetic */ void getAuthType$annotations() {
    }

    @gk60(name = kyx.f127931b)
    public static /* synthetic */ void getClientId$annotations() {
    }

    @gk60(name = "enableCheckout")
    public static /* synthetic */ void getEnableCheckout$annotations() {
    }

    @gk60(name = "enableLegacySharing")
    public static /* synthetic */ void getEnableLegacySharing$annotations() {
    }

    @gk60(name = "enableMediaDevices")
    public static /* synthetic */ void getEnableMediaDevices$annotations() {
    }

    @gk60(name = "hasAudio")
    public static /* synthetic */ void getHasAudio$annotations() {
    }

    @gk60(name = "hidePlayer")
    public static /* synthetic */ void getHidePlayer$annotations() {
    }

    @gk60(name = "legacyBackBehavior")
    public static /* synthetic */ void getLegacyBackBehavior$annotations() {
    }

    @gk60(name = "lookupToken")
    public static /* synthetic */ void getLookupToken$annotations() {
    }

    @gk60(name = "restoreOnKilled")
    public static /* synthetic */ void getRestoreOnKilled$annotations() {
    }

    @gk60(name = "url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    public final Site copy(@gk60(name = "lookupToken") String lookupToken, @gk60(name = "url") String url, @gk60(name = "authType") vi7 authType, @gk60(name = kyx.f127931b) String clientId, @gk60(name = "hasAudio") boolean hasAudio, @gk60(name = "enableLegacySharing") boolean enableLegacySharing, @gk60(name = "hidePlayer") boolean hidePlayer, @gk60(name = "legacyBackBehavior") boolean legacyBackBehavior, @gk60(name = "enableCheckout") boolean enableCheckout, @gk60(name = "restoreOnKilled") boolean restoreOnKilled, @gk60(name = "enableMediaDevices") boolean enableMediaDevices) {
        return new Site(lookupToken, url, authType, clientId, hasAudio, enableLegacySharing, hidePlayer, legacyBackBehavior, enableCheckout, restoreOnKilled, enableMediaDevices);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Site)) {
            return false;
        }
        Site site = (Site) obj;
        return wj50.m88271j(this.lookupToken, site.lookupToken) && wj50.m88271j(this.url, site.url) && this.authType == site.authType && wj50.m88271j(this.clientId, site.clientId) && this.hasAudio == site.hasAudio && this.enableLegacySharing == site.enableLegacySharing && this.hidePlayer == site.hidePlayer && this.legacyBackBehavior == site.legacyBackBehavior && this.enableCheckout == site.enableCheckout && this.restoreOnKilled == site.restoreOnKilled && this.enableMediaDevices == site.enableMediaDevices;
    }

    public final int hashCode() {
        int iHashCode = (this.authType.hashCode() + s571.m77243b(this.lookupToken.hashCode() * 31, 31, this.url)) * 31;
        String str = this.clientId;
        return Boolean.hashCode(this.enableMediaDevices) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasAudio), 31, this.enableLegacySharing), 31, this.hidePlayer), 31, this.legacyBackBehavior), 31, this.enableCheckout), 31, this.restoreOnKilled);
    }

    public /* synthetic */ Site(String str, String str2, vi7 vi7Var, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, vi7Var, str3, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? true : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? false : z7);
    }
}
