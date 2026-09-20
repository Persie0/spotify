package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class obc1 implements qbc1 {

    /* JADX INFO: renamed from: a */
    public final String f163611a;

    public obc1(String str) {
        this.f163611a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obc1) && wj50.m88271j(this.f163611a, ((obc1) obj).f163611a);
    }

    public final int hashCode() {
        return this.f163611a.hashCode();
    }
}
