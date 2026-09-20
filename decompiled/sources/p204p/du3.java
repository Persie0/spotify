package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class du3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f52954a;

    /* JADX INFO: renamed from: b */
    public final fnk0 f52955b;

    /* JADX INFO: renamed from: c */
    public final bji f52956c;

    /* JADX INFO: renamed from: d */
    public final wg61 f52957d;

    /* JADX INFO: renamed from: e */
    public final wg61 f52958e;

    public du3(boolean z, fnk0 fnk0Var, bji bjiVar) {
        this.f52954a = z;
        this.f52955b = fnk0Var;
        this.f52956c = bjiVar;
        this.f52957d = new wg61(new bu3(this, 1));
        this.f52958e = new wg61(new bu3(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public static du3 m36889b(uys0 uys0Var) {
        return new du3(uys0Var.mo47707c("android-address:show_address_settings_item", false), null, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36890a() {
        du3 du3Var = (du3) this.f52958e.getValue();
        return du3Var != null ? du3Var.m36890a() : this.f52954a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("show_address_settings_item", "android-address", m36890a()));
    }

    public du3(fnk0 fnk0Var, bji bjiVar) {
        this(false, fnk0Var, bjiVar);
    }
}
