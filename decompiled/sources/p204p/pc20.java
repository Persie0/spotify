package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pc20 extends sc20 {

    /* JADX INFO: renamed from: b */
    public final String f175942b;

    public pc20(String str) {
        super(str);
        this.f175942b = str;
    }

    @Override // p204p.sc20
    /* JADX INFO: renamed from: a */
    public final String mo66672a() {
        return this.f175942b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc20) && wj50.m88271j(this.f175942b, ((pc20) obj).f175942b);
    }

    public final int hashCode() {
        return this.f175942b.hashCode();
    }
}
