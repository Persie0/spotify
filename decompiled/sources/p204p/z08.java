package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z08 {

    /* JADX INFO: renamed from: a */
    public final String f278008a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f278009b;

    public z08(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f278008a = str;
        this.f278009b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m95048a() {
        return this.f278009b;
    }

    /* JADX INFO: renamed from: b */
    public final String m95049b() {
        return this.f278008a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z08)) {
            return false;
        }
        z08 z08Var = (z08) obj;
        return this.f278008a.equals(z08Var.f278008a) && this.f278009b.equals(z08Var.f278009b);
    }

    public final int hashCode() {
        return ((this.f278008a.hashCode() ^ 1000003) * 1000003) ^ this.f278009b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f278008a + ", usedDates=" + this.f278009b + "}";
    }
}
