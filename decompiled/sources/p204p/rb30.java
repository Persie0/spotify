package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rb30 extends tb30 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f197431a;

    public rb30(ArrayList arrayList) {
        this.f197431a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb30) && this.f197431a.equals(((rb30) obj).f197431a);
    }

    public final int hashCode() {
        return this.f197431a.hashCode();
    }
}
