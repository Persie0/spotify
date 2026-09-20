package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class y0c1 {
    public static final x0c1 Companion = new x0c1();

    /* JADX INFO: renamed from: a */
    public final boolean f267962a;

    public y0c1() {
        this.f267962a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0c1) && this.f267962a == ((y0c1) obj).f267962a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267962a);
    }

    public /* synthetic */ y0c1(int i, boolean z) {
        if ((i & 1) == 0) {
            this.f267962a = false;
        } else {
            this.f267962a = z;
        }
    }
}
