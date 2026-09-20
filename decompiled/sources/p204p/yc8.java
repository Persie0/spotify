package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class yc8 {

    /* JADX INFO: renamed from: a */
    public final String f271424a;

    /* JADX INFO: renamed from: b */
    public final gg8 f271425b;

    /* JADX INFO: renamed from: c */
    public final hg8 f271426c;

    /* JADX INFO: renamed from: d */
    public final Set f271427d;

    public yc8(String str, gg8 gg8Var, hg8 hg8Var, Set set) {
        this.f271424a = str;
        this.f271425b = gg8Var;
        this.f271426c = hg8Var;
        this.f271427d = set;
    }

    /* JADX INFO: renamed from: a */
    public final String m93334a() {
        return this.f271424a;
    }

    /* JADX INFO: renamed from: b */
    public final gg8 m93335b() {
        return this.f271425b;
    }

    /* JADX INFO: renamed from: c */
    public final Set m93336c() {
        return this.f271427d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc8)) {
            return false;
        }
        yc8 yc8Var = (yc8) obj;
        return wj50.m88271j(this.f271424a, yc8Var.f271424a) && wj50.m88271j(this.f271425b, yc8Var.f271425b) && this.f271426c == yc8Var.f271426c && wj50.m88271j(this.f271427d, yc8Var.f271427d);
    }

    public final int hashCode() {
        return this.f271427d.hashCode() + ((this.f271426c.hashCode() + ((this.f271425b.hashCode() + (this.f271424a.hashCode() * 31)) * 31)) * 31);
    }
}
