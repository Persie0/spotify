package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class b12 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f22181a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c12 f22183c;

    /* JADX INFO: renamed from: d */
    public int f22184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b12(c12 c12Var, ibk ibkVar) {
        super(ibkVar);
        this.f22183c = c12Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22182b = obj;
        this.f22184d |= Integer.MIN_VALUE;
        return this.f22183c.m31206a(null, this);
    }
}
