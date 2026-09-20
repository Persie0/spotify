package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ygu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final String f272649a;

    public ygu0(String str) {
        this.f272649a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygu0) && wj50.m88271j(this.f272649a, ((ygu0) obj).f272649a);
    }

    public final int hashCode() {
        return this.f272649a.hashCode();
    }
}
