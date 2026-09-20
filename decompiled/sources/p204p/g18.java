package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g18 {

    /* JADX INFO: renamed from: a */
    public final boolean f75540a;

    /* JADX INFO: renamed from: b */
    public final boolean f75541b;

    /* JADX INFO: renamed from: c */
    public final String f75542c;

    public g18(String str, boolean z, boolean z2) {
        this.f75540a = z;
        this.f75541b = z2;
        this.f75542c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g18) {
            g18 g18Var = (g18) obj;
            if (this.f75540a == g18Var.f75540a && this.f75541b == g18Var.f75541b && this.f75542c.equals(g18Var.f75542c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f75540a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.f75541b ? 1231 : 1237)) * 1000003) ^ this.f75542c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrationState{isConnected=");
        sb.append(this.f75540a);
        sb.append(", isInstalled=");
        sb.append(this.f75541b);
        sb.append(", clientId=");
        return dq60.m36616p(this.f75542c, "}", sb);
    }
}
