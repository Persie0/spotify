package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rn21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200704a;

    /* JADX INFO: renamed from: b */
    public int f200705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f200706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f200706c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200704a = obj;
        this.f200705b |= Integer.MIN_VALUE;
        return this.f200706c.emit(null, this);
    }
}
