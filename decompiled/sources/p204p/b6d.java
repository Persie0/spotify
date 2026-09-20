package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b6d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23937a;

    /* JADX INFO: renamed from: b */
    public int f23938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c6d f23939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6d(c6d c6dVar, ibk ibkVar) {
        super(ibkVar);
        this.f23939c = c6dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23937a = obj;
        this.f23938b |= Integer.MIN_VALUE;
        return this.f23939c.mo15629a(null, null, this);
    }
}
