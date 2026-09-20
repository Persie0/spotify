package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wmu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252979a;

    /* JADX INFO: renamed from: b */
    public int f252980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f252981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f252981c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252979a = obj;
        this.f252980b |= Integer.MIN_VALUE;
        return this.f252981c.emit(null, this);
    }
}
