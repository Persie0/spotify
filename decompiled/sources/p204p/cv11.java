package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cv11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42269a;

    /* JADX INFO: renamed from: b */
    public int f42270b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f42271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f42271c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42269a = obj;
        this.f42270b |= Integer.MIN_VALUE;
        return this.f42271c.emit(null, this);
    }
}
