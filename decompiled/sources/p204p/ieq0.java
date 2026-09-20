package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ieq0 implements qeq0 {

    /* JADX INFO: renamed from: a */
    public final Set f101537a;

    public ieq0(Set set) {
        this.f101537a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ieq0) && wj50.m88271j(this.f101537a, ((ieq0) obj).f101537a);
    }

    public final int hashCode() {
        return this.f101537a.hashCode();
    }
}
