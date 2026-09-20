package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ibo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f100612a;

    public ibo0(String str) {
        this.f100612a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibo0) && wj50.m88271j(this.f100612a, ((ibo0) obj).f100612a);
    }

    public final int hashCode() {
        return this.f100612a.hashCode();
    }
}
