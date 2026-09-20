package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aj31 implements bj31 {

    /* JADX INFO: renamed from: a */
    public final int f16162a;

    /* JADX INFO: renamed from: b */
    public final String f16163b;

    public aj31(int i, String str) {
        this.f16162a = i;
        this.f16163b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj31)) {
            return false;
        }
        aj31 aj31Var = (aj31) obj;
        return this.f16162a == aj31Var.f16162a && wj50.m88271j(this.f16163b, aj31Var.f16163b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16162a) * 31;
        String str = this.f16163b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
