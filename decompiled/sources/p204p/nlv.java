package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nlv implements qlv {

    /* JADX INFO: renamed from: a */
    public final Integer f155173a;

    public nlv(Integer num) {
        this.f155173a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlv) && wj50.m88271j(this.f155173a, ((nlv) obj).f155173a);
    }

    public final int hashCode() {
        Integer num = this.f155173a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
