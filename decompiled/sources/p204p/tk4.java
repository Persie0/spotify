package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tk4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f221081a;

    /* JADX INFO: renamed from: b */
    public final bji f221082b;

    /* JADX INFO: renamed from: c */
    public final wg61 f221083c = new wg61(new jk4(this, 1));

    public tk4(boolean z, bji bjiVar) {
        this.f221081a = z;
        this.f221082b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80998a() {
        tk4 tk4Var = (tk4) this.f221083c.getValue();
        return tk4Var != null ? tk4Var.m80998a() : this.f221081a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("google_assistant_nudge_use_cmp", "android-partner-account-linking-google-assistant-nudges", m80998a()));
    }
}
