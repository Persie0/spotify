package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class u0z {

    /* JADX INFO: renamed from: a */
    public final ArrayList f225626a;

    public u0z(ArrayList arrayList) {
        this.f225626a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0z) && this.f225626a.equals(((u0z) obj).f225626a);
    }

    public final int hashCode() {
        return this.f225626a.hashCode();
    }
}
