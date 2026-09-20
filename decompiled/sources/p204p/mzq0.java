package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mzq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public amf0 f148762a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f148763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pzq0 f148764c;

    /* JADX INFO: renamed from: d */
    public int f148765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzq0(pzq0 pzq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f148764c = pzq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148763b = obj;
        this.f148765d |= Integer.MIN_VALUE;
        return this.f148764c.m71760a(null, this);
    }
}
