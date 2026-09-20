package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iba1 implements kba1 {

    /* JADX INFO: renamed from: a */
    public final String f100499a;

    public iba1(String str) {
        this.f100499a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iba1) && wj50.m88271j(this.f100499a, ((iba1) obj).f100499a);
    }

    public final int hashCode() {
        return this.f100499a.hashCode();
    }
}
