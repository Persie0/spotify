package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class g911 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f77643a;

    public g911(ArrayList arrayList) {
        this.f77643a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g911) && this.f77643a.equals(((g911) obj).f77643a);
    }

    public final int hashCode() {
        return this.f77643a.hashCode();
    }
}
