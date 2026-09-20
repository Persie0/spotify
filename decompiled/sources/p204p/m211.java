package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m211 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139185a;

    /* JADX INFO: renamed from: b */
    public int f139186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n211 f139187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m211(n211 n211Var, ibk ibkVar) {
        super(ibkVar);
        this.f139187c = n211Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139185a = obj;
        this.f139186b |= Integer.MIN_VALUE;
        return this.f139187c.mo15629a(null, null, this);
    }
}
