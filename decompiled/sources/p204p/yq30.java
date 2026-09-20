package p204p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class yq30 extends lj30 {

    /* JADX INFO: renamed from: a */
    public String f275132a;

    /* JADX INFO: renamed from: b */
    public vj30 f275133b;

    @Override // p204p.lj30
    /* JADX INFO: renamed from: a */
    public final lj30 mo59104a(String str, Serializable serializable) {
        this.f275133b = this.f275133b.mo33716q(str, serializable);
        return this;
    }

    @Override // p204p.lj30
    /* JADX INFO: renamed from: b */
    public final ar30 mo59105b() {
        xq30 xq30Var = ar30.Companion;
        String str = this.f275132a;
        HubsImmutableComponentBundle hubsImmutableComponentBundleMo33703d = this.f275133b.mo33703d();
        xq30Var.getClass();
        return xq30.m91813a(str, hubsImmutableComponentBundleMo33703d);
    }

    @Override // p204p.lj30
    /* JADX INFO: renamed from: c */
    public final lj30 mo59106c() {
        this.f275132a = "contextMenu";
        return this;
    }
}
