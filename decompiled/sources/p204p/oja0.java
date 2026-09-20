package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oja0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final Integer f166024a;

    public oja0(Integer num) {
        this.f166024a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oja0) && wj50.m88271j(this.f166024a, ((oja0) obj).f166024a);
    }

    public final int hashCode() {
        Integer num = this.f166024a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
