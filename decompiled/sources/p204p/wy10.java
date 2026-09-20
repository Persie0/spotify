package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class wy10 {

    /* JADX INFO: renamed from: a */
    public final String f256173a;

    /* JADX INFO: renamed from: b */
    public final Object f256174b;

    public wy10(String str, List list) {
        this.f256173a = str;
        this.f256174b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy10)) {
            return false;
        }
        wy10 wy10Var = (wy10) obj;
        return this.f256173a.equals(wy10Var.f256173a) && this.f256174b.equals(wy10Var.f256174b);
    }

    public final int hashCode() {
        return this.f256174b.hashCode() + (this.f256173a.hashCode() * 31);
    }
}
