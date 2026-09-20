package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t3o0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216809a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a9i0 f216810b;

    /* JADX INFO: renamed from: c */
    public int f216811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3o0(a9i0 a9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f216810b = a9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216809a = obj;
        this.f216811c |= Integer.MIN_VALUE;
        return this.f216810b.m25140v(null, null, this);
    }
}
