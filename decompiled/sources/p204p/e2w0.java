package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e2w0 implements f2w0 {

    /* JADX INFO: renamed from: a */
    public final List f55543a;

    public e2w0(List list) {
        this.f55543a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2w0) && wj50.m88271j(this.f55543a, ((e2w0) obj).f55543a);
    }

    public final int hashCode() {
        return this.f55543a.hashCode();
    }
}
