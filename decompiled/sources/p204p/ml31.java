package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ml31 {

    /* JADX INFO: renamed from: a */
    public final us11 f144749a;

    /* JADX INFO: renamed from: b */
    public final Map f144750b;

    public ml31(us11 us11Var, Map map) {
        this.f144749a = us11Var;
        this.f144750b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml31)) {
            return false;
        }
        ml31 ml31Var = (ml31) obj;
        return wj50.m88271j(this.f144749a, ml31Var.f144749a) && wj50.m88271j(this.f144750b, ml31Var.f144750b);
    }

    public final int hashCode() {
        return this.f144750b.hashCode() + (this.f144749a.hashCode() * 31);
    }
}
