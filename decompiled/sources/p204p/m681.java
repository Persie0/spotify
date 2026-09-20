package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class m681 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f140423a;

    public m681(ArrayList arrayList) {
        this.f140423a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m681) && this.f140423a.equals(((m681) obj).f140423a);
    }

    public final int hashCode() {
        return this.f140423a.hashCode();
    }
}
