package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class l6z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f130509a;

    public l6z0(ArrayList arrayList) {
        this.f130509a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6z0) && this.f130509a.equals(((l6z0) obj).f130509a);
    }

    public final int hashCode() {
        return this.f130509a.hashCode();
    }
}
