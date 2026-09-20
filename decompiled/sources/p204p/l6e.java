package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class l6e {

    /* JADX INFO: renamed from: a */
    public final List f130348a;

    public l6e(List list) {
        this.f130348a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6e) && wj50.m88271j(this.f130348a, ((l6e) obj).f130348a);
    }

    public final int hashCode() {
        return this.f130348a.hashCode();
    }
}
