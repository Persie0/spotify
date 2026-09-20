package com.spotify.jam.internal.socialconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.lau;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b \u0010\u0015\u001a\u0004\b\u001b\u0010\u001eR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010!\u0012\u0004\b#\u0010\u0015\u001a\u0004\b\u0016\u0010\"¨\u0006$"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/ResolvedJam;", "", "Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;", "availableJam", "Lcom/spotify/jam/internal/socialconnect/models/Visibility;", "visibility", "", "Lcom/spotify/jam/internal/socialconnect/models/ResolvedToken;", "resolvedTokens", "Lcom/spotify/jam/internal/socialconnect/models/JoinOption;", "joinOptions", "", "correlationId", "<init>", "(Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;Lcom/spotify/jam/internal/socialconnect/models/Visibility;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "copy", "(Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;Lcom/spotify/jam/internal/socialconnect/models/Visibility;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/ResolvedJam;", "a", "Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;", "()Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;", "getAvailableJam$annotations", "()V", "b", "Lcom/spotify/jam/internal/socialconnect/models/Visibility;", "e", "()Lcom/spotify/jam/internal/socialconnect/models/Visibility;", "getVisibility$annotations", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "getResolvedTokens$annotations", "getJoinOptions$annotations", "Ljava/lang/String;", "()Ljava/lang/String;", "getCorrelationId$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ResolvedJam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final AvailableJam availableJam;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Visibility visibility;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List resolvedTokens;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List joinOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String correlationId;

    public ResolvedJam(@gk60(name = "available_jam") AvailableJam availableJam, @gk60(name = "visibility") Visibility visibility, @gk60(name = "resolved_token") List<ResolvedToken> list, @gk60(name = "join_options") List<JoinOption> list2, @gk60(name = "correlation_id") String str) {
        this.availableJam = availableJam;
        this.visibility = visibility;
        this.resolvedTokens = list;
        this.joinOptions = list2;
        this.correlationId = str;
    }

    @gk60(name = "available_jam")
    public static /* synthetic */ void getAvailableJam$annotations() {
    }

    @gk60(name = "correlation_id")
    public static /* synthetic */ void getCorrelationId$annotations() {
    }

    @gk60(name = "join_options")
    public static /* synthetic */ void getJoinOptions$annotations() {
    }

    @gk60(name = "resolved_token")
    public static /* synthetic */ void getResolvedTokens$annotations() {
    }

    @gk60(name = "visibility")
    public static /* synthetic */ void getVisibility$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AvailableJam getAvailableJam() {
        return this.availableJam;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getJoinOptions() {
        return this.joinOptions;
    }

    public final ResolvedJam copy(@gk60(name = "available_jam") AvailableJam availableJam, @gk60(name = "visibility") Visibility visibility, @gk60(name = "resolved_token") List<ResolvedToken> resolvedTokens, @gk60(name = "join_options") List<JoinOption> joinOptions, @gk60(name = "correlation_id") String correlationId) {
        return new ResolvedJam(availableJam, visibility, resolvedTokens, joinOptions, correlationId);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getResolvedTokens() {
        return this.resolvedTokens;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Visibility getVisibility() {
        return this.visibility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedJam)) {
            return false;
        }
        ResolvedJam resolvedJam = (ResolvedJam) obj;
        return wj50.m88271j(this.availableJam, resolvedJam.availableJam) && wj50.m88271j(this.visibility, resolvedJam.visibility) && wj50.m88271j(this.resolvedTokens, resolvedJam.resolvedTokens) && wj50.m88271j(this.joinOptions, resolvedJam.joinOptions) && wj50.m88271j(this.correlationId, resolvedJam.correlationId);
    }

    public final int hashCode() {
        return this.correlationId.hashCode() + s571.m77244c(s571.m77244c((this.visibility.hashCode() + (this.availableJam.hashCode() * 31)) * 31, 31, this.resolvedTokens), 31, this.joinOptions);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResolvedJam(AvailableJam availableJam, Visibility visibility, List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 4;
        lau lauVar = lau.f131415a;
        this(availableJam, visibility, i2 != 0 ? lauVar : list, (i & 8) != 0 ? lauVar : list2, str);
    }
}
