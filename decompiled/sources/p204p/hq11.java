package p204p;

import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class hq11 extends ibk {

    /* JADX INFO: renamed from: a */
    public a2s0 f93984a;

    /* JADX INFO: renamed from: b */
    public GetProfilePrivacyRequest.Builder f93985b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f93986c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jq11 f93987d;

    /* JADX INFO: renamed from: e */
    public int f93988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq11(jq11 jq11Var, ibk ibkVar) {
        super(ibkVar);
        this.f93987d = jq11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93986c = obj;
        this.f93988e |= Integer.MIN_VALUE;
        return this.f93987d.mo54021b(this);
    }
}
