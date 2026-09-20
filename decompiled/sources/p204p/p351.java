package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class p351 {

    /* JADX INFO: renamed from: a */
    public final List f173559a;

    public /* synthetic */ p351() {
        this(lau.f131415a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p351) && wj50.m88271j(this.f173559a, ((p351) obj).f173559a);
    }

    public final int hashCode() {
        return this.f173559a.hashCode();
    }

    public p351(List list) {
        this.f173559a = list;
    }
}
