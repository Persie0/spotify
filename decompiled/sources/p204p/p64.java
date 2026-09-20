package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174279a;

    /* JADX INFO: renamed from: b */
    public final bji f174280b;

    /* JADX INFO: renamed from: c */
    public final wg61 f174281c = new wg61(new o54(this, 22));

    public p64(boolean z, bji bjiVar) {
        this.f174279a = z;
        this.f174280b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69176a() {
        p64 p64Var = (p64) this.f174281c.getValue();
        return p64Var != null ? p64Var.m69176a() : this.f174279a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("related_content_recommendations_headings_enabled", "android-feature-related-content", m69176a()));
    }
}
