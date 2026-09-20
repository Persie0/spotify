package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class kn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f124294a;

    /* JADX INFO: renamed from: b */
    public final bji f124295b;

    /* JADX INFO: renamed from: c */
    public final wg61 f124296c = new wg61(new cn4(this, 5));

    public kn4(boolean z, bji bjiVar) {
        this.f124294a = z;
        this.f124295b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56938a() {
        kn4 kn4Var = (kn4) this.f124296c.getValue();
        return kn4Var != null ? kn4Var.m56938a() : this.f124294a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("compose_ratings_page_enabled", "android-ratings-ratingsandreviewspage", m56938a()));
    }
}
