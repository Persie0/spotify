package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ytc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f276091a;

    public ytc0(String str) {
        this.f276091a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytc0) && wj50.m88271j(this.f276091a, ((ytc0) obj).f276091a);
    }

    public final int hashCode() {
        return this.f276091a.hashCode();
    }
}
