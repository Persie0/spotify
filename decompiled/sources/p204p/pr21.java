package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pr21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180483a;

    /* JADX INFO: renamed from: b */
    public int f180484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f180485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f180485c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180483a = obj;
        this.f180484b |= Integer.MIN_VALUE;
        return this.f180485c.emit(null, this);
    }
}
