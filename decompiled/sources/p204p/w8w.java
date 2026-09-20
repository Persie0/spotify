package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class w8w {

    /* JADX INFO: renamed from: a */
    public final String f249025a;

    /* JADX INFO: renamed from: b */
    public final List f249026b;

    /* JADX INFO: renamed from: c */
    public final List f249027c;

    /* JADX INFO: renamed from: d */
    public final t8w f249028d;

    /* JADX INFO: renamed from: e */
    public final boolean f249029e;

    public w8w(String str, List list, List list2, t8w t8wVar, boolean z) {
        this.f249025a = str;
        this.f249026b = list;
        this.f249027c = list2;
        this.f249028d = t8wVar;
        this.f249029e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8w)) {
            return false;
        }
        w8w w8wVar = (w8w) obj;
        return wj50.m88271j(this.f249025a, w8wVar.f249025a) && wj50.m88271j(this.f249026b, w8wVar.f249026b) && wj50.m88271j(this.f249027c, w8wVar.f249027c) && wj50.m88271j(this.f249028d, w8wVar.f249028d) && this.f249029e == w8wVar.f249029e;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77244c(this.f249025a.hashCode() * 31, 31, this.f249026b), 31, this.f249027c);
        t8w t8wVar = this.f249028d;
        return Boolean.hashCode(this.f249029e) + ((iM77244c + (t8wVar == null ? 0 : t8wVar.hashCode())) * 31);
    }
}
