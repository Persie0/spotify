package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iq41 implements kq41 {

    /* JADX INFO: renamed from: a */
    public final boolean f104629a;

    public iq41(boolean z) {
        this.f104629a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51339a() {
        return this.f104629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq41) && this.f104629a == ((iq41) obj).f104629a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104629a);
    }
}
