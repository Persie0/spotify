package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v5f {

    /* JADX INFO: renamed from: a */
    public final String f237474a;

    /* JADX INFO: renamed from: b */
    public final List f237475b;

    /* JADX INFO: renamed from: c */
    public final boolean f237476c;

    public v5f(String str, List list, boolean z) {
        this.f237474a = str;
        this.f237475b = list;
        this.f237476c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5f)) {
            return false;
        }
        v5f v5fVar = (v5f) obj;
        return wj50.m88271j(this.f237474a, v5fVar.f237474a) && wj50.m88271j(this.f237475b, v5fVar.f237475b) && this.f237476c == v5fVar.f237476c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237476c) + s571.m77244c(this.f237474a.hashCode() * 31, 31, this.f237475b);
    }
}
