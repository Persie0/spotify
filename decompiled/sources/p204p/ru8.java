package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ru8 implements uu8 {

    /* JADX INFO: renamed from: a */
    public final String f202770a;

    /* JADX INFO: renamed from: b */
    public final String f202771b;

    /* JADX INFO: renamed from: c */
    public final lw8 f202772c;

    public ru8(String str, String str2, lw8 lw8Var) {
        this.f202770a = str;
        this.f202771b = str2;
        this.f202772c = lw8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru8)) {
            return false;
        }
        ru8 ru8Var = (ru8) obj;
        return wj50.m88271j(this.f202770a, ru8Var.f202770a) && wj50.m88271j(this.f202771b, ru8Var.f202771b) && this.f202772c == ru8Var.f202772c;
    }

    public final int hashCode() {
        return this.f202772c.hashCode() + s571.m77243b(this.f202770a.hashCode() * 31, 31, this.f202771b);
    }
}
