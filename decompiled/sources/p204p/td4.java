package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class td4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f219221a;

    /* JADX INFO: renamed from: b */
    public final bji f219222b;

    /* JADX INFO: renamed from: c */
    public final wg61 f219223c;

    public td4(boolean z, bji bjiVar) {
        this.f219221a = z;
        this.f219222b = bjiVar;
        this.f219223c = new wg61(new dd4(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80489a() {
        td4 td4Var = (td4) this.f219223c.getValue();
        return td4Var != null ? td4Var.m80489a() : this.f219221a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_release_row", "android-list-ux-platform-consumers-audiobook-rows-releaserow", m80489a()));
    }

    public td4(bji bjiVar) {
        this(false, bjiVar);
    }
}
