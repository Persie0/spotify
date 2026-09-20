package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jy7 {

    /* JADX INFO: renamed from: a */
    public final int f117311a;

    /* JADX INFO: renamed from: b */
    public final ky7 f117312b;

    public jy7(int i, ky7 ky7Var) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.f117311a = i;
        this.f117312b = ky7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jy7)) {
            return false;
        }
        jy7 jy7Var = (jy7) obj;
        ky7 ky7Var = jy7Var.f117312b;
        if (!edb.m38554c(this.f117311a, jy7Var.f117311a)) {
            return false;
        }
        ky7 ky7Var2 = this.f117312b;
        if (ky7Var2 == null) {
            return ky7Var == null;
        }
        return ky7Var2.equals(ky7Var);
    }

    public final int hashCode() {
        int iM38547C = (edb.m38547C(this.f117311a) ^ 1000003) * 1000003;
        ky7 ky7Var = this.f117312b;
        return iM38547C ^ (ky7Var == null ? 0 : ky7Var.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.f117311a;
        if (i == 1) {
            str = "PENDING_OPEN";
        } else if (i == 2) {
            str = "OPENING";
        } else if (i == 3) {
            str = "OPEN";
        } else if (i != 4) {
            str = i != 5 ? "null" : "CLOSED";
        } else {
            str = "CLOSING";
        }
        sb.append(str);
        sb.append(", error=");
        sb.append(this.f117312b);
        sb.append("}");
        return sb.toString();
    }
}
