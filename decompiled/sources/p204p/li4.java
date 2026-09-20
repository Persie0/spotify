package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class li4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f133715a;

    /* JADX INFO: renamed from: b */
    public final boolean f133716b;

    /* JADX INFO: renamed from: c */
    public final bji f133717c;

    /* JADX INFO: renamed from: d */
    public final wg61 f133718d = new wg61(new bh4(this, 24));

    public li4(int i, bji bjiVar, boolean z) {
        this.f133715a = i;
        this.f133716b = z;
        this.f133717c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m59024a() {
        li4 li4Var = (li4) this.f133718d.getValue();
        return li4Var != null ? li4Var.m59024a() : this.f133715a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m59025b() {
        li4 li4Var = (li4) this.f133718d.getValue();
        return li4Var != null ? li4Var.m59025b() : this.f133716b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("max_same_intent_handle_count_threshold", "android-musicappplatform-navigation", m59024a(), 0, 200), new k8a("use_cloned_intent_for_routing_and_handling", "android-musicappplatform-navigation", m59025b()));
    }
}
