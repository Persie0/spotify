package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h0c extends i0c {

    /* JADX INFO: renamed from: a */
    public final Set f86212a;

    public h0c(Set set) {
        this.f86212a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0c) && wj50.m88271j(this.f86212a, ((h0c) obj).f86212a);
    }

    public final int hashCode() {
        return this.f86212a.hashCode();
    }
}
