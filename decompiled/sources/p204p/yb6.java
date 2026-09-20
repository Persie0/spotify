package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class yb6 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f271084a;

    public yb6(ArrayList arrayList) {
        this.f271084a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb6) && this.f271084a.equals(((yb6) obj).f271084a);
    }

    public final int hashCode() {
        return this.f271084a.hashCode();
    }
}
