package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259261a;

    /* JADX INFO: renamed from: b */
    public int f259262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f259263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x921(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f259263c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259261a = obj;
        this.f259262b |= Integer.MIN_VALUE;
        return this.f259263c.emit(null, this);
    }
}
