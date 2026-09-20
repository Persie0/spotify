package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class so80 {

    /* JADX INFO: renamed from: a */
    public final int f211138a;

    /* JADX INFO: renamed from: b */
    public final String f211139b;

    /* JADX INFO: renamed from: c */
    public final Set f211140c;

    /* JADX INFO: renamed from: d */
    public final ibj f211141d;

    /* JADX INFO: renamed from: e */
    public final xi3 f211142e;

    /* JADX INFO: renamed from: f */
    public final List f211143f;

    /* JADX INFO: renamed from: g */
    public final List f211144g;

    /* JADX INFO: renamed from: h */
    public final List f211145h;

    /* JADX INFO: renamed from: i */
    public final bmj f211146i;

    public so80(int i, String str, Set set, ibj ibjVar, xi3 xi3Var, List list, List list2, List list3, bmj bmjVar) {
        this.f211138a = i;
        this.f211139b = str;
        this.f211140c = set;
        this.f211141d = ibjVar;
        this.f211142e = xi3Var;
        this.f211143f = list;
        this.f211144g = list2;
        this.f211145h = list3;
        this.f211146i = bmjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so80)) {
            return false;
        }
        so80 so80Var = (so80) obj;
        return this.f211138a == so80Var.f211138a && wj50.m88271j(this.f211139b, so80Var.f211139b) && wj50.m88271j(this.f211140c, so80Var.f211140c) && wj50.m88271j(this.f211141d, so80Var.f211141d) && this.f211142e == so80Var.f211142e && wj50.m88271j(this.f211143f, so80Var.f211143f) && wj50.m88271j(this.f211144g, so80Var.f211144g) && wj50.m88271j(this.f211145h, so80Var.f211145h) && wj50.m88271j(this.f211146i, so80Var.f211146i);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f211138a) * 31;
        String str = this.f211139b;
        return this.f211146i.hashCode() + s571.m77244c(s571.m77244c(s571.m77244c((this.f211142e.hashCode() + ((this.f211141d.hashCode() + klh.m56830b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f211140c)) * 31)) * 31, 31, this.f211143f), 31, this.f211144g), 31, this.f211145h);
    }
}
