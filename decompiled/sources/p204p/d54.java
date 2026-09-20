package p204p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f45322a;

    /* JADX INFO: renamed from: b */
    public final boolean f45323b;

    /* JADX INFO: renamed from: c */
    public final bji f45324c;

    /* JADX INFO: renamed from: d */
    public final wg61 f45325d = new wg61(new y34(this, 21));

    public d54(int i, bji bjiVar, boolean z) {
        this.f45322a = i;
        this.f45323b = z;
        this.f45324c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m34956a() {
        d54 d54Var = (d54) this.f45325d.getValue();
        return d54Var != null ? d54Var.m34956a() : this.f45322a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m34957b() {
        d54 d54Var = (d54) this.f45325d.getValue();
        return d54Var != null ? d54Var.m34957b() : this.f45323b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("announcement_cooldown_minutes", "android-feature-limited-experience-indicator", m34956a(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("exit_announcements_enabled", "android-feature-limited-experience-indicator", m34957b()));
    }
}
