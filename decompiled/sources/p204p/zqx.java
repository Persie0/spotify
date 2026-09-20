package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zqx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f285475a;

    public zqx(String str) {
        this.f285475a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqx) && wj50.m88271j(this.f285475a, ((zqx) obj).f285475a);
    }

    public final int hashCode() {
        return this.f285475a.hashCode();
    }
}
