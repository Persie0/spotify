package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qew0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f188050a;

    /* JADX INFO: renamed from: b */
    public jsi0 f188051b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f188052c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rew0 f188053d;

    /* JADX INFO: renamed from: e */
    public int f188054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qew0(rew0 rew0Var, ibk ibkVar) {
        super(ibkVar);
        this.f188053d = rew0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188052c = obj;
        this.f188054e |= Integer.MIN_VALUE;
        return this.f188053d.m75418c(this);
    }
}
