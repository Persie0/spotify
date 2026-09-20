package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class suq0 {

    /* JADX INFO: renamed from: a */
    public final q7z0 f214192a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f214193b;

    public suq0(q7z0 q7z0Var, ArrayList arrayList) {
        this.f214192a = q7z0Var;
        this.f214193b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suq0)) {
            return false;
        }
        suq0 suq0Var = (suq0) obj;
        return this.f214192a.equals(suq0Var.f214192a) && this.f214193b.equals(suq0Var.f214193b);
    }

    public final int hashCode() {
        return this.f214193b.hashCode() + (this.f214192a.hashCode() * 31);
    }
}
