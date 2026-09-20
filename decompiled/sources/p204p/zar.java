package p204p;

import com.spotify.devicepredictability.proximitydetector.events.proto.DevicePredictabilityProximityDetection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class zar {

    /* JADX INFO: renamed from: a */
    public final qre0 f281109a;

    public /* synthetic */ zar(qre0 qre0Var) {
        this.f281109a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m95805a(String str, hg8 hg8Var, Set set, String str2, boolean z, boolean z2) {
        String str3;
        iar iarVarM9289t = DevicePredictabilityProximityDetection.m9289t();
        iarVarM9289t.m50097t(str);
        iarVarM9289t.m50098u(hg8Var.m47424a());
        List listM43711Y0 = g6f.m43711Y0(set, new hwd(24));
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM43711Y0, 10));
        Iterator it = listM43711Y0.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((fg8) it.next()).ordinal();
            if (iOrdinal == 0) {
                str3 = "IMMEDIATE";
            } else if (iOrdinal == 1) {
                str3 = "CLOSE";
            } else if (iOrdinal == 2) {
                str3 = "FAR";
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = "UNKNOWN";
            }
            arrayList.add(str3);
        }
        iarVarM9289t.m50093m(arrayList);
        iarVarM9289t.m50096s(str2);
        iarVarM9289t.m50094q(z);
        iarVarM9289t.m50095r(z2);
        this.f281109a.m73616a(iarVarM9289t.build());
    }
}
