package p204p;

import com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage$ShareRequested;

/* JADX INFO: loaded from: classes10.dex */
public final class s4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final VtecWebToAndroidMessage$ShareRequested f205576a;

    public s4d1(VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested) {
        this.f205576a = vtecWebToAndroidMessage$ShareRequested;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4d1) && wj50.m88271j(this.f205576a, ((s4d1) obj).f205576a);
    }

    public final int hashCode() {
        return this.f205576a.hashCode();
    }
}
