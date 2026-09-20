package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ox3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f170842a;

    /* JADX INFO: renamed from: b */
    public final boolean f170843b;

    /* JADX INFO: renamed from: c */
    public final bji f170844c;

    /* JADX INFO: renamed from: d */
    public final wg61 f170845d = new wg61(new ju3(this, 26));

    public ox3(boolean z, boolean z2, bji bjiVar) {
        this.f170842a = z;
        this.f170843b = z2;
        this.f170844c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68193a() {
        ox3 ox3Var = (ox3) this.f170845d.getValue();
        return ox3Var != null ? ox3Var.m68193a() : this.f170842a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68194b() {
        ox3 ox3Var = (ox3) this.f170845d.getValue();
        return ox3Var != null ? ox3Var.m68194b() : this.f170843b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_overflow_area_bit_filter", "android-ble-scanning", m68193a()), new k8a("include_overflow_area_scan_filter", "android-ble-scanning", m68194b()));
    }
}
