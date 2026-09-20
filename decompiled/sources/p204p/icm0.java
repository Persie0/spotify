package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class icm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100845a;

    /* JADX INFO: renamed from: b */
    public final boolean f100846b;

    public icm0() {
        this(false, 3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m50254a() {
        return this.f100846b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50255b() {
        return this.f100845a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icm0)) {
            return false;
        }
        icm0 icm0Var = (icm0) obj;
        return this.f100845a == icm0Var.f100845a && this.f100846b == icm0Var.f100846b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100846b) + (Boolean.hashCode(this.f100845a) * 31);
    }

    public /* synthetic */ icm0(boolean z, int i) {
        this((i & 1) != 0 ? true : z, false);
    }

    public icm0(boolean z, boolean z2) {
        this.f100845a = z;
        this.f100846b = z2;
    }
}
