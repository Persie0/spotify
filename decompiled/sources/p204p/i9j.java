package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i9j extends k9j {

    /* JADX INFO: renamed from: a */
    public final int f100024a;

    /* JADX INFO: renamed from: b */
    public final String f100025b;

    public i9j(int i, String str) {
        this.f100024a = i;
        this.f100025b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9j)) {
            return false;
        }
        i9j i9jVar = (i9j) obj;
        return this.f100024a == i9jVar.f100024a && wj50.m88271j(this.f100025b, i9jVar.f100025b);
    }

    public final int hashCode() {
        return this.f100025b.hashCode() + (Integer.hashCode(this.f100024a) * 31);
    }
}
