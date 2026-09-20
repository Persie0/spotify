package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;

/* JADX INFO: loaded from: classes5.dex */
public final class mz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public BrowseEffect.Load f148658a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f148659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pz90 f148660c;

    /* JADX INFO: renamed from: d */
    public int f148661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz90(pz90 pz90Var, ibk ibkVar) {
        super(ibkVar);
        this.f148660c = pz90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148659b = obj;
        this.f148661d |= Integer.MIN_VALUE;
        return this.f148660c.m71697a(null, this);
    }
}
