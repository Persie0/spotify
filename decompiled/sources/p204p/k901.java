package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final String f120501a;

    public k901(String str) {
        this.f120501a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k901) && wj50.m88271j(this.f120501a, ((k901) obj).f120501a);
    }

    public final int hashCode() {
        return this.f120501a.hashCode();
    }
}
