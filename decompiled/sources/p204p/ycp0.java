package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ycp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v0w f271542b;

    /* JADX INFO: renamed from: c */
    public int f271543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycp0(v0w v0wVar, ibk ibkVar) {
        super(ibkVar);
        this.f271542b = v0wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271541a = obj;
        this.f271543c |= Integer.MIN_VALUE;
        return this.f271542b.m84412a(0, null, this);
    }
}
