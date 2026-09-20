package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ek10 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f60332a;

    /* JADX INFO: renamed from: b */
    public vn80 f60333b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60334c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fk10 f60335d;

    /* JADX INFO: renamed from: e */
    public int f60336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek10(fk10 fk10Var, ibk ibkVar) {
        super(ibkVar);
        this.f60335d = fk10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60334c = obj;
        this.f60336e |= Integer.MIN_VALUE;
        return fk10.m41864a(this.f60335d, false, this);
    }
}
