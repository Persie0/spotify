package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144714a;

    /* JADX INFO: renamed from: b */
    public int f144715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k2c f144716c;

    /* JADX INFO: renamed from: d */
    public Object f144717d;

    /* JADX INFO: renamed from: e */
    public int f144718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkz(k2c k2cVar, fbk fbkVar) {
        super(fbkVar);
        this.f144716c = k2cVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144714a = obj;
        this.f144715b |= Integer.MIN_VALUE;
        return this.f144716c.emit(null, this);
    }
}
