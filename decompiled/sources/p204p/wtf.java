package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class wtf extends ytf {
    /* JADX INFO: renamed from: g */
    public static ytf m88917g(int i) {
        if (i < 0) {
            return ytf.f276112b;
        }
        return i > 0 ? ytf.f276113c : ytf.f276111a;
    }

    @Override // p204p.ytf
    /* JADX INFO: renamed from: a */
    public final ytf mo88918a(int i, int i2) {
        return m88917g(Integer.compare(i, i2));
    }

    @Override // p204p.ytf
    /* JADX INFO: renamed from: b */
    public final ytf mo88919b(long j, long j2) {
        return m88917g(Long.compare(j, j2));
    }

    @Override // p204p.ytf
    /* JADX INFO: renamed from: c */
    public final ytf mo88920c(Object obj, Object obj2, Comparator comparator) {
        return m88917g(comparator.compare(obj, obj2));
    }

    @Override // p204p.ytf
    /* JADX INFO: renamed from: d */
    public final ytf mo88921d(boolean z, boolean z2) {
        return m88917g(Boolean.compare(z, z2));
    }

    @Override // p204p.ytf
    /* JADX INFO: renamed from: e */
    public final ytf mo88922e(boolean z, boolean z2) {
        return m88917g(Boolean.compare(z2, z));
    }

    @Override // p204p.ytf
    /* JADX INFO: renamed from: f */
    public final int mo88923f() {
        return 0;
    }
}
