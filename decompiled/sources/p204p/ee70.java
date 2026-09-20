package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ee70 {

    /* JADX INFO: renamed from: c */
    public static final String f58698c;

    /* JADX INFO: renamed from: d */
    public static final String f58699d;

    /* JADX INFO: renamed from: a */
    public final String f58700a;

    /* JADX INFO: renamed from: b */
    public final String f58701b;

    static {
        String str = h0b1.f86200a;
        f58698c = Integer.toString(0, 36);
        f58699d = Integer.toString(1, 36);
    }

    public ee70(String str, String str2) {
        this.f58700a = h0b1.m46296X(str);
        this.f58701b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ee70.class == obj.getClass()) {
            ee70 ee70Var = (ee70) obj;
            if (Objects.equals(this.f58700a, ee70Var.f58700a) && Objects.equals(this.f58701b, ee70Var.f58701b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f58701b.hashCode() * 31;
        String str = this.f58700a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.f58700a);
        sb.append(", '");
        return dq60.m36616p(this.f58701b, "' }", sb);
    }
}
