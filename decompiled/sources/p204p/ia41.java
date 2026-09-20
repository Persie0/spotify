package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ia41 {

    /* JADX INFO: renamed from: a */
    public final boolean f100147a;

    public ia41(boolean z) {
        this.f100147a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia41) && this.f100147a == ((ia41) obj).f100147a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100147a);
    }
}
