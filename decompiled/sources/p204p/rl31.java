package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rl31 {

    /* JADX INFO: renamed from: a */
    public final String f200214a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f200215b;

    public rl31(String str, ArrayList arrayList) {
        this.f200214a = str;
        this.f200215b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl31)) {
            return false;
        }
        rl31 rl31Var = (rl31) obj;
        return this.f200214a.equals(rl31Var.f200214a) && this.f200215b.equals(rl31Var.f200215b);
    }

    public final int hashCode() {
        return this.f200215b.hashCode() + (this.f200214a.hashCode() * 31);
    }
}
