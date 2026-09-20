package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class vma implements BrowseEvent {

    /* JADX INFO: renamed from: a */
    public final String f242741a;

    public vma(String str) {
        this.f242741a = str;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return edb.m38564m("SectionDismissed: sectionId=", this.f242741a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vma) && wj50.m88271j(this.f242741a, ((vma) obj).f242741a);
    }

    public final int hashCode() {
        return this.f242741a.hashCode();
    }
}
