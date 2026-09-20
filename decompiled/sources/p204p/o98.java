package p204p;

import com.spotify.pamviewservice.p119v1.proto.PremiumPlanRow;

/* JADX INFO: loaded from: classes9.dex */
public final class o98 extends ibk {

    /* JADX INFO: renamed from: a */
    public PremiumPlanRow f162956a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f162957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p98 f162958c;

    /* JADX INFO: renamed from: d */
    public int f162959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o98(p98 p98Var, fbk fbkVar) {
        super(fbkVar);
        this.f162958c = p98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162957b = obj;
        this.f162959d |= Integer.MIN_VALUE;
        return this.f162958c.m69364b(null, this);
    }
}
