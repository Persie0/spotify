package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class s7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y7v f206480b;

    /* JADX INFO: renamed from: c */
    public int f206481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7v(y7v y7vVar, fbk fbkVar) {
        super(fbkVar);
        this.f206480b = y7vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206479a = obj;
        this.f206481c |= Integer.MIN_VALUE;
        return this.f206480b.m93008c(this);
    }
}
