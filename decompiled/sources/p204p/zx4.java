package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zx4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ by4 f287201b;

    /* JADX INFO: renamed from: c */
    public int f287202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx4(by4 by4Var, fbk fbkVar) {
        super(fbkVar);
        this.f287201b = by4Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287200a = obj;
        this.f287202c |= Integer.MIN_VALUE;
        return this.f287201b.m30865H1(this);
    }
}
