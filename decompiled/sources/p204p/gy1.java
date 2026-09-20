package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gy1 {

    /* JADX INFO: renamed from: a */
    public final List f85402a;

    public gy1(List list) {
        this.f85402a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy1) && wj50.m88271j(this.f85402a, ((gy1) obj).f85402a);
    }

    public final int hashCode() {
        return this.f85402a.hashCode();
    }
}
