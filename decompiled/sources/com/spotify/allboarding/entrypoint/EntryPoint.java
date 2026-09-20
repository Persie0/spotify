package com.spotify.allboarding.entrypoint;

import android.content.Intent;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bk5;
import p204p.lzv;
import p204p.nzv;
import p204p.qyv;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, m24212d2 = {"Lcom/spotify/allboarding/entrypoint/EntryPoint;", "", "", "label", "uriSegment", "", "canExit", "endpointPath", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getUriSegment", "Z", "getCanExit", "()Z", "getEndpointPath", "Companion", "p/qyv", "SIGNUP", "HOME_ARTIST_HEADER", "HOME_PODCASTS", "LIBRARY_ADD_ARTISTS", "LIBRARY_ADD_PODCASTS", "DELAYED_PO_BANNER", "HOME_AUDIOBOOKS_SUB_FEED", "HOME_AUDIOBOOKS_SUB_FEED_REENTRY", "HOME_AUDIOBOOKS_BOTTOM_SHEET", "DEFAULT", "DEBUG_LANGUAGE_FILTER", "DEBUG_ARTIST", "DEBUG_LANGUAGE_ONBOARDING", "DEBUG_LANGUAGE_ARTIST_ONBOARDING", "DEBUG_OPTIN_SHOW", "DEBUG_SHOW", "DEBUG_SKIP", "src_main_java_com_spotify_allboarding_entrypoint-entrypoint"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum EntryPoint {
    SIGNUP("SIGNUP", "signup", false, null, 12, null),
    HOME_ARTIST_HEADER("HOME_ARTIST_HEADER", "home-artist-header", false, null, 12, null),
    HOME_PODCASTS("HOME_PODCASTS", "home-podcasts", true, null, 8, null),
    LIBRARY_ADD_ARTISTS("LIBRARY_ADD_ARTISTS", "library-add-artists", true, null, 8, null),
    LIBRARY_ADD_PODCASTS("LIBRARY_ADD_PODCASTS", "library-add-podcasts", true, null, 8, null),
    DELAYED_PO_BANNER("DELAYED_PO_BANNER", "delayed-po-banner", true, null, 8, null),
    HOME_AUDIOBOOKS_SUB_FEED("HOME_AUDIOBOOKS_SUB_FEED", "home-audiobooks-sub-feed", true, null, 8, null),
    HOME_AUDIOBOOKS_SUB_FEED_REENTRY("HOME_AUDIOBOOKS_SUB_FEED_REENTRY", "home-audiobooks-sub-feed-reentry", true, null, 8, null),
    HOME_AUDIOBOOKS_BOTTOM_SHEET("HOME_AUDIOBOOKS_BOTTOM_SHEET", "home-audiobooks-bottom-sheet", true, null, 8, null),
    DEFAULT("DEFAULT", "default", false, null, 12, null),
    DEBUG_LANGUAGE_FILTER("DEFAULT", "debug-language-filter", false, "ARTIST_FILTER", 4, null),
    DEBUG_ARTIST("DEFAULT", "debug-artist", false, null, 12, null),
    DEBUG_LANGUAGE_ONBOARDING("DEFAULT", "debug-language", false, "language", 4, null),
    DEBUG_LANGUAGE_ARTIST_ONBOARDING("DEFAULT", "debug-language-artist", false, "language_artist", 4, null),
    DEBUG_OPTIN_SHOW("DEFAULT", "debug-opt-in-po", false, "artist_optin_show", 4, null),
    DEBUG_SHOW("DEFAULT", "debug-show", false, "show", 4, null),
    DEBUG_SKIP("DEFAULT", "debug-skip", false, "skip", 4, null);

    private static final String ENTRY_POINT_ARG = "entry-point";
    private final boolean canExit;
    private final String endpointPath;
    private final String label;
    private final String uriSegment;
    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());
    public static final qyv Companion = new qyv();

    EntryPoint(String str, String str2, boolean z, String str3) {
        this.label = str;
        this.uriSegment = str2;
        this.canExit = z;
        this.endpointPath = str3;
    }

    public static lzv getEntries() {
        return $ENTRIES;
    }

    public static final EntryPoint getEntryPointFromIntent(Intent intent) {
        Companion.getClass();
        EntryPoint[] entryPointArrValues = values();
        EntryPoint entryPoint = DEFAULT;
        EntryPoint entryPoint2 = (EntryPoint) bk5.m29587J0(intent.getIntExtra(ENTRY_POINT_ARG, entryPoint.ordinal()), entryPointArrValues);
        return entryPoint2 == null ? entryPoint : entryPoint2;
    }

    public static final Intent putEntryPointToIntent(Intent intent, EntryPoint entryPoint) {
        Companion.getClass();
        return intent.putExtra(ENTRY_POINT_ARG, entryPoint.ordinal());
    }

    public final boolean getCanExit() {
        return this.canExit;
    }

    public final String getEndpointPath() {
        return this.endpointPath;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUriSegment() {
        return this.uriSegment;
    }

    /* synthetic */ EntryPoint(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }
}
