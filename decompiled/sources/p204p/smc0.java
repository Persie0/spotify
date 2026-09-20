package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class smc0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f210623a;

    /* JADX INFO: renamed from: b */
    public final bji f210624b;

    /* JADX INFO: renamed from: c */
    public final wg61 f210625c = new wg61(new vmb0(this, 19));

    public smc0(boolean z, bji bjiVar) {
        this.f210623a = z;
        this.f210624b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78520a() {
        smc0 smc0Var = (smc0) this.f210625c.getValue();
        return smc0Var != null ? smc0Var.m78520a() : this.f210623a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_show_esperanto_endpoint", "markasplayedpage", m78520a()));
    }
}
