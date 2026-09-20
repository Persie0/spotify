package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class yth {

    /* JADX INFO: renamed from: a */
    public final List f276125a;

    public yth(List list) {
        this.f276125a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yth) && wj50.m88271j(this.f276125a, ((yth) obj).f276125a);
    }

    public final int hashCode() {
        return this.f276125a.hashCode();
    }
}
