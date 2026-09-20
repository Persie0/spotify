package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i9a implements k9a {

    /* JADX INFO: renamed from: a */
    public final int f99963a;

    /* JADX INFO: renamed from: b */
    public final Map f99964b;

    public i9a(int i, Map map) {
        this.f99963a = i;
        this.f99964b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9a)) {
            return false;
        }
        i9a i9aVar = (i9a) obj;
        return this.f99963a == i9aVar.f99963a && wj50.m88271j(this.f99964b, i9aVar.f99964b);
    }

    public final int hashCode() {
        return this.f99964b.hashCode() + (edb.m38547C(this.f99963a) * 31);
    }
}
