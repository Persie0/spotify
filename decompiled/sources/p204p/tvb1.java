package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tvb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224113a;

    /* JADX INFO: renamed from: b */
    public int f224114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f224115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f224115c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224113a = obj;
        this.f224114b |= Integer.MIN_VALUE;
        return this.f224115c.emit(null, this);
    }
}
