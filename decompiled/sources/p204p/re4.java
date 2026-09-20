package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class re4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f198274a;

    /* JADX INFO: renamed from: b */
    public final bji f198275b;

    /* JADX INFO: renamed from: c */
    public final wg61 f198276c;

    public re4(boolean z, bji bjiVar) {
        this.f198274a = z;
        this.f198275b = bjiVar;
        this.f198276c = new wg61(new ne4(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75378a() {
        re4 re4Var = (re4) this.f198276c.getValue();
        return re4Var != null ? re4Var.m75378a() : this.f198274a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-list-ux-platform-consumers-standard-listcomponents-deletedbyowner", m75378a()));
    }

    public re4(bji bjiVar) {
        this(true, bjiVar);
    }
}
