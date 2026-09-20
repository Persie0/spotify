package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f190466a;

    /* JADX INFO: renamed from: b */
    public final bji f190467b;

    /* JADX INFO: renamed from: c */
    public final wg61 f190468c;

    public qn4(boolean z, bji bjiVar) {
        this.f190466a = z;
        this.f190467b = bjiVar;
        this.f190468c = new wg61(new cn4(this, 9));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73312a() {
        qn4 qn4Var = (qn4) this.f190468c.getValue();
        return qn4Var != null ? qn4Var.m73312a() : this.f190466a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("button_highlight_border_enabled", "android-recaps", m73312a()));
    }

    public qn4(bji bjiVar) {
        this(false, bjiVar);
    }
}
