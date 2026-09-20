package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ent0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61224a;

    /* JADX INFO: renamed from: b */
    public int f61225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fnt0 f61226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ent0(fnt0 fnt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f61226c = fnt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61224a = obj;
        this.f61225b |= Integer.MIN_VALUE;
        return this.f61226c.mo15629a(null, null, this);
    }
}
