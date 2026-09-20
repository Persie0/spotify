package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wwy0 {

    /* JADX INFO: renamed from: a */
    public final List f255856a;

    public wwy0(List list) {
        this.f255856a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwy0) && wj50.m88271j(this.f255856a, ((wwy0) obj).f255856a);
    }

    public final int hashCode() {
        return this.f255856a.hashCode();
    }
}
