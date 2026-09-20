package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ced1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f37090a;

    public ced1(ArrayList arrayList) {
        this.f37090a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ced1) && this.f37090a.equals(((ced1) obj).f37090a);
    }

    public final int hashCode() {
        return this.f37090a.hashCode();
    }
}
