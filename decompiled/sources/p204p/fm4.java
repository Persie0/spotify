package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f70942a;

    /* JADX INFO: renamed from: b */
    public final bji f70943b;

    /* JADX INFO: renamed from: c */
    public final wg61 f70944c = new wg61(new jk4(this, 20));

    public fm4(int i, bji bjiVar) {
        this.f70942a = i;
        this.f70943b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m42051a() {
        fm4 fm4Var = (fm4) this.f70944c.getValue();
        return fm4Var != null ? fm4Var.m42051a() : this.f70942a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("show_auto_download_tooltip_max_count", "android-podcastexperience-autodownloadtooltipimpl", m42051a(), 0, 100000));
    }
}
