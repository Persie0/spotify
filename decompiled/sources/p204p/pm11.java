package p204p;

import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class pm11 extends ibk {

    /* JADX INFO: renamed from: a */
    public a2s0 f178860a;

    /* JADX INFO: renamed from: b */
    public GetProfilePrivacyRequest.Builder f178861b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f178862c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rm11 f178863d;

    /* JADX INFO: renamed from: e */
    public int f178864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm11(rm11 rm11Var, ibk ibkVar) {
        super(ibkVar);
        this.f178863d = rm11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178862c = obj;
        this.f178864e |= Integer.MIN_VALUE;
        return this.f178863d.mo54021b(this);
    }
}
