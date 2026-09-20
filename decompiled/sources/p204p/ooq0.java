package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ooq0 {

    /* JADX INFO: renamed from: a */
    public final List f167687a;

    public ooq0(List list) {
        this.f167687a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ooq0) && wj50.m88271j(this.f167687a, ((ooq0) obj).f167687a);
    }

    public final int hashCode() {
        return this.f167687a.hashCode();
    }
}
