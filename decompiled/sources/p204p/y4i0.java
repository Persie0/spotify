package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y4i0 implements a5i0 {

    /* JADX INFO: renamed from: a */
    public final String f269153a;

    public y4i0(String str) {
        this.f269153a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4i0) && wj50.m88271j(this.f269153a, ((y4i0) obj).f269153a);
    }

    public final int hashCode() {
        return this.f269153a.hashCode();
    }
}
