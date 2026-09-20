package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tjs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final String f221013a;

    /* JADX INFO: renamed from: b */
    public final String f221014b;

    public tjs0(String str, String str2) {
        this.f221013a = str;
        this.f221014b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjs0)) {
            return false;
        }
        tjs0 tjs0Var = (tjs0) obj;
        return wj50.m88271j(this.f221013a, tjs0Var.f221013a) && wj50.m88271j(this.f221014b, tjs0Var.f221014b);
    }

    public final int hashCode() {
        String str = this.f221013a;
        return this.f221014b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
