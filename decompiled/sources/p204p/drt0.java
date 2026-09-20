package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class drt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52386a;

    /* JADX INFO: renamed from: b */
    public int f52387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ert0 f52388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drt0(ert0 ert0Var, fbk fbkVar) {
        super(fbkVar);
        this.f52388c = ert0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52386a = obj;
        this.f52387b |= Integer.MIN_VALUE;
        return this.f52388c.emit(null, this);
    }
}
