package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class elf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60694a;

    /* JADX INFO: renamed from: b */
    public int f60695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flf0 f60696c;

    /* JADX INFO: renamed from: d */
    public bqz0 f60697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elf0(flf0 flf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60696c = flf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60694a = obj;
        this.f60695b |= Integer.MIN_VALUE;
        return this.f60696c.mo15629a(null, null, this);
    }
}
