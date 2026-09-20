package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class n941 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o941 f151705b;

    /* JADX INFO: renamed from: c */
    public int f151706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n941(o941 o941Var, ibk ibkVar) {
        super(ibkVar);
        this.f151705b = o941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151704a = obj;
        this.f151706c |= Integer.MIN_VALUE;
        return o941.m66445a(this.f151705b, null, this);
    }
}
