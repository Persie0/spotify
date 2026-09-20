package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class too {

    /* JADX INFO: renamed from: a */
    public final ArrayList f222292a;

    public too(ArrayList arrayList) {
        this.f222292a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof too) && this.f222292a.equals(((too) obj).f222292a);
    }

    public final int hashCode() {
        return this.f222292a.hashCode();
    }
}
