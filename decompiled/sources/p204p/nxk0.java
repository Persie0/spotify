package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nxk0 implements k330 {
    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        return Collections.singletonList(new ixk0(b250Var));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nxk0);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return t3x0.f216854d;
    }

    @Override // p204p.k330
    public final String getId() {
        return "offline-empty-banner";
    }

    public final int hashCode() {
        return 1975731030;
    }
}
