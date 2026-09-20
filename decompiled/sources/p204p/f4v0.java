package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f4v0 {

    /* JADX INFO: renamed from: a */
    public final List f65845a;

    public f4v0(List list) {
        this.f65845a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4v0) && wj50.m88271j(this.f65845a, ((f4v0) obj).f65845a);
    }

    public final int hashCode() {
        return this.f65845a.hashCode();
    }
}
