package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t301 implements u301 {

    /* JADX INFO: renamed from: a */
    public final String f216685a;

    public t301(String str) {
        this.f216685a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t301) && wj50.m88271j(this.f216685a, ((t301) obj).f216685a);
    }

    public final int hashCode() {
        return this.f216685a.hashCode();
    }
}
