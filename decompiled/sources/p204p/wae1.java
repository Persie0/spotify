package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wae1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f249461a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f249462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b190 f249463c;

    /* JADX INFO: renamed from: d */
    public int f249464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wae1(b190 b190Var, ibk ibkVar) {
        super(ibkVar);
        this.f249463c = b190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249462b = obj;
        this.f249464d |= Integer.MIN_VALUE;
        Object objM27899a = this.f249463c.m27899a(null, null, this);
        return objM27899a == yuk.f276404a ? objM27899a : new s6x0(objM27899a);
    }
}
