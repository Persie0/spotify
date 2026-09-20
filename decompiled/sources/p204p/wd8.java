package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f250235a;

    public wd8(String str) {
        this.f250235a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd8) && wj50.m88271j(this.f250235a, ((wd8) obj).f250235a);
    }

    public final int hashCode() {
        return this.f250235a.hashCode();
    }
}
