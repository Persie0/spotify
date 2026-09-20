package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rlh {

    /* JADX INFO: renamed from: a */
    public final String f200312a;

    /* JADX INFO: renamed from: b */
    public final int f200313b;

    /* JADX INFO: renamed from: c */
    public final String f200314c;

    /* JADX INFO: renamed from: d */
    public final String f200315d;

    /* JADX INFO: renamed from: e */
    public final boolean f200316e;

    public rlh(int i, String str, String str2, boolean z, String str3) {
        this.f200312a = str;
        this.f200313b = i;
        this.f200314c = str2;
        this.f200315d = str3;
        this.f200316e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlh)) {
            return false;
        }
        rlh rlhVar = (rlh) obj;
        return wj50.m88271j(this.f200312a, rlhVar.f200312a) && this.f200313b == rlhVar.f200313b && wj50.m88271j(this.f200314c, rlhVar.f200314c) && wj50.m88271j(this.f200315d, rlhVar.f200315d) && this.f200316e == rlhVar.f200316e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200316e) + s571.m77243b(s571.m77243b(mt60.m62800g(this.f200313b, this.f200312a.hashCode() * 31, 31), 31, this.f200314c), 31, this.f200315d);
    }
}
