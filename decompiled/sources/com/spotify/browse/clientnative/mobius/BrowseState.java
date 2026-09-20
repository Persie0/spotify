package com.spotify.browse.clientnative.mobius;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import p204p.gmr0;
import p204p.wj50;
import p204p.wma;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nJ\b\u0010\u0002\u001a\u00020\u0003H\u0016R\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseState;", "", "breadcrumb", "", "dataSource", "getDataSource", "(Lcom/spotify/browse/clientnative/mobius/BrowseState;)Ljava/lang/String;", "Content", "Error", "Loading", "UIRendered", "Lcom/spotify/browse/clientnative/mobius/BrowseState$Content;", "Lcom/spotify/browse/clientnative/mobius/BrowseState$Error;", "Lcom/spotify/browse/clientnative/mobius/BrowseState$Loading;", "Lcom/spotify/browse/clientnative/mobius/BrowseState$UIRendered;", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface BrowseState {

    @Keep
    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseState$Content;", "Lcom/spotify/browse/clientnative/mobius/BrowseState;", "Lp/gmr0;", "profile", "Lcom/spotify/browse/clientnative/mobius/Model;", "model", "", "columnCount", "<init>", "(Lp/gmr0;Lcom/spotify/browse/clientnative/mobius/Model;I)V", "component1", "()Lp/gmr0;", "component2", "()Lcom/spotify/browse/clientnative/mobius/Model;", "component3", "()I", "copy", "(Lp/gmr0;Lcom/spotify/browse/clientnative/mobius/Model;I)Lcom/spotify/browse/clientnative/mobius/BrowseState$Content;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/gmr0;", "getProfile", "Lcom/spotify/browse/clientnative/mobius/Model;", "getModel", "I", "getColumnCount", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Content implements BrowseState {
        public static final int $stable = 8;
        private final int columnCount;
        private final Model model;
        private final gmr0 profile;

        public Content(gmr0 gmr0Var, Model model, int i) {
            this.profile = gmr0Var;
            this.model = model;
            this.columnCount = i;
        }

        public static /* synthetic */ Content copy$default(Content content, gmr0 gmr0Var, Model model, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                gmr0Var = content.profile;
            }
            if ((i2 & 2) != 0) {
                model = content.model;
            }
            if ((i2 & 4) != 0) {
                i = content.columnCount;
            }
            return content.copy(gmr0Var, model, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final gmr0 getProfile() {
            return this.profile;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Model getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getColumnCount() {
            return this.columnCount;
        }

        public final Content copy(gmr0 profile, Model model, int columnCount) {
            return new Content(profile, model, columnCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return wj50.m88271j(this.profile, content.profile) && wj50.m88271j(this.model, content.model) && this.columnCount == content.columnCount;
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        public final Model getModel() {
            return this.model;
        }

        public final gmr0 getProfile() {
            return this.profile;
        }

        public int hashCode() {
            return Integer.hashCode(this.columnCount) + ((this.model.hashCode() + (this.profile.hashCode() * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseState$Error;", "Lcom/spotify/browse/clientnative/mobius/BrowseState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Error implements BrowseState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && wj50.m88271j(this.throwable, ((Error) other).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseState$Loading;", "Lcom/spotify/browse/clientnative/mobius/BrowseState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Loading implements BrowseState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 262737591;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseState$UIRendered;", "Lcom/spotify/browse/clientnative/mobius/BrowseState;", "columnCount", "", "<init>", "(I)V", "getColumnCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class UIRendered implements BrowseState {
        public static final int $stable = 0;
        private final int columnCount;

        public UIRendered(int i) {
            this.columnCount = i;
        }

        public static /* synthetic */ UIRendered copy$default(UIRendered uIRendered, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = uIRendered.columnCount;
            }
            return uIRendered.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getColumnCount() {
            return this.columnCount;
        }

        public final UIRendered copy(int columnCount) {
            return new UIRendered(columnCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UIRendered) && this.columnCount == ((UIRendered) other).columnCount;
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.columnCount);
        }

        public String toString() {
            return super.toString();
        }
    }

    default String breadcrumb() {
        Model model;
        Model model2;
        List<wma> displayableSections;
        String simpleName = getClass().getSimpleName();
        Content contentM4051a = AbstractC0319c.m4051a(this);
        int size = (contentM4051a == null || (model2 = contentM4051a.getModel()) == null || (displayableSections = model2.getDisplayableSections()) == null) ? 0 : displayableSections.size();
        Content contentM4051a2 = AbstractC0319c.m4051a(this);
        return simpleName + " -> " + size + " sections, datasource " + ((contentM4051a2 == null || (model = contentM4051a2.getModel()) == null) ? null : model.getDataSource());
    }

    default String getDataSource(BrowseState browseState) {
        Model model;
        String dataSource;
        Content contentM4051a = AbstractC0319c.m4051a(browseState);
        return (contentM4051a == null || (model = contentM4051a.getModel()) == null || (dataSource = model.getDataSource()) == null) ? "" : dataSource;
    }
}
