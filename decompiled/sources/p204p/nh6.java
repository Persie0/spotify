package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nh6 extends uh6 {

    /* JADX INFO: renamed from: a */
    public final String f153882a;

    public nh6(String str) {
        this.f153882a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh6) && wj50.m88271j(this.f153882a, ((nh6) obj).f153882a);
    }

    public final int hashCode() {
        return this.f153882a.hashCode();
    }
}
