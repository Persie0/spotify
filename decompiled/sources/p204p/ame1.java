package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ame1 {

    /* JADX INFO: renamed from: a */
    public final String f17126a;

    /* JADX INFO: renamed from: b */
    public final String f17127b;

    /* JADX INFO: renamed from: c */
    public final boolean f17128c;

    public ame1(String str, String str2, boolean z) {
        this.f17126a = str;
        this.f17127b = str2;
        this.f17128c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ame1)) {
            return false;
        }
        ame1 ame1Var = (ame1) obj;
        return wj50.m88271j(this.f17126a, ame1Var.f17126a) && wj50.m88271j(this.f17127b, ame1Var.f17127b) && this.f17128c == ame1Var.f17128c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17128c) + s571.m77243b(this.f17126a.hashCode() * 31, 31, this.f17127b);
    }
}
