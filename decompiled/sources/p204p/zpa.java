package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zpa extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqa f285032b;

    /* JADX INFO: renamed from: c */
    public int f285033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpa(bqa bqaVar, ibk ibkVar) {
        super(ibkVar);
        this.f285032b = bqaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285031a = obj;
        this.f285033c |= Integer.MIN_VALUE;
        Object objM30205M = bqa.m30205M(this.f285032b, this);
        return objM30205M == yuk.f276404a ? objM30205M : new unc(objM30205M);
    }
}
