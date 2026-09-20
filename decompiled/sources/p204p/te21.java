package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class te21 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f219557a;

    /* JADX INFO: renamed from: b */
    public lsi0 f219558b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f219559c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ue21 f219560d;

    /* JADX INFO: renamed from: e */
    public int f219561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te21(ue21 ue21Var, ibk ibkVar) {
        super(ibkVar);
        this.f219560d = ue21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219559c = obj;
        this.f219561e |= Integer.MIN_VALUE;
        return this.f219560d.m82876c(0, this);
    }
}
