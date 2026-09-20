package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f4m {

    /* JADX INFO: renamed from: a */
    public final Map f65800a;

    /* JADX INFO: renamed from: b */
    public final Map f65801b;

    public f4m(Map map, Map map2) {
        this.f65800a = map;
        this.f65801b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4m)) {
            return false;
        }
        f4m f4mVar = (f4m) obj;
        return wj50.m88271j(this.f65800a, f4mVar.f65800a) && wj50.m88271j(this.f65801b, f4mVar.f65801b);
    }

    public final int hashCode() {
        return this.f65801b.hashCode() + (this.f65800a.hashCode() * 31);
    }

    public /* synthetic */ f4m(Map map) {
        this(map, nau.f152117a);
    }
}
