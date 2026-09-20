package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class xyz0 {

    /* JADX INFO: renamed from: a */
    public final Map f267486a;

    public xyz0(Map map) {
        this.f267486a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyz0) && wj50.m88271j(this.f267486a, ((xyz0) obj).f267486a);
    }

    public final int hashCode() {
        return this.f267486a.hashCode();
    }
}
