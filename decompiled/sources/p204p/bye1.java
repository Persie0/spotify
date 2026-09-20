package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bye1 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32182a;

    /* JADX INFO: renamed from: b */
    public final bji f32183b;

    /* JADX INFO: renamed from: c */
    public final wg61 f32184c = new wg61(new b4e1(this, 13));

    public bye1(boolean z, bji bjiVar) {
        this.f32182a = z;
        this.f32183b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30886a() {
        bye1 bye1Var = (bye1) this.f32184c.getValue();
        return bye1Var != null ? bye1Var.m30886a() : this.f32182a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("full_tree_move_structure", "yourlibrary-messaging-page", m30886a()));
    }
}
