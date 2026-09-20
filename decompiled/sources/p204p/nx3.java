package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nx3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f159341a;

    /* JADX INFO: renamed from: b */
    public final int f159342b;

    /* JADX INFO: renamed from: c */
    public final int f159343c;

    /* JADX INFO: renamed from: d */
    public final int f159344d;

    /* JADX INFO: renamed from: e */
    public final bji f159345e;

    /* JADX INFO: renamed from: f */
    public final wg61 f159346f = new wg61(new ju3(this, 25));

    public nx3(boolean z, int i, int i2, int i3, bji bjiVar) {
        this.f159341a = z;
        this.f159342b = i;
        this.f159343c = i2;
        this.f159344d = i3;
        this.f159345e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65811a() {
        nx3 nx3Var = (nx3) this.f159346f.getValue();
        return nx3Var != null ? nx3Var.m65811a() : this.f159341a;
    }

    /* JADX INFO: renamed from: b */
    public final int m65812b() {
        nx3 nx3Var = (nx3) this.f159346f.getValue();
        return nx3Var != null ? nx3Var.m65812b() : this.f159342b;
    }

    /* JADX INFO: renamed from: c */
    public final int m65813c() {
        nx3 nx3Var = (nx3) this.f159346f.getValue();
        return nx3Var != null ? nx3Var.m65813c() : this.f159343c;
    }

    /* JADX INFO: renamed from: d */
    public final int m65814d() {
        nx3 nx3Var = (nx3) this.f159346f.getValue();
        return nx3Var != null ? nx3Var.m65814d() : this.f159344d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("ble_connect_device_reader_enabled", "android-ble-connect-device-reader", m65811a()), new k8a("ble_connect_device_reader_eviction_interval_millis", "android-ble-connect-device-reader", m65812b(), 0, 600000), new k8a("ble_connect_device_reader_inactivity_timeout_millis", "android-ble-connect-device-reader", m65813c(), 0, 600000), new k8a("ble_connect_device_reader_max_attempts", "android-ble-connect-device-reader", m65814d(), 0, 100000));
    }
}
