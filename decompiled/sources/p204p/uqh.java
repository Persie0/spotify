package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class uqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f233016a;

    /* JADX INFO: renamed from: b */
    public final String f233017b;

    /* JADX INFO: renamed from: c */
    public final List f233018c;

    public uqh(String str, List list, String str2) {
        this.f233016a = str;
        this.f233017b = str2;
        this.f233018c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqh)) {
            return false;
        }
        uqh uqhVar = (uqh) obj;
        return wj50.m88271j(this.f233016a, uqhVar.f233016a) && wj50.m88271j(this.f233017b, uqhVar.f233017b) && wj50.m88271j(this.f233018c, uqhVar.f233018c);
    }

    public final int hashCode() {
        int iHashCode = this.f233016a.hashCode() * 31;
        String str = this.f233017b;
        return this.f233018c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
