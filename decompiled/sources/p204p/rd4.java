package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f198017a;

    /* JADX INFO: renamed from: b */
    public final bji f198018b;

    /* JADX INFO: renamed from: c */
    public final wg61 f198019c = new wg61(new dd4(this, 11));

    public rd4(boolean z, bji bjiVar) {
        this.f198017a = z;
        this.f198018b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75319a() {
        rd4 rd4Var = (rd4) this.f198019c.getValue();
        return rd4Var != null ? rd4Var.m75319a() : this.f198017a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("right_align_footer_actions", "android-list-ux-platform-consumers-audiobook-rows-audiobook", m75319a()));
    }
}
