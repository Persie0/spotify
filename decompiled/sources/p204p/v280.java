package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v280 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236559a;

    /* JADX INFO: renamed from: b */
    public int f236560b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f236561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v280(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f236561c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236559a = obj;
        this.f236560b |= Integer.MIN_VALUE;
        return this.f236561c.emit(null, this);
    }
}
