package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s9j implements w9j {

    /* JADX INFO: renamed from: a */
    public final Map f206964a;

    public s9j(Map map) {
        this.f206964a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9j) && wj50.m88271j(this.f206964a, ((s9j) obj).f206964a);
    }

    public final int hashCode() {
        return this.f206964a.hashCode();
    }
}
