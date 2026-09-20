package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2420tm f122036b;

    /* JADX INFO: renamed from: c */
    public int f122037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf10(C2420tm c2420tm, ibk ibkVar) {
        super(ibkVar);
        this.f122036b = c2420tm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122035a = obj;
        this.f122037c |= Integer.MIN_VALUE;
        return this.f122036b.m81083c(this);
    }
}
