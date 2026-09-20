package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class evw implements t2x {

    /* JADX INFO: renamed from: a */
    public final List f63360a;

    public evw(List list) {
        this.f63360a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evw) && wj50.m88271j(this.f63360a, ((evw) obj).f63360a);
    }

    public final int hashCode() {
        return this.f63360a.hashCode();
    }
}
