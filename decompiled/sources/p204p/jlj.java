package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jlj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113632a;

    /* JADX INFO: renamed from: b */
    public int f113633b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f113634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlj(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f113634c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113632a = obj;
        this.f113633b |= Integer.MIN_VALUE;
        return this.f113634c.emit(null, this);
    }
}
