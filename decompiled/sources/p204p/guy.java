package p204p;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class guy {

    /* JADX INFO: renamed from: a */
    public final String f84571a;

    /* JADX INFO: renamed from: b */
    public final Map f84572b;

    public guy(String str, Map map) {
        this.f84571a = str;
        this.f84572b = map;
    }

    /* JADX INFO: renamed from: b */
    public static guy m45792b(String str) {
        return new guy(str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: a */
    public final Annotation m45793a(Class cls) {
        return (Annotation) this.f84572b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guy)) {
            return false;
        }
        guy guyVar = (guy) obj;
        return this.f84571a.equals(guyVar.f84571a) && this.f84572b.equals(guyVar.f84572b);
    }

    public final int hashCode() {
        return this.f84572b.hashCode() + (this.f84571a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f84571a + ", properties=" + this.f84572b.values() + "}";
    }
}
