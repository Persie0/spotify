package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xtd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265846a;

    /* JADX INFO: renamed from: b */
    public int f265847b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f265848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f265848c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265846a = obj;
        this.f265847b |= Integer.MIN_VALUE;
        return this.f265848c.emit(null, this);
    }
}
