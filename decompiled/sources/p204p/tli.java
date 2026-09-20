package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tli extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221476a;

    /* JADX INFO: renamed from: b */
    public int f221477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f221478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tli(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f221478c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221476a = obj;
        this.f221477b |= Integer.MIN_VALUE;
        return this.f221478c.emit(null, this);
    }
}
