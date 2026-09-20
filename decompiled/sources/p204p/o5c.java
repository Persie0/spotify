package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o5c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f161938a;

    public o5c(ArrayList arrayList) {
        this.f161938a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5c) && this.f161938a.equals(((o5c) obj).f161938a);
    }

    public final int hashCode() {
        return this.f161938a.hashCode();
    }
}
