package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class txj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f224716b;

    /* JADX INFO: renamed from: c */
    public int f224717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f224716b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224715a = obj;
        this.f224717c |= Integer.MIN_VALUE;
        return this.f224716b.m89314j(this);
    }
}
