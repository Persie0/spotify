package p204p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes8.dex */
public final class tbz0 {

    /* JADX INFO: renamed from: a */
    public final String f218972a;

    /* JADX INFO: renamed from: b */
    public final Restrictions f218973b;

    /* JADX INFO: renamed from: c */
    public final x431 f218974c;

    /* JADX INFO: renamed from: d */
    public final am81 f218975d;

    public tbz0(String str, Restrictions restrictions, x431 x431Var, am81 am81Var) {
        this.f218972a = str;
        this.f218973b = restrictions;
        this.f218974c = x431Var;
        this.f218975d = am81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbz0)) {
            return false;
        }
        tbz0 tbz0Var = (tbz0) obj;
        return wj50.m88271j(this.f218972a, tbz0Var.f218972a) && wj50.m88271j(this.f218973b, tbz0Var.f218973b) && wj50.m88271j(this.f218974c, tbz0Var.f218974c) && wj50.m88271j(this.f218975d, tbz0Var.f218975d);
    }

    public final int hashCode() {
        return this.f218975d.hashCode() + ((this.f218974c.hashCode() + ((this.f218973b.hashCode() + (this.f218972a.hashCode() * 31)) * 31)) * 31);
    }
}
