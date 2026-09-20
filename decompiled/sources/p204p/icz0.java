package p204p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes8.dex */
public final class icz0 {

    /* JADX INFO: renamed from: a */
    public final String f100901a;

    /* JADX INFO: renamed from: b */
    public final Restrictions f100902b;

    /* JADX INFO: renamed from: c */
    public final x431 f100903c;

    /* JADX INFO: renamed from: d */
    public final am81 f100904d;

    public icz0(String str, Restrictions restrictions, x431 x431Var, am81 am81Var) {
        this.f100901a = str;
        this.f100902b = restrictions;
        this.f100903c = x431Var;
        this.f100904d = am81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icz0)) {
            return false;
        }
        icz0 icz0Var = (icz0) obj;
        return wj50.m88271j(this.f100901a, icz0Var.f100901a) && wj50.m88271j(this.f100902b, icz0Var.f100902b) && wj50.m88271j(this.f100903c, icz0Var.f100903c) && wj50.m88271j(this.f100904d, icz0Var.f100904d);
    }

    public final int hashCode() {
        return this.f100904d.hashCode() + ((this.f100903c.hashCode() + ((this.f100902b.hashCode() + (this.f100901a.hashCode() * 31)) * 31)) * 31);
    }
}
