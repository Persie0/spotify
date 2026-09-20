package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class w590 implements z590 {

    /* JADX INFO: renamed from: a */
    public final Set f248033a;

    public w590(Set set) {
        this.f248033a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w590) && wj50.m88271j(this.f248033a, ((w590) obj).f248033a);
    }

    public final int hashCode() {
        return this.f248033a.hashCode();
    }
}
