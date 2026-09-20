package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t6c1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217534a;

    /* JADX INFO: renamed from: b */
    public int f217535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f217536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6c1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f217536c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217534a = obj;
        this.f217535b |= Integer.MIN_VALUE;
        return this.f217536c.emit(null, this);
    }
}
