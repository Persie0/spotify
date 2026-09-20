package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g9u extends ibk {

    /* JADX INFO: renamed from: a */
    public int f77873a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f77874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i9u f77875c;

    /* JADX INFO: renamed from: d */
    public int f77876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9u(i9u i9uVar, ibk ibkVar) {
        super(ibkVar);
        this.f77875c = i9uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77874b = obj;
        this.f77876d |= Integer.MIN_VALUE;
        return this.f77875c.m49990a(0, this);
    }
}
