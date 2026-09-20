package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ia30 {

    /* JADX INFO: renamed from: a */
    public final int f100133a;

    public ia30(int i) {
        this.f100133a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia30) && this.f100133a == ((ia30) obj).f100133a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f100133a);
    }
}
