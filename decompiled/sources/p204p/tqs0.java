package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wqs0 f222880b;

    /* JADX INFO: renamed from: c */
    public int f222881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqs0(wqs0 wqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f222880b = wqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222879a = obj;
        this.f222881c |= Integer.MIN_VALUE;
        return this.f222880b.mo27514a(null, this);
    }
}
