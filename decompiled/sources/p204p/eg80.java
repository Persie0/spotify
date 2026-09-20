package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eg80 implements fg80 {

    /* JADX INFO: renamed from: a */
    public final String f59244a;

    public eg80(String str) {
        this.f59244a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg80) && wj50.m88271j(this.f59244a, ((eg80) obj).f59244a);
    }

    public final int hashCode() {
        return this.f59244a.hashCode();
    }
}
