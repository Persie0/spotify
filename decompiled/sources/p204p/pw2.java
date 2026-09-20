package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pw2 {

    /* JADX INFO: renamed from: a */
    public final Object f181881a;

    /* JADX INFO: renamed from: b */
    public final boolean f181882b;

    public pw2(List list, boolean z) {
        this.f181881a = list;
        this.f181882b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw2)) {
            return false;
        }
        pw2 pw2Var = (pw2) obj;
        return this.f181881a.equals(pw2Var.f181881a) && this.f181882b == pw2Var.f181882b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181882b) + (this.f181881a.hashCode() * 31);
    }
}
