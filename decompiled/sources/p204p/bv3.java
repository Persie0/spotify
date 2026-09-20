package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f31263a;

    /* JADX INFO: renamed from: b */
    public final bji f31264b;

    /* JADX INFO: renamed from: c */
    public final wg61 f31265c = new wg61(new ju3(this, 12));

    public bv3(boolean z, bji bjiVar) {
        this.f31263a = z;
        this.f31264b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30582a() {
        bv3 bv3Var = (bv3) this.f31265c.getValue();
        return bv3Var != null ? bv3Var.m30582a() : this.f31263a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("fully_support_audiobooks", "android-assisted-curation-curation-handler-playlist", m30582a()));
    }
}
