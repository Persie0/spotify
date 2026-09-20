package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class euo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63028a;

    /* JADX INFO: renamed from: b */
    public int f63029b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f63030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f63030c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63028a = obj;
        this.f63029b |= Integer.MIN_VALUE;
        return this.f63030c.emit(null, this);
    }
}
