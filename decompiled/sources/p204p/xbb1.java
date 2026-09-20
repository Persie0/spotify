package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xbb1 implements zbb1 {

    /* JADX INFO: renamed from: a */
    public final String f259879a;

    public xbb1(String str) {
        this.f259879a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbb1) && wj50.m88271j(this.f259879a, ((xbb1) obj).f259879a);
    }

    public final int hashCode() {
        return this.f259879a.hashCode();
    }
}
