package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class scw {

    /* JADX INFO: renamed from: a */
    public final ArrayList f207809a;

    public scw(ArrayList arrayList) {
        this.f207809a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scw) && this.f207809a.equals(((scw) obj).f207809a);
    }

    public final int hashCode() {
        return this.f207809a.hashCode() * 961;
    }
}
