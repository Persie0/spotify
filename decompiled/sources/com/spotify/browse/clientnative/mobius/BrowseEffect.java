package com.spotify.browse.clientnative.mobius;

import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.laa0;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEffect;", "", "Load", "Lcom/spotify/browse/clientnative/mobius/BrowseEffect$Load;", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface BrowseEffect {

    @Keep
    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEffect$Load;", "Lcom/spotify/browse/clientnative/mobius/BrowseEffect;", "Lp/laa0;", "loadingStrategy", "<init>", "(Lp/laa0;)V", "component1", "()Lp/laa0;", "copy", "(Lp/laa0;)Lcom/spotify/browse/clientnative/mobius/BrowseEffect$Load;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/laa0;", "getLoadingStrategy", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Load implements BrowseEffect {
        public static final int $stable = 0;
        private final laa0 loadingStrategy;

        public Load(laa0 laa0Var) {
            this.loadingStrategy = laa0Var;
        }

        public static /* synthetic */ Load copy$default(Load load, laa0 laa0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                laa0Var = load.loadingStrategy;
            }
            return load.copy(laa0Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final laa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final Load copy(laa0 loadingStrategy) {
            return new Load(loadingStrategy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Load) && this.loadingStrategy == ((Load) other).loadingStrategy;
        }

        public final laa0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public int hashCode() {
            return this.loadingStrategy.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
