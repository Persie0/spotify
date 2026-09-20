package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vuc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244923a;

    /* JADX INFO: renamed from: b */
    public int f244924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f244925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuc1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f244925c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244923a = obj;
        this.f244924b |= Integer.MIN_VALUE;
        return this.f244925c.emit(null, this);
    }
}
