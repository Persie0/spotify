package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w121 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x121 f246930b;

    /* JADX INFO: renamed from: c */
    public int f246931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w121(x121 x121Var, ibk ibkVar) {
        super(ibkVar);
        this.f246930b = x121Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246929a = obj;
        this.f246931c |= Integer.MIN_VALUE;
        return this.f246930b.m89619b(this);
    }
}
