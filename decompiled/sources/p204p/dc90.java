package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public gc90 f47460a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gc90 f47462c;

    /* JADX INFO: renamed from: d */
    public int f47463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f47462c = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47461b = obj;
        this.f47463d |= Integer.MIN_VALUE;
        return this.f47462c.m44309i(null, this);
    }
}
