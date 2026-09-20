package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ww2 {

    /* JADX INFO: renamed from: a */
    public final List f255674a;

    public ww2(List list) {
        this.f255674a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww2) && wj50.m88271j(this.f255674a, ((ww2) obj).f255674a);
    }

    public final int hashCode() {
        return this.f255674a.hashCode();
    }
}
