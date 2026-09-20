package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bol0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final c9k f29203a;

    /* JADX INFO: renamed from: b */
    public final ll00 f29204b;

    /* JADX INFO: renamed from: c */
    public final List f29205c;

    public bol0(luk lukVar, i4t0 i4t0Var) {
        c9k c9kVarM56661c = kk40.m56661c(cct.m32296A(lukVar, new uuk("ObservationPlatformPublisher")));
        this.f29203a = c9kVarM56661c;
        ll00 ll00Var = new ll00(i4t0Var);
        this.f29204b = ll00Var;
        this.f29205c = bk5.m29582E0(new ll00[]{ll00Var, null});
        wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(tnk0.f221995a.mo75861a(), new qff0(this, null, 27)));
    }

    @Override // p204p.hgm
    public final void shutdown() {
        try {
            kk40.m56680v(this.f29203a, null);
        } catch (Exception unused) {
        }
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
