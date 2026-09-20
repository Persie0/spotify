package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class x16 extends huf1 {

    /* JADX INFO: renamed from: d */
    public final ArrayList f257072d;

    public x16(ArrayList arrayList) {
        this.f257072d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x16) && this.f257072d.equals(((x16) obj).f257072d);
    }

    public final int hashCode() {
        return this.f257072d.hashCode();
    }
}
