package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class urz {

    /* JADX INFO: renamed from: a */
    public final List f233476a;

    public urz(List list) {
        this.f233476a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urz) && wj50.m88271j(this.f233476a, ((urz) obj).f233476a);
    }

    public final int hashCode() {
        return this.f233476a.hashCode();
    }
}
