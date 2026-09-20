package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f85256a;

    public gxc0(String str) {
        this.f85256a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxc0) && wj50.m88271j(this.f85256a, ((gxc0) obj).f85256a);
    }

    public final int hashCode() {
        return this.f85256a.hashCode() * 31;
    }
}
