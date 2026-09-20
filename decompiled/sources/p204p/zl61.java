package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zl61 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f283942a;

    public zl61(ArrayList arrayList) {
        this.f283942a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl61) && this.f283942a.equals(((zl61) obj).f283942a);
    }

    public final int hashCode() {
        return this.f283942a.hashCode();
    }
}
