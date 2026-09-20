package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class qbx extends gcx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f187181a;

    public qbx(ArrayList arrayList) {
        this.f187181a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbx) && this.f187181a.equals(((qbx) obj).f187181a);
    }

    public final int hashCode() {
        return this.f187181a.hashCode();
    }
}
