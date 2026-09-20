package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class grv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hrv0 f83840b;

    /* JADX INFO: renamed from: c */
    public int f83841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grv0(hrv0 hrv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f83840b = hrv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83839a = obj;
        this.f83841c |= Integer.MIN_VALUE;
        Object objM48409a = this.f83840b.m48409a(null, this);
        return objM48409a == yuk.f276404a ? objM48409a : new s6x0(objM48409a);
    }
}
