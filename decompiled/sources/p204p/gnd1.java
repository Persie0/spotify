package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gnd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f82694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hnd1 f82695b;

    /* JADX INFO: renamed from: c */
    public int f82696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnd1(hnd1 hnd1Var, ibk ibkVar) {
        super(ibkVar);
        this.f82695b = hnd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f82694a = obj;
        this.f82696c |= Integer.MIN_VALUE;
        Object objM48009a = hnd1.m48009a(this.f82695b, this);
        return objM48009a == yuk.f276404a ? objM48009a : new s6x0(objM48009a);
    }
}
