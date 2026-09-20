package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class uma implements BrowseEvent {

    /* JADX INFO: renamed from: a */
    public final boolean f231784a;

    public uma(boolean z) {
        this.f231784a = z;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return "PersonalizationStateChanged: dsaEnabled=" + this.f231784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uma) && this.f231784a == ((uma) obj).f231784a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231784a);
    }
}
