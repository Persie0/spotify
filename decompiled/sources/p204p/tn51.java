package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tn51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aye f221886b;

    /* JADX INFO: renamed from: c */
    public int f221887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn51(aye ayeVar, ibk ibkVar) {
        super(ibkVar);
        this.f221886b = ayeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221885a = obj;
        this.f221887c |= Integer.MIN_VALUE;
        return this.f221886b.mo27514a(null, this);
    }
}
