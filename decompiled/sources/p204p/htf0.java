package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class htf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95006a;

    /* JADX INFO: renamed from: b */
    public int f95007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f95008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f95008c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95006a = obj;
        this.f95007b |= Integer.MIN_VALUE;
        return this.f95008c.emit(null, this);
    }
}
