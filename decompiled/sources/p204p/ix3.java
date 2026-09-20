package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ix3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f106582a;

    /* JADX INFO: renamed from: b */
    public final bji f106583b;

    /* JADX INFO: renamed from: c */
    public final wg61 f106584c = new wg61(new ju3(this, 22));

    public ix3(boolean z, bji bjiVar) {
        this.f106582a = z;
        this.f106583b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51851a() {
        ix3 ix3Var = (ix3) this.f106584c.getValue();
        return ix3Var != null ? ix3Var.m51851a() : this.f106582a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_unified_language_picker", "android-betamax-audio-language-page-impl", m51851a()));
    }
}
