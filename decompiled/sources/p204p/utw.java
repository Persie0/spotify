package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class utw implements o2x {

    /* JADX INFO: renamed from: a */
    public final boolean f234003a;

    public utw(boolean z) {
        this.f234003a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utw) && this.f234003a == ((utw) obj).f234003a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234003a);
    }
}
