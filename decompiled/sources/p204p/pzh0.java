package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pzh0 extends rzh0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f183712a;

    public pzh0(ArrayList arrayList) {
        this.f183712a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzh0) && this.f183712a.equals(((pzh0) obj).f183712a);
    }

    public final int hashCode() {
        return this.f183712a.hashCode();
    }
}
