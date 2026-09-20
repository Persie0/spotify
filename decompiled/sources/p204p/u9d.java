package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f228142a;

    /* JADX INFO: renamed from: b */
    public final List f228143b;

    public u9d(String str, List list) {
        this.f228142a = str;
        this.f228143b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9d)) {
            return false;
        }
        u9d u9dVar = (u9d) obj;
        return wj50.m88271j(this.f228142a, u9dVar.f228142a) && wj50.m88271j(this.f228143b, u9dVar.f228143b);
    }

    public final int hashCode() {
        return this.f228143b.hashCode() + (this.f228142a.hashCode() * 31);
    }
}
