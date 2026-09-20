package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h1c1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86565a;

    /* JADX INFO: renamed from: b */
    public int f86566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f86567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1c1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f86567c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86565a = obj;
        this.f86566b |= Integer.MIN_VALUE;
        return this.f86567c.emit(null, this);
    }
}
