package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jkb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113276a;

    /* JADX INFO: renamed from: b */
    public int f113277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mkb1 f113278c;

    /* JADX INFO: renamed from: d */
    public arr f113279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkb1(mkb1 mkb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f113278c = mkb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113276a = obj;
        this.f113277b |= Integer.MIN_VALUE;
        return this.f113278c.mo15629a(null, null, this);
    }
}
