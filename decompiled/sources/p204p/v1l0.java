package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v1l0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f236410a;

    public v1l0(ArrayList arrayList) {
        this.f236410a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1l0) && this.f236410a.equals(((v1l0) obj).f236410a);
    }

    public final int hashCode() {
        return this.f236410a.hashCode();
    }
}
