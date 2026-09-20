package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eem0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58817a;

    /* JADX INFO: renamed from: b */
    public int f58818b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f58819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eem0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f58819c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58817a = obj;
        this.f58818b |= Integer.MIN_VALUE;
        return this.f58819c.emit(null, this);
    }
}
