package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yx2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277113a;

    /* JADX INFO: renamed from: b */
    public int f277114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f277115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f277115c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277113a = obj;
        this.f277114b |= Integer.MIN_VALUE;
        return this.f277115c.emit(null, this);
    }
}
