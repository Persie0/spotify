package p204p;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class sy7 {

    /* JADX INFO: renamed from: a */
    public final String f215171a;

    /* JADX INFO: renamed from: b */
    public final Class f215172b;

    /* JADX INFO: renamed from: c */
    public final Object f215173c;

    public sy7(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f215171a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f215172b = cls;
        this.f215173c = key;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sy7) {
            sy7 sy7Var = (sy7) obj;
            Object obj3 = sy7Var.f215173c;
            if (this.f215171a.equals(sy7Var.f215171a) && this.f215172b.equals(sy7Var.f215172b) && ((obj2 = this.f215173c) != null ? obj2.equals(obj3) : obj3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f215171a.hashCode() ^ 1000003) * 1000003) ^ this.f215172b.hashCode()) * 1000003;
        Object obj = this.f215173c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.f215171a);
        sb.append(", valueClass=");
        sb.append(this.f215172b);
        sb.append(", token=");
        return edb.m38568q(sb, this.f215173c, "}");
    }
}
