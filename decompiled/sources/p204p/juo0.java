package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class juo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116126a;

    /* JADX INFO: renamed from: b */
    public int f116127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f116128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f116128c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116126a = obj;
        this.f116127b |= Integer.MIN_VALUE;
        return this.f116128c.emit(null, this);
    }
}
