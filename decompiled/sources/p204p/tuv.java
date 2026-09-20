package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tuv {

    /* JADX INFO: renamed from: a */
    public final Object f223926a;

    /* JADX INFO: renamed from: b */
    public final String f223927b;

    public /* synthetic */ tuv() {
        this(lau.f131415a, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final List m81593a() {
        return this.f223926a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuv)) {
            return false;
        }
        tuv tuvVar = (tuv) obj;
        return wj50.m88271j(this.f223926a, tuvVar.f223926a) && wj50.m88271j(this.f223927b, tuvVar.f223927b);
    }

    public final int hashCode() {
        int iHashCode = this.f223926a.hashCode() * 31;
        String str = this.f223927b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public tuv(List list, String str) {
        this.f223926a = list;
        this.f223927b = str;
    }
}
