package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xox implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f264377a;

    public xox(ArrayList arrayList) {
        this.f264377a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xox) && this.f264377a.equals(((xox) obj).f264377a);
    }

    public final int hashCode() {
        return this.f264377a.hashCode();
    }
}
