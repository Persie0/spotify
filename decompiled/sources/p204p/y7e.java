package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class y7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final List f270032a;

    /* JADX INFO: renamed from: b */
    public final String f270033b;

    public y7e(List list, String str) {
        this.f270032a = list;
        this.f270033b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7e)) {
            return false;
        }
        y7e y7eVar = (y7e) obj;
        return wj50.m88271j(this.f270032a, y7eVar.f270032a) && wj50.m88271j(this.f270033b, y7eVar.f270033b);
    }

    public final int hashCode() {
        int iHashCode = this.f270032a.hashCode() * 31;
        String str = this.f270033b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
