package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class haw0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f89291a;

    /* JADX INFO: renamed from: b */
    public final bji f89292b;

    /* JADX INFO: renamed from: c */
    public final wg61 f89293c = new wg61(new f8w0(this, 3));

    public haw0(int i, w9w0 w9w0Var) {
        this.f89291a = i;
        this.f89292b = w9w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m46942a() {
        haw0 haw0Var = (haw0) this.f89293c.getValue();
        return haw0Var != null ? haw0Var.m46942a() : this.f89291a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("millis_to_defer", "remote-config-fetching", m46942a(), 0, 10000));
    }
}
