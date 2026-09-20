package p204p;

/* JADX INFO: renamed from: p.ib */
/* JADX INFO: loaded from: classes8.dex */
public final class C1973ib extends AbstractC2046kb {

    /* JADX INFO: renamed from: a */
    public final boolean f100403a;

    /* JADX INFO: renamed from: b */
    public final int f100404b;

    public C1973ib(boolean z, int i) {
        this.f100403a = z;
        this.f100404b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1973ib)) {
            return false;
        }
        C1973ib c1973ib = (C1973ib) obj;
        return this.f100403a == c1973ib.f100403a && this.f100404b == c1973ib.f100404b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f100404b) + (Boolean.hashCode(this.f100403a) * 31);
    }
}
