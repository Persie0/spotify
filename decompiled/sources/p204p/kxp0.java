package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127530a;

    /* JADX INFO: renamed from: b */
    public int f127531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f127532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f127532c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127530a = obj;
        this.f127531b |= Integer.MIN_VALUE;
        return this.f127532c.emit(null, this);
    }
}
