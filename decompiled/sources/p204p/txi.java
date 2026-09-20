package p204p;

import io.ably.lib.types.RecoveryKeyContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class txi extends b5x {

    /* JADX INFO: renamed from: c */
    public wzi f224707c = wzi.initialized;

    /* JADX INFO: renamed from: d */
    public String f224708d;

    /* JADX INFO: renamed from: e */
    public String f224709e;

    /* JADX INFO: renamed from: f */
    public final C2596y0 f224710f;

    /* JADX INFO: renamed from: g */
    public final vyi f224711g;

    public txi(C2596y0 c2596y0, C2632z c2632z, C1761d0 c1761d0) {
        this.f224710f = c2596y0;
        this.f224711g = new vyi(c2596y0, this, c2632z, c1761d0);
    }

    @Override // p204p.b5x
    /* JADX INFO: renamed from: a */
    public final void mo28213a(Object obj, Object obj2, Object[] objArr) {
        try {
            ((zzi) obj).mo31064a((yzi) objArr[0]);
        } catch (Throwable th) {
            tx8.m81890e("p.txi", "Unexpected exception calling ConnectionStateListener", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81921e() {
        wzi wziVar;
        String str = this.f224708d;
        if (str == null || str.isEmpty() || (wziVar = this.f224707c) == wzi.closing || wziVar == wzi.closed || wziVar == wzi.failed || wziVar == wzi.suspended) {
            return;
        }
        String str2 = this.f224708d;
        long j = this.f224711g.f246141s;
        C2596y0 c2596y0 = this.f224710f;
        c2596y0.getClass();
        HashMap map = new HashMap();
        for (mmc mmcVar : c2596y0.f267828t.f188382a.values()) {
            if (mmcVar.f28786e == znc.attached) {
                map.put(mmcVar.f28784c, mmcVar.f28788g.channelSerial);
            }
        }
        new RecoveryKeyContext(str2, j, map).encode();
    }
}
