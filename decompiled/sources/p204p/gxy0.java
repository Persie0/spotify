package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gxy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85359a;

    /* JADX INFO: renamed from: b */
    public int f85360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f85361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxy0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f85361c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85359a = obj;
        this.f85360b |= Integer.MIN_VALUE;
        return this.f85361c.emit(null, this);
    }
}
