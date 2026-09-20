package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class sma implements BrowseEvent {

    /* JADX INFO: renamed from: a */
    public static final sma f210605a = new sma();

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return "Foregrounded";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sma);
    }

    public final int hashCode() {
        return -1381080802;
    }

    public final String toString() {
        return "Foregrounded";
    }
}
