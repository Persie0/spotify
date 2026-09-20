package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pvh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181751a;

    /* JADX INFO: renamed from: b */
    public int f181752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f181753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvh(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f181753c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181751a = obj;
        this.f181752b |= Integer.MIN_VALUE;
        return this.f181753c.emit(null, this);
    }
}
