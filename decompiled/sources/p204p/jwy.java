package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jwy {

    /* JADX INFO: renamed from: a */
    public final boolean f116736a;

    /* JADX INFO: renamed from: b */
    public final boolean f116737b;

    /* JADX INFO: renamed from: c */
    public final tbn0 f116738c;

    /* JADX INFO: renamed from: d */
    public final Long f116739d;

    /* JADX INFO: renamed from: e */
    public final Long f116740e;

    /* JADX INFO: renamed from: f */
    public final Long f116741f;

    /* JADX INFO: renamed from: g */
    public final Long f116742g;

    /* JADX INFO: renamed from: h */
    public final Map f116743h;

    public jwy(boolean z, boolean z2, tbn0 tbn0Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.f116736a = z;
        this.f116737b = z2;
        this.f116738c = tbn0Var;
        this.f116739d = l;
        this.f116740e = l2;
        this.f116741f = l3;
        this.f116742g = l4;
        this.f116743h = kkc0.m56706s0(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f116736a) {
            arrayList.add("isRegularFile");
        }
        if (this.f116737b) {
            arrayList.add("isDirectory");
        }
        Long l = this.f116739d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.f116740e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f116741f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.f116742g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.f116743h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return g6f.m43753y0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ jwy(boolean z, boolean z2, tbn0 tbn0Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, tbn0Var, l, l2, l3, l4, nau.f152117a);
    }
}
