package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c9f0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35515a;

    /* JADX INFO: renamed from: b */
    public int f35516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f35517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9f0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f35517c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35515a = obj;
        this.f35516b |= Integer.MIN_VALUE;
        return this.f35517c.emit(null, this);
    }
}
