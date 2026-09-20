package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h8t implements p8t {

    /* JADX INFO: renamed from: a */
    public final String f88786a;

    public h8t(String str) {
        this.f88786a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8t) && wj50.m88271j(this.f88786a, ((h8t) obj).f88786a);
    }

    public final int hashCode() {
        return this.f88786a.hashCode();
    }
}
