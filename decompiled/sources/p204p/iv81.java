package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class iv81 implements lv81 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f106173a;

    public iv81(ArrayList arrayList) {
        this.f106173a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv81) && this.f106173a.equals(((iv81) obj).f106173a);
    }

    public final int hashCode() {
        return this.f106173a.hashCode();
    }
}
