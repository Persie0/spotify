package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tm11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221569a;

    /* JADX INFO: renamed from: b */
    public int f221570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f221571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f221571c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221569a = obj;
        this.f221570b |= Integer.MIN_VALUE;
        return this.f221571c.emit(null, this);
    }
}
