package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jqc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114876a;

    /* JADX INFO: renamed from: b */
    public int f114877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f114878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqc(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f114878c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114876a = obj;
        this.f114877b |= Integer.MIN_VALUE;
        return this.f114878c.emit(null, this);
    }
}
