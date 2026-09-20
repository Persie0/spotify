package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c7c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public k6c0 f34846a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f34847b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7c0 f34848c;

    /* JADX INFO: renamed from: d */
    public int f34849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7c0(f7c0 f7c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f34848c = f7c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34847b = obj;
        this.f34849d |= Integer.MIN_VALUE;
        return f7c0.m40963c(this.f34848c, null, this);
    }
}
