package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eu00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62833a;

    /* JADX INFO: renamed from: b */
    public int f62834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fu00 f62835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu00(fu00 fu00Var, fbk fbkVar) {
        super(fbkVar);
        this.f62835c = fu00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62833a = obj;
        this.f62834b |= Integer.MIN_VALUE;
        return this.f62835c.emit(null, this);
    }
}
