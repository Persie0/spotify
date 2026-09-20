package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yh2 implements bi2 {

    /* JADX INFO: renamed from: a */
    public final String f272715a;

    public yh2(String str) {
        this.f272715a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m93622a() {
        return this.f272715a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh2) && wj50.m88271j(this.f272715a, ((yh2) obj).f272715a);
    }

    public final int hashCode() {
        return this.f272715a.hashCode();
    }
}
