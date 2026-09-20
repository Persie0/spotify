package p204p;

import com.spotify.music.instrumentation.events.proto.AppFocusStateNonAuth;

/* JADX INFO: loaded from: classes10.dex */
public final class x95 implements npz {

    /* JADX INFO: renamed from: a */
    public final qre0 f259275a;

    /* JADX INFO: renamed from: b */
    public boolean f259276b;

    /* JADX INFO: renamed from: c */
    public boolean f259277c;

    public x95(xre xreVar, qre0 qre0Var, wu91 wu91Var) {
        this.f259275a = qre0Var;
    }

    @Override // p204p.npz
    /* JADX INFO: renamed from: a */
    public final void mo65372a() {
        m90238b("foreground");
        this.f259276b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m90238b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        y95 y95VarM15717p = AppFocusStateNonAuth.m15717p();
        y95VarM15717p.m93146m(str);
        y95VarM15717p.m93147q(jCurrentTimeMillis);
        this.f259275a.m73616a(y95VarM15717p.build());
    }

    @Override // p204p.npz
    /* JADX INFO: renamed from: c */
    public final void mo65373c() {
        m90238b(this.f259277c ? "background-playing" : "suspended");
        this.f259276b = false;
    }
}
