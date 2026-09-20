package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class k0m {

    /* JADX INFO: renamed from: a */
    public final ArrayList f118121a;

    public k0m(ArrayList arrayList) {
        this.f118121a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0m) && this.f118121a.equals(((k0m) obj).f118121a);
    }

    public final int hashCode() {
        return this.f118121a.hashCode();
    }
}
