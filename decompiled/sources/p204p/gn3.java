package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gn3 extends hn3 {

    /* JADX INFO: renamed from: a */
    public final String f81536a;

    public gn3(String str) {
        this.f81536a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn3) && wj50.m88271j(this.f81536a, ((gn3) obj).f81536a);
    }

    public final int hashCode() {
        return this.f81536a.hashCode();
    }
}
