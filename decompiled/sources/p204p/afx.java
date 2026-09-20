package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class afx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15238a;

    /* JADX INFO: renamed from: b */
    public int f15239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f15240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afx(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f15240c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15238a = obj;
        this.f15239b |= Integer.MIN_VALUE;
        return this.f15240c.emit(null, this);
    }
}
