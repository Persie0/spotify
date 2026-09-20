package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k751 implements o751 {

    /* JADX INFO: renamed from: a */
    public final String f119982a;

    public k751(String str) {
        this.f119982a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k751) && wj50.m88271j(this.f119982a, ((k751) obj).f119982a);
    }

    public final int hashCode() {
        return this.f119982a.hashCode();
    }
}
