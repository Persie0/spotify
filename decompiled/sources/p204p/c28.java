package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c28 {

    /* JADX INFO: renamed from: a */
    public final mjq f33314a;

    /* JADX INFO: renamed from: b */
    public final List f33315b;

    /* JADX INFO: renamed from: c */
    public final int f33316c;

    /* JADX INFO: renamed from: d */
    public final int f33317d;

    /* JADX INFO: renamed from: e */
    public final cns f33318e;

    public c28(mjq mjqVar, List list, int i, int i2, cns cnsVar) {
        this.f33314a = mjqVar;
        this.f33315b = list;
        this.f33316c = i;
        this.f33317d = i2;
        this.f33318e = cnsVar;
    }

    /* JADX INFO: renamed from: a */
    public static azp0 m31317a(mjq mjqVar) {
        azp0 azp0Var = new azp0(12);
        if (mjqVar == null) {
            throw new NullPointerException("Null surface");
        }
        azp0Var.f21664b = mjqVar;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        azp0Var.f21665c = list;
        azp0Var.f21666d = -1;
        azp0Var.f21667e = -1;
        azp0Var.f21668f = cns.f40076d;
        return azp0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c28)) {
            return false;
        }
        c28 c28Var = (c28) obj;
        return this.f33314a.equals(c28Var.f33314a) && this.f33315b.equals(c28Var.f33315b) && this.f33316c == c28Var.f33316c && this.f33317d == c28Var.f33317d && this.f33318e.equals(c28Var.f33318e);
    }

    public final int hashCode() {
        return ((((((((this.f33314a.hashCode() ^ 1000003) * 1000003) ^ this.f33315b.hashCode()) * (-721379959)) ^ this.f33316c) * 1000003) ^ this.f33317d) * 1000003) ^ this.f33318e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f33314a + ", sharedSurfaces=" + this.f33315b + ", physicalCameraId=null, mirrorMode=" + this.f33316c + ", surfaceGroupId=" + this.f33317d + ", dynamicRange=" + this.f33318e + "}";
    }
}
