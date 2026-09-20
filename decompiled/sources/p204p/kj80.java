package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kj80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123262a;

    /* JADX INFO: renamed from: b */
    public int f123263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lu5 f123264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj80(lu5 lu5Var, fbk fbkVar) {
        super(fbkVar);
        this.f123264c = lu5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123262a = obj;
        this.f123263b |= Integer.MIN_VALUE;
        return this.f123264c.emit(null, this);
    }
}
