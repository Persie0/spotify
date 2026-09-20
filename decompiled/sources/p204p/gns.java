package p204p;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gns implements ens {

    /* JADX INFO: renamed from: a */
    public static final fns f82774a = new fns(new gns(), false);

    /* JADX INFO: renamed from: b */
    public static final Set f82775b = Collections.singleton(cns.f40076d);

    @Override // p204p.ens
    /* JADX INFO: renamed from: a */
    public final DynamicRangeProfiles mo39521a() {
        return null;
    }

    @Override // p204p.ens
    /* JADX INFO: renamed from: b */
    public final Set mo39522b(cns cnsVar) {
        wj50.m88275l("DynamicRange is not supported: " + cnsVar, cns.f40076d.equals(cnsVar));
        return f82775b;
    }

    @Override // p204p.ens
    /* JADX INFO: renamed from: c */
    public final Set mo39523c() {
        return f82775b;
    }
}
