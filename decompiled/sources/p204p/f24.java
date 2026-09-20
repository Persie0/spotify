package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f65102a;

    /* JADX INFO: renamed from: b */
    public final bji f65103b;

    /* JADX INFO: renamed from: c */
    public final wg61 f65104c;

    public f24(boolean z, bji bjiVar) {
        this.f65102a = z;
        this.f65103b = bjiVar;
        this.f65104c = new wg61(new u14(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40569a() {
        f24 f24Var = (f24) this.f65104c.getValue();
        return f24Var != null ? f24Var.m40569a() : this.f65102a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("settings_enabled", "android-devicelocation-consent-impl", m40569a()));
    }

    public f24(bji bjiVar) {
        this(false, bjiVar);
    }
}
