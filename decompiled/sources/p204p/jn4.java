package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class jn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f114012a;

    /* JADX INFO: renamed from: b */
    public final bji f114013b;

    /* JADX INFO: renamed from: c */
    public final wg61 f114014c = new wg61(new cn4(this, 4));

    public jn4(boolean z, bji bjiVar) {
        this.f114012a = z;
        this.f114013b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m53806a() {
        jn4 jn4Var = (jn4) this.f114014c.getValue();
        return jn4Var != null ? jn4Var.m53806a() : this.f114012a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("unreported_consumption_enabled", "android-ratings-ratingsandreviews", m53806a()));
    }
}
