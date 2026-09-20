package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cl10 implements gl10 {

    /* JADX INFO: renamed from: a */
    public final String f39149a;

    public cl10(String str) {
        this.f39149a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl10) && wj50.m88271j(this.f39149a, ((cl10) obj).f39149a);
    }

    public final int hashCode() {
        return this.f39149a.hashCode();
    }
}
