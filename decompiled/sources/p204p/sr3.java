package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sr3 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f213218a;

    /* JADX INFO: renamed from: b */
    public tf60 f213219b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f213220c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tr3 f213221d;

    /* JADX INFO: renamed from: e */
    public int f213222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(tr3 tr3Var, fbk fbkVar) {
        super(fbkVar);
        this.f213221d = tr3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213220c = obj;
        this.f213222e |= Integer.MIN_VALUE;
        return this.f213221d.emit(null, this);
    }
}
