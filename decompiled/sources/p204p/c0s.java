package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c0s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fei f32853b;

    /* JADX INFO: renamed from: c */
    public int f32854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0s(fei feiVar, fbk fbkVar) {
        super(fbkVar);
        this.f32853b = feiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32852a = obj;
        this.f32854c |= Integer.MIN_VALUE;
        return this.f32853b.m41450e(this);
    }
}
