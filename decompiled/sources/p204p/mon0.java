package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mon0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145710a;

    /* JADX INFO: renamed from: b */
    public int f145711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f145712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mon0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f145712c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145710a = obj;
        this.f145711b |= Integer.MIN_VALUE;
        return this.f145712c.emit(null, this);
    }
}
