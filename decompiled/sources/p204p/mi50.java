package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mi50 implements igo {

    /* JADX INFO: renamed from: a */
    public final o6k f143937a;

    /* JADX INFO: renamed from: b */
    public final o6k f143938b;

    /* JADX INFO: renamed from: c */
    public final o6k f143939c;

    /* JADX INFO: renamed from: d */
    public final o6k f143940d;

    /* JADX INFO: renamed from: e */
    public final o6k f143941e;

    /* JADX INFO: renamed from: f */
    public final o6k f143942f;

    public mi50(o6k o6kVar, o6k o6kVar2, o6k o6kVar3, o6k o6kVar4, o6k o6kVar5, o6k o6kVar6) {
        this.f143937a = o6kVar;
        this.f143938b = o6kVar2;
        this.f143939c = o6kVar3;
        this.f143940d = o6kVar4;
        this.f143941e = o6kVar5;
        this.f143942f = o6kVar6;
    }

    @Override // p204p.igo
    public final boolean match(Object obj) {
        ni50 ni50Var = (ni50) obj;
        if (!this.f143937a.m66350a(ni50Var.f154176a) || !this.f143938b.m66350a(ni50Var.f154177b) || !this.f143939c.m66350a(ni50Var.f154178c)) {
            return false;
        }
        if (this.f143940d.m66350a(Boolean.valueOf(ni50Var.f154179d))) {
            return this.f143941e.m66350a(Boolean.valueOf(ni50Var.f154180e)) && this.f143942f.m66350a(ni50Var.f154181f);
        }
        return false;
    }
}
