package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174061a;

    /* JADX INFO: renamed from: b */
    public final bji f174062b;

    /* JADX INFO: renamed from: c */
    public final wg61 f174063c = new wg61(new o54(this, 0));

    public p54(boolean z, bji bjiVar) {
        this.f174061a = z;
        this.f174062b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69162a() {
        p54 p54Var = (p54) this.f174063c.getValue();
        return p54Var != null ? p54Var.m69162a() : this.f174061a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("continue_listening_section_enabled", "android-feature-new-episodes", m69162a()));
    }
}
