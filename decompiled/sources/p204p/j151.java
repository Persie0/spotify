package p204p;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j151 {

    /* JADX INFO: renamed from: a */
    public final String f107646a;

    /* JADX INFO: renamed from: b */
    public final xf40 f107647b;

    /* JADX INFO: renamed from: c */
    public final xf40 f107648c;

    /* JADX INFO: renamed from: d */
    public final xf40 f107649d;

    public j151(String str, HashMap map, HashMap map2, HashMap map3) {
        this.f107646a = str;
        this.f107647b = xf40.m90451c(map);
        this.f107648c = xf40.m90451c(map2);
        this.f107649d = xf40.m90451c(map3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j151)) {
            return false;
        }
        j151 j151Var = (j151) obj;
        return Objects.equals(this.f107646a, j151Var.f107646a) && Objects.equals(this.f107647b, j151Var.f107647b) && Objects.equals(this.f107648c, j151Var.f107648c) && Objects.equals(this.f107649d, j151Var.f107649d);
    }

    public final int hashCode() {
        return Objects.hash(this.f107646a, this.f107647b, this.f107648c, this.f107649d);
    }
}
