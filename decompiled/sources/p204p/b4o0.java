package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class b4o0 implements vwf {

    /* JADX INFO: renamed from: a */
    public final ArrayList f23399a;

    public b4o0(ArrayList arrayList) {
        this.f23399a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4o0) && this.f23399a.equals(((b4o0) obj).f23399a);
    }

    public final int hashCode() {
        return this.f23399a.hashCode();
    }
}
