package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f551 {

    /* JADX INFO: renamed from: a */
    public final List f65941a;

    /* JADX INFO: renamed from: b */
    public final List f65942b;

    /* JADX INFO: renamed from: c */
    public final Throwable f65943c;

    public f551(List list, List list2, Throwable th) {
        this.f65941a = list;
        this.f65942b = list2;
        this.f65943c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f551)) {
            return false;
        }
        f551 f551Var = (f551) obj;
        return wj50.m88271j(this.f65941a, f551Var.f65941a) && wj50.m88271j(this.f65942b, f551Var.f65942b) && wj50.m88271j(this.f65943c, f551Var.f65943c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f65941a.hashCode() * 31, 31, this.f65942b);
        Throwable th = this.f65943c;
        return iM77244c + (th == null ? 0 : th.hashCode());
    }
}
