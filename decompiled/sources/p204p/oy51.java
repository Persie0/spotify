package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class oy51 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f171672a;

    public oy51(ArrayList arrayList) {
        this.f171672a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy51) && this.f171672a.equals(((oy51) obj).f171672a);
    }

    public final int hashCode() {
        return this.f171672a.hashCode();
    }
}
