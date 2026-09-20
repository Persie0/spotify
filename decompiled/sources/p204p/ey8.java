package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ey8 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f63987a;

    public ey8(ArrayList arrayList) {
        this.f63987a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey8) && this.f63987a.equals(((ey8) obj).f63987a);
    }

    public final int hashCode() {
        return this.f63987a.hashCode();
    }
}
