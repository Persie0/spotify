package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d640 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e640 f45572b;

    /* JADX INFO: renamed from: c */
    public int f45573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d640(e640 e640Var, ibk ibkVar) {
        super(ibkVar);
        this.f45572b = e640Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45571a = obj;
        this.f45573c |= Integer.MIN_VALUE;
        return this.f45572b.m37891n(null, this);
    }
}
