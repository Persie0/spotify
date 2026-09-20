package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wf31 extends ag31 {

    /* JADX INFO: renamed from: a */
    public final List f250694a;

    public wf31(List list) {
        this.f250694a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf31) && wj50.m88271j(this.f250694a, ((wf31) obj).f250694a);
    }

    public final int hashCode() {
        return this.f250694a.hashCode();
    }
}
