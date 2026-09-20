package p204p;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zwi0 {

    /* JADX INFO: renamed from: a */
    public TreeSet f286994a;

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0007, B:20:0x0029, B:22:0x002d, B:24:0x0033, B:11:0x0010, B:19:0x0027, B:18:0x0024, B:15:0x001e), top: B:31:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m97131a(boolean z) {
        axi0 axi0Var;
        TreeSet treeSetM27423f;
        if (z) {
            axi0Var = axi0.f20875a;
            treeSetM27423f = null;
            if (!p2l.f173365a.contains(axi0.class)) {
                treeSetM27423f = axi0Var.m27423f(this);
            }
            this.f286994a = treeSetM27423f;
        } else {
            try {
                TreeSet treeSet = this.f286994a;
                if (treeSet == null || treeSet.isEmpty()) {
                    axi0Var = axi0.f20875a;
                    treeSetM27423f = null;
                    if (!p2l.f173365a.contains(axi0.class)) {
                        try {
                            treeSetM27423f = axi0Var.m27423f(this);
                        } catch (Throwable th) {
                            p2l.m68953a(axi0.class, th);
                        }
                    }
                    this.f286994a = treeSetM27423f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TreeSet treeSet2 = this.f286994a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            mo94802e();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo92288b();

    /* JADX INFO: renamed from: c */
    public abstract String mo92289c();

    /* JADX INFO: renamed from: d */
    public String mo92290d() {
        return "id_token,token,signed_request,graph_domain";
    }

    /* JADX INFO: renamed from: e */
    public void mo94802e() {
    }
}
