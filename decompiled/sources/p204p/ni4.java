package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ni4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f154171a;

    /* JADX INFO: renamed from: b */
    public final bji f154172b;

    /* JADX INFO: renamed from: c */
    public final wg61 f154173c;

    public ni4(boolean z, bji bjiVar) {
        this.f154171a = z;
        this.f154172b = bjiVar;
        this.f154173c = new wg61(new bh4(this, 26));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64552a() {
        ni4 ni4Var = (ni4) this.f154173c.getValue();
        return ni4Var != null ? ni4Var.m64552a() : this.f154171a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_video_first_standard_experience_enabled", "android-musicvideos-listvideofirst", m64552a()));
    }

    public ni4(bji bjiVar) {
        this(false, bjiVar);
    }
}
