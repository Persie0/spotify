package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class y18 extends bjx0 {

    /* JADX INFO: renamed from: b */
    public final String f268199b;

    /* JADX INFO: renamed from: c */
    public final String f268200c;

    /* JADX INFO: renamed from: d */
    public final String f268201d;

    /* JADX INFO: renamed from: e */
    public final String f268202e;

    /* JADX INFO: renamed from: f */
    public final long f268203f;

    public y18(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f268199b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f268200c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f268201d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f268202e = str4;
        this.f268203f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bjx0) {
            y18 y18Var = (y18) ((bjx0) obj);
            if (this.f268199b.equals(y18Var.f268199b) && this.f268200c.equals(y18Var.f268200c) && this.f268201d.equals(y18Var.f268201d) && this.f268202e.equals(y18Var.f268202e) && this.f268203f == y18Var.f268203f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f268199b.hashCode() ^ 1000003) * 1000003) ^ this.f268200c.hashCode()) * 1000003) ^ this.f268201d.hashCode()) * 1000003) ^ this.f268202e.hashCode()) * 1000003;
        long j = this.f268203f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f268199b);
        sb.append(", parameterKey=");
        sb.append(this.f268200c);
        sb.append(", parameterValue=");
        sb.append(this.f268201d);
        sb.append(", variantId=");
        sb.append(this.f268202e);
        sb.append(", templateVersion=");
        return ikc0.m50938j(this.f268203f, "}", sb);
    }
}
