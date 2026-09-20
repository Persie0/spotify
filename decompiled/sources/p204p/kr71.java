package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class kr71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f125578a;

    public kr71(ArrayList arrayList) {
        this.f125578a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr71) && this.f125578a.equals(((kr71) obj).f125578a);
    }

    public final int hashCode() {
        return this.f125578a.hashCode();
    }
}
