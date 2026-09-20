package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s1e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204694a;

    /* JADX INFO: renamed from: b */
    public int f204695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f204696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f204696c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204694a = obj;
        this.f204695b |= Integer.MIN_VALUE;
        return this.f204696c.emit(null, this);
    }
}
