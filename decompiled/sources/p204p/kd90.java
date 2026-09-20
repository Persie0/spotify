package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kd90 implements ld90 {

    /* JADX INFO: renamed from: a */
    public final String f121640a;

    public kd90(String str) {
        this.f121640a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd90) && wj50.m88271j(this.f121640a, ((kd90) obj).f121640a);
    }

    public final int hashCode() {
        return this.f121640a.hashCode();
    }
}
