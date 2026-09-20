package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ato0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19724a;

    /* JADX INFO: renamed from: b */
    public int f19725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f19726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ato0(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f19726c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19724a = obj;
        this.f19725b |= Integer.MIN_VALUE;
        return this.f19726c.emit(null, this);
    }
}
