package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class my3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f148299a;

    /* JADX INFO: renamed from: b */
    public final bji f148300b;

    /* JADX INFO: renamed from: c */
    public final wg61 f148301c;

    public my3(boolean z, bji bjiVar) {
        this.f148299a = z;
        this.f148300b = bjiVar;
        this.f148301c = new wg61(new ey3(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63153a() {
        my3 my3Var = (my3) this.f148301c.getValue();
        return my3Var != null ? my3Var.m63153a() : this.f148299a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("keep_screen_awake_enabled", "android-car-mobile-car-feature-availability", m63153a()));
    }

    public my3(bji bjiVar) {
        this(true, bjiVar);
    }
}
