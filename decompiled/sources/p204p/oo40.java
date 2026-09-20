package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class oo40 {

    /* JADX INFO: renamed from: a */
    public final int f167459a;

    /* JADX INFO: renamed from: a */
    public static final boolean m67449a(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int m67450b() {
        return this.f167459a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oo40) {
            return this.f167459a == ((oo40) obj).f167459a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167459a);
    }

    public final String toString() {
        return dq60.m36613m("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.f167459a, ')');
    }
}
