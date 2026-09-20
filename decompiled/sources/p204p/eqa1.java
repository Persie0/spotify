package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class eqa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61838a;

    /* JADX INFO: renamed from: b */
    public int f61839b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f61840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqa1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f61840c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61838a = obj;
        this.f61839b |= Integer.MIN_VALUE;
        return this.f61840c.emit(null, this);
    }
}
