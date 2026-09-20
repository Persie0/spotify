package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vg21 extends ibk {

    /* JADX INFO: renamed from: a */
    public bh21 f241099a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f241100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bh21 f241101c;

    /* JADX INFO: renamed from: d */
    public int f241102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg21(bh21 bh21Var, ibk ibkVar) {
        super(ibkVar);
        this.f241101c = bh21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241100b = obj;
        this.f241102d |= Integer.MIN_VALUE;
        return this.f241101c.m29193e(this);
    }
}
