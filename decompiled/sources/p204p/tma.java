package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class tma implements BrowseEvent {

    /* JADX INFO: renamed from: a */
    public final int f221639a;

    public tma(int i) {
        this.f221639a = i;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return s571.m77246e(this.f221639a, "OnUIRendered: columnCount=");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tma) && this.f221639a == ((tma) obj).f221639a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f221639a);
    }
}
