package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tdy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ udy f219527b;

    /* JADX INFO: renamed from: c */
    public int f219528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdy(udy udyVar, ibk ibkVar) {
        super(ibkVar);
        this.f219527b = udyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219526a = obj;
        this.f219528c |= Integer.MIN_VALUE;
        return this.f219527b.m82873b(null, this);
    }
}
