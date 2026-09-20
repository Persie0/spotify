package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class jy3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f117275a;

    /* JADX INFO: renamed from: b */
    public final bji f117276b;

    /* JADX INFO: renamed from: c */
    public final wg61 f117277c = new wg61(new ey3(this, 2));

    public jy3(boolean z, bji bjiVar) {
        this.f117275a = z;
        this.f117276b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m54774a() {
        jy3 jy3Var = (jy3) this.f117277c.getValue();
        return jy3Var != null ? jy3Var.m54774a() : this.f117275a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_facebook_messenger_text", "android-campaigns-wes", m54774a()));
    }
}
