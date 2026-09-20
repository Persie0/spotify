package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class pl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f178625a;

    /* JADX INFO: renamed from: b */
    public final bji f178626b;

    /* JADX INFO: renamed from: c */
    public final wg61 f178627c = new wg61(new jk4(this, 8));

    public pl4(boolean z, bji bjiVar) {
        this.f178625a = z;
        this.f178626b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70253a() {
        pl4 pl4Var = (pl4) this.f178627c.getValue();
        return pl4Var != null ? pl4Var.m70253a() : this.f178625a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_visref_color_extraction", "android-playlist-artwork-cover-art-page", m70253a()));
    }
}
