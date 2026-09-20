package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vz91 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f246419a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f246420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yz91 f246421c;

    /* JADX INFO: renamed from: d */
    public int f246422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz91(yz91 yz91Var, ibk ibkVar) {
        super(ibkVar);
        this.f246421c = yz91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246420b = obj;
        this.f246422d |= Integer.MIN_VALUE;
        return yz91.m94976a(this.f246421c, null, this);
    }
}
