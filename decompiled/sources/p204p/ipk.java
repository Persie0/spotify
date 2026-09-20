package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ipk implements kpk {

    /* JADX INFO: renamed from: a */
    public final Object f104518a;

    public ipk(List list) {
        this.f104518a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipk) && this.f104518a.equals(((ipk) obj).f104518a);
    }

    public final int hashCode() {
        return this.f104518a.hashCode();
    }
}
