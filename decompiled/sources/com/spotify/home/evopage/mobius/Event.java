package com.spotify.home.evopage.mobius;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ebf0;
import p204p.ei6;
import p204p.gtq;
import p204p.i3a0;
import p204p.k330;
import p204p.kaa0;
import p204p.klh;
import p204p.s571;
import p204p.t3x0;
import p204p.uyk0;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0014\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0014\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u0005\u0007#$%&'()*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event;", "", "", "breadcrumb", "()Ljava/lang/String;", "p/cvw", "GotSlotBasedHomeContent", "p/dvw", "FailedToLoadHomeStructure", "FailedToLoadMoreHomeStructure", "ExplicitFeedbackListChanged", "GotHomeFeatureType", "ConsumptionStateChanged", "DismissSection", "UndoDismissSection", "ConnectivityChanged", "GotOfflineItems", "FailedToLoadOfflineItems", "TempDismissedEntitiesChanged", "Foregrounded", "PageBecameFocused", "ForceReloadChecked", "LoadMore", "Refresh", "VideoSettingsChanged", "Lcom/spotify/home/evopage/mobius/Event$ConnectivityChanged;", "Lcom/spotify/home/evopage/mobius/Event$ConsumptionStateChanged;", "Lcom/spotify/home/evopage/mobius/Event$DismissSection;", "Lcom/spotify/home/evopage/mobius/Event$ExplicitFeedbackListChanged;", "Lcom/spotify/home/evopage/mobius/Event$FailedToLoadHomeStructure;", "Lcom/spotify/home/evopage/mobius/Event$FailedToLoadMoreHomeStructure;", "Lcom/spotify/home/evopage/mobius/Event$FailedToLoadOfflineItems;", "Lcom/spotify/home/evopage/mobius/Event$ForceReloadChecked;", "Lcom/spotify/home/evopage/mobius/Event$Foregrounded;", "Lcom/spotify/home/evopage/mobius/Event$GotHomeFeatureType;", "Lcom/spotify/home/evopage/mobius/Event$GotOfflineItems;", "Lcom/spotify/home/evopage/mobius/Event$GotSlotBasedHomeContent;", "Lcom/spotify/home/evopage/mobius/Event$LoadMore;", "Lcom/spotify/home/evopage/mobius/Event$PageBecameFocused;", "Lcom/spotify/home/evopage/mobius/Event$Refresh;", "Lcom/spotify/home/evopage/mobius/Event$TempDismissedEntitiesChanged;", "Lcom/spotify/home/evopage/mobius/Event$UndoDismissSection;", "Lcom/spotify/home/evopage/mobius/Event$VideoSettingsChanged;", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Event {

    @Keep
    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$ConnectivityChanged;", "Lcom/spotify/home/evopage/mobius/Event;", "", "isConnected", "Lp/kaa0;", "loadingStrategy", "<init>", "(ZLp/kaa0;)V", "", "breadcrumb", "()Ljava/lang/String;", "component1", "()Z", "component2", "()Lp/kaa0;", "copy", "(ZLp/kaa0;)Lcom/spotify/home/evopage/mobius/Event$ConnectivityChanged;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lp/kaa0;", "getLoadingStrategy", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ConnectivityChanged implements Event {
        private final boolean isConnected;
        private final kaa0 loadingStrategy;

        public ConnectivityChanged(boolean z, kaa0 kaa0Var) {
            this.isConnected = z;
            this.loadingStrategy = kaa0Var;
        }

        public static /* synthetic */ ConnectivityChanged copy$default(ConnectivityChanged connectivityChanged, boolean z, kaa0 kaa0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                z = connectivityChanged.isConnected;
            }
            if ((i & 2) != 0) {
                kaa0Var = connectivityChanged.loadingStrategy;
            }
            return connectivityChanged.copy(z, kaa0Var);
        }

        @Override // com.spotify.home.evopage.mobius.Event
        public String breadcrumb() {
            return "ConnectivityChanged: " + this.isConnected + ", loadingStrategy: " + this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsConnected() {
            return this.isConnected;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final kaa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final ConnectivityChanged copy(boolean isConnected, kaa0 loadingStrategy) {
            return new ConnectivityChanged(isConnected, loadingStrategy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectivityChanged)) {
                return false;
            }
            ConnectivityChanged connectivityChanged = (ConnectivityChanged) other;
            return this.isConnected == connectivityChanged.isConnected && this.loadingStrategy == connectivityChanged.loadingStrategy;
        }

        public final kaa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public int hashCode() {
            return this.loadingStrategy.hashCode() + (Boolean.hashCode(this.isConnected) * 31);
        }

        public final boolean isConnected() {
            return this.isConnected;
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$ConsumptionStateChanged;", "Lcom/spotify/home/evopage/mobius/Event;", "entityUriToWasPlayed", "", "", "", "<init>", "(Ljava/util/Map;)V", "getEntityUriToWasPlayed", "()Ljava/util/Map;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ConsumptionStateChanged implements Event {
        private final Map<String, Boolean> entityUriToWasPlayed;

        public ConsumptionStateChanged(Map<String, Boolean> map) {
            this.entityUriToWasPlayed = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConsumptionStateChanged copy$default(ConsumptionStateChanged consumptionStateChanged, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = consumptionStateChanged.entityUriToWasPlayed;
            }
            return consumptionStateChanged.copy(map);
        }

        public final Map<String, Boolean> component1() {
            return this.entityUriToWasPlayed;
        }

        public final ConsumptionStateChanged copy(Map<String, Boolean> entityUriToWasPlayed) {
            return new ConsumptionStateChanged(entityUriToWasPlayed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConsumptionStateChanged) && wj50.m88271j(this.entityUriToWasPlayed, ((ConsumptionStateChanged) other).entityUriToWasPlayed);
        }

        public final Map<String, Boolean> getEntityUriToWasPlayed() {
            return this.entityUriToWasPlayed;
        }

        public int hashCode() {
            return this.entityUriToWasPlayed.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$DismissSection;", "Lcom/spotify/home/evopage/mobius/Event;", "entity", "Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "<init>", "(Lcom/spotify/home/evopage/structureapi/DismissedEntity;)V", "getEntity", "()Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class DismissSection implements Event {
        private final com.spotify.home.evopage.structureapi.DismissedEntity entity;

        public DismissSection(com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity) {
            this.entity = dismissedEntity;
        }

        public static /* synthetic */ DismissSection copy$default(DismissSection dismissSection, com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                dismissedEntity = dismissSection.entity;
            }
            return dismissSection.copy(dismissedEntity);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.spotify.home.evopage.structureapi.DismissedEntity getEntity() {
            return this.entity;
        }

        public final DismissSection copy(com.spotify.home.evopage.structureapi.DismissedEntity entity) {
            return new DismissSection(entity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissSection) && wj50.m88271j(this.entity, ((DismissSection) other).entity);
        }

        public final com.spotify.home.evopage.structureapi.DismissedEntity getEntity() {
            return this.entity;
        }

        public int hashCode() {
            return this.entity.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$ExplicitFeedbackListChanged;", "Lcom/spotify/home/evopage/mobius/Event;", "entityUris", "", "", "<init>", "(Ljava/util/Set;)V", "getEntityUris", "()Ljava/util/Set;", "breadcrumb", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ExplicitFeedbackListChanged implements Event {
        private final Set<String> entityUris;

        public ExplicitFeedbackListChanged(Set<String> set) {
            this.entityUris = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExplicitFeedbackListChanged copy$default(ExplicitFeedbackListChanged explicitFeedbackListChanged, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = explicitFeedbackListChanged.entityUris;
            }
            return explicitFeedbackListChanged.copy(set);
        }

        @Override // com.spotify.home.evopage.mobius.Event
        public String breadcrumb() {
            return "ExplicitFeedbackListChanged: " + this.entityUris;
        }

        public final Set<String> component1() {
            return this.entityUris;
        }

        public final ExplicitFeedbackListChanged copy(Set<String> entityUris) {
            return new ExplicitFeedbackListChanged(entityUris);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExplicitFeedbackListChanged) && wj50.m88271j(this.entityUris, ((ExplicitFeedbackListChanged) other).entityUris);
        }

        public final Set<String> getEntityUris() {
            return this.entityUris;
        }

        public int hashCode() {
            return this.entityUris.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$FailedToLoadOfflineItems;", "Lcom/spotify/home/evopage/mobius/Event;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "breadcrumb", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class FailedToLoadOfflineItems implements Event {
        private final Throwable error;

        public FailedToLoadOfflineItems(Throwable th) {
            this.error = th;
        }

        public static /* synthetic */ FailedToLoadOfflineItems copy$default(FailedToLoadOfflineItems failedToLoadOfflineItems, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failedToLoadOfflineItems.error;
            }
            return failedToLoadOfflineItems.copy(th);
        }

        @Override // com.spotify.home.evopage.mobius.Event
        public String breadcrumb() {
            return ei6.m39073j("FailedToLoadOfflineItems: ", this.error);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final FailedToLoadOfflineItems copy(Throwable error) {
            return new FailedToLoadOfflineItems(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FailedToLoadOfflineItems) && wj50.m88271j(this.error, ((FailedToLoadOfflineItems) other).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$ForceReloadChecked;", "Lcom/spotify/home/evopage/mobius/Event;", "", "shouldReload", "Lp/kaa0;", "loadingStrategy", "<init>", "(ZLp/kaa0;)V", "component1", "()Z", "component2", "()Lp/kaa0;", "copy", "(ZLp/kaa0;)Lcom/spotify/home/evopage/mobius/Event$ForceReloadChecked;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldReload", "Lp/kaa0;", "getLoadingStrategy", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ForceReloadChecked implements Event {
        private final kaa0 loadingStrategy;
        private final boolean shouldReload;

        public ForceReloadChecked(boolean z, kaa0 kaa0Var) {
            this.shouldReload = z;
            this.loadingStrategy = kaa0Var;
        }

        public static /* synthetic */ ForceReloadChecked copy$default(ForceReloadChecked forceReloadChecked, boolean z, kaa0 kaa0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                z = forceReloadChecked.shouldReload;
            }
            if ((i & 2) != 0) {
                kaa0Var = forceReloadChecked.loadingStrategy;
            }
            return forceReloadChecked.copy(z, kaa0Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldReload() {
            return this.shouldReload;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final kaa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final ForceReloadChecked copy(boolean shouldReload, kaa0 loadingStrategy) {
            return new ForceReloadChecked(shouldReload, loadingStrategy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForceReloadChecked)) {
                return false;
            }
            ForceReloadChecked forceReloadChecked = (ForceReloadChecked) other;
            return this.shouldReload == forceReloadChecked.shouldReload && this.loadingStrategy == forceReloadChecked.loadingStrategy;
        }

        public final kaa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final boolean getShouldReload() {
            return this.shouldReload;
        }

        public int hashCode() {
            return this.loadingStrategy.hashCode() + (Boolean.hashCode(this.shouldReload) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$Foregrounded;", "Lcom/spotify/home/evopage/mobius/Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Foregrounded implements Event {
        public static final Foregrounded INSTANCE = new Foregrounded();

        private Foregrounded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Foregrounded);
        }

        public int hashCode() {
            return 41220846;
        }

        public String toString() {
            return "Foregrounded";
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$GotHomeFeatureType;", "Lcom/spotify/home/evopage/mobius/Event;", "Lp/k330;", "homeFeatureType", "", "injectionIndex", "<init>", "(Lp/k330;I)V", "component1", "()Lp/k330;", "component2", "()I", "copy", "(Lp/k330;I)Lcom/spotify/home/evopage/mobius/Event$GotHomeFeatureType;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/k330;", "getHomeFeatureType", "I", "getInjectionIndex", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class GotHomeFeatureType implements Event {
        private final k330 homeFeatureType;
        private final int injectionIndex;

        public GotHomeFeatureType(k330 k330Var, int i) {
            this.homeFeatureType = k330Var;
            this.injectionIndex = i;
        }

        public static /* synthetic */ GotHomeFeatureType copy$default(GotHomeFeatureType gotHomeFeatureType, k330 k330Var, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                k330Var = gotHomeFeatureType.homeFeatureType;
            }
            if ((i2 & 2) != 0) {
                i = gotHomeFeatureType.injectionIndex;
            }
            return gotHomeFeatureType.copy(k330Var, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final k330 getHomeFeatureType() {
            return this.homeFeatureType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getInjectionIndex() {
            return this.injectionIndex;
        }

        public final GotHomeFeatureType copy(k330 homeFeatureType, int injectionIndex) {
            return new GotHomeFeatureType(homeFeatureType, injectionIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GotHomeFeatureType)) {
                return false;
            }
            GotHomeFeatureType gotHomeFeatureType = (GotHomeFeatureType) other;
            return wj50.m88271j(this.homeFeatureType, gotHomeFeatureType.homeFeatureType) && this.injectionIndex == gotHomeFeatureType.injectionIndex;
        }

        public final k330 getHomeFeatureType() {
            return this.homeFeatureType;
        }

        public final int getInjectionIndex() {
            return this.injectionIndex;
        }

        public int hashCode() {
            k330 k330Var = this.homeFeatureType;
            return Integer.hashCode(this.injectionIndex) + ((k330Var == null ? 0 : k330Var.hashCode()) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$GotOfflineItems;", "Lcom/spotify/home/evopage/mobius/Event;", "", "Lp/uyk0;", "offlineHomeItems", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/spotify/home/evopage/mobius/Event$GotOfflineItems;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOfflineHomeItems", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class GotOfflineItems implements Event {
        private final List<uyk0> offlineHomeItems;

        public GotOfflineItems(List<uyk0> list) {
            this.offlineHomeItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GotOfflineItems copy$default(GotOfflineItems gotOfflineItems, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = gotOfflineItems.offlineHomeItems;
            }
            return gotOfflineItems.copy(list);
        }

        public final List<uyk0> component1() {
            return this.offlineHomeItems;
        }

        public final GotOfflineItems copy(List<uyk0> offlineHomeItems) {
            return new GotOfflineItems(offlineHomeItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GotOfflineItems) && wj50.m88271j(this.offlineHomeItems, ((GotOfflineItems) other).offlineHomeItems);
        }

        public final List<uyk0> getOfflineHomeItems() {
            return this.offlineHomeItems;
        }

        public int hashCode() {
            return this.offlineHomeItems.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$LoadMore;", "Lcom/spotify/home/evopage/mobius/Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class LoadMore implements Event {
        public static final LoadMore INSTANCE = new LoadMore();

        private LoadMore() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadMore);
        }

        public int hashCode() {
            return -1824186073;
        }

        public String toString() {
            return "LoadMore";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$PageBecameFocused;", "Lcom/spotify/home/evopage/mobius/Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class PageBecameFocused implements Event {
        public static final PageBecameFocused INSTANCE = new PageBecameFocused();

        private PageBecameFocused() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PageBecameFocused);
        }

        public int hashCode() {
            return 582219619;
        }

        public String toString() {
            return "PageBecameFocused";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$Refresh;", "Lcom/spotify/home/evopage/mobius/Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Refresh implements Event {
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Refresh);
        }

        public int hashCode() {
            return 2075449743;
        }

        public String toString() {
            return "Refresh";
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$TempDismissedEntitiesChanged;", "Lcom/spotify/home/evopage/mobius/Event;", "dismissedEntities", "", "Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "<init>", "(Ljava/util/Set;)V", "getDismissedEntities", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @gtq
    public static final /* data */ class TempDismissedEntitiesChanged implements Event {
        private final Set<com.spotify.home.evopage.structureapi.DismissedEntity> dismissedEntities;

        public TempDismissedEntitiesChanged(Set<com.spotify.home.evopage.structureapi.DismissedEntity> set) {
            this.dismissedEntities = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TempDismissedEntitiesChanged copy$default(TempDismissedEntitiesChanged tempDismissedEntitiesChanged, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = tempDismissedEntitiesChanged.dismissedEntities;
            }
            return tempDismissedEntitiesChanged.copy(set);
        }

        public final Set<com.spotify.home.evopage.structureapi.DismissedEntity> component1() {
            return this.dismissedEntities;
        }

        public final TempDismissedEntitiesChanged copy(Set<com.spotify.home.evopage.structureapi.DismissedEntity> dismissedEntities) {
            return new TempDismissedEntitiesChanged(dismissedEntities);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TempDismissedEntitiesChanged) && wj50.m88271j(this.dismissedEntities, ((TempDismissedEntitiesChanged) other).dismissedEntities);
        }

        public final Set<com.spotify.home.evopage.structureapi.DismissedEntity> getDismissedEntities() {
            return this.dismissedEntities;
        }

        public int hashCode() {
            return this.dismissedEntities.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$UndoDismissSection;", "Lcom/spotify/home/evopage/mobius/Event;", "entity", "Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "<init>", "(Lcom/spotify/home/evopage/structureapi/DismissedEntity;)V", "getEntity", "()Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class UndoDismissSection implements Event {
        private final com.spotify.home.evopage.structureapi.DismissedEntity entity;

        public UndoDismissSection(com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity) {
            this.entity = dismissedEntity;
        }

        public static /* synthetic */ UndoDismissSection copy$default(UndoDismissSection undoDismissSection, com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                dismissedEntity = undoDismissSection.entity;
            }
            return undoDismissSection.copy(dismissedEntity);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.spotify.home.evopage.structureapi.DismissedEntity getEntity() {
            return this.entity;
        }

        public final UndoDismissSection copy(com.spotify.home.evopage.structureapi.DismissedEntity entity) {
            return new UndoDismissSection(entity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UndoDismissSection) && wj50.m88271j(this.entity, ((UndoDismissSection) other).entity);
        }

        public final com.spotify.home.evopage.structureapi.DismissedEntity getEntity() {
            return this.entity;
        }

        public int hashCode() {
            return this.entity.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$VideoSettingsChanged;", "Lcom/spotify/home/evopage/mobius/Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class VideoSettingsChanged implements Event {
        public static final VideoSettingsChanged INSTANCE = new VideoSettingsChanged();

        private VideoSettingsChanged() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof VideoSettingsChanged);
        }

        public int hashCode() {
            return -270672670;
        }

        public String toString() {
            return "VideoSettingsChanged";
        }
    }

    default String breadcrumb() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Keep
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$FailedToLoadMoreHomeStructure;", "Lcom/spotify/home/evopage/mobius/Event;", "error", "", "filterValue", "", "isConnected", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", "getError", "()Ljava/lang/Throwable;", "getFilterValue", "()Ljava/lang/String;", "()Z", "breadcrumb", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class FailedToLoadMoreHomeStructure implements Event {
        private final Throwable error;
        private final String filterValue;
        private final boolean isConnected;

        public FailedToLoadMoreHomeStructure(Throwable th, String str, boolean z) {
            this.error = th;
            this.filterValue = str;
            this.isConnected = z;
        }

        public static /* synthetic */ FailedToLoadMoreHomeStructure copy$default(FailedToLoadMoreHomeStructure failedToLoadMoreHomeStructure, Throwable th, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failedToLoadMoreHomeStructure.error;
            }
            if ((i & 2) != 0) {
                str = failedToLoadMoreHomeStructure.filterValue;
            }
            if ((i & 4) != 0) {
                z = failedToLoadMoreHomeStructure.isConnected;
            }
            return failedToLoadMoreHomeStructure.copy(th, str, z);
        }

        @Override // com.spotify.home.evopage.mobius.Event
        public String breadcrumb() {
            return "FailedToLoadMoreHomeStructure: " + this.error + " filterValue: " + this.filterValue + " isConnected: " + this.isConnected;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilterValue() {
            return this.filterValue;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsConnected() {
            return this.isConnected;
        }

        public final FailedToLoadMoreHomeStructure copy(Throwable error, String filterValue, boolean isConnected) {
            return new FailedToLoadMoreHomeStructure(error, filterValue, isConnected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToLoadMoreHomeStructure)) {
                return false;
            }
            FailedToLoadMoreHomeStructure failedToLoadMoreHomeStructure = (FailedToLoadMoreHomeStructure) other;
            return wj50.m88271j(this.error, failedToLoadMoreHomeStructure.error) && wj50.m88271j(this.filterValue, failedToLoadMoreHomeStructure.filterValue) && this.isConnected == failedToLoadMoreHomeStructure.isConnected;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getFilterValue() {
            return this.filterValue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isConnected) + s571.m77243b(this.error.hashCode() * 31, 31, this.filterValue);
        }

        public final boolean isConnected() {
            return this.isConnected;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FailedToLoadMoreHomeStructure(Throwable th, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, str, (i & 4) != 0 ? false : z);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0014¨\u0006&"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$FailedToLoadHomeStructure;", "Lcom/spotify/home/evopage/mobius/Event;", "", "error", "Lp/kaa0;", "loadingStrategy", "", "filterValue", "", "isConnected", "<init>", "(Ljava/lang/Throwable;Lp/kaa0;Ljava/lang/String;Z)V", "breadcrumb", "()Ljava/lang/String;", "component1", "()Ljava/lang/Throwable;", "component2", "()Lp/kaa0;", "component3", "component4", "()Z", "copy", "(Ljava/lang/Throwable;Lp/kaa0;Ljava/lang/String;Z)Lcom/spotify/home/evopage/mobius/Event$FailedToLoadHomeStructure;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "Lp/kaa0;", "getLoadingStrategy", "Ljava/lang/String;", "getFilterValue", "Z", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class FailedToLoadHomeStructure implements Event {
        private final Throwable error;
        private final String filterValue;
        private final boolean isConnected;
        private final kaa0 loadingStrategy;

        public FailedToLoadHomeStructure(Throwable th, kaa0 kaa0Var, String str, boolean z) {
            this.error = th;
            this.loadingStrategy = kaa0Var;
            this.filterValue = str;
            this.isConnected = z;
        }

        public static /* synthetic */ FailedToLoadHomeStructure copy$default(FailedToLoadHomeStructure failedToLoadHomeStructure, Throwable th, kaa0 kaa0Var, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failedToLoadHomeStructure.error;
            }
            if ((i & 2) != 0) {
                kaa0Var = failedToLoadHomeStructure.loadingStrategy;
            }
            if ((i & 4) != 0) {
                str = failedToLoadHomeStructure.filterValue;
            }
            if ((i & 8) != 0) {
                z = failedToLoadHomeStructure.isConnected;
            }
            return failedToLoadHomeStructure.copy(th, kaa0Var, str, z);
        }

        @Override // com.spotify.home.evopage.mobius.Event
        public String breadcrumb() {
            return "FailedToLoadHomeStructure: " + this.error + " loadingStrategy: " + this.loadingStrategy + " isConnected: " + this.isConnected;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final kaa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFilterValue() {
            return this.filterValue;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsConnected() {
            return this.isConnected;
        }

        public final FailedToLoadHomeStructure copy(Throwable error, kaa0 loadingStrategy, String filterValue, boolean isConnected) {
            return new FailedToLoadHomeStructure(error, loadingStrategy, filterValue, isConnected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToLoadHomeStructure)) {
                return false;
            }
            FailedToLoadHomeStructure failedToLoadHomeStructure = (FailedToLoadHomeStructure) other;
            return wj50.m88271j(this.error, failedToLoadHomeStructure.error) && this.loadingStrategy == failedToLoadHomeStructure.loadingStrategy && wj50.m88271j(this.filterValue, failedToLoadHomeStructure.filterValue) && this.isConnected == failedToLoadHomeStructure.isConnected;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getFilterValue() {
            return this.filterValue;
        }

        public final kaa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isConnected) + s571.m77243b((this.loadingStrategy.hashCode() + (this.error.hashCode() * 31)) * 31, 31, this.filterValue);
        }

        public final boolean isConnected() {
            return this.isConnected;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FailedToLoadHomeStructure(Throwable th, kaa0 kaa0Var, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, kaa0Var, str, (i & 8) != 0 ? false : z);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ \u0010)\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b+\u0010,J¢\u0001\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b;\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010$R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b\r\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bB\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bC\u0010\u001bR'\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010*R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bG\u0010,¨\u0006H"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/Event$GotSlotBasedHomeContent;", "Lcom/spotify/home/evopage/mobius/Event;", "", "Lp/k330;", "sectionDataList", "", "Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "dismissedSectionUris", "tempAdDismissedSectionUris", "Lp/i3a0;", "loadSource", "", "hasLoadingSlots", "isConnected", "", "filterValue", "pageToken", "refreshToken", "Lp/ebf0;", "Ljava/lang/Class;", "Lp/ktx;", "eagerLoadedTraits", "Lp/t3x0;", "responseInstrumentationData", "<init>", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lp/i3a0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/ebf0;Lp/t3x0;)V", "breadcrumb", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Set;", "component3", "component4", "()Lp/i3a0;", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "()Lp/ebf0;", "component11", "()Lp/t3x0;", "copy", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lp/i3a0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/ebf0;Lp/t3x0;)Lcom/spotify/home/evopage/mobius/Event$GotSlotBasedHomeContent;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSectionDataList", "Ljava/util/Set;", "getDismissedSectionUris", "getTempAdDismissedSectionUris", "Lp/i3a0;", "getLoadSource", "Z", "getHasLoadingSlots", "Ljava/lang/String;", "getFilterValue", "getPageToken", "getRefreshToken", "Lp/ebf0;", "getEagerLoadedTraits", "Lp/t3x0;", "getResponseInstrumentationData", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class GotSlotBasedHomeContent implements Event {
        private final Set<com.spotify.home.evopage.structureapi.DismissedEntity> dismissedSectionUris;
        private final ebf0 eagerLoadedTraits;
        private final String filterValue;
        private final boolean hasLoadingSlots;
        private final boolean isConnected;
        private final i3a0 loadSource;
        private final String pageToken;
        private final String refreshToken;
        private final t3x0 responseInstrumentationData;
        private final List<k330> sectionDataList;
        private final Set<com.spotify.home.evopage.structureapi.DismissedEntity> tempAdDismissedSectionUris;

        /* JADX WARN: Multi-variable type inference failed */
        public GotSlotBasedHomeContent(List<? extends k330> list, Set<com.spotify.home.evopage.structureapi.DismissedEntity> set, Set<com.spotify.home.evopage.structureapi.DismissedEntity> set2, i3a0 i3a0Var, boolean z, boolean z2, String str, String str2, String str3, ebf0 ebf0Var, t3x0 t3x0Var) {
            this.sectionDataList = list;
            this.dismissedSectionUris = set;
            this.tempAdDismissedSectionUris = set2;
            this.loadSource = i3a0Var;
            this.hasLoadingSlots = z;
            this.isConnected = z2;
            this.filterValue = str;
            this.pageToken = str2;
            this.refreshToken = str3;
            this.eagerLoadedTraits = ebf0Var;
            this.responseInstrumentationData = t3x0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GotSlotBasedHomeContent copy$default(GotSlotBasedHomeContent gotSlotBasedHomeContent, List list, Set set, Set set2, i3a0 i3a0Var, boolean z, boolean z2, String str, String str2, String str3, ebf0 ebf0Var, t3x0 t3x0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                list = gotSlotBasedHomeContent.sectionDataList;
            }
            if ((i & 2) != 0) {
                set = gotSlotBasedHomeContent.dismissedSectionUris;
            }
            if ((i & 4) != 0) {
                set2 = gotSlotBasedHomeContent.tempAdDismissedSectionUris;
            }
            if ((i & 8) != 0) {
                i3a0Var = gotSlotBasedHomeContent.loadSource;
            }
            if ((i & 16) != 0) {
                z = gotSlotBasedHomeContent.hasLoadingSlots;
            }
            if ((i & 32) != 0) {
                z2 = gotSlotBasedHomeContent.isConnected;
            }
            if ((i & 64) != 0) {
                str = gotSlotBasedHomeContent.filterValue;
            }
            if ((i & 128) != 0) {
                str2 = gotSlotBasedHomeContent.pageToken;
            }
            if ((i & 256) != 0) {
                str3 = gotSlotBasedHomeContent.refreshToken;
            }
            if ((i & 512) != 0) {
                ebf0Var = gotSlotBasedHomeContent.eagerLoadedTraits;
            }
            if ((i & 1024) != 0) {
                t3x0Var = gotSlotBasedHomeContent.responseInstrumentationData;
            }
            ebf0 ebf0Var2 = ebf0Var;
            t3x0 t3x0Var2 = t3x0Var;
            String str4 = str2;
            String str5 = str3;
            boolean z3 = z2;
            String str6 = str;
            boolean z4 = z;
            Set set3 = set2;
            return gotSlotBasedHomeContent.copy(list, set, set3, i3a0Var, z4, z3, str6, str4, str5, ebf0Var2, t3x0Var2);
        }

        @Override // com.spotify.home.evopage.mobius.Event
        public String breadcrumb() {
            return "GotSlotBasedHomeContent: " + this.sectionDataList.size() + " sections, hasLoadingSlots: " + this.hasLoadingSlots + ", isConnected: " + this.isConnected + ", loadSource: " + this.loadSource;
        }

        public final List<k330> component1() {
            return this.sectionDataList;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final ebf0 getEagerLoadedTraits() {
            return this.eagerLoadedTraits;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final t3x0 getResponseInstrumentationData() {
            return this.responseInstrumentationData;
        }

        public final Set<com.spotify.home.evopage.structureapi.DismissedEntity> component2() {
            return this.dismissedSectionUris;
        }

        public final Set<com.spotify.home.evopage.structureapi.DismissedEntity> component3() {
            return this.tempAdDismissedSectionUris;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final i3a0 getLoadSource() {
            return this.loadSource;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getHasLoadingSlots() {
            return this.hasLoadingSlots;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsConnected() {
            return this.isConnected;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFilterValue() {
            return this.filterValue;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPageToken() {
            return this.pageToken;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final GotSlotBasedHomeContent copy(List<? extends k330> sectionDataList, Set<com.spotify.home.evopage.structureapi.DismissedEntity> dismissedSectionUris, Set<com.spotify.home.evopage.structureapi.DismissedEntity> tempAdDismissedSectionUris, i3a0 loadSource, boolean hasLoadingSlots, boolean isConnected, String filterValue, String pageToken, String refreshToken, ebf0 eagerLoadedTraits, t3x0 responseInstrumentationData) {
            return new GotSlotBasedHomeContent(sectionDataList, dismissedSectionUris, tempAdDismissedSectionUris, loadSource, hasLoadingSlots, isConnected, filterValue, pageToken, refreshToken, eagerLoadedTraits, responseInstrumentationData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GotSlotBasedHomeContent)) {
                return false;
            }
            GotSlotBasedHomeContent gotSlotBasedHomeContent = (GotSlotBasedHomeContent) other;
            return wj50.m88271j(this.sectionDataList, gotSlotBasedHomeContent.sectionDataList) && wj50.m88271j(this.dismissedSectionUris, gotSlotBasedHomeContent.dismissedSectionUris) && wj50.m88271j(this.tempAdDismissedSectionUris, gotSlotBasedHomeContent.tempAdDismissedSectionUris) && this.loadSource == gotSlotBasedHomeContent.loadSource && this.hasLoadingSlots == gotSlotBasedHomeContent.hasLoadingSlots && this.isConnected == gotSlotBasedHomeContent.isConnected && wj50.m88271j(this.filterValue, gotSlotBasedHomeContent.filterValue) && wj50.m88271j(this.pageToken, gotSlotBasedHomeContent.pageToken) && wj50.m88271j(this.refreshToken, gotSlotBasedHomeContent.refreshToken) && wj50.m88271j(this.eagerLoadedTraits, gotSlotBasedHomeContent.eagerLoadedTraits) && wj50.m88271j(this.responseInstrumentationData, gotSlotBasedHomeContent.responseInstrumentationData);
        }

        public final Set<com.spotify.home.evopage.structureapi.DismissedEntity> getDismissedSectionUris() {
            return this.dismissedSectionUris;
        }

        public final ebf0 getEagerLoadedTraits() {
            return this.eagerLoadedTraits;
        }

        public final String getFilterValue() {
            return this.filterValue;
        }

        public final boolean getHasLoadingSlots() {
            return this.hasLoadingSlots;
        }

        public final i3a0 getLoadSource() {
            return this.loadSource;
        }

        public final String getPageToken() {
            return this.pageToken;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final t3x0 getResponseInstrumentationData() {
            return this.responseInstrumentationData;
        }

        public final List<k330> getSectionDataList() {
            return this.sectionDataList;
        }

        public final Set<com.spotify.home.evopage.structureapi.DismissedEntity> getTempAdDismissedSectionUris() {
            return this.tempAdDismissedSectionUris;
        }

        public int hashCode() {
            int iM77243b = s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d((this.loadSource.hashCode() + klh.m56830b(klh.m56830b(this.sectionDataList.hashCode() * 31, 31, this.dismissedSectionUris), 31, this.tempAdDismissedSectionUris)) * 31, 31, this.hasLoadingSlots), 31, this.isConnected), 31, this.filterValue), 31, this.pageToken);
            String str = this.refreshToken;
            int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
            ebf0 ebf0Var = this.eagerLoadedTraits;
            return this.responseInstrumentationData.hashCode() + ((iHashCode + (ebf0Var != null ? ebf0Var.f57921a.hashCode() : 0)) * 31);
        }

        public final boolean isConnected() {
            return this.isConnected;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ GotSlotBasedHomeContent(List list, Set set, Set set2, i3a0 i3a0Var, boolean z, boolean z2, String str, String str2, String str3, ebf0 ebf0Var, t3x0 t3x0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, set, set2, i3a0Var, z, z2, str, str2, str3, (i & 512) != 0 ? null : ebf0Var, t3x0Var);
        }
    }
}
