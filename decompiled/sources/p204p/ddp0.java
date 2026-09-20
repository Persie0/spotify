package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ddp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47847a;

    /* JADX INFO: renamed from: b */
    public int f47848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f47849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddp0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f47849c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47847a = obj;
        this.f47848b |= Integer.MIN_VALUE;
        return this.f47849c.emit(null, this);
    }
}
