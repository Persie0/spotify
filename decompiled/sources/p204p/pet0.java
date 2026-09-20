package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pet0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f176844a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f176845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ djs0 f176846c;

    /* JADX INFO: renamed from: d */
    public int f176847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pet0(djs0 djs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f176846c = djs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176845b = obj;
        this.f176847d |= Integer.MIN_VALUE;
        return this.f176846c.m36221i(null, null, this);
    }
}
