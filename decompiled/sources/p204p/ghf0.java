package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ghf0 {

    /* JADX INFO: renamed from: a */
    public final fhf0 f79910a;

    /* JADX INFO: renamed from: b */
    public final Map f79911b;

    public ghf0(fhf0 fhf0Var, Map map) {
        this.f79910a = fhf0Var;
        this.f79911b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghf0)) {
            return false;
        }
        ghf0 ghf0Var = (ghf0) obj;
        return wj50.m88271j(this.f79910a, ghf0Var.f79910a) && wj50.m88271j(this.f79911b, ghf0Var.f79911b);
    }

    public final int hashCode() {
        int iHashCode = this.f79910a.hashCode() * 31;
        Map map = this.f79911b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
