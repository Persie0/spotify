package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f69258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f69259b;

    /* JADX INFO: renamed from: c */
    public int f69260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f69259b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f69258a = obj;
        this.f69260c |= Integer.MIN_VALUE;
        return this.f69259b.m56320j(this);
    }
}
