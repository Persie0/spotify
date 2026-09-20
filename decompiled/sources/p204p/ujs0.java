package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ujs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final String f231113a;

    /* JADX INFO: renamed from: b */
    public final boolean f231114b;

    public ujs0(String str, boolean z) {
        this.f231113a = str;
        this.f231114b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujs0)) {
            return false;
        }
        ujs0 ujs0Var = (ujs0) obj;
        return wj50.m88271j(this.f231113a, ujs0Var.f231113a) && this.f231114b == ujs0Var.f231114b;
    }

    public final int hashCode() {
        String str = this.f231113a;
        return Boolean.hashCode(this.f231114b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
