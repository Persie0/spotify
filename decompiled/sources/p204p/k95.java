package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k95 {

    /* JADX INFO: renamed from: a */
    public final String f120518a;

    /* JADX INFO: renamed from: b */
    public final String f120519b;

    /* JADX INFO: renamed from: c */
    public final String f120520c;

    public k95(String str, String str2, String str3) {
        this.f120518a = str;
        this.f120519b = str2;
        this.f120520c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k95)) {
            return false;
        }
        k95 k95Var = (k95) obj;
        return wj50.m88271j(this.f120518a, k95Var.f120518a) && wj50.m88271j(this.f120519b, k95Var.f120519b) && wj50.m88271j(this.f120520c, k95Var.f120520c);
    }

    public final int hashCode() {
        return this.f120520c.hashCode() + s571.m77243b(this.f120518a.hashCode() * 31, 31, this.f120519b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb.append(this.f120518a);
        sb.append(", cloudBridgeURL=");
        sb.append(this.f120519b);
        sb.append(", accessKey=");
        return dq60.m36617q(sb, this.f120520c, ')');
    }
}
