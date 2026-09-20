package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f190350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml0 f190351b;

    /* JADX INFO: renamed from: c */
    public int f190352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f190351b = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190350a = obj;
        this.f190352c |= Integer.MIN_VALUE;
        return this.f190351b.m83460g(this);
    }
}
