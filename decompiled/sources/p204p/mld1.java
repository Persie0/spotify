package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mld1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6q f144819b;

    /* JADX INFO: renamed from: c */
    public int f144820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mld1(r6q r6qVar, ibk ibkVar) {
        super(ibkVar);
        this.f144819b = r6qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144818a = obj;
        this.f144820c |= Integer.MIN_VALUE;
        return this.f144819b.m74869b(null, null, null, null, this);
    }
}
