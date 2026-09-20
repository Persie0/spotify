package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class un4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f232057a;

    /* JADX INFO: renamed from: b */
    public final bji f232058b;

    /* JADX INFO: renamed from: c */
    public final wg61 f232059c;

    public un4(boolean z, bji bjiVar) {
        this.f232057a = z;
        this.f232058b = bjiVar;
        this.f232059c = new wg61(new cn4(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83512a() {
        un4 un4Var = (un4) this.f232059c.getValue();
        return un4Var != null ? un4Var.m83512a() : this.f232057a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-referrals-jam", m83512a()));
    }

    public un4(bji bjiVar) {
        this(false, bjiVar);
    }
}
