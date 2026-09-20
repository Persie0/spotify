package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fhk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f69679a;

    /* JADX INFO: renamed from: b */
    public int f69680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f69681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f69681c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f69679a = obj;
        this.f69680b |= Integer.MIN_VALUE;
        return this.f69681c.emit(null, this);
    }
}
