package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oxx {

    /* JADX INFO: renamed from: a */
    public final String f171612a;

    public oxx(String str) {
        this.f171612a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m68407a() {
        return this.f171612a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxx) && wj50.m88271j(this.f171612a, ((oxx) obj).f171612a);
    }

    public final int hashCode() {
        String str = this.f171612a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }
}
