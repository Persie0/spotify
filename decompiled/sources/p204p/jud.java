package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jud {

    /* JADX INFO: renamed from: a */
    public final String f116094a;

    /* JADX INFO: renamed from: b */
    public final String f116095b;

    /* JADX INFO: renamed from: c */
    public final int f116096c;

    public jud(String str, String str2, int i) {
        this.f116094a = str;
        this.f116095b = str2;
        this.f116096c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jud)) {
            return false;
        }
        jud judVar = (jud) obj;
        return wj50.m88271j(this.f116094a, judVar.f116094a) && wj50.m88271j(this.f116095b, judVar.f116095b) && this.f116096c == judVar.f116096c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116096c) + s571.m77243b(this.f116094a.hashCode() * 31, 31, this.f116095b);
    }
}
