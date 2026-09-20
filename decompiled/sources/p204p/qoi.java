package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qoi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f190986a;

    /* JADX INFO: renamed from: b */
    public int f190987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f190988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f190988c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190986a = obj;
        this.f190987b |= Integer.MIN_VALUE;
        return this.f190988c.emit(null, this);
    }
}
