package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ei0 implements gi0 {

    /* JADX INFO: renamed from: a */
    public final String f59755a;

    public ei0(String str) {
        this.f59755a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei0) && wj50.m88271j(this.f59755a, ((ei0) obj).f59755a);
    }

    public final int hashCode() {
        return this.f59755a.hashCode();
    }
}
