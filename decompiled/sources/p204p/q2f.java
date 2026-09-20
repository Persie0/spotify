package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q2f implements s2f {

    /* JADX INFO: renamed from: a */
    public final String f184598a;

    public q2f(String str) {
        this.f184598a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2f) && wj50.m88271j(this.f184598a, ((q2f) obj).f184598a);
    }

    public final int hashCode() {
        return this.f184598a.hashCode();
    }

    public final String toString() {
        return this.f184598a;
    }
}
