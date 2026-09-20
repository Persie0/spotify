package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wl80 extends yl80 {

    /* JADX INFO: renamed from: a */
    public final String f252484a;

    /* JADX INFO: renamed from: b */
    public final sb71 f252485b;

    /* JADX INFO: renamed from: c */
    public final gm80 f252486c;

    public wl80(String str, sb71 sb71Var, gm80 gm80Var) {
        this.f252484a = str;
        this.f252485b = sb71Var;
        this.f252486c = gm80Var;
    }

    @Override // p204p.yl80
    /* JADX INFO: renamed from: a */
    public final gm80 mo88503a() {
        return this.f252486c;
    }

    @Override // p204p.yl80
    /* JADX INFO: renamed from: b */
    public final sb71 mo88504b() {
        return this.f252485b;
    }

    /* JADX INFO: renamed from: c */
    public final String m88505c() {
        return this.f252484a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl80)) {
            return false;
        }
        wl80 wl80Var = (wl80) obj;
        return wj50.m88271j(this.f252484a, wl80Var.f252484a) && wj50.m88271j(this.f252485b, wl80Var.f252485b) && wj50.m88271j(this.f252486c, wl80Var.f252486c);
    }

    public final int hashCode() {
        int iHashCode = this.f252484a.hashCode() * 31;
        sb71 sb71Var = this.f252485b;
        int iHashCode2 = (iHashCode + (sb71Var != null ? sb71Var.hashCode() : 0)) * 31;
        gm80 gm80Var = this.f252486c;
        return iHashCode2 + (gm80Var != null ? gm80Var.hashCode() : 0);
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f252484a, ')');
    }
}
