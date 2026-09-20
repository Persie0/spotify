package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final Float f55118a;

    public e141(Float f) {
        this.f55118a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e141) && wj50.m88271j(this.f55118a, ((e141) obj).f55118a);
    }

    public final int hashCode() {
        Float f = this.f55118a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }
}
