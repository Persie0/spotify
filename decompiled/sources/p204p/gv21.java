package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gv21 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f84597a;

    public gv21(ArrayList arrayList) {
        this.f84597a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((fv21) arrayList.get(0)).f73625b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((fv21) arrayList.get(i)).f73624a < j) {
                    z = true;
                    break;
                }
                j = ((fv21) arrayList.get(i)).f73625b;
            }
        }
        c95.m31843i(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gv21.class != obj.getClass()) {
            return false;
        }
        return this.f84597a.equals(((gv21) obj).f84597a);
    }

    public final int hashCode() {
        return this.f84597a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f84597a;
    }
}
