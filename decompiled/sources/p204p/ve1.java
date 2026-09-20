package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ve1 {

    /* JADX INFO: renamed from: a */
    public final String f240544a;

    public ve1(String str) {
        this.f240544a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve1) && wj50.m88271j(this.f240544a, ((ve1) obj).f240544a);
    }

    public final int hashCode() {
        return this.f240544a.hashCode();
    }
}
