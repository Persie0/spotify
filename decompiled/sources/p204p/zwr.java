package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zwr extends ibk {

    /* JADX INFO: renamed from: a */
    public ywr f287056a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f287057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ axr f287058c;

    /* JADX INFO: renamed from: d */
    public int f287059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwr(axr axrVar, fbk fbkVar) {
        super(fbkVar);
        this.f287058c = axrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287057b = obj;
        this.f287059d |= Integer.MIN_VALUE;
        return this.f287058c.m27427b(this);
    }
}
