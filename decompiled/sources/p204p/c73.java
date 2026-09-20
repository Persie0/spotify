package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class c73 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34730a;

    public c73(ArrayList arrayList) {
        this.f34730a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c73) && this.f34730a.equals(((c73) obj).f34730a);
    }

    public final int hashCode() {
        return this.f34730a.hashCode();
    }
}
