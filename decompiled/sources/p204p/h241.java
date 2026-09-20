package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h241 implements j241 {

    /* JADX INFO: renamed from: a */
    public final Set f86892a;

    public h241(Set set) {
        this.f86892a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h241) && wj50.m88271j(this.f86892a, ((h241) obj).f86892a);
    }

    public final int hashCode() {
        return this.f86892a.hashCode();
    }
}
