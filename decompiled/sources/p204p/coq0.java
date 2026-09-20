package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class coq0 implements joq0 {

    /* JADX INFO: renamed from: a */
    public final Set f40328a;

    public coq0(Set set) {
        this.f40328a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coq0) && wj50.m88271j(this.f40328a, ((coq0) obj).f40328a);
    }

    public final int hashCode() {
        return this.f40328a.hashCode();
    }
}
