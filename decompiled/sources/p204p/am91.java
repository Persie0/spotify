package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class am91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17072a;

    /* JADX INFO: renamed from: b */
    public int f17073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f17074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f17074c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17072a = obj;
        this.f17073b |= Integer.MIN_VALUE;
        return this.f17074c.emit(null, this);
    }
}
