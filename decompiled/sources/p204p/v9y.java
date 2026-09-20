package p204p;

import kotlin.Metadata;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/v9y;", "Lp/ixh0;", "Lp/w9y;", "src_main_java_com_spotify_encore_tabs-tabs"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
final /* data */ class v9y extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final qly0 f239063a;

    /* JADX INFO: renamed from: b */
    public final float f239064b;

    /* JADX INFO: renamed from: c */
    public final long f239065c;

    public v9y(qly0 qly0Var, float f, long j) {
        this.f239063a = qly0Var;
        this.f239064b = f;
        this.f239065c = j;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        w9y w9yVar = new w9y();
        w9yVar.f249285M0 = this.f239063a;
        w9yVar.f249286N0 = this.f239064b;
        w9yVar.f249287O0 = this.f239065c;
        return w9yVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        w9y w9yVar = (w9y) exh0Var;
        w9yVar.f249285M0 = this.f239063a;
        w9yVar.f249286N0 = this.f239064b;
        w9yVar.f249287O0 = this.f239065c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9y)) {
            return false;
        }
        v9y v9yVar = (v9y) obj;
        if (!this.f239063a.equals(v9yVar.f239063a) || !ybs.m93301b(this.f239064b, v9yVar.f239064b)) {
            return false;
        }
        long j = v9yVar.f239065c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f239065c, j);
    }

    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(this.f239063a.hashCode() * 31, 31, this.f239064b);
        int i = n6f.f150872l;
        return Long.hashCode(this.f239065c) + iM8g;
    }
}
