package p204p;

import com.spotify.connectivity.auth.NativeSession;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b301 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final Map f22758a;

    /* JADX INFO: renamed from: b */
    public final xtk f22759b;

    /* JADX INFO: renamed from: c */
    public final fke f22760c;

    /* JADX INFO: renamed from: d */
    public final wwi0 f22761d;

    /* JADX INFO: renamed from: e */
    public final mh7 f22762e;

    /* JADX INFO: renamed from: f */
    public NativeSession f22763f;

    /* JADX INFO: renamed from: g */
    public final wiy0 f22764g;

    public b301(Map map, xtk xtkVar, ztk ztkVar, fke fkeVar, wwi0 wwi0Var, mh7 mh7Var) {
        this.f22758a = map;
        this.f22759b = xtkVar;
        this.f22760c = fkeVar;
        this.f22761d = wwi0Var;
        this.f22762e = mh7Var;
        ((auk) xtkVar).f19950c.runBlocking(new zu3(this, 14));
        this.f22764g = new wiy0(izg1.m52006g(new SchedulingTransport(ztkVar.f286205a, m27981a().getInternalTransportToNative())), 6);
    }

    /* JADX INFO: renamed from: a */
    public final NativeSession m27981a() {
        NativeSession nativeSession = this.f22763f;
        if (nativeSession != null) {
            return nativeSession;
        }
        wj50.m88260d0("nativeSession");
        throw null;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        m27981a().blockingLogout();
        ((auk) this.f22759b).f19950c.runBlocking(new cjs0(this, 15));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
