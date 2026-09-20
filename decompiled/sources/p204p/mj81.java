package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mj81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144188a;

    /* JADX INFO: renamed from: b */
    public int f144189b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f144190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f144190c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144188a = obj;
        this.f144189b |= Integer.MIN_VALUE;
        return this.f144190c.emit(null, this);
    }
}
