package com.spotify.home.evopage.mobius;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.dq60;
import p204p.g6f;
import p204p.lau;
import p204p.ovh0;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0003\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/State;", "", "breadcrumb", "", "Loading", "Content", "Error", "Lcom/spotify/home/evopage/mobius/State$Content;", "Lcom/spotify/home/evopage/mobius/State$Error;", "Lcom/spotify/home/evopage/mobius/State$Loading;", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface State {

    @Keep
    @Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/State$Loading;", "Lcom/spotify/home/evopage/mobius/State;", "sessionId", "", "<init>", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Loading implements State {
        private final String sessionId;

        public Loading(String str) {
            this.sessionId = str;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.sessionId;
            }
            return loading.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final Loading copy(String sessionId) {
            return new Loading(sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && wj50.m88271j(this.sessionId, ((Loading) other).sessionId);
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    default String breadcrumb() {
        return getClass().getSimpleName();
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/State$Error;", "Lcom/spotify/home/evopage/mobius/State;", "error", "", "refreshToken", "", "sessionId", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/Throwable;", "getRefreshToken", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Error implements State {
        private final Throwable error;
        private final String refreshToken;
        private final String sessionId;

        public Error(Throwable th, String str, String str2) {
            this.error = th;
            this.refreshToken = str;
            this.sessionId = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            if ((i & 2) != 0) {
                str = error.refreshToken;
            }
            if ((i & 4) != 0) {
                str2 = error.sessionId;
            }
            return error.copy(th, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final Error copy(Throwable error, String refreshToken, String sessionId) {
            return new Error(error, refreshToken, sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return wj50.m88271j(this.error, error.error) && wj50.m88271j(this.refreshToken, error.refreshToken) && wj50.m88271j(this.sessionId, error.sessionId);
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.refreshToken;
            return this.sessionId.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Error(Throwable th, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : str, str2);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006)"}, m24212d2 = {"Lcom/spotify/home/evopage/mobius/State$Content;", "Lcom/spotify/home/evopage/mobius/State;", "Lp/ovh0;", "model", "", "isOnline", "", "pageToken", "refreshToken", "", "loadingHistory", "<init>", "(Lp/ovh0;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "breadcrumb", "()Ljava/lang/String;", "component1", "()Lp/ovh0;", "component2", "()Z", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Lp/ovh0;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/spotify/home/evopage/mobius/State$Content;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lp/ovh0;", "getModel", "Z", "Ljava/lang/String;", "getPageToken", "getRefreshToken", "Ljava/util/List;", "getLoadingHistory", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Content implements State {
        private final boolean isOnline;
        private final List<String> loadingHistory;
        private final ovh0 model;
        private final String pageToken;
        private final String refreshToken;

        public Content(ovh0 ovh0Var, boolean z, String str, String str2, List<String> list) {
            this.model = ovh0Var;
            this.isOnline = z;
            this.pageToken = str;
            this.refreshToken = str2;
            this.loadingHistory = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, ovh0 ovh0Var, boolean z, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                ovh0Var = content.model;
            }
            if ((i & 2) != 0) {
                z = content.isOnline;
            }
            if ((i & 4) != 0) {
                str = content.pageToken;
            }
            if ((i & 8) != 0) {
                str2 = content.refreshToken;
            }
            if ((i & 16) != 0) {
                list = content.loadingHistory;
            }
            List list2 = list;
            String str3 = str;
            return content.copy(ovh0Var, z, str3, str2, list2);
        }

        @Override // com.spotify.home.evopage.mobius.State
        public String breadcrumb() {
            boolean z = !this.model.f170506e.isEmpty();
            boolean z2 = this.isOnline;
            int size = this.model.m68132b().size();
            String str = this.refreshToken;
            String str2 = this.pageToken;
            String strM43753y0 = g6f.m43753y0(this.loadingHistory, null, null, null, null, 63);
            StringBuilder sb = new StringBuilder("Content -> hasOfflineItems: ");
            sb.append(z);
            sb.append(", isOnline: ");
            sb.append(z2);
            sb.append(", displayableFeatures: ");
            sb.append(size);
            sb.append(", refreshToken ");
            sb.append(str);
            sb.append(", pageToken ");
            return dq60.m36618r(sb, str2, ", loadingHistory: ", strM43753y0);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ovh0 getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsOnline() {
            return this.isOnline;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPageToken() {
            return this.pageToken;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final List<String> component5() {
            return this.loadingHistory;
        }

        public final Content copy(ovh0 model, boolean isOnline, String pageToken, String refreshToken, List<String> loadingHistory) {
            return new Content(model, isOnline, pageToken, refreshToken, loadingHistory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return wj50.m88271j(this.model, content.model) && this.isOnline == content.isOnline && wj50.m88271j(this.pageToken, content.pageToken) && wj50.m88271j(this.refreshToken, content.refreshToken) && wj50.m88271j(this.loadingHistory, content.loadingHistory);
        }

        public final List<String> getLoadingHistory() {
            return this.loadingHistory;
        }

        public final ovh0 getModel() {
            return this.model;
        }

        public final String getPageToken() {
            return this.pageToken;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public int hashCode() {
            int iM77243b = s571.m77243b(s571.m77245d(this.model.hashCode() * 31, 31, this.isOnline), 31, this.pageToken);
            String str = this.refreshToken;
            return this.loadingHistory.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final boolean isOnline() {
            return this.isOnline;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Content(ovh0 ovh0Var, boolean z, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(ovh0Var, z, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? lau.f131415a : list);
        }
    }
}
