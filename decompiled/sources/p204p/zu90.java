package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f286395a;

    public zu90(String str) {
        this.f286395a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu90) && wj50.m88271j(this.f286395a, ((zu90) obj).f286395a);
    }

    public final int hashCode() {
        return this.f286395a.hashCode();
    }
}
