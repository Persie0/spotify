package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f207415a;

    /* JADX INFO: renamed from: b */
    public int f207416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yrb f207417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbc(yrb yrbVar, fbk fbkVar) {
        super(fbkVar);
        this.f207417c = yrbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207415a = obj;
        this.f207416b |= Integer.MIN_VALUE;
        return this.f207417c.emit(null, this);
    }
}
