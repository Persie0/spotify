package p204p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: classes2.dex */
public final class f1a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Effect.LoadHomeStructure f64833a;

    /* JADX INFO: renamed from: b */
    public Throwable f64834b;

    /* JADX INFO: renamed from: c */
    public kaa0 f64835c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f64836d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l1a0 f64837e;

    /* JADX INFO: renamed from: f */
    public int f64838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1a0(l1a0 l1a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f64837e = l1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64836d = obj;
        this.f64838f |= Integer.MIN_VALUE;
        return l1a0.m57867b(this.f64837e, null, this);
    }
}
