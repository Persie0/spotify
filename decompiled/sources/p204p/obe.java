package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class obe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sbe f163627b;

    /* JADX INFO: renamed from: c */
    public int f163628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obe(sbe sbeVar, ibk ibkVar) {
        super(ibkVar);
        this.f163627b = sbeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163626a = obj;
        this.f163628c |= Integer.MIN_VALUE;
        return sbe.m77725c(this.f163627b, null, this);
    }
}
