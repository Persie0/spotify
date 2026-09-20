package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xz1 implements yz1 {

    /* JADX INFO: renamed from: a */
    public final String f267504a;

    public xz1(String str) {
        this.f267504a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz1) && wj50.m88271j(this.f267504a, ((xz1) obj).f267504a);
    }

    public final int hashCode() {
        return this.f267504a.hashCode();
    }
}
