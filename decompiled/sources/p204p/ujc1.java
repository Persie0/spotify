package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ujc1 {

    /* JADX INFO: renamed from: a */
    public final Object f230969a;

    public ujc1(Object obj) {
        this.f230969a = obj;
        if (!(obj instanceof ry8) && !(obj instanceof qy8)) {
            throw new IllegalArgumentException("Element must be either a Compose Element or a View Element");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujc1) && wj50.m88271j(this.f230969a, ((ujc1) obj).f230969a);
    }

    public final int hashCode() {
        return this.f230969a.hashCode();
    }
}
