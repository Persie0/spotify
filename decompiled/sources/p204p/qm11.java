package p204p;

import com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class qm11 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f190010a;

    /* JADX INFO: renamed from: b */
    public a2s0 f190011b;

    /* JADX INFO: renamed from: c */
    public SetProfilePrivacyRequest.Builder f190012c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f190013d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rm11 f190014e;

    /* JADX INFO: renamed from: f */
    public int f190015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm11(rm11 rm11Var, ibk ibkVar) {
        super(ibkVar);
        this.f190014e = rm11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190013d = obj;
        this.f190015f |= Integer.MIN_VALUE;
        return this.f190014e.mo54020a(false, this);
    }
}
