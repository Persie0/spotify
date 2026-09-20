package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ibl {

    /* JADX INFO: renamed from: a */
    public final boolean f100602a;

    /* JADX INFO: renamed from: b */
    public final String f100603b;

    public ibl(boolean z, String str) {
        this.f100602a = z;
        this.f100603b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibl)) {
            return false;
        }
        ibl iblVar = (ibl) obj;
        return this.f100602a == iblVar.f100602a && wj50.m88271j(this.f100603b, iblVar.f100603b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f100602a) * 31;
        String str = this.f100603b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
