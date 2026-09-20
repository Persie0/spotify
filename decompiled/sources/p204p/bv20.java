package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class bv20 implements gv20 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31259a;

    public bv20(ArrayList arrayList) {
        this.f31259a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv20) && this.f31259a.equals(((bv20) obj).f31259a);
    }

    public final int hashCode() {
        return this.f31259a.hashCode();
    }
}
