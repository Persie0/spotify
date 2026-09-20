package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z0f0 extends d1f0 {

    /* JADX INFO: renamed from: a */
    public final String f278096a;

    public z0f0(String str) {
        this.f278096a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0f0) && wj50.m88271j(this.f278096a, ((z0f0) obj).f278096a);
    }

    public final int hashCode() {
        return this.f278096a.hashCode();
    }
}
