package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f282790a;

    /* JADX INFO: renamed from: b */
    public final bji f282791b;

    /* JADX INFO: renamed from: c */
    public final wg61 f282792c;

    public zh4(boolean z, bji bjiVar) {
        this.f282790a = z;
        this.f282791b = bjiVar;
        this.f282792c = new wg61(new bh4(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96113a() {
        zh4 zh4Var = (zh4) this.f282792c.getValue();
        return zh4Var != null ? zh4Var.m96113a() : this.f282790a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_entrypoint_section", "android-music-guesser", m96113a()));
    }

    public zh4(bji bjiVar) {
        this(true, bjiVar);
    }
}
