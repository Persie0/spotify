package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y7v f248789b;

    /* JADX INFO: renamed from: c */
    public int f248790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7v(y7v y7vVar, fbk fbkVar) {
        super(fbkVar);
        this.f248789b = y7vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248788a = obj;
        this.f248790c |= Integer.MIN_VALUE;
        return this.f248789b.m93013h(this);
    }
}
