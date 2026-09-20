package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zei {

    /* JADX INFO: renamed from: a */
    public final String f282040a;

    /* JADX INFO: renamed from: b */
    public final List f282041b;

    public zei(String str, List list) {
        this.f282040a = str;
        this.f282041b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zei)) {
            return false;
        }
        zei zeiVar = (zei) obj;
        return wj50.m88271j(this.f282040a, zeiVar.f282040a) && wj50.m88271j(this.f282041b, zeiVar.f282041b);
    }

    public final int hashCode() {
        return this.f282041b.hashCode() + (this.f282040a.hashCode() * 31);
    }
}
