package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class qq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public PlayerState f191431a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f191432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vq2 f191433c;

    /* JADX INFO: renamed from: d */
    public int f191434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq2(vq2 vq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f191433c = vq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191432b = obj;
        this.f191434d |= Integer.MIN_VALUE;
        return this.f191433c.m86182b(this);
    }
}
