package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class u1w0 {

    /* JADX INFO: renamed from: a */
    public final Map f225929a;

    /* JADX INFO: renamed from: b */
    public final Map f225930b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u1w0() {
        nau nauVar = nau.f152117a;
        this(nauVar, nauVar);
    }

    /* JADX INFO: renamed from: a */
    public final Map m82230a() {
        return this.f225929a;
    }

    /* JADX INFO: renamed from: b */
    public final Map m82231b() {
        return this.f225930b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1w0)) {
            return false;
        }
        u1w0 u1w0Var = (u1w0) obj;
        return wj50.m88271j(this.f225929a, u1w0Var.f225929a) && wj50.m88271j(this.f225930b, u1w0Var.f225930b);
    }

    public final int hashCode() {
        return this.f225930b.hashCode() + (this.f225929a.hashCode() * 31);
    }

    public u1w0(Map map, Map map2) {
        this.f225929a = map;
        this.f225930b = map2;
    }
}
