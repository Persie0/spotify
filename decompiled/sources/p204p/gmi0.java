package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gmi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ imi0 f81411b;

    /* JADX INFO: renamed from: c */
    public int f81412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmi0(imi0 imi0Var, ibk ibkVar) {
        super(ibkVar);
        this.f81411b = imi0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81410a = obj;
        this.f81412c |= Integer.MIN_VALUE;
        return this.f81411b.m51098d(null, this);
    }
}
