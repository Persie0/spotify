package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class icc {

    /* JADX INFO: renamed from: a */
    public final String f100784a;

    /* JADX INFO: renamed from: b */
    public final int f100785b;

    public icc(String str, int i) {
        this.f100784a = str;
        this.f100785b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icc)) {
            return false;
        }
        icc iccVar = (icc) obj;
        return wj50.m88271j(this.f100784a, iccVar.f100784a) && this.f100785b == iccVar.f100785b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f100785b) + (this.f100784a.hashCode() * 31);
    }
}
