package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228060a;

    /* JADX INFO: renamed from: b */
    public int f228061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f228062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u921(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f228062c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228060a = obj;
        this.f228061b |= Integer.MIN_VALUE;
        return this.f228062c.emit(null, this);
    }
}
