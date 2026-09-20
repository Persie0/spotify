package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wj6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final List f251855a;

    public wj6(List list) {
        this.f251855a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj6) && wj50.m88271j(this.f251855a, ((wj6) obj).f251855a);
    }

    public final int hashCode() {
        return this.f251855a.hashCode();
    }
}
