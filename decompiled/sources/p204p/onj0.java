package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class onj0 {

    /* JADX INFO: renamed from: a */
    public final String f167270a;

    /* JADX INFO: renamed from: b */
    public final String f167271b;

    /* JADX INFO: renamed from: c */
    public final String f167272c;

    /* JADX INFO: renamed from: d */
    public final String f167273d;

    /* JADX INFO: renamed from: e */
    public final int f167274e;

    /* JADX INFO: renamed from: f */
    public final int f167275f;

    /* JADX INFO: renamed from: g */
    public final boolean f167276g;

    /* JADX INFO: renamed from: h */
    public final String f167277h;

    /* JADX INFO: renamed from: i */
    public final String f167278i;

    /* JADX INFO: renamed from: j */
    public final String f167279j;

    /* JADX INFO: renamed from: k */
    public final String f167280k;

    public onj0(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, String str6, String str7, String str8) {
        this.f167270a = str;
        this.f167271b = str2;
        this.f167272c = str3;
        this.f167273d = str4;
        this.f167274e = i;
        this.f167275f = i2;
        this.f167276g = z;
        this.f167277h = str5;
        this.f167278i = str6;
        this.f167279j = str7;
        this.f167280k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onj0)) {
            return false;
        }
        onj0 onj0Var = (onj0) obj;
        return wj50.m88271j(this.f167270a, onj0Var.f167270a) && wj50.m88271j(this.f167271b, onj0Var.f167271b) && wj50.m88271j(this.f167272c, onj0Var.f167272c) && wj50.m88271j(this.f167273d, onj0Var.f167273d) && this.f167274e == onj0Var.f167274e && this.f167275f == onj0Var.f167275f && this.f167276g == onj0Var.f167276g && wj50.m88271j(this.f167277h, onj0Var.f167277h) && wj50.m88271j(this.f167278i, onj0Var.f167278i) && wj50.m88271j(this.f167279j, onj0Var.f167279j) && wj50.m88271j(this.f167280k, onj0Var.f167280k);
    }

    public final int hashCode() {
        return this.f167280k.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d(mt60.m62800g(this.f167275f, mt60.m62800g(this.f167274e, s571.m77243b(s571.m77243b(s571.m77243b(this.f167270a.hashCode() * 31, 31, this.f167271b), 31, this.f167272c), 31, this.f167273d), 31), 31), 31, this.f167276g), 31, this.f167277h), 31, this.f167278i), 31, this.f167279j);
    }
}
