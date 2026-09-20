package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qiq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189054a;

    /* JADX INFO: renamed from: b */
    public int f189055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f189056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiq0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f189056c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189054a = obj;
        this.f189055b |= Integer.MIN_VALUE;
        return this.f189056c.emit(null, this);
    }
}
