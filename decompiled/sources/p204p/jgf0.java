package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jgf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public n8l f112185a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f112186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kgf0 f112187c;

    /* JADX INFO: renamed from: d */
    public int f112188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgf0(kgf0 kgf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f112187c = kgf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112186b = obj;
        this.f112188d |= Integer.MIN_VALUE;
        return this.f112187c.mo27514a(null, this);
    }
}
