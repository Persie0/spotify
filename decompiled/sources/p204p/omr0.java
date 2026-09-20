package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class omr0 {

    /* JADX INFO: renamed from: a */
    public final Integer f167082a;

    public omr0(Integer num) {
        this.f167082a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omr0) && wj50.m88271j(this.f167082a, ((omr0) obj).f167082a);
    }

    public final int hashCode() {
        Integer num = this.f167082a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
