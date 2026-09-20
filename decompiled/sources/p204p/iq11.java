package p204p;

import com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class iq11 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f104603a;

    /* JADX INFO: renamed from: b */
    public a2s0 f104604b;

    /* JADX INFO: renamed from: c */
    public SetProfilePrivacyRequest.Builder f104605c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f104606d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jq11 f104607e;

    /* JADX INFO: renamed from: f */
    public int f104608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq11(jq11 jq11Var, ibk ibkVar) {
        super(ibkVar);
        this.f104607e = jq11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104606d = obj;
        this.f104608f |= Integer.MIN_VALUE;
        return this.f104607e.mo54020a(false, this);
    }
}
