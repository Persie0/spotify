package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rd81 extends sd81 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f198064a;

    public rd81(ArrayList arrayList) {
        this.f198064a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd81) && this.f198064a.equals(((rd81) obj).f198064a);
    }

    public final int hashCode() {
        return this.f198064a.hashCode();
    }
}
