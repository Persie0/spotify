package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yam implements na01 {

    /* JADX INFO: renamed from: b */
    public final String f270947b;

    /* JADX INFO: renamed from: c */
    public final xam f270948c;

    /* JADX INFO: renamed from: d */
    public final fiz f270949d;

    /* JADX INFO: renamed from: e */
    public final g3e f270950e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f270951f;

    /* JADX INFO: renamed from: g */
    public final wam f270952g;

    public yam(String str, xam xamVar, fiz fizVar, g3e g3eVar, i4t0 i4t0Var, wam wamVar) {
        this.f270947b = str;
        this.f270948c = xamVar;
        this.f270949d = fizVar;
        this.f270950e = g3eVar;
        this.f270951f = i4t0Var;
        this.f270952g = wamVar;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty ID must be provided.");
        }
    }

    @Override // p204p.na01
    /* JADX INFO: renamed from: a */
    public final g3e mo45291a() {
        return this.f270950e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yam)) {
            return false;
        }
        yam yamVar = (yam) obj;
        return wj50.m88271j(this.f270947b, yamVar.f270947b) && wj50.m88271j(this.f270948c, yamVar.f270948c) && wj50.m88271j(this.f270949d, yamVar.f270949d) && wj50.m88271j(this.f270950e, yamVar.f270950e) && wj50.m88271j(this.f270951f, yamVar.f270951f) && wj50.m88271j(this.f270952g, yamVar.f270952g);
    }

    @Override // p204p.na01
    public final String getId() {
        return this.f270947b;
    }

    public final int hashCode() {
        return this.f270952g.hashCode() + ((this.f270951f.hashCode() + ((this.f270950e.hashCode() + ((this.f270949d.hashCode() + ((this.f270948c.hashCode() + (this.f270947b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p204p.na01
    public final fiz isVisible() {
        return this.f270949d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yam(String str, xam xamVar, g3e g3eVar, i4t0 i4t0Var, wam wamVar) {
        this(str, xamVar, jxq0.f117175L0, g3eVar, i4t0Var, wamVar);
        na01.f151903a.getClass();
    }
}
