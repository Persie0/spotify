package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t330 implements u330 {

    /* JADX INFO: renamed from: a */
    public final String f216693a;

    public t330(String str) {
        this.f216693a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t330) && wj50.m88271j(this.f216693a, ((t330) obj).f216693a);
    }

    public final int hashCode() {
        return this.f216693a.hashCode();
    }
}
