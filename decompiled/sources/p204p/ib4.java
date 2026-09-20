package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ib4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100429a;

    /* JADX INFO: renamed from: b */
    public final bji f100430b;

    /* JADX INFO: renamed from: c */
    public final wg61 f100431c = new wg61(new f30(this, 17));

    public ib4(boolean z, bji bjiVar) {
        this.f100429a = z;
        this.f100430b = bjiVar;
    }

    /* JADX INFO: renamed from: c */
    public static ib4 m50119c(uys0 uys0Var) {
        return new ib4(uys0Var.mo47707c("android-libs-hugs:apply_content_area_padding", false), null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50120b() {
        ib4 ib4Var = (ib4) this.f100431c.getValue();
        return ib4Var != null ? ib4Var.m50120b() : this.f100429a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("apply_content_area_padding", "android-libs-hugs", m50120b()));
    }
}
