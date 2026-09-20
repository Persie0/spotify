package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class oip0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165857a;

    /* JADX INFO: renamed from: b */
    public int f165858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f165859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oip0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f165859c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165857a = obj;
        this.f165858b |= Integer.MIN_VALUE;
        return this.f165859c.emit(null, this);
    }
}
