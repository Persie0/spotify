package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class fh40 implements ih40 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f69573a;

    public fh40(ArrayList arrayList) {
        this.f69573a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh40) && this.f69573a.equals(((fh40) obj).f69573a);
    }

    public final int hashCode() {
        return this.f69573a.hashCode();
    }
}
