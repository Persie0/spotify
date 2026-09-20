package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i9x implements m9x {

    /* JADX INFO: renamed from: a */
    public final String f100096a;

    public i9x(String str) {
        this.f100096a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9x) && wj50.m88271j(this.f100096a, ((i9x) obj).f100096a);
    }

    public final int hashCode() {
        return this.f100096a.hashCode();
    }
}
