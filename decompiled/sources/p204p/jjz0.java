package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jjz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113126a;

    /* JADX INFO: renamed from: b */
    public int f113127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f113128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f113128c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113126a = obj;
        this.f113127b |= Integer.MIN_VALUE;
        return this.f113128c.emit(null, this);
    }
}
