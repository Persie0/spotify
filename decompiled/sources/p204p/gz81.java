package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gz81 {

    /* JADX INFO: renamed from: a */
    public final boolean f85866a;

    /* JADX INFO: renamed from: b */
    public final boolean f85867b;

    /* JADX INFO: renamed from: c */
    public final eh00 f85868c;

    public gz81(eh00 eh00Var, boolean z, boolean z2) {
        this.f85866a = z;
        this.f85867b = z2;
        this.f85868c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gz81.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        gz81 gz81Var = (gz81) obj;
        return this.f85866a == gz81Var.f85866a && this.f85867b == gz81Var.f85867b && ((Number) this.f85868c.invoke()).longValue() == ((Number) gz81Var.f85868c.invoke()).longValue();
    }

    public final int hashCode() {
        return Long.hashCode(((Number) this.f85868c.invoke()).longValue()) + s571.m77245d(Boolean.hashCode(this.f85866a) * 31, 31, this.f85867b);
    }

    public /* synthetic */ gz81() {
        this(c781.f34818g, false, false);
    }
}
