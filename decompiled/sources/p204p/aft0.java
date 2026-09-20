package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aft0 extends bft0 {

    /* JADX INFO: renamed from: a */
    public final String f15228a;

    public aft0(String str) {
        this.f15228a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aft0) && wj50.m88271j(this.f15228a, ((aft0) obj).f15228a);
    }

    public final int hashCode() {
        return this.f15228a.hashCode();
    }
}
