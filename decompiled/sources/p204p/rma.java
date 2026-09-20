package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class rma implements BrowseEvent {

    /* JADX INFO: renamed from: a */
    public final int f200486a;

    public rma(int i) {
        this.f200486a = i;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return s571.m77246e(this.f200486a, "ColumnCountChange: columnCount=");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rma) && this.f200486a == ((rma) obj).f200486a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f200486a);
    }
}
