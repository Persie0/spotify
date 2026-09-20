package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class if90 extends ibk {

    /* JADX INFO: renamed from: a */
    public d850 f101731a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f101732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jf90 f101733c;

    /* JADX INFO: renamed from: d */
    public int f101734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if90(jf90 jf90Var, ibk ibkVar) {
        super(ibkVar);
        this.f101733c = jf90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101732b = obj;
        this.f101734d |= Integer.MIN_VALUE;
        return this.f101733c.m53161f(null, this);
    }
}
