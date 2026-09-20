package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f760 implements g760 {

    /* JADX INFO: renamed from: a */
    public final Object f66569a;

    public f760(Object obj) {
        this.f66569a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f760) && wj50.m88271j(this.f66569a, ((f760) obj).f66569a);
    }

    public final int hashCode() {
        Object obj = this.f66569a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
