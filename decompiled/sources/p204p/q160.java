package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q160 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r160 f184220b;

    /* JADX INFO: renamed from: c */
    public int f184221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q160(r160 r160Var, ibk ibkVar) {
        super(ibkVar);
        this.f184220b = r160Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184219a = obj;
        this.f184221c |= Integer.MIN_VALUE;
        return this.f184220b.m74460a(this);
    }
}
