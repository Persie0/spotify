package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ja4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f110317a;

    /* JADX INFO: renamed from: b */
    public final bji f110318b;

    /* JADX INFO: renamed from: c */
    public final wg61 f110319c = new wg61(new ga4(this, 2));

    public ja4(boolean z, bji bjiVar) {
        this.f110317a = z;
        this.f110318b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52778a() {
        ja4 ja4Var = (ja4) this.f110319c.getValue();
        return ja4Var != null ? ja4Var.m52778a() : this.f110317a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("settings_entry_point_enabled", "android-libraryimport-settings-impl", m52778a()));
    }
}
