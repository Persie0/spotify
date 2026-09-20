package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s3p extends ibk {

    /* JADX INFO: renamed from: a */
    public vab f205310a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f205311b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yrb f205312c;

    /* JADX INFO: renamed from: d */
    public int f205313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3p(yrb yrbVar, fbk fbkVar) {
        super(fbkVar);
        this.f205312c = yrbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205311b = obj;
        this.f205313d |= Integer.MIN_VALUE;
        return this.f205312c.m94414b(null, this);
    }
}
