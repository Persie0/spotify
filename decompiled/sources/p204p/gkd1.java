package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gkd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80783a;

    /* JADX INFO: renamed from: b */
    public int f80784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjy0 f80785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkd1(vjy0 vjy0Var, fbk fbkVar) {
        super(fbkVar);
        this.f80785c = vjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80783a = obj;
        this.f80784b |= Integer.MIN_VALUE;
        return this.f80785c.emit(null, this);
    }
}
