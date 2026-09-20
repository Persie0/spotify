package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class uql0 implements xql0 {

    /* JADX INFO: renamed from: a */
    public final Set f233076a;

    public uql0(Set set) {
        this.f233076a = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m83805a() {
        return this.f233076a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uql0) && wj50.m88271j(this.f233076a, ((uql0) obj).f233076a);
    }

    public final int hashCode() {
        return this.f233076a.hashCode();
    }
}
