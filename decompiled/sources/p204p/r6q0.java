package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r6q0 {

    /* JADX INFO: renamed from: a */
    public final int f196342a;

    public /* synthetic */ r6q0(int i) {
        this.f196342a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ r6q0 m74870a(int i) {
        return new r6q0(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r6q0) {
            return this.f196342a == ((r6q0) obj).f196342a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f196342a);
    }

    public final String toString() {
        return dq60.m36613m("PointerKeyboardModifiers(packedValue=", this.f196342a, ')');
    }
}
