package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bzk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vpj f32523b;

    /* JADX INFO: renamed from: c */
    public int f32524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzk(vpj vpjVar, ibk ibkVar) {
        super(ibkVar);
        this.f32523b = vpjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32522a = obj;
        this.f32524c |= Integer.MIN_VALUE;
        return this.f32523b.m86161e(null, this);
    }
}
