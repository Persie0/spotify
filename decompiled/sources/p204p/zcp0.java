package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zcp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v0w f281558b;

    /* JADX INFO: renamed from: c */
    public int f281559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcp0(v0w v0wVar, ibk ibkVar) {
        super(ibkVar);
        this.f281558b = v0wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281557a = obj;
        this.f281559c |= Integer.MIN_VALUE;
        return this.f281558b.m84413b(null, this);
    }
}
