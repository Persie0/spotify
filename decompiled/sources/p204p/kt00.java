package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kt00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126099a;

    /* JADX INFO: renamed from: b */
    public int f126100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lt00 f126101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt00(lt00 lt00Var, fbk fbkVar) {
        super(fbkVar);
        this.f126101c = lt00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126099a = obj;
        this.f126100b |= Integer.MIN_VALUE;
        return this.f126101c.emit(null, this);
    }
}
