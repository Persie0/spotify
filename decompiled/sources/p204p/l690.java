package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l690 extends ibk {

    /* JADX INFO: renamed from: a */
    public i690 f130275a;

    /* JADX INFO: renamed from: b */
    public sr4 f130276b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f130277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m690 f130278d;

    /* JADX INFO: renamed from: e */
    public int f130279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l690(m690 m690Var, ibk ibkVar) {
        super(ibkVar);
        this.f130278d = m690Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f130277c = obj;
        this.f130279e |= Integer.MIN_VALUE;
        return this.f130278d.m60977f(null, null, null, this);
    }
}
