package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kiz implements i7t0 {

    /* JADX INFO: renamed from: a */
    public final fiz f123142a;

    /* JADX INFO: renamed from: b */
    public final juk f123143b;

    public kiz(fiz fizVar, juk jukVar) {
        this.f123142a = fizVar;
        this.f123143b = jukVar;
    }

    @Override // p204p.i7t0
    public final void subscribe(ft51 ft51Var) {
        ft51Var.getClass();
        ft51Var.onSubscribe(new dnz(this.f123142a, ft51Var, this.f123143b));
    }
}
