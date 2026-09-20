package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pib extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177880a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rib f177881b;

    /* JADX INFO: renamed from: c */
    public int f177882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pib(rib ribVar, ibk ibkVar) {
        super(ibkVar);
        this.f177881b = ribVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177880a = obj;
        this.f177882c |= Integer.MIN_VALUE;
        return this.f177881b.m75585e(this);
    }
}
