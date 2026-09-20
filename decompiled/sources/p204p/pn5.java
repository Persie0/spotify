package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final List f179311a;

    public pn5(List list) {
        this.f179311a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn5) && wj50.m88271j(this.f179311a, ((pn5) obj).f179311a);
    }

    public final int hashCode() {
        return this.f179311a.hashCode();
    }
}
