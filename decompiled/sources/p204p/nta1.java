package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nta1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f158036a;

    /* JADX INFO: renamed from: b */
    public String f158037b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f158038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ota1 f158039d;

    /* JADX INFO: renamed from: e */
    public int f158040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nta1(ota1 ota1Var, ibk ibkVar) {
        super(ibkVar);
        this.f158039d = ota1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158038c = obj;
        this.f158040e |= Integer.MIN_VALUE;
        return this.f158039d.m67779m(null, this);
    }
}
