package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class chy0 extends ehy0 {

    /* JADX INFO: renamed from: a */
    public final Object f38149a;

    public chy0(Object obj) {
        this.f38149a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chy0) && wj50.m88271j(this.f38149a, ((chy0) obj).f38149a);
    }

    public final int hashCode() {
        Object obj = this.f38149a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
