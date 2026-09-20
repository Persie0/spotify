package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class td80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud80 f219262b;

    /* JADX INFO: renamed from: c */
    public int f219263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td80(ud80 ud80Var, ibk ibkVar) {
        super(ibkVar);
        this.f219262b = ud80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219261a = obj;
        this.f219263c |= Integer.MIN_VALUE;
        return this.f219262b.m82847h(null, this);
    }
}
