package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class jix0 {

    /* JADX INFO: renamed from: a */
    public final String f112831a;

    /* JADX INFO: renamed from: b */
    public final List f112832b;

    /* JADX INFO: renamed from: c */
    public final Map f112833c;

    public jix0(String str, List list, Map map) {
        this.f112831a = str;
        this.f112832b = list;
        this.f112833c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jix0)) {
            return false;
        }
        jix0 jix0Var = (jix0) obj;
        return wj50.m88271j(this.f112831a, jix0Var.f112831a) && wj50.m88271j(this.f112832b, jix0Var.f112832b) && wj50.m88271j(this.f112833c, jix0Var.f112833c);
    }

    public final int hashCode() {
        return this.f112833c.hashCode() + s571.m77244c(this.f112831a.hashCode() * 31, 31, this.f112832b);
    }
}
