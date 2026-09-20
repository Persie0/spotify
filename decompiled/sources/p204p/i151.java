package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i151 {

    /* JADX INFO: renamed from: a */
    public final String f97405a;

    /* JADX INFO: renamed from: b */
    public final String f97406b;

    /* JADX INFO: renamed from: c */
    public final j151 f97407c;

    public i151(String str, String str2, j151 j151Var) {
        this.f97405a = str;
        this.f97406b = str2;
        this.f97407c = j151Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i151)) {
            return false;
        }
        i151 i151Var = (i151) obj;
        return Objects.equals(this.f97405a, i151Var.f97405a) && Objects.equals(this.f97406b, i151Var.f97406b) && Objects.equals(this.f97407c, i151Var.f97407c);
    }

    public final int hashCode() {
        return Objects.hash(this.f97405a, this.f97406b, this.f97407c);
    }
}
