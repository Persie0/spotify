package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e7r extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f56989a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7r f56991c;

    /* JADX INFO: renamed from: d */
    public int f56992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7r(f7r f7rVar, ibk ibkVar) {
        super(ibkVar);
        this.f56991c = f7rVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56990b = obj;
        this.f56992d |= Integer.MIN_VALUE;
        return this.f56991c.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
