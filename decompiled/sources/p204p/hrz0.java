package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hrz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94565a;

    /* JADX INFO: renamed from: b */
    public int f94566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f94567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f94567c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94565a = obj;
        this.f94566b |= Integer.MIN_VALUE;
        return this.f94567c.emit(null, this);
    }
}
