package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class n7e implements o7e {

    /* JADX INFO: renamed from: a */
    public final List f151140a;

    public n7e(List list) {
        this.f151140a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7e) && wj50.m88271j(this.f151140a, ((n7e) obj).f151140a);
    }

    public final int hashCode() {
        return this.f151140a.hashCode();
    }
}
