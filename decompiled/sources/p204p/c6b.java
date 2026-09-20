package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c6b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34474a;

    /* JADX INFO: renamed from: b */
    public int f34475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f34476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6b(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f34476c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34474a = obj;
        this.f34475b |= Integer.MIN_VALUE;
        return this.f34476c.emit(null, this);
    }
}
