package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205341a;

    /* JADX INFO: renamed from: b */
    public int f205342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t3u f205343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3u(t3u t3uVar, ibk ibkVar) {
        super(ibkVar);
        this.f205343c = t3uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205341a = obj;
        this.f205342b |= Integer.MIN_VALUE;
        return this.f205343c.mo15629a(null, null, this);
    }
}
