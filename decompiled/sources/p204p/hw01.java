package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hw01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jw01 f95832b;

    /* JADX INFO: renamed from: c */
    public int f95833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw01(jw01 jw01Var, ibk ibkVar) {
        super(ibkVar);
        this.f95832b = jw01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95831a = obj;
        this.f95833c |= Integer.MIN_VALUE;
        return this.f95832b.m54395a(this);
    }
}
