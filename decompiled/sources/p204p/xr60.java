package p204p;

import io.ably.lib.rest.Auth;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class xr60 {

    /* JADX INFO: renamed from: c */
    public static final xr60 f265273c = new xr60(0, null);

    /* JADX INFO: renamed from: a */
    public final int f265274a;

    /* JADX INFO: renamed from: b */
    public final sr60 f265275b;

    public xr60(int i, sr60 sr60Var) {
        String string;
        this.f265274a = i;
        this.f265275b = sr60Var;
        if ((i == 0) == (sr60Var == null)) {
            return;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
            sb.append(" requires type to be specified.");
            string = sb.toString();
        } else {
            string = "Star projection must have no type specified.";
        }
        throw new IllegalArgumentException(string.toString());
    }

    /* JADX INFO: renamed from: a */
    public final int m91914a() {
        return this.f265274a;
    }

    /* JADX INFO: renamed from: b */
    public final sr60 m91915b() {
        return this.f265275b;
    }

    /* JADX INFO: renamed from: c */
    public final sr60 m91916c() {
        return this.f265275b;
    }

    /* JADX INFO: renamed from: d */
    public final int m91917d() {
        return this.f265274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr60)) {
            return false;
        }
        xr60 xr60Var = (xr60) obj;
        return this.f265274a == xr60Var.f265274a && wj50.m88271j(this.f265275b, xr60Var.f265275b);
    }

    public final int hashCode() {
        int i = this.f265274a;
        int iM38547C = (i == 0 ? 0 : edb.m38547C(i)) * 31;
        sr60 sr60Var = this.f265275b;
        return iM38547C + (sr60Var != null ? sr60Var.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f265274a;
        int i2 = i == 0 ? -1 : wr60.f254274a[edb.m38547C(i)];
        if (i2 == -1) {
            return Auth.WILDCARD_CLIENTID;
        }
        sr60 sr60Var = this.f265275b;
        if (i2 == 1) {
            return String.valueOf(sr60Var);
        }
        if (i2 == 2) {
            return "in " + sr60Var;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + sr60Var;
    }
}
