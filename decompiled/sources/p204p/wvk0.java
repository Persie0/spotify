package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wvk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255519a;

    /* JADX INFO: renamed from: b */
    public int f255520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f255521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f255521c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255519a = obj;
        this.f255520b |= Integer.MIN_VALUE;
        return this.f255521c.emit(null, this);
    }
}
