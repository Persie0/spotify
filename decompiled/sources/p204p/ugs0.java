package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ugs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final List f230255a;

    public ugs0(List list) {
        this.f230255a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugs0) && wj50.m88271j(this.f230255a, ((ugs0) obj).f230255a);
    }

    public final int hashCode() {
        return this.f230255a.hashCode();
    }
}
