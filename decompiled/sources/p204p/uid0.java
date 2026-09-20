package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class uid0 implements cjd0 {

    /* JADX INFO: renamed from: a */
    public final List f230665a;

    /* JADX INFO: renamed from: b */
    public final boolean f230666b;

    /* JADX INFO: renamed from: c */
    public final int f230667c;

    /* JADX INFO: renamed from: d */
    public final wxd0 f230668d;

    public uid0(List list, boolean z, int i, wxd0 wxd0Var) {
        this.f230665a = list;
        this.f230666b = z;
        this.f230667c = i;
        this.f230668d = wxd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uid0)) {
            return false;
        }
        uid0 uid0Var = (uid0) obj;
        return wj50.m88271j(this.f230665a, uid0Var.f230665a) && this.f230666b == uid0Var.f230666b && this.f230667c == uid0Var.f230667c && this.f230668d == uid0Var.f230668d;
    }

    public final int hashCode() {
        return this.f230668d.hashCode() + mt60.m62800g(this.f230667c, s571.m77245d(this.f230665a.hashCode() * 31, 31, this.f230666b), 31);
    }
}
