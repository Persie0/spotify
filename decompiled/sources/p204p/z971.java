package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z971 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fiz f280704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f280705b;

    public z971(zv41 zv41Var, long j) {
        this.f280704a = zv41Var;
        this.f280705b = j;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f280704a.collect(new y971(nizVar, this.f280705b), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
