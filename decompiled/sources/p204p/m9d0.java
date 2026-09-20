package p204p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: classes8.dex */
public final class m9d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public UbiSpecificationId f141275a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f141276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n9d0 f141277c;

    /* JADX INFO: renamed from: d */
    public int f141278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9d0(n9d0 n9d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f141277c = n9d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141276b = obj;
        this.f141278d |= Integer.MIN_VALUE;
        return this.f141277c.mo38243a(null, this);
    }
}
