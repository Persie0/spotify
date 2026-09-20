package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class grt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83825a;

    /* JADX INFO: renamed from: b */
    public int f83826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hrt f83827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grt(hrt hrtVar, ibk ibkVar) {
        super(ibkVar);
        this.f83827c = hrtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83825a = obj;
        this.f83826b |= Integer.MIN_VALUE;
        return this.f83827c.mo15629a(null, null, this);
    }
}
