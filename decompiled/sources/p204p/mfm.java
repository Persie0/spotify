package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mfm implements k330 {

    /* JADX INFO: renamed from: a */
    public final t3x0 f143096a;

    public mfm(t3x0 t3x0Var) {
        this.f143096a = t3x0Var;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        return Collections.singletonList(new jfm(b250Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfm) && wj50.m88271j(this.f143096a, ((mfm) obj).f143096a);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f143096a;
    }

    @Override // p204p.k330
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return this.f143096a.hashCode() + (118662176 * 31);
    }
}
