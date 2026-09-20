package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e4c extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56043a;

    /* JADX INFO: renamed from: b */
    public int f56044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f56045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4c(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f56045c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56043a = obj;
        this.f56044b |= Integer.MIN_VALUE;
        return this.f56045c.emit(null, this);
    }
}
