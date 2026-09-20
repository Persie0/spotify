package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k6x0 extends x6x0 {

    /* JADX INFO: renamed from: a */
    public final Object f119864a;

    public k6x0(Object obj) {
        this.f119864a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6x0) && wj50.m88271j(this.f119864a, ((k6x0) obj).f119864a);
    }

    public final int hashCode() {
        Object obj = this.f119864a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
