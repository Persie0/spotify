package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kil extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ suj f123007b;

    /* JADX INFO: renamed from: c */
    public int f123008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kil(suj sujVar, fbk fbkVar) {
        super(fbkVar);
        this.f123007b = sujVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123006a = obj;
        this.f123008c |= Integer.MIN_VALUE;
        return suj.m79389c(this.f123007b, null, this);
    }
}
