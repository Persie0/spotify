package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tz61 extends uz61 {

    /* JADX INFO: renamed from: a */
    public final String f225165a;

    public tz61(String str) {
        this.f225165a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz61) && wj50.m88271j(this.f225165a, ((tz61) obj).f225165a);
    }

    public final int hashCode() {
        return this.f225165a.hashCode();
    }
}
