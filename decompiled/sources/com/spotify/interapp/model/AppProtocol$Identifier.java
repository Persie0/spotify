package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u000b\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Identifier", "Lcom/spotify/interapp/model/a;", "", "id", "featureIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/spotify/interapp/model/AppProtocol$Identifier;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/interapp/model/AppProtocol$Identifier;", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "d", "getFeatureIdentifier", "setFeatureIdentifier", "getFeatureIdentifier$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AppProtocol$Identifier extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String featureIdentifier;

    public AppProtocol$Identifier(@gk60(name = "id") String str, @gk60(name = "feature_identifier") String str2) {
        this.id = str;
        this.featureIdentifier = str2;
    }

    @gk60(name = "feature_identifier")
    public static /* synthetic */ void getFeatureIdentifier$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    public final AppProtocol$Identifier copy(@gk60(name = "id") String id, @gk60(name = "feature_identifier") String featureIdentifier) {
        return new AppProtocol$Identifier(id, featureIdentifier);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppProtocol$Identifier)) {
            return false;
        }
        AppProtocol$Identifier appProtocol$Identifier = (AppProtocol$Identifier) obj;
        return wj50.m88271j(this.id, appProtocol$Identifier.id) && wj50.m88271j(this.featureIdentifier, appProtocol$Identifier.featureIdentifier);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.featureIdentifier;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
