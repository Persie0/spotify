package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z5d0 implements a6d0 {

    /* JADX INFO: renamed from: a */
    public final String f279545a;

    public z5d0(String str) {
        this.f279545a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5d0) && wj50.m88271j(this.f279545a, ((z5d0) obj).f279545a);
    }

    public final int hashCode() {
        return this.f279545a.hashCode();
    }
}
