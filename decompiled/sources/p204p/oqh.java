package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f168293a;

    /* JADX INFO: renamed from: b */
    public final List f168294b;

    public oqh(String str, List list) {
        this.f168293a = str;
        this.f168294b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqh)) {
            return false;
        }
        oqh oqhVar = (oqh) obj;
        return wj50.m88271j(this.f168293a, oqhVar.f168293a) && wj50.m88271j(this.f168294b, oqhVar.f168294b);
    }

    public final int hashCode() {
        return this.f168294b.hashCode() + (this.f168293a.hashCode() * 31);
    }
}
