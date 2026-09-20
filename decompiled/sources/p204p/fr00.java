package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fr00 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f72317a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f72318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ir00 f72319c;

    /* JADX INFO: renamed from: d */
    public int f72320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr00(ir00 ir00Var, ibk ibkVar) {
        super(ibkVar);
        this.f72319c = ir00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72318b = obj;
        this.f72320d |= Integer.MIN_VALUE;
        return this.f72319c.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
