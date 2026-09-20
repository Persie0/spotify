package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class as0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f19269a;

    /* JADX INFO: renamed from: b */
    public fh0 f19270b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19271c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ es0 f19272d;

    /* JADX INFO: renamed from: e */
    public int f19273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(es0 es0Var, ibk ibkVar) {
        super(ibkVar);
        this.f19272d = es0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19271c = obj;
        this.f19273e |= Integer.MIN_VALUE;
        return this.f19272d.m39851a(null, this);
    }
}
