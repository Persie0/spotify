package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wh20 {

    /* JADX INFO: renamed from: a */
    public final String f251234a;

    /* JADX INFO: renamed from: b */
    public final String f251235b;

    public wh20(String str, String str2) {
        this.f251234a = str;
        this.f251235b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh20)) {
            return false;
        }
        wh20 wh20Var = (wh20) obj;
        return wj50.m88271j(this.f251234a, wh20Var.f251234a) && wj50.m88271j(this.f251235b, wh20Var.f251235b);
    }

    public final int hashCode() {
        return this.f251235b.hashCode() + (this.f251234a.hashCode() * 31);
    }
}
