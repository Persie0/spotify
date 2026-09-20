package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ex5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63668a;

    /* JADX INFO: renamed from: b */
    public int f63669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f63670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f63670c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63668a = obj;
        this.f63669b |= Integer.MIN_VALUE;
        return this.f63670c.emit(null, this);
    }
}
