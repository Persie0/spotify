package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t0s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f215972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u0s f215973b;

    /* JADX INFO: renamed from: c */
    public int f215974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0s(u0s u0sVar, ibk ibkVar) {
        super(ibkVar);
        this.f215973b = u0sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215972a = obj;
        this.f215974c |= Integer.MIN_VALUE;
        return this.f215973b.m82127a(this);
    }
}
