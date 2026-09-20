package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y361 implements z361 {

    /* JADX INFO: renamed from: a */
    public final String f268768a;

    public y361(String str) {
        this.f268768a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m92734a() {
        return this.f268768a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y361) && wj50.m88271j(this.f268768a, ((y361) obj).f268768a);
    }

    public final int hashCode() {
        return this.f268768a.hashCode();
    }
}
