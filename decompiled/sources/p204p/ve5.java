package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ve5 extends ibk {

    /* JADX INFO: renamed from: a */
    public re5 f240618a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f240619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ we5 f240620c;

    /* JADX INFO: renamed from: d */
    public int f240621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve5(we5 we5Var, ibk ibkVar) {
        super(ibkVar);
        this.f240620c = we5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240619b = obj;
        this.f240621d |= Integer.MIN_VALUE;
        return this.f240620c.m87863h(this);
    }
}
