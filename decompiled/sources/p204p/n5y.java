package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n5y {

    /* JADX INFO: renamed from: a */
    public final ArrayList f150638a;

    public n5y(ArrayList arrayList) {
        this.f150638a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5y) && this.f150638a.equals(((n5y) obj).f150638a);
    }

    public final int hashCode() {
        return this.f150638a.hashCode();
    }
}
