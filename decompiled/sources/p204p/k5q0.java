package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k5q0 {

    /* JADX INFO: renamed from: a */
    public final Map f119563a;

    public k5q0(Map map) {
        this.f119563a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5q0) && wj50.m88271j(this.f119563a, ((k5q0) obj).f119563a);
    }

    public final int hashCode() {
        return this.f119563a.hashCode();
    }

    public /* synthetic */ k5q0() {
        this(nau.f152117a);
    }
}
