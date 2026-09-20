package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j1e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107743a;

    /* JADX INFO: renamed from: b */
    public int f107744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjy0 f107745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1e1(vjy0 vjy0Var, fbk fbkVar) {
        super(fbkVar);
        this.f107745c = vjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107743a = obj;
        this.f107744b |= Integer.MIN_VALUE;
        return this.f107745c.emit(null, this);
    }
}
