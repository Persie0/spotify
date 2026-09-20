package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class brt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30167a;

    /* JADX INFO: renamed from: b */
    public int f30168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f30169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f30169c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30167a = obj;
        this.f30168b |= Integer.MIN_VALUE;
        return this.f30169c.emit(null, this);
    }
}
