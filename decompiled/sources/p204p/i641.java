package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i641 {

    /* JADX INFO: renamed from: a */
    public final List f99099a;

    public i641(List list) {
        this.f99099a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i641) && wj50.m88271j(this.f99099a, ((i641) obj).f99099a);
    }

    public final int hashCode() {
        return this.f99099a.hashCode() * 31;
    }
}
