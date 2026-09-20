package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hnc extends ibk {

    /* JADX INFO: renamed from: a */
    public fiz f93290a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f93291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ inc f93292c;

    /* JADX INFO: renamed from: d */
    public int f93293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnc(inc incVar, fbk fbkVar) {
        super(fbkVar);
        this.f93292c = incVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93291b = obj;
        this.f93293d |= Integer.MIN_VALUE;
        return this.f93292c.m51129b(null, this);
    }
}
