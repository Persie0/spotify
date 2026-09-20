package p204p;

import com.spotify.adsdisplay.embeddedad.events.proto.EmbeddedNPVAdEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class mg8 {

    /* JADX INFO: renamed from: a */
    public final qre0 f143360a;

    public mg8(qre0 qre0Var) {
        this.f143360a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m61695a(String str, ro0 ro0Var) {
        k6u k6uVarM2814u = EmbeddedNPVAdEvent.m2814u();
        k6uVarM2814u.m55619t(str);
        k6uVarM2814u.m55615m(ro0Var.mo29280c());
        k6uVarM2814u.m55616q(ro0Var.mo29283j());
        k6uVarM2814u.m55620u(System.currentTimeMillis());
        this.f143360a.m73616a(k6uVarM2814u.build());
    }

    public mg8(xre xreVar, qre0 qre0Var) {
        this.f143360a = qre0Var;
    }
}
