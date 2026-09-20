package p204p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: classes7.dex */
public final class bs30 extends vq30 {

    /* JADX INFO: renamed from: a */
    public String f30224a;

    /* JADX INFO: renamed from: b */
    public String f30225b;

    /* JADX INFO: renamed from: c */
    public vj30 f30226c;

    @Override // p204p.vq30
    /* JADX INFO: renamed from: a */
    public final vq30 mo30347a(wj30 wj30Var) {
        this.f30226c = this.f30226c.mo39768a(wj30Var);
        return this;
    }

    @Override // p204p.vq30
    /* JADX INFO: renamed from: b */
    public final ds30 mo30348b() {
        as30 as30Var = ds30.Companion;
        String str = this.f30224a;
        String str2 = this.f30225b;
        HubsImmutableComponentBundle hubsImmutableComponentBundleMo33703d = this.f30226c.mo33703d();
        as30Var.getClass();
        return as30.m27054a(str, str2, hubsImmutableComponentBundleMo33703d);
    }

    @Override // p204p.vq30
    /* JADX INFO: renamed from: c */
    public final vq30 mo30349c(String str) {
        this.f30225b = str;
        return this;
    }
}
