package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ch41 implements fbk, zuk {

    /* JADX INFO: renamed from: a */
    public final gnc f37921a;

    /* JADX INFO: renamed from: b */
    public final juk f37922b;

    public ch41(gnc gncVar, juk jukVar) {
        this.f37921a = gncVar;
        this.f37922b = jukVar;
    }

    @Override // p204p.zuk
    public final zuk getCallerFrame() {
        return this.f37921a;
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return this.f37922b;
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        this.f37921a.resumeWith(obj);
    }
}
