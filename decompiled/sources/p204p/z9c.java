package p204p;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class z9c implements n35 {

    /* JADX INFO: renamed from: a */
    public final CastDevice f280739a;

    /* JADX INFO: renamed from: b */
    public final m6h1 f280740b;

    /* JADX INFO: renamed from: c */
    public final Bundle f280741c;

    /* JADX INFO: renamed from: d */
    public final String f280742d = UUID.randomUUID().toString();

    public /* synthetic */ z9c(cxb cxbVar) {
        this.f280739a = (CastDevice) cxbVar.f42972b;
        this.f280740b = (m6h1) cxbVar.f42973c;
        this.f280741c = (Bundle) cxbVar.f42974d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z9c)) {
            return false;
        }
        z9c z9cVar = (z9c) obj;
        if (mvl0.m62956s(this.f280739a, z9cVar.f280739a)) {
            Bundle bundle = z9cVar.f280741c;
            Bundle bundle2 = this.f280741c;
            if (bundle2 == null || bundle == null) {
                if (bundle2 == bundle) {
                    if (mvl0.m62956s(this.f280742d, z9cVar.f280742d)) {
                        return true;
                    }
                }
            } else if (bundle2.size() == bundle.size()) {
                Set<String> setKeySet = bundle2.keySet();
                if (setKeySet.containsAll(bundle.keySet())) {
                    for (String str : setKeySet) {
                        if (!mvl0.m62956s(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                    if (mvl0.m62956s(this.f280742d, z9cVar.f280742d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f280739a, this.f280741c, 0, this.f280742d});
    }
}
