package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kev implements uev {

    /* JADX INFO: renamed from: a */
    public final jev f121984a;

    public kev(jev jevVar) {
        this.f121984a = jevVar;
    }

    @Override // p204p.uev
    /* JADX INFO: renamed from: a */
    public final String mo56242a(bpe1 bpe1Var, tev tevVar) {
        jev jevVar = bpe1Var.f29428e;
        jev jevVar2 = this.f121984a;
        if (jevVar2 == jevVar) {
            return mo39238b(bpe1Var, tevVar);
        }
        na6.m63957e("This decorator is meant to be used with " + jevVar2 + " entities, and was used with " + jevVar + ", this should not happen");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo39238b(bpe1 bpe1Var, tev tevVar);
}
