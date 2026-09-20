package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zme0 implements ene0 {

    /* JADX INFO: renamed from: a */
    public final String f284259a;

    public zme0(String str) {
        this.f284259a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zme0) && wj50.m88271j(this.f284259a, ((zme0) obj).f284259a);
    }

    public final int hashCode() {
        return this.f284259a.hashCode();
    }
}
