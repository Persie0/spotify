package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j1s0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final String f107840a;

    public j1s0(String str) {
        this.f107840a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1s0) && wj50.m88271j(this.f107840a, ((j1s0) obj).f107840a);
    }

    public final int hashCode() {
        return this.f107840a.hashCode();
    }
}
