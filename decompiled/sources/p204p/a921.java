package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a921 implements b921 {

    /* JADX INFO: renamed from: a */
    public final List f13458a;

    public a921(List list) {
        this.f13458a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a921) && wj50.m88271j(this.f13458a, ((a921) obj).f13458a);
    }

    public final int hashCode() {
        return this.f13458a.hashCode();
    }
}
