package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class md4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f142305a;

    /* JADX INFO: renamed from: b */
    public final bji f142306b;

    /* JADX INFO: renamed from: c */
    public final wg61 f142307c = new wg61(new dd4(this, 6));

    public md4(int i, bji bjiVar) {
        this.f142305a = i;
        this.f142306b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m61507a() {
        md4 md4Var = (md4) this.f142307c.getValue();
        return md4Var != null ? md4Var.m61507a() : this.f142305a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("default_minimum_visible_chips_required", "android-list-ux-platform-chips-impl", m61507a(), 1, 5));
    }
}
