package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class utc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f233891a;

    public utc0(String str) {
        this.f233891a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utc0) && wj50.m88271j(this.f233891a, ((utc0) obj).f233891a);
    }

    public final int hashCode() {
        return this.f233891a.hashCode();
    }
}
