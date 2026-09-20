package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class boy implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f29275a;

    /* JADX INFO: renamed from: b */
    public final boolean f29276b;

    public boy(String str, boolean z) {
        this.f29275a = str;
        this.f29276b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boy)) {
            return false;
        }
        boy boyVar = (boy) obj;
        return wj50.m88271j(this.f29275a, boyVar.f29275a) && this.f29276b == boyVar.f29276b;
    }

    public final int hashCode() {
        String str = this.f29275a;
        return Boolean.hashCode(this.f29276b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
