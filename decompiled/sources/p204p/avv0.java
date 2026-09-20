package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class avv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20285a;

    /* JADX INFO: renamed from: b */
    public int f20286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f20287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avv0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f20287c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20285a = obj;
        this.f20286b |= Integer.MIN_VALUE;
        return this.f20287c.emit(null, this);
    }
}
