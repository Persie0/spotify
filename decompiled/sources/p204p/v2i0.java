package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v2i0 {

    /* JADX INFO: renamed from: a */
    public final List f236673a;

    /* JADX INFO: renamed from: b */
    public final String f236674b;

    public v2i0(List list, String str) {
        this.f236673a = list;
        this.f236674b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2i0)) {
            return false;
        }
        v2i0 v2i0Var = (v2i0) obj;
        return wj50.m88271j(this.f236673a, v2i0Var.f236673a) && wj50.m88271j(this.f236674b, v2i0Var.f236674b);
    }

    public final int hashCode() {
        int iHashCode = this.f236673a.hashCode() * 31;
        String str = this.f236674b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
