package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class s6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final ArrayList f206128a;

    public s6i(ArrayList arrayList) {
        this.f206128a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6i) && this.f206128a.equals(((s6i) obj).f206128a);
    }

    public final int hashCode() {
        return this.f206128a.hashCode();
    }
}
