package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rr3 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f201935a;

    /* JADX INFO: renamed from: b */
    public tf60 f201936b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f201937c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tr3 f201938d;

    /* JADX INFO: renamed from: e */
    public int f201939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr3(tr3 tr3Var, fbk fbkVar) {
        super(fbkVar);
        this.f201938d = tr3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201937c = obj;
        this.f201939e |= Integer.MIN_VALUE;
        return this.f201938d.emit(null, this);
    }
}
