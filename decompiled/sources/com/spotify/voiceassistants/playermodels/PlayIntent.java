package com.spotify.voiceassistants.playermodels;

import android.net.Uri;
import android.os.Bundle;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gc6;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/PlayIntent;", "", "uri", "Landroid/net/Uri;", "query", "", "queryLanguage", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Landroid/net/Uri;", "getQuery", "()Ljava/lang/String;", "getQueryLanguage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class PlayIntent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_MEDIA_FULL_QUERY = "android.intent.extra.user_query";
    private static final String EXTRA_MEDIA_FULL_QUERY_LANGUAGE = "android.intent.extra.user_query_language";
    private final String query;
    private final String queryLanguage;
    private final Uri uri;

    @Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/PlayIntent$Companion;", "", "<init>", "()V", "EXTRA_MEDIA_FULL_QUERY", "", "EXTRA_MEDIA_FULL_QUERY_LANGUAGE", "create", "Lcom/spotify/voiceassistants/playermodels/PlayIntent;", "uri", "Landroid/net/Uri;", "extra", "Landroid/os/Bundle;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlayIntent create(Uri uri, Bundle extra) {
            String string;
            String string2;
            String strReplaceFirst;
            String str = "";
            if (uri != null) {
                Pattern pattern = gc6.f78495a;
                if ("alexa".equals(uri.getScheme())) {
                    String path = uri.getPath();
                    if (path == null) {
                        strReplaceFirst = gc6.f78495a.matcher(uri.getSchemeSpecificPart()).replaceFirst("");
                        wj50.m88279p(strReplaceFirst);
                    } else {
                        strReplaceFirst = gc6.f78496b.matcher(path).replaceFirst("");
                        wj50.m88279p(strReplaceFirst);
                    }
                    uri = Uri.parse(strReplaceFirst);
                    if (uri.equals(Uri.EMPTY)) {
                        uri = gc6.f78498d;
                    }
                } else if (uri.equals(Uri.EMPTY)) {
                    uri = gc6.f78498d;
                }
            } else {
                uri = Uri.EMPTY;
            }
            wj50.m88279p(uri);
            if (extra == null || (string = extra.getString(PlayIntent.EXTRA_MEDIA_FULL_QUERY, "")) == null) {
                string = "";
            }
            if (extra != null && (string2 = extra.getString(PlayIntent.EXTRA_MEDIA_FULL_QUERY_LANGUAGE, "")) != null) {
                str = string2;
            }
            return new PlayIntent(uri, string, str);
        }

        private Companion() {
        }
    }

    public PlayIntent(Uri uri, String str, String str2) {
        this.uri = uri;
        this.query = str;
        this.queryLanguage = str2;
    }

    public static /* synthetic */ PlayIntent copy$default(PlayIntent playIntent, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = playIntent.uri;
        }
        if ((i & 2) != 0) {
            str = playIntent.query;
        }
        if ((i & 4) != 0) {
            str2 = playIntent.queryLanguage;
        }
        return playIntent.copy(uri, str, str2);
    }

    public static final PlayIntent create(Uri uri, Bundle bundle) {
        return INSTANCE.create(uri, bundle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQueryLanguage() {
        return this.queryLanguage;
    }

    public final PlayIntent copy(Uri uri, String query, String queryLanguage) {
        return new PlayIntent(uri, query, queryLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayIntent)) {
            return false;
        }
        PlayIntent playIntent = (PlayIntent) other;
        return wj50.m88271j(this.uri, playIntent.uri) && wj50.m88271j(this.query, playIntent.query) && wj50.m88271j(this.queryLanguage, playIntent.queryLanguage);
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getQueryLanguage() {
        return this.queryLanguage;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.queryLanguage.hashCode() + s571.m77243b(this.uri.hashCode() * 31, 31, this.query);
    }

    public String toString() {
        return super.toString();
    }
}
