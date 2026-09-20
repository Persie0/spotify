package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ig70 {

    /* JADX INFO: renamed from: a */
    public final String f101911a;

    /* JADX INFO: renamed from: b */
    public final List f101912b;

    /* JADX INFO: renamed from: c */
    public final String f101913c;

    /* JADX INFO: renamed from: d */
    public final boolean f101914d;

    public ig70(String str, String str2, List list, boolean z) {
        this.f101911a = str;
        this.f101912b = list;
        this.f101913c = str2;
        this.f101914d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig70)) {
            return false;
        }
        ig70 ig70Var = (ig70) obj;
        return wj50.m88271j(this.f101911a, ig70Var.f101911a) && wj50.m88271j(this.f101912b, ig70Var.f101912b) && wj50.m88271j(this.f101913c, ig70Var.f101913c) && this.f101914d == ig70Var.f101914d;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f101911a.hashCode() * 31, 31, this.f101912b);
        String str = this.f101913c;
        return Boolean.hashCode(this.f101914d) + ((iM77244c + (str == null ? 0 : str.hashCode())) * 31);
    }
}
