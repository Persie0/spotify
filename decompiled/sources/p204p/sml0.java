package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public jml0 f210681a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f210682b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uml0 f210683c;

    /* JADX INFO: renamed from: d */
    public int f210684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f210683c = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210682b = obj;
        this.f210684d |= Integer.MIN_VALUE;
        return this.f210683c.m83462i(null, this);
    }
}
