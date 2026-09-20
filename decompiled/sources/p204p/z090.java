package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f278033a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f278034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b190 f278035c;

    /* JADX INFO: renamed from: d */
    public int f278036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z090(b190 b190Var, ibk ibkVar) {
        super(ibkVar);
        this.f278035c = b190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278034b = obj;
        this.f278036d |= Integer.MIN_VALUE;
        Object objM27899a = this.f278035c.m27899a(null, null, this);
        return objM27899a == yuk.f276404a ? objM27899a : new s6x0(objM27899a);
    }
}
