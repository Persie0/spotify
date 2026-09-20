package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gbd1 {

    /* JADX INFO: renamed from: a */
    public final String f78277a;

    /* JADX INFO: renamed from: b */
    public final Object f78278b;

    /* JADX INFO: renamed from: c */
    public final String f78279c;

    public gbd1(String str, List list, String str2) {
        this.f78277a = str;
        this.f78278b = list;
        this.f78279c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbd1)) {
            return false;
        }
        gbd1 gbd1Var = (gbd1) obj;
        return wj50.m88271j(this.f78277a, gbd1Var.f78277a) && this.f78278b.equals(gbd1Var.f78278b) && wj50.m88271j(this.f78279c, gbd1Var.f78279c);
    }

    public final int hashCode() {
        return this.f78279c.hashCode() + dq60.m36604d(this.f78277a.hashCode() * 31, 31, this.f78278b);
    }
}
