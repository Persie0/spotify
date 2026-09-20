package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pid extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177920a;

    /* JADX INFO: renamed from: b */
    public int f177921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f177922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pid(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f177922c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177920a = obj;
        this.f177921b |= Integer.MIN_VALUE;
        return this.f177922c.emit(null, this);
    }
}
