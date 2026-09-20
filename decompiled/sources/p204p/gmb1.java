package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gmb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81360a;

    /* JADX INFO: renamed from: b */
    public int f81361b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f81362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f81362c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81360a = obj;
        this.f81361b |= Integer.MIN_VALUE;
        return this.f81362c.emit(null, this);
    }
}
