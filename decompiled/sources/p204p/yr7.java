package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yr7 {

    /* JADX INFO: renamed from: a */
    public final int f275408a;

    public /* synthetic */ yr7(int i) {
        this.f275408a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ yr7 m94412a(int i) {
        return new yr7(i);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int m94413b() {
        return this.f275408a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yr7) {
            return this.f275408a == ((yr7) obj).f275408a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f275408a);
    }

    public final String toString() {
        return dq60.m36613m("AutoClearFocusBehavior(value=", this.f275408a, ')');
    }
}
