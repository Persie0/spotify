package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jnu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lnu0 f114203b;

    /* JADX INFO: renamed from: c */
    public int f114204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnu0(lnu0 lnu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f114203b = lnu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114202a = obj;
        this.f114204c |= Integer.MIN_VALUE;
        return this.f114203b.m59509b(null, this, false);
    }
}
