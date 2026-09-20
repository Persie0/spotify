package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ugp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230222a;

    /* JADX INFO: renamed from: b */
    public int f230223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vgp0 f230224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugp0(vgp0 vgp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f230224c = vgp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230222a = obj;
        this.f230223b |= Integer.MIN_VALUE;
        return this.f230224c.mo15629a(null, null, this);
    }
}
