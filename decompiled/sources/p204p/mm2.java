package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mm2 {

    /* JADX INFO: renamed from: a */
    public final String f145030a;

    public mm2(String str) {
        this.f145030a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm2) && wj50.m88271j(this.f145030a, ((mm2) obj).f145030a);
    }

    public final int hashCode() {
        return this.f145030a.hashCode();
    }
}
