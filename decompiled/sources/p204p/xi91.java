package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xi91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f261834a;

    /* JADX INFO: renamed from: b */
    public int f261835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f261836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f261836c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261834a = obj;
        this.f261835b |= Integer.MIN_VALUE;
        return this.f261836c.emit(null, this);
    }
}
