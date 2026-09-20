package p204p;

import com.spotify.eventcardinfoservice.p062v1.EventCardInfoResponse;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: classes9.dex */
public final class l4x {

    /* JADX INFO: renamed from: a */
    public final EventCardInfoResponse f129777a;

    /* JADX INFO: renamed from: b */
    public final CollectionArtist f129778b;

    public l4x(EventCardInfoResponse eventCardInfoResponse, CollectionArtist collectionArtist) {
        this.f129777a = eventCardInfoResponse;
        this.f129778b = collectionArtist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4x)) {
            return false;
        }
        l4x l4xVar = (l4x) obj;
        return wj50.m88271j(this.f129777a, l4xVar.f129777a) && wj50.m88271j(this.f129778b, l4xVar.f129778b);
    }

    public final int hashCode() {
        return this.f129778b.hashCode() + (this.f129777a.hashCode() * 31);
    }
}
