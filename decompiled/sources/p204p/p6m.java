package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class p6m implements x5m {

    /* JADX INFO: renamed from: a */
    public final String f174430a;

    /* JADX INFO: renamed from: b */
    public final bqt f174431b;

    /* JADX INFO: renamed from: c */
    public final luk f174432c;

    /* JADX INFO: renamed from: d */
    public final luk f174433d;

    /* JADX INFO: renamed from: e */
    public MobiusLoop f174434e;

    /* JADX INFO: renamed from: f */
    public final wg61 f174435f;

    public p6m(hc80 hc80Var, String str, bqt bqtVar, luk lukVar, luk lukVar2) {
        this.f174430a = str;
        this.f174431b = bqtVar;
        this.f174432c = lukVar;
        this.f174433d = lukVar2;
        hc80Var.getLifecycle().mo31986a(new l6m(this));
        this.f174435f = new wg61(new yfk(this, 23));
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: a */
    public final void mo28300a(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set set2 = dd41.f47702f;
            String strM35694A = r46.m74726U(str).m35694A();
            if (strM35694A != null) {
                arrayList.add(strM35694A);
            }
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        if (setM43736n1.isEmpty()) {
            return;
        }
        MobiusLoop mobiusLoop = this.f174434e;
        if (mobiusLoop != null) {
            mobiusLoop.m15600a(new np10(setM43736n1));
        } else {
            na6.m63957e("Trying to set items of interest in CurationStateApiService before the service is started or after it's been stopped");
        }
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: c */
    public final v5m mo28301c() {
        return (v5m) this.f174435f.getValue();
    }

    @Override // p204p.x5m
    public final void start() {
        this.f174434e = Mobius.m15582d(ata0.f19628c, this.f174431b.m30278a(null, new ew4(this.f174430a, null, 1))).mo15592d(new rc9(this, 22)).mo15590b(new f0m(this, 1)).mo15595g(w6m.f248423a);
    }

    @Override // p204p.x5m
    public final void stop() {
        MobiusLoop mobiusLoop = this.f174434e;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            na6.m63957e("Trying to stop CurationStateApiService before the service is started or after it's been stopped");
        }
        this.f174434e = null;
    }
}
