package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class u681 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f227244a;

    public u681(ArrayList arrayList) {
        this.f227244a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u681) && this.f227244a.equals(((u681) obj).f227244a);
    }

    public final int hashCode() {
        return this.f227244a.hashCode();
    }
}
