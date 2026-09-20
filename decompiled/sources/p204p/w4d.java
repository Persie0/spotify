package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class w4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final Set f247789a;

    public w4d(Set set) {
        this.f247789a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4d) && wj50.m88271j(this.f247789a, ((w4d) obj).f247789a);
    }

    public final int hashCode() {
        return this.f247789a.hashCode();
    }
}
