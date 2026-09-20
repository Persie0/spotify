package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cqc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40823a;

    /* JADX INFO: renamed from: b */
    public int f40824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f40825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f40825c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40823a = obj;
        this.f40824b |= Integer.MIN_VALUE;
        return this.f40825c.emit(null, this);
    }
}
