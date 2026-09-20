package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wf91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f250770b;

    /* JADX INFO: renamed from: c */
    public int f250771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f250770b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250769a = obj;
        this.f250771c |= Integer.MIN_VALUE;
        return this.f250770b.m56312a(this);
    }
}
