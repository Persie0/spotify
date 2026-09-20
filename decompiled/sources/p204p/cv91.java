package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cv91 {

    /* JADX INFO: renamed from: a */
    public final String f42337a;

    /* JADX INFO: renamed from: b */
    public final String f42338b;

    /* JADX INFO: renamed from: c */
    public final au91 f42339c;

    /* JADX INFO: renamed from: d */
    public final dv91 f42340d;

    /* JADX INFO: renamed from: e */
    public final bv91 f42341e;

    public cv91(String str, String str2, au91 au91Var, dv91 dv91Var, bv91 bv91Var) {
        this.f42337a = str;
        this.f42338b = str2;
        this.f42339c = au91Var;
        this.f42340d = dv91Var;
        this.f42341e = bv91Var;
    }

    /* JADX INFO: renamed from: a */
    public final bv91 m34010a() {
        return this.f42341e;
    }

    /* JADX INFO: renamed from: b */
    public final String m34011b() {
        return this.f42338b;
    }

    /* JADX INFO: renamed from: c */
    public final dv91 m34012c() {
        return this.f42340d;
    }

    /* JADX INFO: renamed from: d */
    public final au91 m34013d() {
        return this.f42339c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv91)) {
            return false;
        }
        cv91 cv91Var = (cv91) obj;
        return wj50.m88271j(this.f42337a, cv91Var.f42337a) && wj50.m88271j(this.f42338b, cv91Var.f42338b) && wj50.m88271j(this.f42339c, cv91Var.f42339c) && wj50.m88271j(this.f42340d, cv91Var.f42340d) && wj50.m88271j(this.f42341e, cv91Var.f42341e);
    }

    public final int hashCode() {
        return this.f42341e.hashCode() + ((this.f42340d.hashCode() + ((this.f42339c.hashCode() + s571.m77243b(this.f42337a.hashCode() * 31, 31, this.f42338b)) * 31)) * 31);
    }

    public final String toString() {
        return "UbiInteractionEventIdentity(interface=" + this.f42337a + ", actor=" + this.f42338b + ", path=" + this.f42339c + ", interactionType=" + this.f42340d + ", action=" + this.f42341e + ')';
    }
}
