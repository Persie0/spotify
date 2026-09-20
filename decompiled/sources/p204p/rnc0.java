package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rnc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ia70 f200887a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f200888b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ia70 f200889c;

    /* JADX INFO: renamed from: d */
    public int f200890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnc0(ia70 ia70Var, ibk ibkVar) {
        super(ibkVar);
        this.f200889c = ia70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200888b = obj;
        this.f200890d |= Integer.MIN_VALUE;
        return this.f200889c.m50042n(null, this);
    }
}
