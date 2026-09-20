package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class emk0 {

    /* JADX INFO: renamed from: a */
    public final int f60932a;

    /* JADX INFO: renamed from: b */
    public final Integer f60933b;

    public emk0(int i, Integer num) {
        this.f60932a = i;
        this.f60933b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emk0)) {
            return false;
        }
        emk0 emk0Var = (emk0) obj;
        return this.f60932a == emk0Var.f60932a && wj50.m88271j(this.f60933b, emk0Var.f60933b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f60932a) * 31;
        Integer num = this.f60933b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f60932a + ", dataOffset=" + this.f60933b + ')';
    }
}
