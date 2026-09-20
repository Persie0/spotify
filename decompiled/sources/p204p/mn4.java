package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mn4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145305a;

    /* JADX INFO: renamed from: b */
    public int f145306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f145307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f145307c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145305a = obj;
        this.f145306b |= Integer.MIN_VALUE;
        return this.f145307c.emit(null, this);
    }
}
