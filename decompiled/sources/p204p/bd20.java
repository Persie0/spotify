package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class bd20 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f25979a;

    /* JADX INFO: renamed from: b */
    public final String f25980b;

    public bd20(ArrayList arrayList, String str) {
        this.f25979a = arrayList;
        this.f25980b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd20)) {
            return false;
        }
        bd20 bd20Var = (bd20) obj;
        return this.f25979a.equals(bd20Var.f25979a) && this.f25980b.equals(bd20Var.f25980b);
    }

    public final int hashCode() {
        return this.f25980b.hashCode() + (this.f25979a.hashCode() * 31);
    }
}
