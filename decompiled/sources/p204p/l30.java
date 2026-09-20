package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class l30 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f129163a;

    public l30(ArrayList arrayList) {
        this.f129163a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l30) && this.f129163a.equals(((l30) obj).f129163a);
    }

    public final int hashCode() {
        return this.f129163a.hashCode();
    }
}
