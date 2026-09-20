package com.spotify.browse.clientnative.mobius;

import androidx.annotation.Keep;
import java.util.Set;
import kotlin.Metadata;
import p204p.gmr0;
import p204p.laa0;
import p204p.wj50;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\b\n\r\b\t\u000b\f\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "", "", "breadcrumb", "()Ljava/lang/String;", "StructureLoaded", "StructureLoadFailed", "ExplicitFeedbackListChanged", "p/sma", "p/tma", "p/rma", "p/uma", "p/vma", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent$ExplicitFeedbackListChanged;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoadFailed;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoaded;", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface BrowseEvent {

    @Keep
    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent$ExplicitFeedbackListChanged;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "entityUris", "", "", "<init>", "(Ljava/util/Set;)V", "getEntityUris", "()Ljava/util/Set;", "breadcrumb", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ExplicitFeedbackListChanged implements BrowseEvent {
        public static final int $stable = 0;
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

        @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
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
    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoadFailed;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "Lp/laa0;", "loadingStrategy", "", "throwable", "<init>", "(Lp/laa0;Ljava/lang/Throwable;)V", "component1", "()Lp/laa0;", "component2", "()Ljava/lang/Throwable;", "copy", "(Lp/laa0;Ljava/lang/Throwable;)Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoadFailed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/laa0;", "getLoadingStrategy", "Ljava/lang/Throwable;", "getThrowable", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class StructureLoadFailed implements BrowseEvent {
        public static final int $stable = 8;
        private final laa0 loadingStrategy;
        private final Throwable throwable;

        public StructureLoadFailed(laa0 laa0Var, Throwable th) {
            this.loadingStrategy = laa0Var;
            this.throwable = th;
        }

        public static /* synthetic */ StructureLoadFailed copy$default(StructureLoadFailed structureLoadFailed, laa0 laa0Var, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                laa0Var = structureLoadFailed.loadingStrategy;
            }
            if ((i & 2) != 0) {
                th = structureLoadFailed.throwable;
            }
            return structureLoadFailed.copy(laa0Var, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final laa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final StructureLoadFailed copy(laa0 loadingStrategy, Throwable throwable) {
            return new StructureLoadFailed(loadingStrategy, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StructureLoadFailed)) {
                return false;
            }
            StructureLoadFailed structureLoadFailed = (StructureLoadFailed) other;
            return this.loadingStrategy == structureLoadFailed.loadingStrategy && wj50.m88271j(this.throwable, structureLoadFailed.throwable);
        }

        public final laa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode() + (this.loadingStrategy.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013¨\u0006("}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoaded;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "Lp/gmr0;", "profile", "Lcom/spotify/browse/clientnative/mobius/Model;", "browsitaContent", "Lp/laa0;", "loadingStrategy", "", "shouldShowDSABanner", "<init>", "(Lp/gmr0;Lcom/spotify/browse/clientnative/mobius/Model;Lp/laa0;Z)V", "component1", "()Lp/gmr0;", "component2", "()Lcom/spotify/browse/clientnative/mobius/Model;", "component3", "()Lp/laa0;", "component4", "()Z", "copy", "(Lp/gmr0;Lcom/spotify/browse/clientnative/mobius/Model;Lp/laa0;Z)Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoaded;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lp/gmr0;", "getProfile", "Lcom/spotify/browse/clientnative/mobius/Model;", "getBrowsitaContent", "Lp/laa0;", "getLoadingStrategy", "Z", "getShouldShowDSABanner", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class StructureLoaded implements BrowseEvent {
        public static final int $stable = 8;
        private final Model browsitaContent;
        private final laa0 loadingStrategy;
        private final gmr0 profile;
        private final boolean shouldShowDSABanner;

        public StructureLoaded(gmr0 gmr0Var, Model model, laa0 laa0Var, boolean z) {
            this.profile = gmr0Var;
            this.browsitaContent = model;
            this.loadingStrategy = laa0Var;
            this.shouldShowDSABanner = z;
        }

        public static /* synthetic */ StructureLoaded copy$default(StructureLoaded structureLoaded, gmr0 gmr0Var, Model model, laa0 laa0Var, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                gmr0Var = structureLoaded.profile;
            }
            if ((i & 2) != 0) {
                model = structureLoaded.browsitaContent;
            }
            if ((i & 4) != 0) {
                laa0Var = structureLoaded.loadingStrategy;
            }
            if ((i & 8) != 0) {
                z = structureLoaded.shouldShowDSABanner;
            }
            return structureLoaded.copy(gmr0Var, model, laa0Var, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final gmr0 getProfile() {
            return this.profile;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Model getBrowsitaContent() {
            return this.browsitaContent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final laa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShouldShowDSABanner() {
            return this.shouldShowDSABanner;
        }

        public final StructureLoaded copy(gmr0 profile, Model browsitaContent, laa0 loadingStrategy, boolean shouldShowDSABanner) {
            return new StructureLoaded(profile, browsitaContent, loadingStrategy, shouldShowDSABanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StructureLoaded)) {
                return false;
            }
            StructureLoaded structureLoaded = (StructureLoaded) other;
            return wj50.m88271j(this.profile, structureLoaded.profile) && wj50.m88271j(this.browsitaContent, structureLoaded.browsitaContent) && this.loadingStrategy == structureLoaded.loadingStrategy && this.shouldShowDSABanner == structureLoaded.shouldShowDSABanner;
        }

        public final Model getBrowsitaContent() {
            return this.browsitaContent;
        }

        public final laa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final gmr0 getProfile() {
            return this.profile;
        }

        public final boolean getShouldShowDSABanner() {
            return this.shouldShowDSABanner;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShowDSABanner) + ((this.loadingStrategy.hashCode() + ((this.browsitaContent.hashCode() + (this.profile.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    default String breadcrumb() {
        return getClass().getSimpleName();
    }
}
