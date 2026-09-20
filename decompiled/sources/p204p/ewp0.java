package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ewp0 {

    /* JADX INFO: renamed from: a */
    public final String f63588a;

    public ewp0(String str) {
        this.f63588a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewp0) && this.f63588a.equals(((ewp0) obj).f63588a);
    }

    public final int hashCode() {
        return (this.f63588a.hashCode() * 31) - 1871273172;
    }
}
