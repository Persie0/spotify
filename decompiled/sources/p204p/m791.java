package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m791 extends ibk {

    /* JADX INFO: renamed from: a */
    public qe70 f140744a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f140745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r791 f140746c;

    /* JADX INFO: renamed from: d */
    public int f140747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m791(r791 r791Var, ibk ibkVar) {
        super(ibkVar);
        this.f140746c = r791Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140745b = obj;
        this.f140747d |= Integer.MIN_VALUE;
        Object objM74893a = this.f140746c.m74893a(null, null, null, null, this);
        return objM74893a == yuk.f276404a ? objM74893a : new s6x0(objM74893a);
    }
}
