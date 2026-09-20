package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oe8 implements re8 {

    /* JADX INFO: renamed from: a */
    public final Integer f164372a;

    public oe8(Integer num) {
        this.f164372a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe8) && wj50.m88271j(this.f164372a, ((oe8) obj).f164372a);
    }

    public final int hashCode() {
        Integer num = this.f164372a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
