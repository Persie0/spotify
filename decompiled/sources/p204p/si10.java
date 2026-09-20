package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class si10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui10 f209311b;

    /* JADX INFO: renamed from: c */
    public int f209312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si10(ui10 ui10Var, ibk ibkVar) {
        super(ibkVar);
        this.f209311b = ui10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209310a = obj;
        this.f209312c |= Integer.MIN_VALUE;
        Object objM83173c = this.f209311b.m83173c(this);
        return objM83173c == yuk.f276404a ? objM83173c : new s6x0(objM83173c);
    }
}
