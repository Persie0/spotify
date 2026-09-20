package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ibb0 implements jbb0 {

    /* JADX INFO: renamed from: a */
    public final String f100501a;

    /* JADX INFO: renamed from: b */
    public final boolean f100502b;

    public ibb0(String str, boolean z) {
        this.f100501a = str;
        this.f100502b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb0)) {
            return false;
        }
        ibb0 ibb0Var = (ibb0) obj;
        return wj50.m88271j(this.f100501a, ibb0Var.f100501a) && this.f100502b == ibb0Var.f100502b;
    }

    public final int hashCode() {
        String str = this.f100501a;
        return Boolean.hashCode(this.f100502b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
