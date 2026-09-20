package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class url extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wrl f233398b;

    /* JADX INFO: renamed from: c */
    public int f233399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public url(wrl wrlVar, ibk ibkVar) {
        super(ibkVar);
        this.f233398b = wrlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233397a = obj;
        this.f233399c |= Integer.MIN_VALUE;
        return this.f233398b.m88866e(this);
    }
}
