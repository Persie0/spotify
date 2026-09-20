package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xmx0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f263463a;

    public xmx0(ArrayList arrayList) {
        this.f263463a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmx0) && this.f263463a.equals(((xmx0) obj).f263463a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f263463a.hashCode() * 31);
    }
}
