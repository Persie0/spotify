package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pwz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f182159a;

    /* JADX INFO: renamed from: b */
    public int f182160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f182161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f182161c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f182159a = obj;
        this.f182160b |= Integer.MIN_VALUE;
        return this.f182161c.emit(null, this);
    }
}
