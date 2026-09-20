package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d0y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r160 f44105b;

    /* JADX INFO: renamed from: c */
    public int f44106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0y0(r160 r160Var, ibk ibkVar) {
        super(ibkVar);
        this.f44105b = r160Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44104a = obj;
        this.f44106c |= Integer.MIN_VALUE;
        return this.f44105b.m74460a(this);
    }
}
