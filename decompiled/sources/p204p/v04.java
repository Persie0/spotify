package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f235904a;

    /* JADX INFO: renamed from: b */
    public final bji f235905b;

    /* JADX INFO: renamed from: c */
    public final wg61 f235906c = new wg61(new ey3(this, 22));

    public v04(boolean z, bji bjiVar) {
        this.f235904a = z;
        this.f235905b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84367a() {
        v04 v04Var = (v04) this.f235906c.getValue();
        return v04Var != null ? v04Var.m84367a() : this.f235904a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-creative-work-encore-dialogs", m84367a()));
    }
}
