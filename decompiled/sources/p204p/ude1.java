package p204p;

import com.spotify.wrapped.p194v1.proto.ShareAssetResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class ude1 extends ibk {

    /* JADX INFO: renamed from: a */
    public ShareAssetResponse f229237a;

    /* JADX INFO: renamed from: b */
    public String f229238b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f229239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vde1 f229240d;

    /* JADX INFO: renamed from: e */
    public int f229241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ude1(vde1 vde1Var, ibk ibkVar) {
        super(ibkVar);
        this.f229240d = vde1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229239c = obj;
        this.f229241e |= Integer.MIN_VALUE;
        return this.f229240d.m85225b(null, null, null, this);
    }
}
