package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d6b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45640a;

    /* JADX INFO: renamed from: b */
    public int f45641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f45642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6b(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f45642c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45640a = obj;
        this.f45641b |= Integer.MIN_VALUE;
        return this.f45642c.emit(null, this);
    }
}
