package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class v16 {

    /* JADX INFO: renamed from: a */
    public final boolean f236261a;

    /* JADX INFO: renamed from: b */
    public final Object f236262b;

    public v16(List list, boolean z) {
        this.f236261a = z;
        this.f236262b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v16)) {
            return false;
        }
        v16 v16Var = (v16) obj;
        return this.f236261a == v16Var.f236261a && this.f236262b.equals(v16Var.f236262b);
    }

    public final int hashCode() {
        return this.f236262b.hashCode() + (Boolean.hashCode(this.f236261a) * 31);
    }
}
