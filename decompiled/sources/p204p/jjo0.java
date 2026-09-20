package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jjo0 implements vjo0 {

    /* JADX INFO: renamed from: a */
    public final List f113063a;

    public jjo0(List list) {
        this.f113063a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjo0) && wj50.m88271j(this.f113063a, ((jjo0) obj).f113063a);
    }

    public final int hashCode() {
        return this.f113063a.hashCode();
    }
}
