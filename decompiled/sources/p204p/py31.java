package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class py31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183330a;

    /* JADX INFO: renamed from: b */
    public int f183331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f183332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py31(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f183332c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183330a = obj;
        this.f183331b |= Integer.MIN_VALUE;
        return this.f183332c.emit(null, this);
    }
}
