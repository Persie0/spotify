package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class my7 {

    /* JADX INFO: renamed from: a */
    public final String f148331a;

    /* JADX INFO: renamed from: b */
    public final a18 f148332b;

    public my7(String str, a18 a18Var) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f148331a = str;
        if (a18Var == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f148332b = a18Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof my7) {
            my7 my7Var = (my7) obj;
            if (this.f148331a.equals(my7Var.f148331a) && this.f148332b.equals(my7Var.f148332b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f148331a.hashCode() ^ 1000003) * 1000003) ^ this.f148332b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f148331a + ", cameraConfigId=" + this.f148332b + "}";
    }
}
