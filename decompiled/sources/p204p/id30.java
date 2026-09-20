package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class id30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final String f100927a;

    public id30(String str) {
        this.f100927a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id30) && wj50.m88271j(this.f100927a, ((id30) obj).f100927a);
    }

    public final int hashCode() {
        return this.f100927a.hashCode();
    }
}
