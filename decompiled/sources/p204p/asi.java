package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class asi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19459a;

    /* JADX INFO: renamed from: b */
    public int f19460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f19461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f19461c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19459a = obj;
        this.f19460b |= Integer.MIN_VALUE;
        return this.f19461c.emit(null, this);
    }
}
