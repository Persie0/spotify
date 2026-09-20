package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml0 f200589b;

    /* JADX INFO: renamed from: c */
    public int f200590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f200589b = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200588a = obj;
        this.f200590c |= Integer.MIN_VALUE;
        return this.f200589b.m83461h(this);
    }
}
