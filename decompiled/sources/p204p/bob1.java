package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bob1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f29064a;

    public bob1(ArrayList arrayList) {
        this.f29064a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bob1) && this.f29064a.equals(((bob1) obj).f29064a);
    }

    public final int hashCode() {
        return this.f29064a.hashCode();
    }
}
