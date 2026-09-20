package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class e3l0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f55823a;

    public e3l0(ArrayList arrayList) {
        this.f55823a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3l0) && this.f55823a.equals(((e3l0) obj).f55823a);
    }

    public final int hashCode() {
        return this.f55823a.hashCode();
    }
}
