package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c860 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35116a;

    /* JADX INFO: renamed from: b */
    public int f35117b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f35118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c860(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f35118c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35116a = obj;
        this.f35117b |= Integer.MIN_VALUE;
        return this.f35118c.emit(null, this);
    }
}
