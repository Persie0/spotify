package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class y820 {

    /* JADX INFO: renamed from: a */
    public final List f270175a;

    /* JADX INFO: renamed from: b */
    public final boolean f270176b;

    /* JADX INFO: renamed from: c */
    public final eh00 f270177c;

    public y820(List list, eh00 eh00Var, boolean z) {
        this.f270175a = list;
        this.f270176b = z;
        this.f270177c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y820)) {
            return false;
        }
        y820 y820Var = (y820) obj;
        return wj50.m88271j(this.f270175a, y820Var.f270175a) && this.f270176b == y820Var.f270176b && wj50.m88271j(this.f270177c, y820Var.f270177c);
    }

    public final int hashCode() {
        return this.f270177c.hashCode() + s571.m77245d(this.f270175a.hashCode() * 31, 31, this.f270176b);
    }
}
