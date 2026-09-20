package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tya1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224905a;

    /* JADX INFO: renamed from: b */
    public int f224906b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjy0 f224907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tya1(vjy0 vjy0Var, fbk fbkVar) {
        super(fbkVar);
        this.f224907c = vjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224905a = obj;
        this.f224906b |= Integer.MIN_VALUE;
        return this.f224907c.emit(null, this);
    }
}
