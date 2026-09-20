package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f265987a;

    /* JADX INFO: renamed from: b */
    public final bji f265988b;

    /* JADX INFO: renamed from: c */
    public final wg61 f265989c = new wg61(new ju3(this, 10));

    public xu3(boolean z, bji bjiVar) {
        this.f265987a = z;
        this.f265988b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92118a() {
        xu3 xu3Var = (xu3) this.f265989c.getValue();
        return xu3Var != null ? xu3Var.m92118a() : this.f265987a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_biography_page", "android-artist-creatorartist", m92118a()));
    }
}
