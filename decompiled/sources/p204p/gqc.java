package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gqc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83431a;

    /* JADX INFO: renamed from: b */
    public int f83432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f83433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f83433c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83431a = obj;
        this.f83432b |= Integer.MIN_VALUE;
        return this.f83433c.emit(null, this);
    }
}
