package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bla extends jb8 {

    /* JADX INFO: renamed from: a */
    public hqb f28141a;

    /* JADX INFO: renamed from: b */
    public gh00 f28142b;

    @Override // p204p.jb8
    /* JADX INFO: renamed from: a */
    public final void mo29755a() {
        this.f28142b = null;
        this.f28141a = null;
    }

    @Override // p204p.jb8
    /* JADX INFO: renamed from: b */
    public final void mo29756b(Throwable th) {
        hqb hqbVar = this.f28141a;
        if (hqbVar != null) {
            hqbVar.resumeWith(new c6x0(th));
        }
    }
}
