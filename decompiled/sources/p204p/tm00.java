package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tm00 extends an00 {

    /* JADX INFO: renamed from: a */
    public final String f221563a;

    public tm00(String str) {
        this.f221563a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm00) && wj50.m88271j(this.f221563a, ((tm00) obj).f221563a);
    }

    public final int hashCode() {
        return this.f221563a.hashCode();
    }
}
