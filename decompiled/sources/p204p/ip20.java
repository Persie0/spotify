package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ip20 extends jp20 {

    /* JADX INFO: renamed from: a */
    public final String f104368a;

    public ip20(String str) {
        this.f104368a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip20) && wj50.m88271j(this.f104368a, ((ip20) obj).f104368a);
    }

    public final int hashCode() {
        return this.f104368a.hashCode();
    }
}
