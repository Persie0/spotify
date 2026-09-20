package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f239602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f239603b;

    /* JADX INFO: renamed from: c */
    public int f239604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f239603b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239602a = obj;
        this.f239604c |= Integer.MIN_VALUE;
        return this.f239603b.m95890h(null, this);
    }
}
