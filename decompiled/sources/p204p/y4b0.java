package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y4b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269113a;

    /* JADX INFO: renamed from: b */
    public int f269114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z4b0 f269115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4b0(z4b0 z4b0Var, fbk fbkVar) {
        super(fbkVar);
        this.f269115c = z4b0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269113a = obj;
        this.f269114b |= Integer.MIN_VALUE;
        return this.f269115c.emit(null, this);
    }
}
