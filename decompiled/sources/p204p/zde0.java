package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zde0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281704a;

    /* JADX INFO: renamed from: b */
    public int f281705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f281706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zde0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f281706c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281704a = obj;
        this.f281705b |= Integer.MIN_VALUE;
        return this.f281706c.emit(null, this);
    }
}
