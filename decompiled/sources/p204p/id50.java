package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class id50 implements kd50 {

    /* JADX INFO: renamed from: a */
    public final String f100940a;

    public id50(String str) {
        this.f100940a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id50) && wj50.m88271j(this.f100940a, ((id50) obj).f100940a);
    }

    public final int hashCode() {
        return this.f100940a.hashCode();
    }
}
