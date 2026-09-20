package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class wuz0 implements zuz0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f255303a;

    public wuz0(ArrayList arrayList) {
        this.f255303a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuz0) && this.f255303a.equals(((wuz0) obj).f255303a);
    }

    public final int hashCode() {
        return this.f255303a.hashCode();
    }
}
