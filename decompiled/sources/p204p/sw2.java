package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sw2 {

    /* JADX INFO: renamed from: a */
    public final List f214559a;

    public sw2(List list) {
        this.f214559a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw2) && wj50.m88271j(this.f214559a, ((sw2) obj).f214559a);
    }

    public final int hashCode() {
        return this.f214559a.hashCode();
    }
}
