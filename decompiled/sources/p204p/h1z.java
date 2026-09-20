package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class h1z {

    /* JADX INFO: renamed from: a */
    public final ArrayList f86778a;

    public h1z(ArrayList arrayList) {
        this.f86778a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1z) && this.f86778a.equals(((h1z) obj).f86778a);
    }

    public final int hashCode() {
        return this.f86778a.hashCode();
    }
}
