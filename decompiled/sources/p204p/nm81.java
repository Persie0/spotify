package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nm81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f155324a;

    /* JADX INFO: renamed from: b */
    public int f155325b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f155326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm81(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f155326c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f155324a = obj;
        this.f155325b |= Integer.MIN_VALUE;
        return this.f155326c.emit(null, this);
    }
}
