package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class iws implements jws {

    /* JADX INFO: renamed from: a */
    public final List f106505a;

    /* JADX INFO: renamed from: b */
    public final boolean f106506b;

    /* JADX INFO: renamed from: c */
    public final Integer f106507c;

    public iws(qf40 qf40Var, Integer num, int i) {
        boolean z = (i & 2) == 0;
        num = (i & 4) != 0 ? null : num;
        this.f106505a = qf40Var;
        this.f106506b = z;
        this.f106507c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iws)) {
            return false;
        }
        iws iwsVar = (iws) obj;
        return wj50.m88271j(this.f106505a, iwsVar.f106505a) && this.f106506b == iwsVar.f106506b && wj50.m88271j(this.f106507c, iwsVar.f106507c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f106505a.hashCode() * 31, 31, this.f106506b);
        Integer num = this.f106507c;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
