package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class bh71 {

    /* JADX INFO: renamed from: a */
    public final List f27105a;

    public bh71(List list) {
        this.f27105a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh71) && wj50.m88271j(this.f27105a, ((bh71) obj).f27105a);
    }

    public final int hashCode() {
        return this.f27105a.hashCode();
    }
}
