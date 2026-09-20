package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18849a;

    /* JADX INFO: renamed from: b */
    public int f18850b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f18851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqw(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f18851c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18849a = obj;
        this.f18850b |= Integer.MIN_VALUE;
        return this.f18851c.emit(null, this);
    }
}
