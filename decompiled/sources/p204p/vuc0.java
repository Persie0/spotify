package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vuc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244920a;

    /* JADX INFO: renamed from: b */
    public int f244921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wuc0 f244922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuc0(wuc0 wuc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f244922c = wuc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244920a = obj;
        this.f244921b |= Integer.MIN_VALUE;
        return this.f244922c.mo15629a(null, null, this);
    }
}
