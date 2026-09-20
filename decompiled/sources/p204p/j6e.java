package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class j6e {

    /* JADX INFO: renamed from: a */
    public final Object f109296a;

    public j6e(List list) {
        this.f109296a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6e) && this.f109296a.equals(((j6e) obj).f109296a);
    }

    public final int hashCode() {
        return this.f109296a.hashCode();
    }
}
