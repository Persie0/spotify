package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dki0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f49979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hki0 f49980b;

    /* JADX INFO: renamed from: c */
    public int f49981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dki0(hki0 hki0Var, ibk ibkVar) {
        super(ibkVar);
        this.f49980b = hki0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49979a = obj;
        this.f49981c |= Integer.MIN_VALUE;
        Object objM47845a = this.f49980b.m47845a(null, null, null, this);
        return objM47845a == yuk.f276404a ? objM47845a : new s6x0(objM47845a);
    }
}
