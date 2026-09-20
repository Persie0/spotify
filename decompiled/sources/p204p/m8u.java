package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m8u extends ibk {

    /* JADX INFO: renamed from: a */
    public int f141127a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f141128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q8u f141129c;

    /* JADX INFO: renamed from: d */
    public int f141130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8u(q8u q8uVar, ibk ibkVar) {
        super(ibkVar);
        this.f141129c = q8uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141128b = obj;
        this.f141130d |= Integer.MIN_VALUE;
        return this.f141129c.m72341b(this);
    }
}
