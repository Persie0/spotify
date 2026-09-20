package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ibs {

    /* JADX INFO: renamed from: a */
    public final Throwable f100658a;

    public ibs(Throwable th) {
        this.f100658a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibs) && wj50.m88271j(this.f100658a, ((ibs) obj).f100658a);
    }

    public final int hashCode() {
        return this.f100658a.hashCode();
    }
}
